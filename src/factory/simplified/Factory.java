package factory.simplified;

public class Factory {

	public static Traductor Traduce(String idioma){
		Traductor traductor=null;
		if(idioma.equalsIgnoreCase("ingles")){
			traductor = new TraductorIngles();
		}
		if(idioma.equalsIgnoreCase("espanol")){
			traductor = new TraductorEspanol();
		}
		return traductor;
	}
	
	
	/** el codigo main no forma parte del patron,
    solo se utiliza para aplicar el patron */	
	public static void main(String[] args) {
		System.out.println("pattern factory");
		Traductor traductor = Factory.Traduce("ingles");
		System.out.println(traductor.Numero(1));
	}
}
