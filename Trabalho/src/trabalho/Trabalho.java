package trabalho;

import java.util.Scanner;

public class Trabalho {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        /* int[] surrogates = {0xD83D, 0xDC7D};
         String alienEmojiString = new String(surrogates, 0, surrogates.length);
         System.out.println(alienEmojiString);*/
        System.out.println("\uD83D\uDC7D");
        Relatando r = new Relatando();
        int op = 0;
        while (op != 6) {
            System.out.println("--------------------------ESCOLHA---------------------------\n"
                    + "Opção 1: Mostre os livros em ordem crescente pelo número de páginas.\n"
                    + "Opção 2: Mostre todos os livros separados por área.\n"
                    + "Opção 3: Mostrar qual a editora possui a maior quantidade de obras (mostrar\n"
                    + "o nome da editora, a quantidade de livros e os livros).\n"
                    + "Opção 4: Mostrar qual a editora possui a menor quantidade de obras\n"
                    + "(mostrar o nome da editora, a quantidade de livros e os livros)\n"
                    + "Opção 5: Cadastro\n"
                    + "Opção 6: Sair\n");
            System.out.print("Digite a opção entre 1 a 6: \n");
            op = Integer.parseInt(l.nextLine());
            boolean c = false;
            do {
                try {

                    c = true;
                } catch (NumberFormatException n) {
                    System.out.println("Isso não é um número inteiro, colega 👍");
                }

            } while (c);

            switch (op) {
                case 1:
                    r.Relatorio1();
                    break;

                case 2:
                    r.Relatorio2();
                    break;
                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Nome do livro: \r");
                    break;
                case 6:
                    System.out.println("Vazando..👋👋👋👋👋👋");
                    break;
                default:

                    break;

            }
        }
    }

}
