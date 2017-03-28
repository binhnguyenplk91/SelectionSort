package selectionsort;

import java.util.Scanner;

/**
 *
 * @author BinhTN264
 */
public class SelectionSort {

    int[] value = new int[5];
    int i = 0;
    int j = 0;

    void Input() {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 number:");
        for (i = 0; i < 5; i++) {
            value[i] = sc.nextInt();
        }
    }

    void OutPut() {
        System.out.println("After selection sort:");
        for (int i = 0; i < 5; i++) {
            System.out.print(+value[i] + " ");
        }
    }

    void Processing() {
        int temp = 0;
        for (j = 0; j < 4; j++) {
            for (i = j + 1; i < 5; i++) {
                if (value[j] > value[i]) {
                    temp = value[j];
                    value[j] = value[i];
                    value[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        ss.Input();
        ss.Processing();
        ss.OutPut();
    }
}
