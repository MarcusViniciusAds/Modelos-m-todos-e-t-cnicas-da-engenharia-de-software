
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Nissan", "GTR35", 2017);

        System.out.println("--- Primeiro programa orientado a objeto ---");

        System.out.println("Informações do carro: ");
        meuCarro.informacoesCarro();

        System.out.println("O carro vai acelerar: ");
        meuCarro.barulhoMotor();
    }
}