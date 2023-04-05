import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = input.nextInt();

        int total=0;

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". enter the number: ");
            numbers[i] = input.nextInt();
            if (numbers[i] %2==1){
                total += numbers[i];
            }
        }
        System.out.println("The sum of the odd numbers entered= "+total);
    }
}
