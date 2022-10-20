import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Olá, seja bem-vindo ao site mais querido do Brasil, sou o Omeagle e irei realizar o seu cadastro.");
        System.out.println("Informe seu nome completo:");

        String nome = input.nextLine();

        System.out.println("Olá " + nome);
        System.out.println("Informe sua idade:");

        int idade = input.nextInt();
        if (idade >= 18) {
            System.out.println("Vejo que sua idade é suficiente, prossiga com o cadastro.");
            System.out.println("Informe seu CPF:");
            int cpf = input.nextInt();
            System.out.println("Informe seu e-mail:");
            String mail = input.next();
            System.out.println("Esses são seu dados:" + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n"
                    + "CPF: " + cpf + "\n" + "E-mail: " + mail);
            System.out.println("Cadastro realizado com sucesso! Aproveite nossos serviços.");
        }

        else {
            System.out.println("Idade insuficiente, infelizmente você não poderá prosseguir com o cadastro." + "\n"
                    + "Retorne quando completar 18 anos para concluir seu cadastro e desfrutar dos nossos serviços.");
        }
    }
}