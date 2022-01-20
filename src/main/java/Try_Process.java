import processing.core.PApplet;
public class Try_Process extends PApplet {
    Ellipse e1;
    Ellipse e2;
    Ellipse e3;
    Ellipse e4;

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

        e1=new Ellipse(this,1);
        e2=new Ellipse(this,2);
        e3=new Ellipse(this,3);
        e4=new Ellipse(this,4);

        }
    public void draw() {
        e1.firstellipse();
        e2.secondellipse();
        e3.thirdellipse();
        e4.fourthellipse();

    }

}
