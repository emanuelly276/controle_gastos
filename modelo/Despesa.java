package modelo;

public class Despesa {
    
    private String descricao;
    private double valor;
    private String status;


//CONSTRUTOR

    public Despesa(String descricao, double valor, String status) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = "Pendente";
    }

    //GETTERS E SETTERS
 
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
}