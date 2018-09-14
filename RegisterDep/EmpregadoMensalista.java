package RegisterDep;

public class EmpregadoMensalista extends Empregado {

    private double valorMes;

    public EmpregadoMensalista(String nome,
            double valorMes, Departamento depto) {
        this.setNumero();
        this.setNome(nome);
        this.valorMes = valorMes;
        this.setDepto(depto);
    }

    public double getValorMes() {
        return valorMes;
    }

    public void setValorMes(double valorMes) {
        this.valorMes = valorMes;
    }

    @Override
    public double calcularSalario() {
        return valorMes;
    }
}