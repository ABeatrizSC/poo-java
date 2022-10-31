package aula14.projetovideo;
public class Aula14ProjetoVideo {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO"); //Construtor pede apenas o titulo do video como parametro
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 01 de HTML5");
        
        /* (retirar para testar)
        System.out.println("-----------VIDEOS----------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString()); */
        
        //Pessoa p = new Pessoa("Jubileu", 22, "H"); -> NÃO SE PODE FAZER ISSO POIS A CLASSE "PESSOA" É ABSTRATA
        //CLASSE ABSTRATA SÓ SERVE DE BASE PARA CRIAR OUTRAS CLASSES
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jose", 22, "H", "Zeca"); //criando um gafanhoto e passando os parametros obrigatorios no construtor
        g[1] = new Gafanhoto("Ana Beatriz", 12, "F", "Ana");
        
        /* (retirar para testar)
        System.out.println("-----------GAFANHOTOS----------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString()); */
        
        Visualizacao vis[]= new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]); //CRIANDO UM OBJ EM "VISUALIZACAO" PASSANDO GAFANHOTO E VIDEO COMO PARAMETRO, 
        //POIS FOI DECLARADO ELES NO ATRIBUTO DE "VISUALIZACAO"
        vis[0].avaliar(); 
        System.out.println(vis[0].toString());
        
        //CRIEI OUTRO OBJETO, UTILIZANDO O MESMO "GAFANHOTO", MAS QUE VERÁ UM VIDEO DIFERENTE
        vis[1] = new Visualizacao(g[0], v[1]); //Jose assiste PHP
        vis[0].avaliar(35.0f); //avaliou usando porc
        System.out.println(vis[1].toString());
        
    }
    
}
