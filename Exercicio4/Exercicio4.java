import java.util.Scanner;

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String frase = teclado.nextLine();

    StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
    StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
    
    parte1.reverse();
    parte2.reverse();

    System.out.println(parte1.toString() + parte2.toString());
		

    teclado.close();
  }
}