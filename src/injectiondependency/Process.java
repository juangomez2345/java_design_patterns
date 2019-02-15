package injectiondependency;


public class Process {

	public static void main(String arg[])
	{
		Object objectAwareImpl = new ObjectAwareImpl(); 
		
        if (objectAwareImpl instanceof IRequestAware) 
        {
            ((ObjectAwareImpl) objectAwareImpl).setRequest("request1");
        }
        
        if (objectAwareImpl instanceof ISessionAware) 
        {
            ((ISessionAware) objectAwareImpl).setSession("session1");
        }

        System.out.println( ((ObjectAwareImpl) objectAwareImpl).getRequest() );
        System.out.println( ((ObjectAwareImpl) objectAwareImpl).getSession() );
        
	}
	
}
