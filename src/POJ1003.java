
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author arthur
 */
public class POJ1003 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float target = scan.nextFloat();
        while (true) {
            if (target == 0) break;
            float sum = 0, count = 2;
            while (sum < target) {
                sum += 1.0 / count;
                count++;
            }
            System.out.println(((int)(count-2) + " card(s)"));
            target = scan.nextFloat();
        }
    }
}