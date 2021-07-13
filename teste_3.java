package Testes;

import java.util.ArrayList;
import java.util.Scanner;

public class teste_3 {

	public static void main(String[] args) {
		
		// Primeira Semana
		Scanner scanner = new Scanner(System.in);
		double numeros[] = new double[5];
		for (int i = 0; i < numeros.length; i++) {
		    while (true) {
		        try {
		            System.out.println("Digite o " + (i + 1) + "º preço da primeira semana: ");
		            numeros[i] = Double.parseDouble(scanner.nextLine());
		            break;
		        } catch (NumberFormatException e) {
		            System.out.println("Você não digitou um número válido");
		        }
		    }
		}
		double soma = 0;
		for (double n : numeros) {
		    soma += n;
		  
		}
		
		
		// Segunda semana
		Scanner scanner2 = new Scanner(System.in);
		double numeros2[] = new double[5];
		for (int i = 0; i < numeros2.length; i++) {
		    while (true) {
		        try {
		            System.out.println("Digite o " + (i + 1) + "º  preço da segunda semana: ");
		            numeros2[i] = Double.parseDouble(scanner2.nextLine());
		            break;
		        } catch (NumberFormatException e) {
		            System.out.println("Você não digitou um número válido");
		        }
		    }
		}
		double soma2 = 0;
		for (double n : numeros2) {
		    soma2 += n;
		  
		}
		
		
		// Terceira Semana
		Scanner scanner3 = new Scanner(System.in);
		double numeros3[] = new double[5];
		for (int i = 0; i < numeros3.length; i++) {
		    while (true) {
		        try {
		            System.out.println("Digite o " + (i + 1) + "º valor da terceira semana: ");
		            numeros3[i] = Double.parseDouble(scanner3.nextLine());
		            break;
		        } catch (NumberFormatException e) {
		            System.out.println("Você não digitou um número válido");
		        }
		    }
		}
		double soma3 = 0;
		for (double n : numeros3) {
		    soma3 += n;
		  
		}
		
		
		// Quarta semana
		Scanner scanner4 = new Scanner(System.in);
		double numeros4[] = new double[5];
		for (int i = 0; i < numeros4.length; i++) {
		    while (true) {
		        try {
		            System.out.println("Digite o " + (i + 1) + "º valor da quarta semana: ");
		            numeros4[i] = Double.parseDouble(scanner4.nextLine());
		            break;
		        } catch (NumberFormatException e) {
		            System.out.println("Você não digitou um número válido");
		        }
		    }
		}
		double soma4 = 0;
		for (double n : numeros4) {
		    soma4 += n;
		    		  
		}
		
		double s1 = soma/5;
		double s2 = soma2/5;
		double s3 = soma3/5;
		double s4 = soma4/5;
		double total = (s1) + (s2) + (s3) + (s4);
		
		// Vetor para calcular maior e menor entre as semanas
		double [] vetor = { s1, s2, s3, s4};
		double menor;
		double maior;
		menor = vetor[0];
		maior = vetor[0];
		for (int i = 0; i < 4; i++) {
		    soma += vetor[i];
		    if (vetor[i] < menor) {
		        menor = vetor[i];
		    }
		    if (vetor[i] > maior) {
		        maior = vetor[i];
		    }
		}
		
		System.out.println("A média de preço da primeira semana foi de " + s1);
		System.out.println("A média de preço da segunda semana foi de " + s2);
		System.out.println("A média de preço terceira semana foi de " + s3);
		System.out.println("A média de preço quarta semana foi de " + s4);
		System.out.println("A média da mensal foi de " + (total/4));
		System.out.println("A média da semana mais baixa foi de " + menor);
		System.out.println("A média da semana mais alta foi de " + maior);
	}
 }
