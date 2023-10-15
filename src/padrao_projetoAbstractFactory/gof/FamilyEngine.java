package padrao_projetoAbstractFactory.gof;

public class FamilyEngine implements Engine {

	@Override
	public void design() {
		System.out.println("Projetando um motor familiar.");

	}

	@Override
	public void manufacture() {
		System.out.println("Fabricando um motor familiar.");
	}
}
