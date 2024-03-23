package BANCO;

public abstract class Banco {
    private String usuario;

    private double saldo;

    private double depositar;

    private double retirar;

    public Banco(String usuario, double saldo, double depositar) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.depositar = depositar;
        this.retirar = retirar;
    }

    public  String get_usuario() {
        return this.usuario;
    }


    public double get_saldo() {
        return this.saldo;
    }

    public void set_saldo(double saldo){
        this.saldo = saldo;
    }

    public double get_deposito() {
        return this.depositar;
    }

    public void set_deposito(double depositar){
        this.depositar = depositar;
    }

    public double get_retiro() {
        return this.retirar;
    }

    public void set_retiro(double retirar) {
        this.retirar = retirar;
    }
}

