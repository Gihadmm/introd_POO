import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //criando instancias
        Carro onix = new Carro();
        onix.modelo= "Onix";
        onix.ano= 2013;
        onix.cor = "azul petroleo";
        onix.marca = "Toyota";
        onix.setVIN(123456123);
        System.out.println();

        Moto pop100 = new Moto();
        pop100.modelo= "Pop100";
        pop100.ano= 2014;
        pop100.cor = "verde";
        pop100.marca = "Honda";
        pop100.setVIN(40026922);










    }
}