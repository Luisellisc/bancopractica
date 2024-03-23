package BANCO;

public class Retiro extends Banco{
    private double retirar;
    public Retiro(String usuario, String contra,  double saldo, double retirar) {
        super(usuario,contra,saldo);
        this.retirar = retirar;
    }

    public double get_retirar() {
        return retirar;
    }
    public void retirar() {
        double saldo = get_saldo() - retirar;
        set_saldo(saldo);

        System.out.println(get_usuario() + ",su saldo es de: " + get_saldo());
    }
}
