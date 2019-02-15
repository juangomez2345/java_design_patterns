package strategy;

public class AuthenticationDB implements Strategy
{
	@Override
	public void authentication()
	{
		System.out.println("Estrategia Authentication DB");
	}
}
