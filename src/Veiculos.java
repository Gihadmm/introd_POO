public abstract class Veiculos {

    //atributos
    String Modelo;
    String Cor;
    String Marca;
    int Ano;
    private int VIN;

    public Veiculos(String Modelo, String Cor, String Marca, int Ano) {
        this.Modelo = Modelo;
        this.Cor = Cor;
        this.Marca = Marca;
        this.Ano = Ano;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVin(){
        this.VIN = 2;
    }



    public void Mover(){

        System.out.println("Vruuuummm");
    }




}
