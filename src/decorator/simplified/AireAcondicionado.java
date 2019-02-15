package decorator.simplified;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(IVendible iVendible) {
		super(iVendible);
	}

	
	public String getDescripcion() {
		return getiVendible().getDescripcion() + " + Aire Acondicionado";
	}

	
	public int getPrecio() {
		return getiVendible().getPrecio() + 1500;
	}

}
