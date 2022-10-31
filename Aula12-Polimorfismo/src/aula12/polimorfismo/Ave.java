package aula12.polimorfismo;
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("Construindo ninho.");
    }
    
    //metodos abstratos
    
    @Override
    public void locomover() {
        System.out.println("Voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave.");
    }
    
    //get e set

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
