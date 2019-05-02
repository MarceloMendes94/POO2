
package adaptercliente;

import adaptercliente.model.AdapterClienteExterno;
import adaptercliente.visao.VisaoCliente;
import lib.ClienteExterno;

public class MainComAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClienteExterno clienteExterno = new ClienteExterno();
        
        clienteExterno.setCelular("9997777");
        clienteExterno.setDddCelular("027");
        clienteExterno.setTelefone("3333");
        clienteExterno.setDddTelefone("027");
        clienteExterno.setEmail("jose.silva@email.com");
        clienteExterno.setNome("Jose");
        clienteExterno.setSobreNome("Silva");
        VisaoCliente visao = new VisaoCliente();
        AdapterClienteExterno cliente = new AdapterClienteExterno(clienteExterno);
        visao.setInformacoesCliente(cliente);//espera um Cliente
        visao.setVisible(true); 
        
        
    }
    
}
