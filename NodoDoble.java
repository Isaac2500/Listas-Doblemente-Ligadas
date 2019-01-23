
public class NodoDoble{

    NodoDoble nodoAnterior;
    NodoDoble nodoSiguiente;
    Object data;

    public NodoDoble(Object data){

        this.data = data;

    }

    public NodoDoble obtenerAnterior(){
        return this.nodoAnterior;
    }

    public NodoDoble obtenerSiguiente(){
        return this.nodoSiguiente;
    }

    public void enlazarSiguiente(Nodo xNodo){
        this.nodoSiguiente = xNodo;
    }

    public void enlazarAnterior(Nodo xNodo){
        this.nodoAnterior = xNodo;
    }

    public void setDato(Objetc Dato){
        this.data = Dato;
    }


}