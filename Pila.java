public class Pila 
{
    private Nodo cima;

    public void apilar(Object dato) 
    {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    public Object desapilar() 
    {
        if (cima == null) return null;
        Object dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }

    public boolean estaVacia()
    { 
        return cima == null;
     }
}