package fundamentos;

public class OperadoresArimeticos {

    public static void main(String[] args) {
        int notaAluno1 = 99;
        int notaAluno2 = 80;
        int notaAluno3 = 53;

      /*  int soma = 2+10;
        int subtracao = 6-10;
        int multiplicacao = 8*3;
        int divisao = 8/2;
        int resto = 7 %2;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);*/



        int totalGeral = notaAluno1 + notaAluno2 + notaAluno3;
        System.out.println("Total geral: " + totalGeral);

        int mediaGeral = (notaAluno1 + notaAluno2 + notaAluno3) / 3;
        System.out.println("Media geral: " + mediaGeral);
    }


}
