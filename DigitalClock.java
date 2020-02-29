
import javax.swing.JFrame;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DigitalClock extends JFrame {
  int x =0; 
  int y =0;

  ShowNumber num = new ShowNumber(x,y);

    public void paint(Graphics g){
      // Background of the clock
        
        g.setColor(Color.BLUE);
        g.fillRect(70,100,600,350);
        

        Thread time = new Thread(){
          public void run() {
            try {
                for(; ;){
                /* Calendar class has the details of date and time 
                    Creating an object of type Calendar and considering 
                    every digit of the Hours, minutes and seconds of system time.
                */
                Calendar cal = new GregorianCalendar();
                int minute = cal.get(Calendar.MINUTE);
                int hour = cal.get(Calendar.HOUR);
                int second = cal.get(Calendar.SECOND);
                // Hour
                num.number(g,170,200, hour);  
                
                // Seperation :
                g.fillOval(250, 230, 20, 20);
                g.fillOval(250, 270, 20, 20);

                // Minute 
                int minmin = minute%10;
                int minmax = minute/10;
                int secmin = second%10;
                int secmax = second/10;
                num.number(g,300, 200,minmax);
                num.number(g,375, 200,minmin);

                // Seperation :
                g.fillOval(452, 230, 20, 20);
                g.fillOval(452, 270, 20, 20);

                // Seconds
                num.number(g,500, 200,secmax);
                num.number(g,575, 200,secmin);

                 sleep(1000);

                 // Redraw the background 
                //  g.drawRect(70,100,300,300);
               
                 g.setColor(Color.BLUE);                
                 g.fillRect(70,100,600,350);
                 
                }
            } catch (InterruptedException e){
              e.printStackTrace();
            }
          }
        }; time.run();
      
       
    }
   
    // Setup  GUI window 
    public static void main(String args[]){
    DigitalClock clock = new DigitalClock();
    clock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    clock.setSize(750,500);
    clock.setVisible(true);
    clock.setTitle("Digital Clock");
    
    }
}

    
