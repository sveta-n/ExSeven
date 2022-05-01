import java.util.Arrays;
import java.util.Scanner;

public class ExSeven {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите размер массива: ");
    int size = scanner.nextInt();
    int[] myArray = new int[size];
    System.out.println("Введите содержимое массива: ");

    for (int i = 0; i < size; i++) {
        myArray[i] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(myArray));
        int x = 2;
        int y = 4;
        int z = 6;

        for (int j : myArray) {
            if (j == x || j == y || j == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

    }
}
