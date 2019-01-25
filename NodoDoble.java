
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

    public void enlazarSiguiente(NodoDoble xNodo){
        this.nodoSiguiente = xNodo;
    }

    public void enlazarAnterior(NodoDoble xNodo){
        this.nodoAnterior = xNodo;
    }

    public void setDato(Object Dato){
        this.data = Dato;
    }


}