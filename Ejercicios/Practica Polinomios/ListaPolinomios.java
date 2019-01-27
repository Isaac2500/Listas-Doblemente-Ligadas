
public class ListaPolinomios{

    private Nodo head;
    private int size = 0;

    public ListaPolinomios(){
        this.head = null;
    }

    public static void main(String[] args) {
        ListaPolinomios Ls = new ListaPolinomios();

        Ls.insertarTermino(new Nodo(4,2));
        Ls.imprimirPolinomio();
    }

    public boolean encontrarSimilitudes(Nodo xNodo){
        
        Nodo temp = head;
        boolean band = false;

        if(temp.obtenerSiguiente() == null){
            return false;
        }else{
            while(temp.obtenerSiguiente() != null || band == false){
            
                if (temp.obtenerExponente() != xNodo.obtenerExponente()) {
    
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

    public void insertarTermino(Nodo xNodo){
        
        if(this.encontrarSimilitudes(xNodo) != true){
            Nodo temp = head;
            
            if(temp.obtenerSiguiente() == null){
                
                temp.enlazarSiguiente(xNodo);
                xNodo.enlazarAnterior(temp);
                size++;

            }else{

                int band = 0;
                while (temp.obtenerSiguiente() != null || band == 0) {
                    
                    if(temp.obtenerExponente()<xNodo.obtenerExponente()){
                        band = 1;
                    }else{
                        temp = temp.obtenerSiguiente();
                    }
                }

               Nodo temp2 = head;

               while(temp2.obtenerSiguiente()!=temp){
                    temp2 = temp2.obtenerSiguiente();    
               }

               xNodo.enlazarSiguiente(temp);
               xNodo.enlazarAnterior(temp2);
               temp.enlazarAnterior(xNodo);
               temp2.enlazarSiguiente(xNodo);

               size++;
            }
        }
    }

/*    public void ordenarTermino(Nodo xNode){
        
        Nodo temp = head;
        while(temp.obtenerSiguiente() != null || temp.obtenerExponente()<xNode.obtenerExponente()){
            
        }

    }
*/
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


}