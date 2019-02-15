package strategy;

public class Context 
{
	Strategy c;

	public Context(){		
	}

	public void setStrategy(Strategy c) {
		this.c = c;
	}
	
	public void authentication()
	{
		c.authentication();
	}
}
