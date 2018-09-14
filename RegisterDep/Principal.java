/* O programa implementara conceito de ArrayList
 para calculo de pgto de empregados Diarista e mensalista
 nos seus Departamentos respectivos. 
 *nao funcionando o tamanho da lista de objetos
 */
package RegisterDep;

import corejava.*;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Empregado> listaDeEmpregados = new ArrayList<Empregado>(10);
        ArrayList<Departamento> listaDeDepartamentos = new ArrayList<Departamento>(10);
        String nome, cpf;
        double valorDia, valorMes;
        int numDias, resposta, idade;
        boolean achou;

        Empregado umEmpregado = null;
        Departamento umDepartamento = null;

        boolean continua = true;
        while (continua) {
            System.out.println('\n' + "O que você deseja fazer?");
            System.out.println('\n' + "1. Cadastrar");
            System.out.println("2. Remover");
            System.out.println("3. Listar");
            System.out.println("4. Sair");

            int opcao = Console1.readInt('\n'
                    + "Digite um número entre 1 e 4:");

            switch (opcao) {
                case 1: {
                    System.out.println('\n' + "1. Departamento");
                    System.out.println('\n' + "2. Empregado");
                    opcao = Console1.readInt('\n' + "Digite um número entre 1 e 4:");
                    nome = Console1.readLine('\n' + "Digite o nome: ");
                    
                    
                    if (opcao == 1) {
                        
                        umDepartamento = new Departamento(nome);
                        listaDeDepartamentos.add(umDepartamento);
                        System.out.println('\n' + "Departamento cadastrado"
                                + " com sucesso!");
                    } else {
                        achou = false;
                        resposta = Console1.readInt('\n' + "Digite o número do Departamento:");
                        for (int i = 0; i < listaDeDepartamentos.size(); i++) {
                            umDepartamento = listaDeDepartamentos.get(i);

                            if (resposta == umDepartamento.getNumero()) {
                                achou = true;
                                break;
                            }
                        }
                        if (!achou) {
                            umDepartamento = null;
                            System.out.println('\n' + "Departamento Inexistente!");
                        }
                        System.out.println('\n' + "1. Diarista");
                        System.out.println("2. Mensalista");
                        opcao = Console1.readInt('\n' + "Digite um número entre 1 e 2:");
                        if (opcao == 1) {
                            numDias = Console1.readInt('\n' + "Digite o numero de dias: ");
                            valorDia = Console1.readDouble('\n' + "Digite o valor dia: ");
                            umEmpregado = new EmpregadoDiarista(nome, numDias, valorDia, umDepartamento);
                        } else {
                            valorMes = Console1.readDouble('\n' + "Digite o valor mes: ");
                            umEmpregado = new EmpregadoMensalista(nome, valorMes, umDepartamento);
                        }
                        listaDeEmpregados.add(umEmpregado);
                        System.out.println('\n' + "Empregado cadastrado com sucesso!");
                    }
                    break;
                }
                case 2: {
                    System.out.println('\n' + "1. Departamento");
                    System.out.println("2. Empregado");
                    opcao = Console1.readInt('\n' + "Digite um número entre 1 e 2:");
                    resposta = Console1.readInt('\n' + "Digite o número que você deseja remover: ");
                    achou = false;
                    
                    int x;
                    if (opcao == 1) {
                        for (x = 0; x < listaDeDepartamentos.size(); x++) {
                            umDepartamento = listaDeDepartamentos.get(x);
                            if (resposta == umDepartamento.getNumero()) {
                                achou = true;
                                break;
                            }
                        }
                        if (achou) {
                            achou = false;
                            for (int i = 0; i < listaDeEmpregados.size(); i++) {
                                umEmpregado = listaDeEmpregados.get(i);
                                if (umEmpregado.getDepto() != null) {
                                    if (resposta == umEmpregado.getDepto().getNumero()) {
                                        achou = true;
                                    }
                                }
                            }
                            if (achou) {
                                System.out.println('\n' + "Departamento sendo utilizado!");
                            } else {
                                listaDeDepartamentos.remove(x);
                                System.out.println('\n' + "Departamento removido com sucesso!");
                            }
                        } else {
                            System.out.println('\n' + "Departamento não encontrado!");
                        }
                    } else {
                        int i;
                        for (i = 0; i < listaDeEmpregados.size(); i++) {
                            umEmpregado = listaDeEmpregados.get(i);

                            if (resposta == umEmpregado.getNumero()) {
                                achou = true;
                                break;
                            }
                        }
                        if (achou) {
                            listaDeEmpregados.remove(i);
                            System.out.println('\n' + "Empregado removido com sucesso!");
                        } else {
                            System.out.println('\n' + "Empregado não encontrado!");
                        }
                    }
                    break;
                }
                case 3: {
                    if (listaDeDepartamentos.isEmpty()) {
                        System.out.println('\n' + "Não há departamentos na lista.");
                    } else {
                        System.out.println("");
                        System.out.println('\n' + "Lista de departamentos");
                        for (int i = 0; i < listaDeDepartamentos.size(); i++) {
                            umDepartamento = listaDeDepartamentos.get(i);
                            System.out.println("Numero = " + umDepartamento.getNumero()
                                    + "  Nome = " + umDepartamento.getNome());
                        }
                    }
                    if (listaDeEmpregados.isEmpty()) {
                        System.out.println('\n' + "Não há empregados na lista.");
                    } else {
                        System.out.println("");
                        System.out.println('\n' + "Lista de empregados");
                        for (int i = 0; i < listaDeEmpregados.size(); i++) {
                            umEmpregado = listaDeEmpregados.get(i);
                            System.out.println("Numero = " + umEmpregado.getNumero()
                                    + "  Nome = " + umEmpregado.getNome()
                                    + "  Salario = " + umEmpregado.calcularSalario()
                                    + "  CPF = " + umEmpregado.getCpf()
                                    + "  Idade = " + umEmpregado.getIdade());
                            if (umEmpregado.getDepto() != null) {
                                System.out.println("Departamento = "
                                        + umEmpregado.getDepto().getNome());
                            }
                        }
                    }
                    break;
                }
                case 4:
                    continua = false;
                    break;

                default:
                    System.out.println('\n' + "Opção inválida!");
            }
        }
    }
}