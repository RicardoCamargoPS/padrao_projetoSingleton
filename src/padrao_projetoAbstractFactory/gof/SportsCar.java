package padrao_projetoAbstractFactory.gof;

public class SportsCar implements Car {

	@Override
	public void assemble() {
		System.out.println("Montando um carro esportivo.");

	}

	@Override
	public void start() {
		System.out.println("Iniciando o motor de um carro esportivo.");

	}

}
