package test;
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arthur
 */
public class Main {
    static char[] array = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
    'N','O','P','R','S','T','U','V','W','X','Y'};
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = Integer.parseInt(scan.nextLine());
        char[][] arrayOfPhoneNumber = new char[temp][7];
        char[] phoneNumber = new char[7];
        int[] result = new int[temp];
        boolean key = false;
        int port = 0;
        for(int i = 0; i < temp; i++) {
            result[i] = 1;
            String tempstr = scan.nextLine();
            phoneNumber = tempstr.replaceAll("-", "").toCharArray();
            for(int j = 0; j < 7; j++) {
                for(int k = 0; k < 24; k++) {
                    if (array[k] == phoneNumber[j])
                    {
                        phoneNumber[j] = (char)('0' - 0 + ((k / 3) + 2));
                        break; 
                    }
                }
            }
            for(int l = 0; l < i; l++) {
                key = true;
                for(int m = 0; m < 7; m++) {
                    if (phoneNumber[m] != arrayOfPhoneNumber[l][m]) {
                        key = false;
                        break;
                    }
                }
                if (key == true) {
                    result[l]++;
                    break;
                }
            }
            if (key == false) {
                arrayOfPhoneNumber[port] = phoneNumber;
                port = i + 1;
            }
        }
        key = false;
        for(int i = 0;i < temp; i++) {
            if (result[i] > 1) {
                key = true;
                System.out.print(arrayOfPhoneNumber[i][0]); 
                System.out.print(arrayOfPhoneNumber[i][1]); 
                System.out.print(arrayOfPhoneNumber[i][2]);
                System.out.print("-");
                System.out.print(arrayOfPhoneNumber[i][3]); 
                System.out.print(arrayOfPhoneNumber[i][4]); 
                System.out.print(arrayOfPhoneNumber[i][5]); 
                System.out.print(arrayOfPhoneNumber[i][6]); 
                System.out.print(" " + result[i]);
                System.out.println();
            }
        }
        if (key == false) {
            System.out.println("No duplicates.");
        }
    }
   
    
}
