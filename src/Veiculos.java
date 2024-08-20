public abstract class Veiculos {

    String marca;
    String modelo;
    int ano;
    String cor;

    public Veiculos(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public Veiculos() {
    }

    public abstract void mover();
    public abstract void ligar();


}
