import java.util.regex.Pattern;

public class Usuario {

    //Atributos de clase
    private String nombre;
    private int edad;
    private String DNI;

    //constructor
    public Usuario() {
    }

    //metodos get/set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return this.DNI;
    }

    public boolean setDNI(String DNI) {

        boolean salir = false;
        // si la condicion se cumple da valor al atributo de clase DNI y cambia el valor
        // del booleano a true
        if (validarDNI(DNI)) {
            this.DNI = DNI;
            salir = true;
        }

        return salir;
    }

    @Override
    public String toString() {
        return " Usuario: " + getNombre() + ", edad: " + this.getEdad() + ", DNI: " + this.getDNI();
    }

    /*
     * Metodo para valida DNI deacuerdo a una expresion regular
     */
    private boolean validarDNI(String DNI) {
        // Expresion regular DNI sin excluir ninguna letra del alfabeto
        // http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java
        // Expresion regular de separador - sacado de la pagina web
        // https://es.stackoverflow.com/questions/62607/una-letra-seguida-de-un-gui%C3%B3n-y-un-n%C3%BAmero-entre-1-y-999
        // Simbolo ? para indicar que aparace como mucho una vez
        // https://es.wikipedia.org/wiki/Expresi%C3%B3n_regular
        final String patron = "^\\d{8}-?[A-Z]$";

        return Pattern.matches(patron, DNI);
    }

}
