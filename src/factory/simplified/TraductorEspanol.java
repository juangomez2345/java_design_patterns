package factory.simplified;

public class TraductorEspanol extends Traductor{

	public String Numero(int numero) {
		switch(numero){
		case 1: return "uno";
		case 2: return "dos";
		case 3: return "tres";
		}
		return "unknow";
	}

}
