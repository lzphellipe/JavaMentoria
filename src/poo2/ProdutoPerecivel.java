package poo2;

import java.util.Date;

public class ProdutoPerecivel {

    public String descriptor;
    protected Date dataValidade;

    public void identificar() {
        super.identificar();
        System.out.println("Minha data de validade é: " + dataValidade);
    }
}
