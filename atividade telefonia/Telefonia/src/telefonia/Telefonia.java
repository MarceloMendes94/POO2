// @marcelo sala de aula
package telefonia;

public class Telefonia {

    public static void main(String[] args) {
        // meu codigo
        TelefoneSingleton aux= TelefoneSingleton.getInstance();
        for(int i=0 ; i<100 ; i++){            
            System.out.println(aux.nextNumber());
        }
        aux.salvar();
    }
    
}
