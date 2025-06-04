import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    private String nome;
    private List<String> locaisAtendimento = new ArrayList<String>();

    public Transportadora(String nome, List<String> locaisAtendimento) {
        this.nome = nome;
        this.locaisAtendimento = new ArrayList<>(locaisAtendimento);
    }
}
