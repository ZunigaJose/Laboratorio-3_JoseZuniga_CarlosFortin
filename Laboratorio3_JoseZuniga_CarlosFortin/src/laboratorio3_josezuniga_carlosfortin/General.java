
package laboratorio3_josezuniga_carlosfortin;

/**
 *
 * @author Carlos Fortin
 */
public class General extends Soldado{
    
    private int años_mando;
    private Arma arma;

    public General() {
        super();
    }

    public General(int años_mando, Arma arma, String nombre, String lugar, int edad, String sexo, int x, int y) {
        super(nombre, lugar, edad, sexo, x , y);
        this.años_mando = años_mando;
        this.arma = arma;
    }

    public int getAños_mando() {
        return años_mando;
    }

    public void setAños_mando(int años_mando) {
        this.años_mando = años_mando;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "General{" + "a\u00f1os_mando=" + años_mando + ", arma=" + arma + '}';
    }
    
    
    
}
