package esercizio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Client client = new Client();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scelga la casa produttrice : \n 1 per Fiat \n 2 Ferrari");
		int sceltaCasaProd = scanner.nextInt();
		
		switch(sceltaCasaProd) {
		case 1:
			client.sceltaCasaProduttrice(new Fiat());
			break;
			
		case 2:
			client.sceltaCasaProduttrice(new Ferrari());
			break;
		}
		
		
		System.out.println("Quale modello desidera? \n Sportiva \n Utilitaria \n Suv");
		Scanner scanner2 = new Scanner(System.in);
		String scelta = scanner2.nextLine();
		client.sceltaModello(scelta);
		
		switch(scelta) {
		case "Sportiva":
			client.sceltaCasaProduttrice(new Fiat());
			break;
			
		case "Utilitaria":
			client.sceltaCasaProduttrice(new Ferrari());
			break;
		case "Suv":
			client.sceltaCasaProduttrice(new Ferrari());
			break;
		}
		
	}
}
