import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("====================== MENU ========================\n");
    System.out.println("Olá, seja bem vindo ao UberLand!\n\n");
    System.out.println("Escolha uma das seguintes opções abaixo:");

    System.out.println("1- Fazer Cadastro como Cliente");
    System.out.println("2- Fazer Cadastro como Motorista");

    Scanner s = new Scanner(System.in);

    int choose = s.nextInt();
    s.nextLine();

    if(choose == 1){
        System.out.println("Você se cadastrou como CLIENTE");
    }

    if(choose == 2){
        System.out.println("Você se cadastrou como MOTORISTA");
    }

}
