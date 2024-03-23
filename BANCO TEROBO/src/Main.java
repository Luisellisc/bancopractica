//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import BANCO.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 5000;

        System.out.println(" Ingrese su usuario");
        String usuario = sc.nextLine();
        System.out.println("Cantidad depositada");
        double depo = Double.parseDouble(sc.nextLine());



        Banco depositar = new Deposito(usuario,depo, saldo );
        Banco.depositar();
    }
}