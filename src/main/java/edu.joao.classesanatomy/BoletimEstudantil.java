package edu.joao.classesanatomy;

public class BoletimEstudantil {

    public static void main(String[] args) {

        int finalMedia = 2;

        if(finalMedia < 6) {
            System.out.println("Reprovado");
        }
        else if (finalMedia == 6) {
            System.out.println("Prova Minerva");
        }
        else System.out.println("Aprovado");

    }
}
