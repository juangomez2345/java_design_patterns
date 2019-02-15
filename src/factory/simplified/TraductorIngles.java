package factory.simplified;

public class TraductorIngles extends Traductor{

	public String Numero(int numero) {
		switch(numero){
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		}
		return null;
	}
	
}
