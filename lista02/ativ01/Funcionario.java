package ativ01;

public class Funcionario {
    private String nome;
    private double salarioHora;
    private final int ID_FUNC;
    private static int proxID;
    public static final double SALARIO_HORA_MINIMO;
    private double horasTrabalhadasMes;

    public void Funcionario(String nome) {
        this.nome = nome;
        this.salarioHora = 12.5;
    }

    public void Funcionario(String nome, double salarioHora) {
        this.nome = nome;
        this.salarioHora = salarioHora;
    }

    public String getNome() {
        return nome;
    }

    public int getID_FUNC() {
        return ID_FUNC;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public double calculaSalarioMes() {
        return horasTrabalhadasMes * salarioHora;
    }
    
    public void reiniciaMesTrabalho() {
        horasTrabalhadasMes = 0;
    }

    public void atualizaNome(String nome) {
        this.nome = nome;
    }

    public void atualizaSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public static int getProxID() {
        return proxID;
    }

    public void adicionaDiaDeTrabalho(int horasTrabalhadasDia) {
        if (horasTrabalhadasDia >= 4) {
            horasTrabalhadasMes += horasTrabalhadasDia;
        }
    }
}
