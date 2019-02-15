package strategy;

public class AuthenticationLDAP implements Strategy
{
	@Override
	public void authentication() 
	{
		System.out.println("Estrategia Authentication LDAP");
	}

}
