package simplemoviedatabase;
import java.awt.Desktop;
import java.io.IOException;
import java.io.File;

public class AdvancedSearch {
    public void search() {
        try {
            File htmlFile = new File("G:\\Codes\\workplace2\\SimpleMovieDatabase\\web\\advancedSearch.html");
            Desktop.getDesktop().browse(htmlFile.toURI());
        }catch(IOException e) {}
    }

    
}
