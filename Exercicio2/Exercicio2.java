import java.util.Scanner;

public class Exercicio2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // Recebendo informação do valor
    float valor = teclado.nextFloat();

    int[] notas = {100, 50, 20, 10, 5, 2};
    double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

    System.out.println("Notas:");
    // Percorrendo as notas e fazendo o calculo mostrando os valores
    for (int i = 0; i < notas.length; i++) {
      int quantidade_nota = (int)valor / notas[i];
      System.out.println(quantidade_nota + " nota(s) de R$ " + (float)notas[i]);
      valor -= quantidade_nota * notas[i];
    }

    System.out.println("Moedas:");
    // Percorrendo as moedas e fazendo o calculo mostrando os valores
    for (int i = 0; i < moedas.length; i++) {
      int quantidade_moeda = (int)(valor / moedas[i]);
      System.out.println(quantidade_moeda + " moeda(s) de R$ " + (float)moedas[i]);
      valor -= quantidade_moeda * moedas[i];
    }

    teclado.close();

  }
}