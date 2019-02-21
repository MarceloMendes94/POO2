package atividadecontacorrente;

/**
 *
 * @author 20151BSI0436
 */
public class ContaCorrente extends Conta implements Tributavel {
    
    @Override
    public Double calculaAtributo(){
         return getSaldo()*0.1;
    }
    
}
