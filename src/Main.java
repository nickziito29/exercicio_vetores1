import entities.Reserva;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int quarto = 0;
    System.out.println("Quantos quartos vão ser alugados?");
    int n = sc.nextInt();
    Reserva[] res = new Reserva[10];

    if (n<=10) {

        for (int i = 1; i <= n; i++) {

            System.out.println("Rent # " + i + ": ");
            System.out.print("Name: " );
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: " );
            String email = sc.next();
            System.out.print("Quarto: " );
            quarto = sc.nextInt();
            sc.nextLine();
            res[quarto] = new Reserva(name,email);

        }

        for (int i = 0; i < n; i++) {
            System.out.println("Quartos reservados: ");

            if (res[quarto] != null) {
                System.out.println(quarto + ": " + res[quarto].getName() + ", " + res[quarto].getEmail());
            }
        }
    }







    sc.close();

    }


}