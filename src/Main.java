


public class Main {
    public static void main(String[] args) {

        Carro onix = new Carro();
        onix.modelo= "Onix";
        onix.ano= 2013;
        onix.cor = "azul petroleo";
        onix.marca = "Toyota";

        onix.setVIN(123456123);
        System.out.println(onix.getVIN());
    }
}