package aula12.polimorfismo;
public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolha(){
        
    }
    
    //metodos abstratos
    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som.");
    }
    
    //get e set

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
