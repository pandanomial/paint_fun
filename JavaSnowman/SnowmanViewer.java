 /**
 * Create a window application named Snowman, displays a snowman
 * Be creative, you can add additional shapes and you can use different colors. 
 * Provide a class SnowmanViewer and SnowmanComponent. 
 */
import javax.swing.JFrame;  

public class SnowmanViewer 
{  
    public static void main(String[] args) 
    {  
        final int FRAME_WIDTH = 550;         
        final int FRAME_HEIGHT = 550;  
        
        JFrame f = new JFrame(); 
        
        f.setSize(FRAME_WIDTH,FRAME_HEIGHT); 
        f.setTitle("Snow White Show by Stephanie");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SnowmanComponent snowman = new SnowmanComponent();
        
        f.add(snowman);
        f.setVisible(true);  
       
    }  
 
}  

