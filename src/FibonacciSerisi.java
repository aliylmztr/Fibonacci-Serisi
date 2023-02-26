import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int element, first = 0, second = 1;

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        element = input.nextInt();

        for (int i = 1; i <= element + 1; i++) {
            System.out.print(first + " ");
            int total = first + second;
            first = second;
            second = total;
        }
    }
}
