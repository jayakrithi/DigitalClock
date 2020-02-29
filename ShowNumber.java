import javafx.scene.canvas.GraphicsContext;
import sun.font.GraphicComponent;
import sun.java2d.loops.DrawLine;
import javax.swing.JFrame;
import java.awt.*;

public class ShowNumber{

    public ShowNumber(int x, int y){
    //int number = n;
    } 
    Polygon polya = new Polygon();
    Polygon polyb = new Polygon();
    Polygon polyc = new Polygon();
    Polygon polyd = new Polygon();
    Polygon polye = new Polygon();
    Polygon polyf = new Polygon();
    Polygon polyg = new Polygon();
    int y1, y2, y3, y4, y5 =0;
    public void a(Graphics g, int x, int y){
      
        polya.addPoint(x+10,y+10);
        polya.addPoint(x+20,y+0);
        polya.addPoint(x+40,y+0);
        polya.addPoint(x+50,y+10);
        polya.addPoint(x+40,y+20);
        polya.addPoint(x+20,y+20);
        g.setColor(Color.WHITE);
        g.fillPolygon(polya); 
        polya.reset();
      
        
    }

    public void b(Graphics g, int x, int y){
        
        polyb.addPoint(x+50,y+10);
        polyb.addPoint(x+60,y+20);
        polyb.addPoint(x+60,y+40);
        polyb.addPoint(x+50,y+50);
         polyb.addPoint(x+40,y+40);
         polyb.addPoint(x+40,y+20);
        g.setColor(Color.WHITE);
        g.fillPolygon(polyb);
        polyb.reset();
       
    }

    public void c(Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        polyc.addPoint(x+50,y+50);
        polyc.addPoint(x+60,y+60);
        polyc.addPoint(x+60,y+80);
        polyc.addPoint(x+50,y+90);
        polyc.addPoint(x+40,y+80);
        polyc.addPoint(x+40,y+60);
        g.fillPolygon(polyc);
        polyc.reset();
        
    }

    public void d(Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        polyd.addPoint(x+10,y+90);
        polyd.addPoint(x+20,y+80);
        polyd.addPoint(x+40,y+80);
        polyd.addPoint(x+50,y+90);
        polyd.addPoint(x+40,y+100);
        polyd.addPoint(x+20,y+100);
        g.fillPolygon(polyd);
        polyd.reset();
        
    }

    public void e(Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        polye.addPoint(x+10,y+50);
        polye.addPoint(x+20,y+60);
        polye.addPoint(x+20,y+80);
        polye.addPoint(x+10,y+90);
        polye.addPoint(x+0,y+80);
        polye.addPoint(x+0,y+60);
        g.fillPolygon(polye);
        polye.reset();
        
    }

    public void f(Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        polyf.addPoint(x+10,y+10);
        polyf.addPoint(x+20,y+20);
        polyf.addPoint(x+20,y+40);
        polyf.addPoint(x+10,y+50);
        polyf.addPoint(x+0,y+40);
        polyf.addPoint(x+0,y+20);
        g.fillPolygon(polyf);
        polyf.reset();
        
    }

    public void g(Graphics g, int x, int y){
        g.setColor(Color.WHITE);
        polyg.addPoint(x+20,y+40);
        polyg.addPoint(x+40,y+40);
        polyg.addPoint(x+50,y+50);
        polyg.addPoint(x+40,y+60);
        polyg.addPoint(x+20,y+60);
        polyg.addPoint(x+10,y+50);
        g.fillPolygon(polyg);
        polyg.reset();
        
    }

    public void number(Graphics g,int x, int y,int n){
        if (n == 0){
            a(g,x,y);b(g,x,y);c(g,x,y);d(g,x,y);e(g,x,y);f(g,x,y);
           } else if (n == 1){
             b(g,x,y);c(g,x,y);
           } else if (n == 2){
             a(g,x,y);b(g,x,y);g(g,x,y);e(g,x,y);d(g,x,y);
           } else if (n == 3){
             a(g,x,y);b(g,x,y);g(g,x,y);c(g,x,y);d(g,x,y);
           } else if (n == 4){
             b(g,x,y);g(g,x,y);c(g,x,y);f(g,x,y);
           } else if (n == 5){
             a(g,x,y);f(g,x,y);g(g,x,y);c(g,x,y);d(g,x,y);
           } else if (n == 6){
            f(g,x,y);g(g,x,y);e(g,x,y);d(g,x,y);c(g,x,y);
           } else if (n == 7){
             a(g,x,y);b(g,x,y);c(g,x,y);
           } else if (n == 8){
             a(g,x,y);b(g,x,y);c(g,x,y);d(g,x,y);e(g,x,y);f(g,x,y);g(g,x,y);
           } else if (n == 9) {
             a(g,x,y);b(g,x,y);c(g,x,y);g(g,x,y);f(g,x,y);
           } else {
             e(g,x,y);g(g,x,y);c(g,x,y);
           }
    

    }
   
}