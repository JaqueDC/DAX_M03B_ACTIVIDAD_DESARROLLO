
/**
 *
 * Aprovechando dos de las características más importantes de Java, la herencia y el polimorfismo,
 * podemos crear nuestras propias excepciones simplemente heredando.
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/excepciones/propias.htm
 */
public class GastoException extends Exception{


    public GastoException() {
        //me obligas a pasarle el literal a través del padre debido a que según
        //el diagrama de clases no se permite tener un final String
        super("Saldo insuficiente o cero, verifique saldo primero ");
    }

}
