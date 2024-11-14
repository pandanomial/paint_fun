 /**
 * Create a window application named Snowman, displays a snowman
 * Be creative, you can add additional shapes and you can use different colors. 
 * Provide a class SnowmanViewer and SnowmanComponent. 
 * 
 */
import java.awt.*;  
import java.awt.geom.Ellipse2D;
//import javax.swing.JComponent; // JComponent does not have color cyan 

//colors: RED, YELLOW, BLUE, ORANGE, PINK, CYAN, MAGENTA, 
//BLACK, WHITE, GRAY, LIGHT_GRAY, DARK_GRAY. 
 
public class SnowmanComponent extends Canvas// JComponent does not have color cyan 
{  
   
    public void paint(Graphics g) 
    {  
      final int MID = 150;    //reference x from upper left corner
      final int TOP = 50;     //reference y from upper left corner

      setBackground (Color.cyan);                   // sky and background
      
     
      g.setColor (Color.magenta);                   //  stage   
      g.fillRect (MID-150, TOP+190, 300, 50);  
      //fillRect(UpLeftRecPointX, UpLeftRecPointY,width, height) 
      
      g.setColor (Color.black);                      // stage banner
      g.drawString("Welcome to Snow White Show!", MID-100, TOP + 222);  
      //drawString("message",LowLeftPointX, LowLeftPointY) 

      g.setColor (Color.green);                     // grass 
      g.fillRect (MID-150, TOP+260, 550, 220); 
      //fillRect(UpLeftRecPointX, UpLeftRecPointY,width, height) 
      
      
      g.setColor(Color.gray); //stage holder color: gray + cyan = brown     
      g.fillRect (MID-130, TOP+240, 32, 20);        //  stage holder 1
      g.fillRect (MID-30, TOP+240, 32, 20);         //  stage holder 2
      g.fillRect (MID+70, TOP+240, 32, 20);         //  stage holder 3
      //fillRect(UpLeftRecPointX, UpLeftRecPointY,width, height) 
       
      g.setColor (Color.yellow);                    // sun
      g.fillOval (MID-150, TOP-50, 80, 80);      
      //drawOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 

      /////////// girl /////////// 
      g.setColor (Color.black);                     // girl's head shape
      g.drawOval(MID-16, TOP, 30, 35); 
      //drawOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 

      g.setColor (Color.white);                     // girl's face
      g.fillOval (MID-16, TOP, 30, 35);  
      //drawOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 

      g.setColor (Color.black);
      g.drawArc(MID-25, TOP, 50, 80, 40, 120 );    // a little hair
      //drawArc(UpLeftRecPointX, UpLeftRecPointY,width,height,startAngle, SweepAngleCounterClockAsPositive)
      
      
      g.setColor (Color.pink);                      // ballet ribbon
      g.fillOval (MID-15, TOP - 5, 30, 10); 
      //fillOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 

      
      g.setColor (Color.red);                       // girl lip color
      g.drawArc (MID-10, TOP+20, 20, 10, 160, 140); // girl smile
      //drawArc(UpLeftRecPointX, UpLeftRecPointY,width,height,startAngle, SweepAngleCounterClockAsPositive)
      
      g.setColor (Color.black);                     // ballet bun
      g.fillOval (MID-10, TOP - 20, 20, 20);  
      //drawOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 
      g.setColor (Color.pink);                      // ballet ribbon
      g.fillOval (MID-15, TOP - 5, 30, 5); 
      
      g.setColor (Color.black);  
      g.drawArc (150, 30, 100, 50, 160, 30);        // a little hair

      g.setColor (Color.white);
      g.fillOval (MID-35, TOP+35, 70, 50);          // girl upper torso
      g.fillOval (MID-50, TOP+80, 100, 60);         // girl lower torso

      g.setColor (Color.black);                     // girl eye color
      g.fillOval (MID-14, TOP+10, 10, 10);          // girl left eye
      g.fillOval (MID+5, TOP+10, 10, 10);           // girl right eye
      

      g.setColor (Color.white);                        
      g.fillOval (MID-20, TOP + 90,  15,  100);        // girl standing leg
      //drawOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 
      
      ////////// boy //////////
      g.setColor (Color.white);      
      g.drawOval (MID+150, TOP+200, 40, 35);           // boy head
      g.fillOval (MID+150, TOP+200, 40, 35);           // boy right eye
      g.setColor (Color.blue);                         // boy eye color
      g.fillOval (MID+155, TOP+200, 10, 10);           // boy left eye
      g.fillOval (MID+165, TOP+210, 10, 10);           // boy right eye
      g.setColor (Color.red);                          // boy lip color
      g.drawArc  (MID+150, TOP+200, 30, 30, 160, 140); // boy smile
      g.setColor (Color.white);
      g.fillOval (MID+155, TOP+225, 90, 50);           // boy upper torso
      g.fillOval (MID+150, TOP+250, 150, 70);          // boy lower torso
      g.setColor (Color.black);                        // boy hat
      g.drawLine (MID+202, TOP+198, MID+150, TOP+198); 
      g.drawLine (MID+202, TOP+199, MID+150, TOP+199); 
      g.drawLine (MID+202, TOP+200, MID+150, TOP+200);  // brim of hat
      g.fillRect (MID+160, TOP+175, 30, 25);            // top of hat 
       
      ///////// adding more: girl's dancing pose ////////
       
      Graphics2D g2 = (Graphics2D) g; // for Ellipse rotating and thicker lines
      
      //g.setColor (Color.green);     //for trees
      //g2.setStroke(new BasicStroke(16)); 
      //for(int i=460; i<=550; i=i+25)
      //    g.drawLine (i, 100, i, 330);
      
      
      //Ellipse2D.Double, Ellipse2D.Float, I choose float 
      Shape s1 = new Ellipse2D.Float(MID+40, TOP+130, 55, 12);  // girl dancing leg
      //Float​(float x, float y, float w, float h)
      //Float​(UpLeftRecPointX, UpLeftRecPointY, width, height)
      g2.rotate(Math.toRadians(135),  MID+40,  TOP+130);
      //rotate​(angle, pivotX, pivotY) 2D Rotate transform with pivot.
      //rotate​(angle, pivotX, pivotY, pivotZ) Rotate transform with 3D pivot.
      //rotate​(angle, pivotX, pivotY, pivotZ, Point3D axis)3D Rotate transform with pivot.
      //Rotate​(angle, Point3D axis) 3D Rotate transform.
      g2.setPaint(Color.white);
      g2.fill(s1);
    
      Shape s2 = new Ellipse2D.Float(MID+30, TOP+280, 55, 10);  // girl upper arm
      //Float​(UpLeftRecPointX, UpLeftRecPointY, width, height)
      g2.rotate(Math.toRadians(175),  MID+30,  TOP+280);
      //rotate​(angle, pivotX, pivotY) 2D Rotate transform with pivot.
      g2.setPaint(Color.white);
      g2.fill(s2);
      
      Shape s3 = new Ellipse2D.Float(MID+44, TOP+280, 55, 13);  // girl lower arm
      //Float​(UpLeftRecPointX, UpLeftRecPointY, width, height)
      g2.rotate(Math.toRadians(110),  MID+44,  TOP+280);
      //rotate​(angle, pivotX, pivotY) 2D Rotate transform with pivot.
      g2.setPaint(Color.white);
      g2.fill(s3);
      
      Shape s4 = new Ellipse2D.Float(MID+198, TOP+180, 105, 13); // girl pointing arm
      //Float​(UpLeftRecPointX, UpLeftRecPointY, width, height)
      g2.rotate(Math.toRadians(140),  MID+198,  TOP+180);
      //rotate​(angle, pivotX, pivotY) 2D Rotate transform with pivot.
      g2.setPaint(Color.white);
      g2.fill(s4);
      
      //////// sun has larger thicker smile//////
      g.setColor (Color.red);                                    //sun eyes
      g.drawArc (MID+440, TOP+210, 20, 20, 10, 170);             //sun left eye
      g.drawArc (MID+410, TOP+210, 20, 20, 10, 170);             //sun right eye
       
      g2.setStroke(new BasicStroke(6));                          // sun smile thicker lip
      g2.setPaint(Color.red);
      g2.drawArc (MID+410, TOP+170, 40, 50, 10, 170);
      //drawArc(UpLeftRecPointX, UpLeftRecPointY,width,height,startAngle, SweepAngleCounterClockAsPositive)
      
      /////// audience ///////
      g.setColor (Color.white);      
      g.drawOval(MID+250, TOP-150, 40, 35);                      // audience 1
      g.fillOval(MID+250, TOP-150, 40, 35); 
      g.fillOval(MID+250, TOP-200, 70, 60);
       
      g.drawOval(MID+200, TOP-150, 40, 35);                      // audience 2
      g.fillOval(MID+200, TOP-150, 40, 35); 
      g.fillOval(MID+160, TOP-200, 80, 60);
      //fillOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 

      ////////// clouds ///////////
      g.setColor (Color.white);                                  // clouds
      g2.setStroke(new BasicStroke(16)); 
      g.fillOval(MID+80, TOP+310, 40, 35);                    
      g.fillOval(MID+100, TOP+300, 50, 35); 
      g.fillOval(MID+50, TOP+300, 50, 35); 
      g.fillOval(MID, TOP+320, 80, 60);
      g.fillOval(MID-20, TOP+360, 30, 25);
      g.fillOval(MID-30, TOP+380, 25, 15); 
      //fillOval(UpLeftRecPointX, UpLeftRecPointY,width, height) 
     
    } 
   
  
}  

