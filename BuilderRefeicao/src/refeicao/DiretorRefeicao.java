
package refeicao;

/**
 *
 * @author felipe
 */
public class DiretorRefeicao {        
    
    public Refeicao preparaNaoVegetariana(String sabor, String tipoBebida){       
        Refeicao novaRefeicao = new Refeicao();
        Batata batata = new Batata();
        novaRefeicao.setBatata(batata);
        NonVegetarianoBuilder refeicaoBuilder = new NonVegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);                
        refeicaoBuilder.prepadaHamburgerCarne();
        
        return novaRefeicao;        
    }     
    public Refeicao preparaVegetariana(String sabor, String tipoBebida){        
        Refeicao novaRefeicao = new Refeicao();
        Batata batata = new Batata();
        novaRefeicao.setBatata(batata);
        VegetarianoBuilder refeicaoBuilder = new VegetarianoBuilder(novaRefeicao);        
        if(tipoBebida.equalsIgnoreCase("refrigerante"))
            refeicaoBuilder.adicionarRefrigerante(sabor);
        else
            refeicaoBuilder.adicionarSuco(sabor);     
        refeicaoBuilder.preparaHamburgerVegetariano();
        return novaRefeicao;        
    }            
    
}
