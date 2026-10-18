package modelo;

public class Meta {
    
    private String objetivo;
    private double valorAlvo;
    private double valorPoupado;
    
//CONSTRUTOR

    public Meta(String objetivo, double valorAlvo, double valorPoupado) {
        
        this.objetivo = objetivo;
        this.valorAlvo = valorAlvo;
        this.valorPoupado = 0.0;
        
    }
    
    //GETTERS E SETTERS

    public String getObjetivo() {
        return this.objetivo;
    }    
    
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    public double getValorAlvo() {
        return this.valorAlvo;
    }    
    
    public void setValorAlvo(double valorAlvo) {
        this.valorAlvo = valorAlvo;
    }
    
    public double getValorPoupado() {
        return this.valorPoupado;
    }
    
    public void setValorPoupado(double valorPoupado) {
        this.valorPoupado = valorPoupado;
    }
    
}