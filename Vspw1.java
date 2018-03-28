import java.applet.*;
import java.awt.*;
public class Vspw1 extends Applet
{
  String msg;
  public void init()
  {
   setBackground(Color.pink);
   setForeground(Color.black);
   msg="background color is pink";
   }
public void paint (Graphics g)
{
   g.drawString(msg,50,80);
  
}
}
/*<Applet code = "Vspw1.class" width=300 Height=400>
</Applet>
*/

