import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Алёха on 30.10.2016.
 */
public class Demo{
    public static void main(String[] args) {

        PrintWriter writer;
        writer = null;
        try {
            writer = new PrintWriter("Robot.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Point start = new Point(0, 0);
        Point end = new Point(12, 22);

        Robot robot = new Robot(start);
        robot.move(start);
        writer.println(robot.toString());
        robot.turnLeft();
        writer.println(robot.toString());
        robot.walk();
        robot.turnRight();


        writer.close();

        System.out.println("Координаты введены в файл");

    }
}

