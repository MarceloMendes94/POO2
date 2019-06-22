
package refeicao;

/**
 *
 * @author felipe
 */
public class Refeicao {
    private Batata batata;
    private Hamburger hamburger;
    private Bebida bebida;

    public Hamburger getHamburger() {
        return hamburger;
    }
    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }
    public Batata getBatata() {
        return batata;
    }
    public void setBatata(Batata batata) {
        this.batata = batata;
    }   
    public Bebida getBebida() {
        return bebida;
    }
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }       
}
