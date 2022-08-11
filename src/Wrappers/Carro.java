package Wrappers;

import poo.Proprietario;

public class Carro {

    String fabricante;
    public String modelo;
    String cor;
    Integer anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono;

    public void  alterarModelo(String modelo) {
        if(modelo != null) {
           this.modelo = modelo;
        }
    }

    void ligar() {
        if(modelo !=null) {
            System.out.println("Ligando o carro"+ modelo);
        }
    }
}
