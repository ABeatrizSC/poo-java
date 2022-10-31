package aula12.polimorfismo;
public class Cachorro extends Mamifero {
    
    //sobrepondo o metodo para exibir cachorro latindo e nao "som de mamifero"
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
        
    }
    
}

