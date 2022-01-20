import processing.core.PApplet;
public class Try_Process extends PApplet {
       int speed1=0;int speed2=0;int speed3=0; int speed4=0;
       int height=500;
      public static void main(String args[]) {

              PApplet.main("Try_Process");
       }
       @Override
       public void settings() {
              super.settings();
              size(640, 480);
       }
       @Override
       public void setup()
       {
              //ellipse
       }
       public void draw() {
             firstellipse();
              secondellipse();
              thirdellipse();
              fourthellipse();
       }
       public void firstellipse()
       {
              ellipse(speed1,height/5,20,20);
              speed1++;
       }
       public void secondellipse()
       {
              ellipse(speed2,2*height/5,20,20);
              speed2=speed2+2;
       }
       public void thirdellipse()
       {
              ellipse(speed3,3*height/5,20,20);
              speed3=speed3+3;
       }
       public void fourthellipse()
       {
              ellipse(speed4,4*height/5,20,20);
              speed4=speed4+4;
       }

}




