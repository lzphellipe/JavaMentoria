package poo;

public class Caminhada {

    public void andar(Pessoa pessoa) {
        System.out.println("Eu \""+ pessoa.nome +"\"" + "está " +
                "andando com o \"" + pessoa.cachorro.nome +"\"");
    }
}
