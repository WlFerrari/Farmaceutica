import com.empresa.farmaceutica.ItemNegocio;
import com.empresa.farmaceutica.Produto;
import static com.empresa.farmaceutica.CalculadoraIR.calcular;

public class Main {
    public static void main(String[] args) {
        Produto p0 = new Produto(123, "Tylenol", 10.5, 15.0, 100);
        ItemNegocio itemNegocio = new ItemNegocio(p0, 10);

        System.out.println(itemNegocio);
        System.out.println(calcular(5000));
    }
}