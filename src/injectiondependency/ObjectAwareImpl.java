package injectiondependency;


public class ObjectAwareImpl implements IRequestAware, ISessionAware
{

	private String request;
	private String session;
	
	@Override
	public void setRequest(String request) {
		this.request=request;
	}
	
	@Override
	public void setSession(String session) {
		this.session=session;
	}
	
	public String getRequest(){
		return request;
	}
	
	public String getSession(){
		return session;
	}	
}
