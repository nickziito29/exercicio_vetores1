import entities.Reserva;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos vão ser alugados?");
        int n = sc.nextInt();
        Reserva[] res = new Reserva[n];









    sc.close();

    }


}