package esercizio;

public class Ferrari implements CasaProduttrice {
	
	public Utilitaria createUtilitaria() {
		return new FerrariUtilitaria();
	}

	@Override
	public Sportiva createSportiva() {
		// TODO Auto-generated method stub
		return new FerrariSportiva();
	}

	@Override
	public Suv createSuv() {
		// TODO Auto-generated method stub
		return new FerrariSuv();
	}
	
	
}
