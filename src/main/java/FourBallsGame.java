import processing.core.PApplet;

public class FourBallsGame extends PApplet {
    public static final int majorAxis = 50;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    public static final int minorAxis = 50;
    private static int ballAPosition=0, ballBPosition=0, ballCPosition=0, ballDPosition=0;
    private static final int ballAY = HEIGHT/5, ballBY = (2*HEIGHT)/5, ballCY=(3*HEIGHT)/5, ballDY=(4*HEIGHT)/5;
    public static void main(String args[]){
        PApplet.main("FourBallsGame",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ballAPosition, ballAY, majorAxis, minorAxis);
        ellipse(ballBPosition, ballBY, majorAxis, minorAxis);
        ellipse(ballCPosition, ballCY, majorAxis, minorAxis);
        ellipse(ballDPosition, ballDY, majorAxis, minorAxis);
        ballAPosition+=1;
        ballBPosition+=2;
        ballCPosition+=3;
        ballDPosition+=4;
    }
}
