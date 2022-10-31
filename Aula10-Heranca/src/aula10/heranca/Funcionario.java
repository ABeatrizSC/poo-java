package aula10.heranca;
public class Funcionario extends Pessoa {
    //ATRIBUTOS:
    private String setor;
    private boolean trabalhando;
    
    //METODOS:
    public void mudarTrabalho(String trab){
        this.trabalhando = !this.trabalhando; //receber o inverso de trabalhando
        
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalahando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
