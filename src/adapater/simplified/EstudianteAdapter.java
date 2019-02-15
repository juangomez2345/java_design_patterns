package adapater.simplified;

public class EstudianteAdapter {
	private Student student = new Student();
	
	public void asignarNombre(String nombre){
		student.setName(nombre);
	}
	public void imprimeNombre(){
		System.out.println(student);
	}
	
	
	/** el codigo main no forma parte del patron,
    solo se utiliza para aplicar el patron */
	public static void main(String[] args) 
	{
		EstudianteAdapter estudianteAdapter = new EstudianteAdapter();
		estudianteAdapter.asignarNombre("juan");
		estudianteAdapter.imprimeNombre();
	}
}
