package aula12.polimorfismo;
public class Mamifero extends Animal {
    private String corPelo;
    
    //metodos abstratos
    @Override
    public void locomover(){
        System.out.println("Correndo");
        
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
        
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
        
    }
    
    //get e set 

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
