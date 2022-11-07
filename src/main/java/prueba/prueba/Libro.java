package prueba.prueba;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"autor", "clave","nombre", "editorial", "isbn"})

public class Libro { 
    private String nombre;
    private String clave;
   
    private String autor;
    private String editorial;
    private String isbn;
    public Libro(String nombre,String clave,String autor, String editorial, String isbn) {
		super();
        this.clave=clave;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}   
	public Libro() {}
    public String getNombre() { return nombre; }
    public String getAutor() { return autor;  }
    public String getEditorial() {return editorial; }
    public String getIsbn() { return isbn;}
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setEditorial(String editorial) { this.editorial = editorial;  }
    public void setIsbn(String isbn) {  this.isbn = isbn;  }
    @XmlAttribute(name="clave")
    public String getClave() {return clave;    }
    public void setClave(String clave) {this.clave = clave; }
}
