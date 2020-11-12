package esercizio;

public class Fiat implements CasaProduttrice {

	@Override
	public Utilitaria createUtilitaria() {
		// TODO Auto-generated method stub
		return new FiatUtilitaria();
	}

	@Override
	public Sportiva createSportiva() {
		// TODO Auto-generated method stub
		return new FiatSportiva();
	}

	@Override
	public Suv createSuv() {
		// TODO Auto-generated method stub
		return new FiatSuv();
	}
	
}
