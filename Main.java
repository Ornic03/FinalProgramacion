public class Main 
{
    public static void main(String[] args) 
    {
        Biblioteca b = new Biblioteca("Central");

        Libro l1 = new Libro("Harry Potter", "001", "JK Rowling");
        Libro l2 = new Libro("El Hobbit", "002", "Tolkien");
        Libro l3 = new Libro("Código Limpio", "003", "Robert Martin");

        b.agregarLibro(l1);
        b.agregarLibro(l2);
        b.agregarLibro(l3);

        l1.prestar("Santiago");
        l1.prestar("Agostina");
        l1.devolver();

        System.out.println("Libros con 'Harry': " + b.buscarPorTitulo("Harry").tamaño());
        System.out.println("Libros de 'Tolkien': " + b.buscarPorAutor("Tolkien").tamaño());
        System.out.println(b.obtenerEstadisticas());
    }
}