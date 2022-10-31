
package aula06.encapsulamento;

public class ControleRemoto implements Controlador {
    //ATRIBUTOS PRIVADOS 
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //METODO CONSTRUTOR:
    public ControleRemoto() { //Toda vez que criar um objeto ele estará:
        this.volume = 50; //no volume 50
        this.ligado = false; //desligado
        this.tocando = false; //NÃO tocando.    
    }
    
    //METODOS ESPECIAIS
    //Get e Set privados para não poderem ser usados fora desta classe ControleRemoto
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
   
    //METODOS ABSTRATOS:
    //Para se criar estes metodos terá que primeiro criar uma 'implementação' com a INTERFACE 'Controlador'
    //ou seja, adiciona 'implements + nome_da_interface' ao lado do nome da Classe.
    
    @Override //Sobrescrever o metodo já definido.
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {//STATUS 
        System.out.println(" ----MENU----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.print(">");
        }
    }

    @Override
    public void fecharMenu() { 
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) { //se estiver ligado
            this.setVolume(this.getVolume()+ 5); // aumenta o volume.   
        } else{
            System.out.println("Impossível aumentar volume."); //impossivel aumentar se a tv esta desligada
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        } else{
            System.out.println("Impossível diminuir volume."); //impossivel diminuir se a tv esta desligada
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {//só colocará mudo se estiver ligado e volume já não estiver mudo.
            this.setVolume(0); // muta
        }
    }    

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {//se estiver ligado e o volume já estiver mudo
            this.setVolume(50); //volume volta pra 50.
        }
    }    

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){  //se ele estiver ligado e NÃO tocando
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) { //se ele estiver ligado e tocando
            this.setTocando(false);
        }
    }   
    
}
