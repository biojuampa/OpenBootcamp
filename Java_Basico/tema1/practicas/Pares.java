import java.util.Scanner;

public class Pares {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Dime un número (0 para salir): ");
            int num = sc.nextInt();

            if (num == 0)
                break;
            
            for (int i=0; i<=num; i++) {
                if (i%2 != 0)
                    continue;
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

