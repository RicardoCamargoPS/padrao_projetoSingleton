package padrao_projetoAbstractFactory.gof;

public class FamilyCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		
		return new FamilyCar();
	}

	@Override
	public Engine createEngine() {
		
		return new FamilyEngine();
	}

}
