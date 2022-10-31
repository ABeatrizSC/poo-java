package emojicombat;

import java.util.Random;

public class Luta {
    //atributos:
    private Lutador desafiado;
    private Lutador desafiante;
    //OBS: Não se colocoiu tipos primitivos nos atributos acima (int, boolean...), mas sim um TIPO ABSTRATO DE DADO.
    //LUTADOR é uma outra classe, criada anteriormente.
    //DESAFIADO/DESAFIANTE será uma *instância* da CLASSE LUTADOR -> Será um OBJETO de LUTADOR.
    //Assim, cria-se uma relação desse tipo ABSTRATO e uma *instância* de uma determinada CLASSE.
    //DESAFIADO/DESAFIANTE são objetos instânciados de uma outra CLASSE, a LUTADOR, e eles podem utilizar os
    //métodos dessa CLASSE mesmo estando em outra (no caso, na classe LUTA)
    private int rounds;
    private boolean aprovada; //Serve para ver se a luta foi aprovada ou não
    
    //METODOS PUBLICOS:
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria())&& l1 != l2){ //para ser aprovada terá que possuir dois lutadores diferentes e eles têm que ser da mesma categoria (Leve, médio e pesado)
            // '==' aqui é diferente
            //Perceba que estamos usando METODOS DA OUTRA CLASSE "LUTADOR"
            this.aprovada = true; //luta aprovada
            this.desafiado = l1; //dando valores ao desafiante e desafiado
            this.desafiante = l2;
        } else {
            this.aprovada = false; //luta nao provada
            this.desafiado = null; //não há desafiante e desafiado
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){ //se a luta for aprovada
            System.out.println("--------------------------------------------");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("--------------------------------------------");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            //Perceba que estamos usando METODOS DA OUTRA CLASSE "LUTADOR"
            
            Random aleatorio = new Random(); //objeto do tipo Random de nome "aleatorio"
            //Com isso, aparece a importação do Random ali no inicio do código
            int vencedor = aleatorio.nextInt(3); //Vencedor vai receber numeros entre 0 1 e 2
            switch (vencedor){
                case 0:  //empate
                    System.out.println("=== RESULTADO DA LUTA ===");
                    System.out.println("Empate.");
                    this.desafiado.empatarLuta(); //desafiado recebe um EMPATE no histótico de lutas
                    this.desafiante.empatarLuta(); //desafiante recebe um EMPATE no histótico de lutas
                    break; 
                case 1: //desafiado vence
                    System.out.println("=== RESULTADO DA LUTA ===");
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //desafiante vence
                    System.out.println("=== RESULTADO DA LUTA ===");
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            } //fim switch
        } else {
             System.out.println("A luta não pode acontecer!"); 
        } //fim If
        
    } //fim método Lutar();
    
    //METODOS ESPECIAIS:

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
}
