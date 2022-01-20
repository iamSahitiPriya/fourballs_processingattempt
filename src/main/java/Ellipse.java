//import processing.core.PApplet;

public class Ellipse   {
    public int height=500;
    public int width=10;
    public int speed;


   Try_Process move;
    Ellipse(Try_Process move,int speed)
    {
        this.speed=speed;
        this.move=move;
    }
    public void firstellipse()
    {
        move.ellipse(width,height/5,20,20);
        width=width+speed;
    }
    public void secondellipse()
    {
        move.ellipse(width,2*height/5,20,20);
        width=width+speed;
    }
    public void thirdellipse()
    {
        move.ellipse(width,3*height/5,20,20);
        width=width+speed;
    }
    public void fourthellipse()
    {
        move.ellipse(width,4*height/5,20,20);
        width=width+speed;
    }




}
