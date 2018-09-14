package RegisterDep;

public class EmpregadoDiarista extends Empregado {

    private int numDias;
    private double valorDia;

    public EmpregadoDiarista(String nome, int numDias,
            double valorDia, Departamento depto) {
        this.setNumero();    // super.setNumero();	
        this.setNome(nome);   // this.nome = nome;
        this.numDias = numDias;
        this.valorDia = valorDia;
        this.setDepto(depto);
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public double calcularSalario() {
        return numDias * valorDia;
    }
}