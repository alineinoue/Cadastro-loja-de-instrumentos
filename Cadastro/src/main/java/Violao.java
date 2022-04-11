public class Violao {
    
    private String marca;
    private int ano;
    private float valor;

    public Violao() {
        marca = "";
        ano = 0;
        valor = 0;
    }

    public Violao(String marca, int ano, float valor) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    } //Sobrecarga

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }    
}
