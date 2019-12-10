package simplemoviedatabase;

import javafx.application.Application; 
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;  
import javafx.scene.web.WebView;
import javafx.stage.Stage;  
import javafx.stage.WindowEvent;

public class Trailer extends Application implements Runnable { 
    public static String[] arguments;
    public Stage pStage;
    
    
    @Override
    public void start(Stage primaryStage) {
        pStage=primaryStage;
        try {
            Platform.setImplicitExit(false);
            AbstractThings abstractThings=new AbstractThings() {}; 
            if (abstractThings.fetchTrackerValue()) {
                        Platform.runLater(()-> start(primaryStage));
                        abstractThings.setTrackerValue(false);
                    }
            String trailerKey=abstractThings.getTempKey();
            String trailerName=abstractThings.getTempName();   
            primaryStage.setTitle(trailerName);
            WebView webview = new WebView();
            String url="https://www.youtube.com/embed/"+trailerKey;
            webview.getEngine().load(url);
            webview.setPrefSize(640, 390);
            primaryStage.setScene(new Scene(webview));
            primaryStage.show();
            primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    primaryStage.close();
                    webview.getEngine().load(null);
                 
                    
                  //  Platform.runLater(()->start(primaryStage));
//                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    
                }
            });
            
        } catch(Exception e) {}
    }
    
    public static void main(String[] args) { 
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Shutdown hook")));
        arguments=args;
    }    
    
    @Override
    public void run(){
        launch();
    }
}
 
