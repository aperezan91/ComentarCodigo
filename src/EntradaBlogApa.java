/**
 * Clase para manejar las entradas de un blog.
 * @author Adrian Perez
 * @version 05/05/2020 3.0
 * @
 */

public class EntradaBlogApa {
	/**
	 * @author Adrian Perez
	 */
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Constructor de la clase
	 * @param id
	 * @param autor
	 * @param texto
	 * @throws IllegalArgumentException
	 */
	public EntradaBlogApa(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Devuelve el número de la entrada
	 * @return id
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Devuelve el texto completo de la entrada
	 * @return texto
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * Devuelve el nombre del autor de la entrada en mayúsculas
	 * @return autor
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * Devuelve el nombre del autor
	 * @deprecated usar getAutor
	 * @return autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * Metodo main 
	 * @param args
	 */
	public static void main(String[] args) {
		EntradaBlogApa e1=new EntradaBlogApa(-3,"adrian","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}