 /* @author Giuliane
 */

import java.util.Scanner;
import java.util.Random;
public class Advinhacao {
    public static void main(String[] args) throws Exception {
        System.out.println("> * * * Bem vindo ao jogo da advinhação! * * *\n\n> Vou gerar um número automaticamente e você deve advinhar qual número estou \"pensando\".\n> Tudo pronto? Vamos lá!");
    
        Random rand = new Random();
        int min = 1;
        int max = 10;

        int numeroRandom = rand.nextInt((max - min) + 1) + min; //Não sei a lógica por trás dessa equação...
        int guess;
        System.out.println("> Digite um número entre 1 e 10: ");
        Scanner read = new Scanner(System.in);
        guess = read.nextInt();

        for(int i = 0; guess < 0 || guess > 10; i++) {
                System.out.println("> Número inválido. Tente um número entre 1 e 10: ");
                guess = read.nextInt();
        }

        if (guess == numeroRandom) {
            System.out.println("> Acertou de primeira! Excelente chute!");
        } else {
            int contatorTentativas = 0;

            do {
            System.out.print("> Errou. Mas não desista! ");

            if (guess > numeroRandom) {
                System.out.println("O número que estou \"pensando\" é menor do que seu número informado: ");
                guess = read.nextInt();
                contatorTentativas++;
            } else if (guess < numeroRandom) {
                System.out.println("O número que estou \"pensando\" é maior do que seu número informado: ");
                guess = read.nextInt();
                contatorTentativas++;
            } for(int i = 0; guess < 0 || guess > 10; i++) {
                System.out.println("> Número inválido. Tente um número entre 1 e 10: ");
                guess = read.nextInt();
        }   } while (guess != numeroRandom);
            System.out.printf("Parabéns! Você acertou em %d tentativas!\n\n",contatorTentativas + 1);
        }
        read.close();
    }
}
