
package fabrica.abstrata;

/**
 *
 * @author marcelo
 */
public class CobrancaClaro implements Cobranca{

    @Override
    public void cobrar(int telefone) {
        System.out.println(" cobrança da claro");
    }
    
}
