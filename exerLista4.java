package exxmatrizedemais;

import java.util.Scanner;

public class exerLista4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Questao1
        float[] notas = {7.5f, 4.0f, 9.2f, 5.5f, 8.0f, 6.5f, 3.2f, 10.0f, 7.0f, 5.8f};
        float media = calcularMedia(notas);
        float maior = encontrarMaiorNota(notas);
        int qntMedia = contarAcimaMedia(notas, media);
        System.out.printf("Média = %.2f\n", media);
        System.out.printf("Maior nota = %.2f\n", maior);
        System.out.printf("Quantidade que ficou na média ou acima = %d\n", qntMedia);

       //Questão2
        System.out.print("Digite o valor: ");
        int dinheiro = sc.nextInt();
        calcularTroco(dinheiro);

       //Questão3
        System.out.print("Digite sua senha: ");
        String senha = sc.next();
        validarSenha(senha);

       //Questão4
        System.out.print("Digite o tempo em segundos: ");
        int tempo = sc.nextInt();
        converterTempo(tempo);

        //Questão 5
        System.out.print("Quantos números deseja inserir no vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vect[i] = sc.nextInt();
        }
        if (temRepetidos(vect)) {
            System.out.println("Há números repetidos na lista.");
        } else {
            System.out.println("Não há números repetidos na lista.");
        }

        //Questão6
        int[] vetorParaInverter = {10, 20, 30, 40, 50};
        System.out.print("Vetor original: ");
        imprimirVetor(vetorParaInverter);
        inverterLista(vetorParaInverter); 
        System.out.print("Vetor invertido: ");
        imprimirVetor(vetorParaInverter);

        sc.close();
    }

    //exxer1
    public static float calcularMedia(float[] notas) {
        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static float encontrarMaiorNota(float[] notas) {
        float maior = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        return maior;
    }

    public static int contarAcimaMedia(float[] notas, float media) {
        int qntMedia = 0;
        for (int j = 0; j < notas.length; j++) {
            if (notas[j] >= media) {
                qntMedia++;
            }
        }
        return qntMedia;
    }

   //exer2
    public static void calcularTroco(int dinheiro) {
        int troco1 = dinheiro / 50;
        int resto1 = dinheiro % 50;
        int troco2 = resto1 / 20;
        int resto2 = resto1 % 20;
        int troco3 = resto2 / 10;

        System.out.println(troco1 + " notas de 50");
        System.out.println(troco2 + " notas de 20");
        System.out.println(troco3 + " notas de 10");
    }

    //exer3
    public static void validarSenha(String senha) {
        int tamanho = senha.length();

        if (tamanho < 8) {
            System.out.println("Senha Inválida, não possui pelo menos 8 caracteres");
            return;
        }

        for (int i = 0; i < tamanho; i++) {
            char c = senha.charAt(i);
            if (c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*') {
                System.out.println("Senha é Válida");
                return;
            }
        }

        System.out.println("Senha Inválida, não possui pelo menos um caractere especial (ex: @, #, $, %, & ou *)");
    }

    //exer4
    public static void converterTempo(int tempo) {
       
        int hora = tempo / 3600;
        int resto = tempo % 3600;
        int min = resto / 60;
        int segundos = resto % 60;

        System.out.println(tempo + " segundos deve resultar em " + hora + "h " + min + "min e " + segundos + "seg");
    }

    //exer5
    public static boolean temRepetidos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //exx 6
    public static void inverterLista(int[] vetor) {
        int n = vetor.length;
        
        for (int i = 0; i < n / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[n - 1 - i];
            vetor[n - 1 - i] = temp;
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


