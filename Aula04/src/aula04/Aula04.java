package aula04;

public class Aula04 {
    public static void main(String[] args) {
        CanetaAula4 c1 = new CanetaAula4("NIC", "Amarelo", 0.4f); //Passando parâmetros ao CONSTRUTOR
        c1.setModelo("BIC"); //Adicionando o modelo
        //c1.modelo = "BIC"; -> PODERÁ SER FEITO ASSIM TAMBÉM
        c1.setPonta(0.5f); //Adicionando o valor da ponta 
        // c1.ponta = 0.5f -> AQUI NÃO PODERÁ FAZER ASSIM, POIS O ATRIBUTO 'ponta' É PRIVADO
        c1.status();
        
        CanetaAula4 c2 = new CanetaAula4("AAA", "Laranja", 1.5f);
        c2.status();
      
    }
    
}
