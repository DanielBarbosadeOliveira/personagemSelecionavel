public class personagem {
    String nome;
    int idade;
    String tipo;
    String atack;
    
    public void atacar(String tipo){
    this.tipo = tipo;
        
    switch (tipo) {
        case "Guerreiro":
            atack = "espada";
            System.out.println("O herói chamado de " + nome + " é da classe " + tipo + ", de " + idade + " anos, atacou com " + atack);
            break;
        case "Mago":
            atack = "magia";
            System.out.println("O herói chamado de " + nome + " é da classe " + tipo + ", de " + idade + " anos, atacou com " + atack);
            break;
        case "Monge":
            atack = "artes marciais";
            System.out.println("O herói chamado de " + nome + " é da classe " + tipo + ", de " + idade + " anos, atacou com " + atack);
            break;
        case "Ninja":
            atack = "Shuriken";
            System.out.println("O herói chamado de " + nome + " é da classe " + tipo + ", de " + idade + " anos, atacou com " + atack);
            break;
        default:
            break;
            
    }
}

}
