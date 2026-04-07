import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 2. INICIAÇÃO: Ligando o Scanner ao seu teclado (System.in)
        Scanner leitor = new Scanner(System.in);

        // Pedimos para o usuário digitar algo
        System.out.println("Digite o primeiro número:");

        // 3. ARMAZENAMENTO: Criamos uma variável inteira (int) chamada 'A e B'
        // e mandamos o leitor capturar o próximo número inteiro que o usuário digitar
        int A = leitor.nextInt();

        System.out.println("Digite o segundo número:");
        int B = leitor.nextInt();

        leitor.close();

        System.out.println("\n--- OPERADORES ARITMÉTICOS (Matemática) ---");
        System.out.println("Soma (A + B): " + (A + B));
        System.out.println("Subtração (A - B): " + (A - B));
        System.out.println("Multiplicação (A * B): " + (A * B));
        System.out.println("Divisão (A / B): " + (A / B));
        System.out.println("Resto (A % B): " + (A % B));

        System.out.println("\n--- OPERADORES RELACIONAIS (Comparações) ---");
        System.out.println("A é igual a B? (A == B): " + (A == B));
        System.out.println("A é diferente de B? (A != B): " + (A != B));
        System.out.println("A é maior que B? (A > B): " + (A > B));
        System.out.println("A é menor que B? (A < B): " + (A < B));
        System.out.println("A é maior ou igual a B? (A >= B): " + (A >= B));
        System.out.println("A é menor ou igual a B? (A <= B): " + (A <= B));

        System.out.println("\n--- OPERADORES LÓGICOS (Combinações) ---");
        System.out.println("Os DOIS são maiores que zero? (A > 0 && B > 0): " + ((A > 0) && (B > 0)));
        System.out.println("PELO MENOS UM deles é igual a zero? (A == 0 || B == 0): " + ((A == 0) || (B == 0)));
        System.out.println("Invertendo o resultado de 'A é igual a B' (!(A == B)): " + !(A == B));
    }
}

