public class Nodo {

    private Nodo siguiente;
    private Nodo anterior;
    private int dato;
    private int exponente;
    
    public Nodo(int dato, int exp) {

        this.siguiente = null;
        this.anterior = null;
        this.dato = dato;
        this.exponente = exp;
    }

    public void enlazarSiguiente(Nodo Nodex) {

        this.siguiente = Nodex;

    }

    public Nodo obtenerSiguiente() {

        return siguiente;

    }

    public void enlazarAnterior(Nodo Nodex) {

        this.anterior = Nodex;

    }

    public Nodo obtenerAnterior() {

        return anterior;

    }

    public int obtenerCoeficiente() {

        return this.dato;

    }

    public void establecerCoeficiente(int dato) {

        this.dato = dato;

    }
    
    public int obtenerExponente(){
        return this.exponente;
    }
    
    

}
