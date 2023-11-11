import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite sua nota da primeira avaliação:");
        float nota1 = entrada.nextFloat();
        System.out.println("Digite sua nota da segunda avaliação:");
        float nota2 = entrada.nextFloat();
        System.out.println("Digite sua nota da terceira avaliação:");
        float nota3 = entrada.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A sua média foi de %.2f \n", media);

        if(media >= 7) {
            System.out.printf("Parábens %s! Você foi aprovado!", nome);
        } else {
            System.out.println("Infelizmente você foi reprovado.");
        }
    }
}