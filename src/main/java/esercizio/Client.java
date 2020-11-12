package esercizio;

public class Client {
	private CasaProduttrice casaProduttrice;
	
	public void sceltaCasaProduttrice(CasaProduttrice cp) {
		casaProduttrice= cp;
	}
	
	public void sceltaModello(String modello) {
		if(modello.equalsIgnoreCase("Sportiva")) {
			Sportiva sportiva = casaProduttrice.createSportiva();
			sportiva.descrizione();
		}
		
		if(modello.equalsIgnoreCase("Utilitaria")) {
			Utilitaria utilitaria= casaProduttrice.createUtilitaria();
			utilitaria.descrizione();
		}
		
		if(modello.equalsIgnoreCase("Suv")) {
			Suv suv = casaProduttrice.createSuv();
			suv.descrizione();
		}
	}
}
