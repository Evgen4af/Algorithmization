
/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of matrix (m, n) ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] array = new int[m][n];
        for (int j = 0; j < array.length; j++) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (count == (j + 1)) {
                    break;
                }
                int randomRow = random.nextInt(m);
                while (array[randomRow][j] == 1) {
                    randomRow = random.nextInt(m);
                }
                array[randomRow][j] = 1;
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

            }
        }


    }
}
