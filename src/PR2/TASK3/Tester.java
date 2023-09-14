package PR2.TASK3;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int maxSize) {
        circles = new Circle[maxSize];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив объектов Circle полон. Нельзя добавить больше элементов.");
        }
    }

    public void displayCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Point point1 = new Point(2.0, 3.0);
        Point point2 = new Point(-1.0, 0.0);

        Circle circle1 = new Circle(point1, 5.0);
        Circle circle2 = new Circle(point2, 3.0);

        Tester tester = new Tester(2);
        tester.addCircle(circle1);
        tester.addCircle(circle2);

        tester.displayCircles();
    }
}


