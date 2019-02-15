package decorator.simplified;

public class Mp3Player extends AutoDecorator {

	public Mp3Player(IVendible iVendible) {
		super(iVendible);
	}

	
	public String getDescripcion() {
		return getiVendible().getDescripcion() + " + Mp3Palyer";
	}

	
	public int getPrecio() {
		return getiVendible().getPrecio() + 250;
	}

}
