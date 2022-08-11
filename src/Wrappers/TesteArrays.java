package Wrappers;

public class TesteArrays {

    public static void main(String[] args) {
        int[] notas =  new int[4];
        notas[0] = 5;
        notas[1] = 10;
        notas[2] = 8;
        notas[3] = 9;

        System.out.println("Nota do primeiro aluno é "+ notas[0]);

        System.out.println("Tamanho do array:"+ notas.length);
        for (int i = 0; i <notas.length; i++) {
            System.out.println("Posição["+i +"]=" + notas[i]);

        }

    }


}
