
public class Nodo{

    private int priority;
    private float value;
    private Nodo nodoAnterior;
    private Nodo nodoSiguiente;

    public Nodo (float x, int y){
        this.value = x;
        this.priority = y;
    }

    public Nodo getNodePrev(){
        return this.nodoAnterior;
    }

    public Nodo getNodePost(){
        return this.nodoSiguiente;
    }
    
    public void setNodoPost(Nodo xNode){
        this.nodoSiguiente = xNode;
    }

    public void setNodoPrev(Nodo xNode) {
        this.nodoAnterior = xNode;
    }

    public int getPriority() {
        return this.priority;
    }

    public float getValue(){
        return this.value;
    }
    
}