public class Variaveis {
    public static void main(String[] args) {

        /*byte idadeDoPet = 200;*/ //overflow
        byte idadeDoPet = 9;
        short valorDaConsulta = 100;
        double salarioDoFuncionarioResponsavelPeloBanho = 6373.77;
        String nomeDoPet = "Paçoca";
        String nomeDoveterinario = "Julia";

        System.out.println("Saída do programa");
        System.out.println("-----------------------------");
        System.out.println("Salário: " + "R$" + salarioDoFuncionarioResponsavelPeloBanho);
        System.out.println("Idade do PET: " + idadeDoPet);
        System.out.println("Valor da consulta: " + "R$" + valorDaConsulta);
        System.out.println("Nome do PET: " + nomeDoPet);
        System.out.println("O pet foi atendido pela doutor(a): " + nomeDoveterinario);
        System.out.println("-----------------------------");
    }
}
