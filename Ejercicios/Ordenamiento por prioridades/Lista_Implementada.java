
public class Lista_Implementada{

    private Nodo head_1;
    private Nodo head_2;
    private Nodo head_3;
    int size = 0;
    public static void main(String[] args) {
        Lista_Implementada Ls = new Lista_Implementada();
        Ls.insertar(3, 1);
        Ls.insertar(2, 2);
        Ls.insertar(1, 3);
        Ls.imprimirLista();
    }

    public Lista_Implementada(){
        this.head_1 = null;
        this.head_2 = null;
        this.head_3 = null;
    }

    public boolean listaVacia(){
        if(size == 0){
           return true; 
        }else{
            return false;
        }
    }

    public void insertar(float x, int y){
        Nodo temp;
        Nodo temp2;
        Nodo nuevo;
        switch(y){
            case 1:
                
               if (head_1 == null) {
                   head_1 = new Nodo(x, y);
                   this.enlazarLista();
               } else {
                   
                    if(head_1.getNodePost() == null){
                        head_1.setNodoPost(new Nodo(x,y));
                        this.enlazarLista();
                    }else{
                        temp = head_1;
                        
                        do {
                            temp = temp.getNodePost();
                        } while (temp.getValue()>x||temp.getNodePost() != null);
                        
                        if(temp.getNodePost() == null){
                            
                            temp.setNodoPost(new Nodo(x,y));
                            temp.getNodePost().setNodoPrev(temp);
                            this.enlazarLista();

                        }else{
                            temp2 = temp.getNodePrev();
                            nuevo = new Nodo(x,y);
                            nuevo.setNodoPost(temp);
                            nuevo.setNodoPrev(temp2);
                            temp.setNodoPrev(nuevo);
                            temp2.setNodoPost(nuevo);
                            this.enlazarLista();
                            size++;
                        }
                    }
                   
               }
                break;
            case 2:
            if (head_2 == null) {
                head_2 = new Nodo(x, y);
                this.enlazarLista();
            } else {
                
                 if(head_2.getNodePost() == null){
                     head_2.setNodoPost(new Nodo(x,y));
                     this.enlazarLista();
                 }else{
                     temp = head_2;
                     
                     do {
                         temp = temp.getNodePost();
                     } while (temp.getValue()>x||temp.getNodePost() != null);
                     
                     if(temp.getNodePost() == null){
                         
                         temp.setNodoPost(new Nodo(x,y));
                         temp.getNodePost().setNodoPrev(temp);
                         this.enlazarLista();

                     }else{
                         temp2 = temp.getNodePrev();
                         nuevo = new Nodo(x,y);
                         nuevo.setNodoPost(temp);
                         nuevo.setNodoPrev(temp2);
                         temp.setNodoPrev(nuevo);
                         temp2.setNodoPost(nuevo);
                         this.enlazarLista();
                         size++;
                     }
                 }
                
            }
                break;
            case 3:
            if (head_3 == null) {
                head_3 = new Nodo(x, y);
                this.enlazarLista();
            } else {
                
                 if(head_3.getNodePost() == null){
                     head_3.setNodoPost(new Nodo(x,y));
                     this.enlazarLista();
                 }else{
                     temp = head_3;
                     
                     do {
                         temp = temp.getNodePost();
                     } while (temp.getValue()>x||temp.getNodePost() != null);
                     
                     if(temp.getNodePost() == null){
                         
                         temp.setNodoPost(new Nodo(x,y));
                         temp.getNodePost().setNodoPrev(temp);
                         this.enlazarLista();

                     }else{
                         temp2 = temp.getNodePrev();
                         nuevo = new Nodo(x,y);
                         nuevo.setNodoPost(temp);
                         nuevo.setNodoPrev(temp2);
                         temp.setNodoPrev(nuevo);
                         temp2.setNodoPost(nuevo);
                         this.enlazarLista();
                         size++;
                     }
                 }
                
            }
                break;
            default:
                break;    

        }
    }


    public void enlazarLista(){
        Nodo temp = head_1;
        Nodo temp2 = head_2;
        Nodo temp3 = head_3;

        while(temp.getNodePost()!=null){
            temp = temp.getNodePost();
        }
        temp.setNodoPost(temp2);
        temp2.setNodoPrev(temp);

        while (temp.getNodePost() != null) {
            temp = temp.getNodePost();
        }

        temp.setNodoPost(temp3);
        temp3.setNodoPrev(temp);
        
    }
    public void imprimirLista(){
        Nodo temp = head_1;

        while (temp.getNodePost()!= null) {
            System.out.println("Numero: "+temp.getValue()+" , Prioridad: "+temp.getPriority());
            temp = temp.getNodePost();
        }
    }
}