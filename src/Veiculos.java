public abstract class Veiculos {

    // caracteriscas dos veículos
    String marca;
    String modelo;
    int ano;
    String cor;

    //atributo privado, conceito de encapsulamento
    private int VIN;

    public Veiculos(String marca, String modelo, int ano, String cor, int rodas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //getter e setter   
    public int getVIN() {
        return VIN;
    }
        public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    //metodos dos veiculos
    public Veiculos() {
    }

    public abstract void mover();
    public abstract void ligar();

}
