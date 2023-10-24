public class Carro{
    private String cor;
    private String modelo;
    private String placa;
    private int aro;
    private double valorCarro;
    
public int getAro(){
    return aro;
}
public void setAro(int aro){
    this.aro = aro;
}
public String getCor(){
    return cor;
}
public void setCor(String cor){
    this.cor = cor;
}
public String getModelo(){
    return modelo;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}
public String getPlaca(){
    return placa;
}
public void setPlaca(String placa){
    this.placa = placa;
}
public double getValorCarro(){
    return valorCarro;
}
public void setAro(double valorCarro){
    this.valorCarro = valorCarro
    ;
}
    public Carro(){

    }
    public Carro(int aro){
        this.aro=aro;
    }
    public Carro(int aro, String modelo){
        this.aro=aro;
        this.modelo=modelo;
    }
    public Carro(int aro, String modelo, double valorCarro){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
    }
    public Carro(int aro, String modelo, double valorCarro, String cor){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
        this.cor=cor;
    }
    public Carro(int aro, String modelo, double valorCarro, String cor, String placa){
        this.aro=aro;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
        this.cor=cor;
        this.placa=placa;
    }
    //4 atributos para o Carro e faça três construtores
}