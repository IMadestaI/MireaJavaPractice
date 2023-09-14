package PR2.TASK2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(20.4, 10.3);
        System.out.println(ball1);
        System.out.println(ball2);
        ball1.setXY(10, 10);
        System.out.println(ball1);
        ball1.move(-5.7, 3.5);
        System.out.println(ball1);
    }
}
