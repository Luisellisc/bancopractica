package BANCO;

public class Deposito extends Banco {

    public Deposito(String usuario, double depositar, double saldo) {
        super(usuario, saldo,  depositar);
    }

    public void depositar(){
        double saldo = get_saldo() + get_deposito();
        set_saldo(saldo);

        System.out.println(get_usuario() + ", su saldo es de: " + get_saldo());
    }
}
