package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //instanciar - criar o objeto c1, uma caneta
        c1.cor = "Azul"; // atribuindo a caneta a cor azul
        c1.ponta = 0.5f; //tamanho da ponta da caneta
        c1.tampar(); //chamando o método tampar - para destampar, chama-se o método destampar()
        
        
        c1.status(); //chamando o método status, que dá detalhes sobre o objeto c1
        c1.rabiscar(); //chamando o metodo rabiscar
        
        Caneta c2 = new Caneta(); //CRIANDO OUTRA CANETA/OBJETO
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status(); //chamando o método status, que dá detalhes sobre o objeto c2
        c2.rabiscar();
        
        //OBSERVAMOS, ENTÃO, QUE TODOS OS OBJETOS DA MESMA CLASSE POSSUEM OS MESMOS ATRIBUTOS E MÉTODOS, SÓ MUDA SEUS STATUS (preta, azul, tamapada, destampada)
        //Não possuem o mesmo Valor de atributo.
        
    }
    
}
