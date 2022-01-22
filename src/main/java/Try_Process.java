import processing.core.PApplet;
public class Try_Process extends PApplet {
    public int height=500;
    int x=0;
    int y=0;
    int z=0;
    int c=0;

    public static void main(String args[]) {

        PApplet.main("Try_Process");
    }
    @Override
    public void settings() {
        super.settings();
        size(640,500);
    }
    @Override
    public void setup()
    {



        }
    public void draw() {
        firstellipse();
        secondellipse();
        thirdellipse();
        fourthellipse();

    }
    public void firstellipse()
    {
        ellipse(x,height/5,20,20);
        x=x+1;
    }
    public void secondellipse()
    {
        ellipse(y,2*height/5,20,20);
       y=y+2;
    }
    public void thirdellipse()
    {
        ellipse(z,3*height/5,20,20);
        z=z+3;
    }
    public void fourthellipse()
    {
        ellipse(c,4*height/5,20,20);
        c=c+4;
    }


}
