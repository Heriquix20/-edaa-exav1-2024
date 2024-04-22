package ListaAv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LerArquivo read = new LerArquivo();
        OrdenarPaises ordenar = new OrdenarPaises();
        Scanner sc = new Scanner(System.in);
        List<Country> paises = new ArrayList<>();
    
        String menu = """
            \n\nDigite a opção desejada:
            [1] Ordenar por Ordem Alfabética
            [2] Ordenar por audiência TV
            [3] Encerrar
            """;
        int opcao = 0;

        do {
        System.out.println(menu);
        opcao = sc.nextInt();
    
        switch (opcao) {
            case 1:
            read.readFile(paises);
            ordenar.ordenarAlfabetica(paises);
            ordenar.imprimirLista(paises);
            break;

            case 2:
            read.readFile(paises);
            ordenar.ordenarTvAudience(paises);
            ordenar.imprimirLista(paises);
            break;

            case 3:
            System.out.println("Encerrando o programa...");
            System.exit(0);
            break;

            default:
            System.out.println("Digite um número válido!");
            break;
        }
    } while(opcao != 1 && opcao != 2 && opcao != 3);

    sc.close();
  }
}

