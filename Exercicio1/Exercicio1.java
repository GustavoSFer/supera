import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // Quantidade de linhas que serão inseridas
        int linhas = Integer.parseInt(st.nextToken());
        // passando para Array
        List<Integer> listaNumeros = new ArrayList<>();
        
        // Coletando as informações e colocando dentro da lista
        for (int i = 0; i < linhas; i++) {
            st = new StringTokenizer(br.readLine());
            listaNumeros.add(Integer.parseInt(st.nextToken()));
        }
        // Filtrando numeros pares e impares e colocando em ordem que deseja
        var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        
        // Adicionando os valores em um novo array
        List<Integer> total = new ArrayList<>();
        total.addAll(pares);
        total.addAll(impares);

        //  imprimindo as informações do array
        total.forEach(System.out::println);
    }
}