package RegisterDep;

public abstract class Empregado {

    public static int contador = 0;
    private int numero;
    private String nome;
    private String cpf;
    private int idade;
    private Departamento depto;

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setNumero() {
        numero = ++contador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    public abstract double calcularSalario();
}