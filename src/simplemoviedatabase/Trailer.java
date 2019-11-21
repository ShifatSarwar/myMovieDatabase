package simplemoviedatabase;

import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application; 
import javafx.application.Platform;
import javafx.scene.Scene;  
import javafx.scene.web.WebView;
import javafx.stage.Stage;  
import javafx.stage.WindowEvent;

public class Trailer extends Application implements Observer, Runnable { 
    public static String[] arguments;
    
    
    @Override
    public void start(Stage primaryStage) { 
        try {
            AbstractThings abstractThings=new AbstractThings() {};
            
            String trailerKey=abstractThings.getTempKey();
            String trailerName=abstractThings.getTempName();   
            primaryStage.setTitle(trailerName);
            WebView webview = new WebView();
            String url="https://www.youtube.com/embed/"+trailerKey;
            webview.getEngine().load(url);
            webview.setPrefSize(640, 390);
            primaryStage.setScene(new Scene(webview));
            primaryStage.show();
        
            primaryStage.setOnCloseRequest((WindowEvent event) -> {
                try {
                    primaryStage.close();
                    webview.getEngine().load(null);
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                } catch (UnsupportedOperationException ex) {
                    Logger.getLogger(Trailer.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            
        } catch(Exception e) {}
    }
    
    public static void main(String[] args) {  
        arguments=args;
    }    
    
    @Override
    public void run(){
        launch();
    }
    
    
    @Override
    public void update(Observable o, Object arg) {
        Platform.runLater(new Runnable() {
            public void run() {             
                new Trailer().start(new Stage());
            }
        });
    }
    
}
 
