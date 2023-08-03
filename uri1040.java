import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float nota1 = sc.nextFloat(); float peso1 = 2;
		float nota2 = sc.nextFloat(); float peso2 = 3;
		float nota3 = sc.nextFloat(); float peso3 = 4;
		float nota4 = sc.nextFloat(); float peso4 = 1;
		
		float media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) + (nota4 * peso4)) / (peso1 + peso2 + peso3 + peso4);
		
		System.out.printf("Media: %.1f%n", media);
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
		}
		
		if (sc.hasNextFloat()) {
		
			float notaExame = sc.nextFloat();
		
			System.out.printf("Nota do exame: %.1f%n", notaExame);
		
		float notaFinal = (media + notaExame) / 2;
		
		if (notaFinal >= 5.0) {
			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.println("Aluno reprovado.");
		}
		
		System.out.printf("Media final: %.1f%n", notaFinal);
		
		sc.close();
	
		}
	}
}
