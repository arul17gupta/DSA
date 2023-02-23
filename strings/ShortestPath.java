import java.util.*;

public class ShortestPath {

    public static float getPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            }

            else if (dir == 'N') {
                y++;
            }

            else if (dir == 'E') {
                x++;
            }

            else if (dir == 'W') {
                x--;
            }
else{
    System.out.println("enter the correct path: ");
    break;
}
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Enter the path: ");

String path = sc.nextLine();

System.out.println(getPath(path));

    }
}
