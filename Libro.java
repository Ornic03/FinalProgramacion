public class Libro 
{
    private String titulo, isbn, autor;
    private boolean disponible;
    private ListaEnlazada listaEspera;
    private ListaEnlazada historialPrestamos;

    public Libro(String titulo, String isbn, String autor) 
    {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        disponible = true;
        listaEspera = new ListaEnlazada();
        historialPrestamos = new ListaEnlazada();
    }

    public void prestar(String usuario) 
    {
        if (!disponible) 
        {
            listaEspera.agregar(usuario);
            System.out.println("Libro no disponible. " + usuario + " agregado a la lista de espera.");
            return;
        }
        disponible = false;
        historialPrestamos.agregar(usuario);
        System.out.println("Libro prestado a " + usuario);
    }

    public void devolver() 
    {
        disponible = true;
        if (listaEspera.tamaño() > 0) 
        {
            Nodo siguiente = listaEspera.getCabeza();
            listaEspera.eliminar(siguiente.getDato());
            prestar((String)siguiente.getDato());
        }
    }

    public String getTitulo() 
    { 
        return titulo; 
    }
    public String getAutor() 
    { 
        return autor; 
    }
    public String getIsbn() 
    { 
        return isbn; 
    }
    public boolean estaDisponible()
    { 
        return disponible; 
    }
}