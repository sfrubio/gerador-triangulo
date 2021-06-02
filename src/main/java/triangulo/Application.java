package triangulo;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite o lado A: ");
        int ladoA = entrada.nextInt();

        System.out.printf("Digite o lado B: ");
        int ladoB = entrada.nextInt();

        System.out.printf("Digite o lado C: ");
        int ladoC = entrada.nextInt();

        Triangulo triangulo = new Triangulo();
        String tipoTriangulo = triangulo.classificaTriangulo(ladoA, ladoB, ladoC);
        System.out.println("O triângulo é " + tipoTriangulo);
    }
}
