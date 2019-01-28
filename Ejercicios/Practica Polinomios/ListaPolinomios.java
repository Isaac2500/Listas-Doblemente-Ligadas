
public class ListaPolinomios{

    private Nodo head;
    private int size;

    public ListaPolinomios(){
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        ListaPolinomios Ls = new ListaPolinomios();

        //Ls.insertarTermino();
        Ls.imprimirPolinomio();
    }

    public boolean encontrarSimilitudes(Nodo xNodo){
        
        Nodo temp = head;
        boolean band = false;

        if(this.listaVacia() == true){
            return false;
        }else{
            while(temp.obtenerSiguiente() != null || band == false){
            
                if (temp.obtenerExponente() == xNodo.obtenerExponente()) {
    
                    temp.establecerCoeficiente(xNodo.obtenerCoeficiente() + temp.obtenerCoeficiente());
                    band = true;
    
                } else {
                    temp = temp.obtenerSiguiente();    
                }
    
            }

            if(band == true){
                return true;
            }else{
                return false;
            }
        }     
    }

    public void insertarTermino(int x, int y){

        
        Nodo nuevo = new Nodo(x,y);
        
        if(nuevo.obtenerExponente()>this.gradoPolinomio()){
            Nodo temp = head;
            while(temp.obtenerSiguiente()!=null){
                temp = temp.obtenerSiguiente();
            }
            
            temp.enlazarSiguiente(nuevo);
            nuevo.enlazarAnterior(temp);
            size++;
        
        }else{

            if(this.encontrarSimilitudes(nuevo)!= true){

            }
        }

    }

    public boolean listaVacia(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }

    }

    public void imprimirPolinomio(){
        Nodo temp = head;
        while(temp.obtenerSiguiente() != null){
            temp = temp.obtenerSiguiente();
            System.out.println(temp.obtenerCoeficiente() + "x^" + temp.obtenerExponente() +" + ");
        }

    }

    public int gradoPolinomio(){
        Nodo temp= head;
        int grado = 0;

        while (temp.obtenerSiguiente() != null) {
            
            if(grado<temp.obtenerExponente()){
                grado = temp.obtenerExponente();
            }
            temp = temp.obtenerSiguiente();
        }

        return grado;
    }

}