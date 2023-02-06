import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli:");
        int a = scanner.nextInt();
        System.out.println("Ievadiet darbības (+,-,*,/)");
        char operation = scanner.next().charAt(0);
        System.out.println("Ievadiet otro skaitli:");
        int b = scanner.nextInt();
        if (operation == '+'){
            int result = a+b;
            System.out.println(a+"+"+b+"=" + result);
        } else if(operation =='-'){
            int result = a-b;
            System.out.println(a+'-'+b+ "="+ result);


        }
    }
}