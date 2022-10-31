package aula06.encapsulamento;
public interface Controlador {
    
    //METODOS ABSTRATOS NA INTERFACE 'CONTROLADOR'.
    //NÃO É SEMPRE QUE É 'VOID'. PODE VARIAR.
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();  
} //INTERFACE CRIADA.
