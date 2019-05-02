package adaptercliente.model;
import lib.ClienteExterno;
public class AdapterClienteExterno extends Cliente{
    private ClienteExterno ce;
    public AdapterClienteExterno(ClienteExterno c){
        this.ce= c;
    }
    
    /* getters */
    @Override
    public String getNomeCompleto() {
        return ce.getNome() +" "+ ce.getSobreNome();
    }
    @Override
    public String getTelefone(){
        return ce. getDddTelefone() +" "+ce.getTelefone();
    }
    @Override
    public String getEmail(){
        return ce.getDddCelular()+" "+ce.getCelular();
    }
    @Override
    public String getCelular(){
        return ce.getDddCelular() +" "+ce.getCelular();
    }

    /*Seters*/
    public void setNome(String nome){
        ce.setNome(nome);
    }
    public void setSobrenome(String Snome){
        ce.setSobreNome(Snome);
    }
    public void setDddTelefone(String ddd){
        ce.setDddTelefone(ddd);
    }
    @Override
    public void setTelefone(String tel){
        ce.setTelefone(tel);
    }
    @Override
    public void setEmail(String email){
        ce.setEmail(email);
    }
    public void setDddCelular(String ddd){
        ce.setDddCelular(ddd);
    }
    @Override
    public void setCelular(String Cel){
        ce.setCelular(Cel);
    }

}