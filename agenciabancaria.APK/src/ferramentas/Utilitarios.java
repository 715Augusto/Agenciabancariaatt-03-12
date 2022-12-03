package ferramentas;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Utilitarios {
    static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00#");

    public static String doubleToString(Double valor) {
        return formatandoValores.format(valor);
    }
}