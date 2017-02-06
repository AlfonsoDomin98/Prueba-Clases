
public class AlumnoTest {

	public static void main(String[] args) {
		
		Alumno alum = new Alumno();
		Alumno alum1 = new Alumno();
		Alumno alum2 = new Alumno();
		String [] asign ={"LLMM","BBDD","Programacion"};

		
		alum.nombre = "Pepe";
		alum1.nombre = "Paco";
		alum2.nombre = "Ramon";
		alum1.apellido = "Muñoz";
		alum.apellido = "Giraldez";
		alum2.apellido = "Vazquez";
		alum.asignatura = asign;
		alum1.asignatura = asign;
		alum2.asignatura = asign;	
		alum.edad = 18;
		alum1.edad = 25;
		alum2.edad = 31;
		
		System.out.println("La ficha del alumno: " + alum.nombre +" " +alum.apellido);
		System.out.println("Edad: "+alum.edad );
		System.out.println("Asignaturas: "+alum.asignatura);
		System.out.println("");
		System.out.println("La ficha del alumno: "+ alum1.nombre +" " +alum1.apellido);
		System.out.println("Edad: "+alum1.edad );
		System.out.println("Asignaturas: "+alum1.asignatura);
		System.out.println("");
		System.out.println("La ficha del alumno: "+ alum2.nombre +" " +alum2.apellido);
		System.out.println("Edad: "+alum2.edad );
		System.out.println("Asignaturas: "+alum2.asignatura);
		
		

	}

}
