 /* @author Giuliane
 */

import java.util.Scanner;
import java.util.Random;
public class Advinhacao {
    public static void main(String[] args) throws Exception {
        System.out.println("> * * * Bem vindo ao jogo da advinhação! * * *\n\n> Vou gerar um número automaticamente e você deve advinhar qual número estou \"pensando\".\n> Tudo pronto? Vamos lá!");
    
        Random rand = new Random();
        int upperbound = 10;

        int numeroRandom = rand.nextInt(upperbound);
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
            int contatorTentativas = 0; //mas e se a pessoa for até 1000 tentativas? Deveria colocar uma barreira nisso, como um game over.

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
            System.out.printf("Parabéns! Você acertou em %d tentativas!\n\n",contatorTentativas); //depois de quantas tentativas?
        }
        read.close();
    }
}
