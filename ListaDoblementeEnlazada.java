
public class ListaDoblementeEnlazada{

    private NodoDoble head;
    private int size;

    public static void main(String[] args) {
        
    }
    
    public ListaDoblementeEnlazada (){
        this.head = null;
        this.size = 0;
    }

    public boolean listaVacia() {
        
        if(size == 0){
            return true;
        }else{
            return false;
        }

    }

    public void insertarPrimero(Object data) {
        
        NodoDoble temp = head;
        head = new NodoDoble(data);
        temp.enlazarAnterior(head);
        head.enlazarSiguiente(temp);
        size++;

    }

    public void insertarFinal(Object data) {
        
        if(this.listaVacia() != true){
            NodoDoble temp = head;

            while (temp.obtenerSiguiente() != null) {
                temp = temp.obtenerSiguiente();
            }

            temp.enlazarSiguiente(new NodoDoble(data));
            temp.obtenerSiguiente().enlazarAnterior(temp);

            size++;

        }else{
            this.insertarPrimero(data);
        }
        
    }

    public void insertarIndice(int index,Object data) {
        if(this.listaVacia() != true){
            
            if(index > size){
                System.out.println("Indice fuera de rango");
            }else{
                NodoDoble temp = head;
                
            }
        }else{
            this.insertarPrimero(data);
        }
    }
}