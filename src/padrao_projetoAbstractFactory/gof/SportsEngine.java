package padrao_projetoAbstractFactory.gof;

public class SportsEngine implements Engine {

	@Override
	public void design() {
		System.out.println("Projetando um motor esportivo.");

	}

	@Override
	public void manufacture() {
		System.out.println("Fabricando um motor esportivo.");

	}

}
