package padrao_projetoAbstractFactory.gof;

public class FamilyCar implements Car {

	@Override
	public void assemble() {
		System.out.println("Montando um carro familiar.");

	}

	@Override
	public void start() {
		System.out.println("Iniciando o motor de um carro familiar.");

	}

}
