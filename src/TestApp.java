import padrao_projetoAbstractFactory.gof.Car;
import padrao_projetoAbstractFactory.gof.CarFactory;
import padrao_projetoAbstractFactory.gof.Engine;
import padrao_projetoAbstractFactory.gof.FamilyCarFactory;
import padrao_projetoAbstractFactory.gof.SportsCarFactory;
import padrao_projetoBuider.gof.Pessoa;
import padrao_projetoBuider.gof.PessoaConstrutor;
import padrao_projetoFacade.gof.Facade;
import padrao_projetoSingleton.gof.SingletonEager;
import padrao_projetoSingleton.gof.SingletonLazy;
import padrao_projetoSingleton.gof.SingletonLazyHolder;
import padrao_projetoStrategy.gof.Comportamento;
import padrao_projetoStrategy.gof.ComportamentoAgressivo;
import padrao_projetoStrategy.gof.ComportamentoDefensivo;
import padrao_projetoStrategy.gof.ComportamentoNormal;
import padrao_projetoStrategy.gof.Robo;

public class TestApp {
	
	public static void main(String[] args) {

		// Teste relacionados ao design Pattern Singleton 
		

		System.out.println("Design Pattern Singleton testes \n");

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);


		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager); eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder); lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Teste relacionados ao design Pattern Strategy

		System.out.println("\nDesign Pattern Strategy testes \n");

		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();

		robo.setComportamento(defensivo);
		robo.mover();

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();		

		// Teste relacionados ao design Pattern Facade

		System.out.println("\nDesign Pattern Facade testes \n");

		Facade facade = new Facade();
		facade.migrarClientes("Venilton", "14801788");

		// Teste relacionados ao design Pattern Abstract Factory

		System.out.println("\nDesign Pattern Abstract Factory testes \n");

		CarFactory sportsCarFactory = new SportsCarFactory();
		Car sportsCar = sportsCarFactory.createCar();
		Engine sportsEngine = sportsCarFactory.createEngine();

		sportsCar.assemble();
		sportsEngine.design();
		sportsEngine.manufacture();
		sportsCar.start();

		System.out.println();

		CarFactory familyCarFactory = new FamilyCarFactory();
		Car familyCar = familyCarFactory.createCar();
		Engine familyEngine = familyCarFactory.createEngine();

		familyCar.assemble();
		familyEngine.design();
		familyEngine.manufacture();
		familyCar.start();

		// Teste relacionados ao design Pattern Builder

		System.out.println("\nDesign Pattern Builder testes \n");

		Pessoa persoa1 = new PessoaConstrutor()
				.withNome("João")
				.withIdade(30)
				.construtor();

		Pessoa persoa2 = new PessoaConstrutor()
				.withNome("Maria")
				.withEndereco("Rua ABC, 123")
				.construtor();

		System.out.println("Person 1: " + persoa1);
		System.out.println("Person 2: " + persoa2);
	}

}
