package modelo;

public class Conta {
    
    private int numero;
    private String cliente;
    private double saldo;
    private double limite;

    //CONSTRUTOR

   public Conta (int numero, String cliente, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    //GETTERS E SETTERS
 
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int Numero) {
        this.numero = numero;
    }
    
    public String getCliente() {
        return this.cliente;
    }
    
    public void setCliente(String Cliente) {
        this.cliente = cliente;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double newSaldo) {
        this.saldo = newSaldo;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setLimite(String Limite) {
        this.limite = limite;
    }

}