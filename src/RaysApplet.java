import java.awt.*;

public class RaysApplet extends java.applet.Applet {
    public void paint(Graphics g) {
     g.drawString("Hello world!", 5, 25);
     g.draw3DRect(100, 200, 400, 250, true );
     g.drawOval(100,200,300,300);
    }
}
