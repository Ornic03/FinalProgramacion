public class Cola 
{
    private Nodo frente, fin;

    public void encolar(Object dato) 
    {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) 
            { frente = fin = nuevo; 

        }
        else 
        { fin.setSiguiente(nuevo); fin = nuevo;
            
        }
    }

    public Object desencolar() 
    {
        if (frente == null) return null;
        Object dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) fin = null;
        return dato;
    }

    public boolean estaVacia()
    {
        return frente == null; 
    }
}
