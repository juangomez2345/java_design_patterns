package facade.simplified;

public class Facade 
{
	private OpcAlumno opcAlumno = new OpcAlumno();
	private OpcMaestro opcMaestro = new OpcMaestro();
	
	public void registraUsuario(Usuario usuario){
		if(usuario instanceof Alumno)
			opcAlumno.registraAlumno(usuario);
		if(usuario instanceof Maestro)
			opcMaestro.registraMaestro(usuario);
	}
	
	
	/** el codigo main no forma parte del patron,
    solo se utiliza para aplicar el patron */	
	public static void main(String[] args) 
	{
		Facade facade = new Facade();
		Usuario alumno = new Alumno();
		Usuario maestro = new Maestro();
		 
		alumno.setNombre("carlos");
		maestro.setNombre("juan");
		 
		facade.registraUsuario(alumno);
		facade.registraUsuario(maestro);
	}
}
