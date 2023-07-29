import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dinheiro, troco, cem, cinquenta, vinte, dez,
			cinco, dois, umReal;
		double cinquentaCentavos, vinteECincoCentavos, dezCentavos,
		cincoCentavos, umCentavo;
		int divisao;
		
		dinheiro = sc.nextDouble();
		divisao = (int)(dinheiro * 100.0 + 0.5);
		
		cem = dinheiro / 100 ;	//5.767
		troco = dinheiro % 100;
		
		cinquenta = troco / 50; //1.153
		troco = dinheiro % 50;
		
		vinte = troco / 20;
		troco = dinheiro % 20;
		
		dez = vinte / 10;
		troco = dinheiro % 10;
		
		cinco = troco / 5;
		troco = dinheiro % 5;

		dois = troco / 2;
		troco = dinheiro % 2;
		
		umReal = troco / 1;
		troco = dinheiro % 1;
		
		//centavos - \/ 
		
		cinquentaCentavos = troco / 0.50;
		troco = dinheiro % 0.50;
		
		vinteECincoCentavos = troco / 0.25;
		troco = dinheiro % 0.25;
		
		dezCentavos = troco / 0.10;
		troco = dinheiro % 0.10;
		
		cincoCentavos = troco / 0.05;
		troco = dinheiro % 0.05;
		
		umCentavo = troco / 0.01;
		
		System.out.println("NOTAS:");
		System.out.println((int)cem + " nota(s) de R$ 100.00");
		System.out.println((int)cinquenta + " nota(s) de R$ 50.00");
		System.out.println((int)vinte + " nota(s) de R$ 20.00");
		System.out.println((int)dez + " nota(s) de R$ 10.00");
		System.out.println((int)cinco + " nota(s) de R$ 5.00");
		System.out.println((int)dois + " nota(s) de R$ 2.00");
	
		System.out.println("MOEDAS:");
		System.out.println((int)umReal + " moeda(s) de R$ 1.00");
		System.out.println((int)cinquentaCentavos + " moeda(s) de R$ 0.50");
		System.out.println((int)vinteECincoCentavos + " moeda(s) de R$ 0.25");
		System.out.println((int)dezCentavos + " moeda(s) de R$ 0.10");
		System.out.println((int)cincoCentavos + " moeda(s) de R$ 0.05");
		System.out.println((int)umCentavo + " moeda(s) de R$ 0.01");
	
		sc.close();

	}

}
