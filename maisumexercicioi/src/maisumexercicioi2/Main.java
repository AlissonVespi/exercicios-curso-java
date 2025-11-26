package maisumexercicioi2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        double raio, area;
        double pi = 3.14159;

        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A = %.4f%n", area);

        sc.close();

	}

}
