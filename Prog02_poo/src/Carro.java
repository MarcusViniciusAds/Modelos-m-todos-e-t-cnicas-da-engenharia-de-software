
public class Carro {
    // atributos (características do carro) //
    String marca;
    String modelo;
    int ano;

    // contrutor //
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // métodos (ações) //
    public void barulhoMotor(){
        System.out.println("Vrum-vrum-vruuumm");
    }
    public void informacoesCarro(){
        System.out.println("Marca " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Ano " + ano);
    }
}
