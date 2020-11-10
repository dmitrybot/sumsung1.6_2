import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        if (x > y){
            if (x > z){
                if (y > z){
                    System.out.println(z + " " + y + " " + x);
                } else {
                    System.out.println(y + " " + z + " " + x);
                }
            } else {
                System.out.println(y + " " + x + " " + z);
            }
        } else {
            if (y > z){
                if (x > z){
                    System.out.println(z + " " + x + " " + y);
                } else {
                    System.out.println(x + " " + z + " " + y);
                }
            } else {
                System.out.println(x + " " + y + " " + z);
            }
        }
    }
}
