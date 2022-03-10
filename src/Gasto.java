
public class Gasto extends Dinero {

    public Gasto(double gasto, String description) {
        this.setDinero(gasto);
        this.setDescription(description);
    }

    @Override
    public String toString() {
        ////Deacuerdo a vídeo del resultado esperado del programa
        return "Gasto: "+ super.getDescription() +  ", cantidad:" + this.getDinero() +"€";
    }
}