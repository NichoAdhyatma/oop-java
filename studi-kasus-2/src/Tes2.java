import no2.View.*;

public class Tes2 {
    public static void main(String[] args) {
        View viewCube = new ViewCube();
        View viewBall = new ViewBall();

        System.out.println("Calculate Volume of Ball");
        viewBall.inputShape();
        viewBall.showVolume();

        System.out.println("================");

        System.out.println("Calculate Volume of Cube");
        viewCube.inputShape();
        viewCube.showVolume();
    }
}