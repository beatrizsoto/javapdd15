
/*public class Strategy
{

}*/
public class Persona
{
	private String nombre;
	private String apellido;

	public String getNombre()
	{
		return nombre;
	}
	public void setNombre (String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
}

public class Alumno extends Persona
{
	private double promedio;

	public double getPromedio()
	{
		return promedio;
	}

	public void setPromedio(double promedio)
	{
		this.promedio = promedio;
	}
}

public class Profesor extends persona 
{
	private String legajo;

	public String getLegajo()
	{
		return legajo;
	}

	public void setCuota(double cuota)
	{
		this.cuota = cuota;
	}
}

public class Socio extends Persona
{
	private double cuota;

	public void setCuota(double cuota)
	{
		this.cuota = cuota;
	}
}

public class Biblioteca
{
	private static ArrayList<Libro> libors = new ArrayList<Libro>();

	public Biblioteca()
	{
		Libro libro = new Libro();
		libro.setEstado("Bueno");
		libro.setTitulo("Un titulo");

		// crear más libros
		libros.add(libro);

	}

	public static ArrayList<Libro> obtenerLibros()
	{
		return libros;
	}
}

public interface LibroStrategy
{
	public Libro findLibro(String titulo);
}

public class BuenoNuevoRegularStrategy implements LibroStrategy
{
	@override
	public Libro findLibro(String titulo)
	{
		ArrayList<Libro> libros = Biblioteca.obtenerLibros();
		//Aquí iría un algotirmo que busque libros segun el titulo
		//primerio buscaría aquellos libros en estado bueno,
		//luego los nuevo y por ultimo los regulares.
		//acá soy vago y solo retorno un libro en estado bueno.
		Libro libro = new Libro();
		libro.setEstado("Bueno");
		return libro;
	}
}

public class NuevoBuenoRegularStrategy implements LibroStrategy
{
	@override
	public Libro findLibro(String titulo)
	{
		ArrayList<Libro> libros = Biblioteca.obtenerLibros();
		//Aquí iría un algotirmo que busque libros segun el titulo
		//primerio buscaría aquellos libros en estado nuevo,
		//luego los bueno y por ultimo los regulares.
		//acá soy vago y solo retorno un libro en estado nuevo.
		Libro libro = new Libro();
		libro.setEstado("Nuevo");
		return libro;
	}
}

public class RegularBuenoNuevoStrategy implements LibroStrategy
{
	@override
	public Libro findLibro(String titulo)
	{
		ArrayList<Libro> libros = Biblioteca.obtenerLibros();
		//Aquí iría un algotirmo que busque libros segun el titulo
		//primerio buscaría aquellos libros en estado regular,
		//luego los bueno y por ultimo los nuevos.
		//acá soy vago y solo retorno un libro en estado regular.
		Libro libro = new Libro();
		libro.setEstado("Regular");
		return libro;
	}
}

public class LibroFinder 
{
	public Libro findLibro(Persona persona, String titulo)
	{
		LibroStrategy strategy = null;
		if (persona instanceof Socio)
			{
				strategy = new NuevoBuenoRegularStrategy();
			}
		else if (persona instanceof Profesor)
			{
				strategy = new BuenoNuevoRegularStrategy();
			}
		else 
			{
				strategy = new RegularBuenoNuevoStrategy();
			}
		return strategy.findLibro(titulo);
	}
}

public static void main(String[] args)
{
	Socio socio = new Socio();
	Libro libro = new LibroFinder().findLibro(socio,"migranitodejava");
	system.out.println(libro.getEstado());

}
