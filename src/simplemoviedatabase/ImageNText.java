package simplemoviedatabase;

import javax.swing.Icon;

public class ImageNText {

    private String name;
    private Icon poster;
    
    public ImageNText(String text, Icon icon) {
        this.name=text;
        this.poster=icon;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    
    
     public Icon getPoster() {
        return poster;
    }
    public void setPoster(Icon img) {
        this.poster=img;
    } 
    
}
