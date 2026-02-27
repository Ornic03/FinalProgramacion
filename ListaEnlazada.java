public class ListaEnlazada 
{
    private Nodo cabeza;
    private int tamaño;

    public ListaEnlazada() 
    {
        cabeza = null;
        tamaño = 0;
    }

    public void agregar(Object dato) 
    {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) cabeza = nuevo;
        else 
        {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) actual = actual.getSiguiente();
            actual.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public boolean eliminar(Object dato) 
    {
        if (cabeza == null) return false;
        if (cabeza.getDato().equals(dato)) 
        {
            cabeza = cabeza.getSiguiente();
            tamaño--;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) 
            {
            if (actual.getSiguiente().getDato().equals(dato))
            {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                tamaño--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public Nodo getCabeza() 
    { 
        return cabeza; 
    }
    public int tamaño() 
    { 
        return tamaño; 
    }
}