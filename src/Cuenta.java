import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    //atributos
    private double saldo;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;

    //constructor
    public Cuenta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;

        //inicializo las colecciones en el constructor
        this.ingresos = new ArrayList<>();
        this.gastos = new ArrayList<>();
    }

    //get/set
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public double addIngresos(String descripcion, double cantidad) {
        //agrego un ingreso
        ingresos.add(new Ingreso(cantidad, descripcion));
        //a saldo le a?ado la cantidad del ingreso
        this.saldo += cantidad;

        //muestro el saldo
        return this.getSaldo();
    }

    public double addGastos(String descripcion, double cantidad) throws GastoException {

        boolean condicionGastoException = this.getSaldo()<cantidad;

        //compruebo si hay saldo suficiente antes de restar la cantidad, sino lo hay no hará nada más
        if(condicionGastoException) {
            throw new GastoException();
        }

        //agrego un gasto
        gastos.add(new Gasto(cantidad, descripcion));

        //a saldo le resto la cantidad del gasto
        this.saldo -= cantidad;
        return this.getSaldo();
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    @Override
    public String toString() {
        //no se especifica por ningun sitio como debe de ser, viendo como son los demás en el video
        //me he presupuesto que sería así
        return "Usuario: " + this.getUsuario() + ", saldo: " + this.getSaldo();
    }
}
