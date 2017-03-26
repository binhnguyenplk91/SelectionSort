package selectionsort;

import java.util.Scanner;

/**
 *
 * @author BinhTN264
 */
public class SelectionSort {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int[] value = new int[5];
        System.out.println("Enter 5 number:");
        for (i = 0; i < 5; i++) {            
            value[i] = sc.nextInt();
        }
        int temp = 0;
        for (int j = 0; j < 4; j++) {
            for (i = j + 1; i < 5; i++) {
                if (value[j] > value[i]) {

                    temp = value[j];
                    value[j] = value[i];
                    value[i] = temp;
                }
            }
        }
        System.out.println("After selection sort:");
        for (i = 0; i < 5; i++) {
            System.out.print(+value[i] + " ");
        }
    }
}
