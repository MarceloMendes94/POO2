package atividadecontacorrente;


public class AtividadeContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        ContaCorrente itau = new ContaCorrente();
        itau.setSaldo(2400.50);
        System.out.println("seu saldo é "+itau.getSaldo()+" seus impostos são "+itau.calculaAtributo());
        
    }
    
}
