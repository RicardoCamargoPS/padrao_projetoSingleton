package padrao_projetoAbstractFactory.gof;

public class SportsCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		
		return new SportsCar();
	}

	@Override
	public Engine createEngine() {
		
		return new SportsEngine();
	}

}
