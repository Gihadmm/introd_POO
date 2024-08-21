public class Carro extends Veiculos {



    public int rodas(){
        int rodas = 4;
        System.out.println("A quantidade de roda é: " + rodas);
        return rodas;
    }

    public void mover() {
        System.out.println("O carro se move de maneira suave e controlada");
    }

    public void ligar() {
        System.out.println("O Carro está ligado");
    }


}
