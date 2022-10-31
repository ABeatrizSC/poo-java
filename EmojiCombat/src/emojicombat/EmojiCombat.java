package emojicombat;

public class EmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; //VETORES PARA CRIAR VÁRIOS LUTADORES
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1); //parametros pois foi colocado no CONSTRUTOR
        l[1] = new Lutador ("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador ("UF0COBOL", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador ("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta(); //criar novo objeto da classe LUTA
        UEC01.marcarLuta(l[0], l[1]); //marcar luta entre estes jogadores
        UEC01.lutar(); //FAZER A LUTA ACONTECER
        //l[0].status(); 
        //l[1].status();
        
        
        
        //COMANDOS QUE POSSO FAZER:
        //Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1); -> Poderia ter sido criado assim também, sem vetores.
        //l[0].status();
        //l[1].status();
        //l[0].apresentar();
        //l[0].ganharLuta(); //Adiciona + 1 às vitórias
        //l[0].setPeso(10f); -> Posso mudar assim
        
        //COMANDOS PROIBIDOS:
        // l[1].setCategoria(); -> não posso mexer pois esta PRIVADO
        
    }
    
}
