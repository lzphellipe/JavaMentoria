package poo2;

import java.util.Date;

public class TesteSobreposicao {

    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descriptor = "Caixa de fósforo";
        pp.dataValidade = new Date();
        pp.identificar();
    }
}
