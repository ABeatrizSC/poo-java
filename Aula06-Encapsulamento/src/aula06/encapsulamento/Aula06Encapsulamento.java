package aula06.encapsulamento;

public class Aula06Encapsulamento {
    public static void main(String[] args) {
        //CODIGO PRINCIPAL POR ONDE PODERÁ MEXER NO CONTROLE REMOTO
        //Não poderá ser utilizado os Get e Set pois eles estão privados
        //Só poderá ser usado os metodos disponiveis na interface
        
        // c.setVolume(80); -> não é possivel pois está privado, encapsulado
        ControleRemoto c = new ControleRemoto();
        c.ligar(); //liga o controle
        c.maisVolume(); //aumenta em 5 o volume 
        
        c.abrirMenu(); //gera o status do controle
    }
    
}
