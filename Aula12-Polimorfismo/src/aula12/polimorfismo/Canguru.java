package aula12.polimorfismo;
public class Canguru extends Mamifero {
    
   //sobrepondo o metodo locomover para poder mudar a maneira de locomoção
    @Override
    public void locomover(){
        System.out.println("Pulando");
        
    }
    
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    
    
}
