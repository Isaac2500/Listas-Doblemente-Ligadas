
public class ListaDoblementeEnlazada{

    private NodoDoble head;
    private int size;

    public static void main(String[] args) {
        
    }
    
    public ListaDoblementeEnlazada (){
        this.head = null;
        this.size = 0;
    }

    //------------Metodos_auxiliares-------------
    public boolean listaVacia() {
        
        if(size == 0){
            return true;
        }else{
            return false;
        }

    }

    public void imprimirLista(){
        NodoDoble temp = head;

        while(temp.obtenerSiguiente() != null){
            temp = temp.obtenerSiguiente();
            System.out.println(temp.data);
        }
    }
    //-------------------------------------------

    //------------Metodos_para_insertar----------
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
                for(int i=0; i<index-1 && temp.obtenerSiguiente() != null;i++){
                    temp = temp.obtenerSiguiente();
                }

                NodoDoble nuevoNodo = new NodoDoble(data);
                nuevoNodo.enlazarSiguiente(temp.obtenerSiguiente());
                nuevoNodo.enlazarAnterior(temp);
                temp.obtenerSiguiente().enlazarAnterior(nuevoNodo);
                temp.enlazarSiguiente(nuevoNodo);
                
                size++;
            }
        }else{
            this.insertarPrimero(data);
        }
    }
    //-----------------------------------------------------------------

    //----------------Metodos de Eliminacion---------------------------
    public void eliminarPrimero(){
        if(this.listaVacia() != true){
            this.head.obtenerSiguiente().obtenerSiguiente().enlazarAnterior(head);    
            this.head.enlazarSiguiente(this.head.obtenerSiguiente().obtenerSiguiente());
            size--;
        }else{
            System.out.println("Lista Vacia");
        }
    }

    public void eliminarUltimo(){
        if(this.listaVacia() != true){
            NodoDoble temp1 = head;
            NodoDoble temp2 = head;

            while (temp1.obtenerSiguiente() != null) {
                temp1 = temp1.obtenerSiguiente();
            }

            while(temp2.obtenerSiguiente() != temp1){
                temp2 = temp2.obtenerSiguiente();
            }

            temp2.enlazarSiguiente(null);
            size--;
        }else{
            System.out.println("Lista Vacia");
        }
    }

    public void eliminarIndice(int index){
        if(this.listaVacia() != true){  
            if (index>size) {
                System.out.println("Indice fuera de rango");
            } else {
                if (index == 0) {
                    this.eliminarPrimero();
                }else{
                     
                    NodoDoble temp = head;
                    for (int i = 0; i < index-1 && temp.obtenerSiguiente() != null; i++) {
                        temp = temp.obtenerSiguiente();
                    }
                    temp.obtenerSiguiente().obtenerSiguiente().enlazarAnterior(temp);
                    temp.enlazarSiguiente(temp.obtenerSiguiente().obtenerSiguiente());
                    size--;
                }

            }
        }else{
            System.out.println("Lista Vacia");
        }
    }
    //-----------------------------------------------------------------

}