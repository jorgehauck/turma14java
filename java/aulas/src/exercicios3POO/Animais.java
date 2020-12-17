package exercicios3POO;

public class Animais {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		Animal cavalo = new Cavalo();
		Animal preguica = new Preguica();
		
		
		cachorro.nome = "Hector";
		cavalo.nome = "Alipio";
		preguica.nome = "Dorminhoca";
		
		cachorro.emitirSom();
		cavalo.emitirSom();
		preguica.emitirSom();
	}

}
