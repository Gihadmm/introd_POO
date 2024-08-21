public abstract class Veiculos {

    // caracteriscas dos veículos
    String marca;
    String modelo;
    int ano;
    String cor;
    int rodas;

    private int VIN;
    int Rodas;

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public Veiculos(String marca, String modelo, int ano, String cor, int rodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.rodas = rodas;
    }

    public Veiculos() {
    }

    public abstract void mover();
    public abstract void ligar();


}
