package strategy;

public class StrategyPatternDemo 
{
	public static void main(String args[])
	{
		Context context = new Context();
		Strategy strategyA = new AuthenticationLDAP();
		Strategy strategyB = new AuthenticationDB();
		
		context.setStrategy(strategyA);
		context.authentication();
				
		context.setStrategy(strategyB);
		context.authentication();
				
		context.setStrategy(strategyA);
		context.authentication();
	}
	
}
