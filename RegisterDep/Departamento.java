package RegisterDep;

public class Departamento {

    public static int contador = 0;
    private int numero;
    private String nome;

    public Departamento(String nome) {
        numero = ++contador;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}