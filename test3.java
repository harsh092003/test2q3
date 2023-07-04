import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int number;
        
        System.out.println("Enter a list of numbers (-1 to stop):");

        do {
            number = scanner.nextInt();
            if (number != -1) {
                numbers.add(number);
            }
        } while (number != -1);
        
        scanner.close();

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();
        System.out.println("Average: " + average);
    }
}


