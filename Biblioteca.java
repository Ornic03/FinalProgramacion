public class Biblioteca 
{
    private String nombre;
    private ListaEnlazada libros;

    public Biblioteca(String nombre) 
    { this.nombre = nombre; libros = new ListaEnlazada(); 

    }

    public void agregarLibro(Libro libro) 
    { libros.agregar(libro);
        
    }

    public Libro buscarPorIsbn(String isbn) 
    {
        Nodo actual = libros.getCabeza();
        while (actual != null) 
        {
            Libro l = (Libro) actual.getDato();
            if (l.getIsbn().equals(isbn)) return l;
            actual = actual.getSiguiente();
        }
        return null;
    }

    public ListaEnlazada buscarPorTitulo(String titulo) 
    {
        ListaEnlazada resultado = new ListaEnlazada();
        Nodo actual = libros.getCabeza();
        while (actual != null) 
        {
            Libro l = (Libro) actual.getDato();
            if (l.getTitulo().toLowerCase().contains(titulo.toLowerCase())) resultado.agregar(l);
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    public ListaEnlazada buscarPorAutor(String autor) 
    {
        ListaEnlazada resultado = new ListaEnlazada();
        Nodo actual = libros.getCabeza();
        while (actual != null) 
        {
            Libro l = (Libro) actual.getDato();
            if (l.getAutor().toLowerCase().contains(autor.toLowerCase())) resultado.agregar(l);
            actual = actual.getSiguiente();
        }
        return resultado;
    }

    public String obtenerEstadisticas() 
    {
        int total = libros.tamaño(), disponibles = 0, prestados = 0;
        Nodo actual = libros.getCabeza();
        while (actual != null) 
        {
            Libro l = (Libro) actual.getDato();
            if (l.estaDisponible()) disponibles++;
            else prestados++;
            actual = actual.getSiguiente();
        }
        return "Total de libros: " + total + "\nDisponibles: " + disponibles + "\nPrestados: " + prestados;
    }
}