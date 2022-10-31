package aula13.polimorfismosobrecarga;
public class Mamifero extends Animal {
    protected String corPelo;
    
    //POLIMORFISMO POR SOBREPOSIÇÃO
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero!");
        
    }
    
    
}
