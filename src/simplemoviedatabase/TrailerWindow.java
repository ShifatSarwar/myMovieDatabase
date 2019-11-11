package simplemoviedatabase;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrailerWindow extends javax.swing.JFrame {

    public static JPanel getBrowser() {
        JPanel webPanel=new JPanel(new BorderLayout());
       JWebBrowser wb =new JWebBrowser();
        webPanel.add(wb,BorderLayout.CENTER);
        wb.setBarsVisible(false);
        wb.navigate("https://www.youtube.com/watch_popup?v=GKiHB5AzihE&t=79s");
        return webPanel;
    }                    

    public static void main(String args[]) {
        NativeInterface.open();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new JFrame("Trailer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(getBrowser(),BorderLayout.CENTER);
                frame.setSize(400,300);
                frame.setVisible(true);
            }
        });
        NativeInterface.runEventPump();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                NativeInterface.close();           
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }){
            
        });
    }     
}
