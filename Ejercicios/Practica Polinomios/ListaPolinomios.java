
public class ListaPolinomios{

    private Nodo head;
    private int size;

    public ListaPolinomios(int dato, int exp){
        this.head = new Nodo(dato, exp);
        this.size = 1;
    }

    public static void main(String[] args) {
        ListaPolinomios Ls = new ListaPolinomios();

        //Ls.insertarTermino(3,4);
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

    //Para  este metodo, determinamos 3 casos
    public void insertarTermino(int x, int y){
        Nodo temp;
        Nodo nuevo = new Nodo(x,y);
        //Como al instanciar una lista comenzara con un elemento.
        //La lista nunca estara vacia, aqui se determina si el elemento nuevo es de mayor exponente 
        //que el ya existente
        if(size == 1){
            
            if(head.obtenerExponente()<nuevo.obtenerExponente()){
                head.enlazarSiguiente(nuevo);
                nuevo.enlazarAnterior(head);
                size++;
            }else{
                temp = head;
                head = nuevo;
                head.enlazarSiguiente(temp);
                temp.enlazarAnterior(head);
                size++;
            }
        //Si la lista tiene mas de un elemento se procede a lo siguiente    
        }else{
            
            //Agrega termino al final si el exponente es mayor al del polinomio
            //porque el polinomio esta ordenado de menor a mayor
            if(nuevo.obtenerExponente()>this.gradoPolinomio()){
                temp = head;
                while(temp.obtenerSiguiente()!=null){
                    temp = temp.obtenerSiguiente();
                }
                
                temp.enlazarSiguiente(nuevo);
                nuevo.enlazarAnterior(temp);
                size++;
            //----------------------------------------------------------------
            }else{
            //Si el nuevo termino no es de mayor grado, quiere decir que puede ser que exista un termmino
            //Con en mismo grado o simplemente no se ha añadido un termino de dicho grado    
            //Si el termino a agregar es de diferente gradoque alguno existente se procede con lo siguiente    
                if(this.encontrarSimilitudes(nuevo)!= true){
                    temp = head;
                    //Mientras el exponente del nuevo nodo sea mayor a los terminos del polinomio hasta
                    //Encontrar un termino de mayor exponente
                    //RECORRELO
                    while(nuevo.obtenerExponente()>temp.obtenerExponente()){
                        temp = temp.obtenerSiguiente();
                    }
                    //En este momento tomamos en cuenta que temp esta en un termino con mayor exponente que 
                    //el nuevo nodo y procedemos a enlazarlo
                    nuevo.enlazarSiguiente(temp);
                    nuevo.enlazarAnterior(temp.obtenerAnterior());
                    temp.obtenerAnterior().enlazarSiguiente(nuevo);
                    temp.enlazarAnterior(nuevo);

                }
            //-----------------------------------------------------------------    
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