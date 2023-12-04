import java.util.Scanner;

public class personagemSelecionavel {
    
    public static void main(String[] args) {
        personagem heroi = new personagem();
        heroi.nome = "Daniel";
        heroi.idade = 24;
        heroi.tipo = "Guerreiro";
        heroi.atack = "espada";

        heroi.atacar(heroi.tipo);

        Scanner teclado = new Scanner(System.in);
        System.out.print("Herói personalizado!\nDigite o nome do seu herói: ");
        heroi.nome = teclado.nextLine();
        System.out.print("Digite a idade do seu herói: ");
        heroi.idade = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Digite a classe do seu herói: ");
        heroi.tipo = teclado.nextLine();
        heroi.atacar(heroi.tipo);
    }
    
}

