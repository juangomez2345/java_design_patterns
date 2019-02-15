package decorator.simplified;

/*

  Imaginemos que vendemos automóviles 
  y el cliente puede opcionalmente adicionar ciertos componentes 
  (aire acondicionado, mp3 player, etc). 
  Por cada componente que se adiciona, el precio varía

*/

public abstract class AutoDecorator implements IVendible {
	private IVendible iVendible;
	
	public AutoDecorator(IVendible iVendible){
		this.iVendible=iVendible;
	}

	public IVendible getiVendible() {
		return iVendible;
	}
	public void setiVendible(IVendible iVendible) {
		this.iVendible = iVendible;
	}
	
	
	
	/** el codigo main no forma parte del patron,
    solo se utiliza para aplicar el patron */	
	public static void main(String[] args) 
	{
		IVendible auto = new FiatUno();
		auto = new AireAcondicionado(auto);
		
		System.out.println(auto.getDescripcion());
		System.out.println(auto.getPrecio());
		
		IVendible auto2 = new FordFiesta();
		auto2 = new AireAcondicionado(auto2);
		auto2 = new Mp3Player(auto2);
		
		System.out.println(auto2.getDescripcion());
		System.out.println(auto2.getPrecio());		
		
	}

}
