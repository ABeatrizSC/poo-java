package aula11.herancaeclassabstrata;
public class Aluno extends Pessoa { //CLASSE "PESSOA" É A CLASSE MÃE DESSA CLASSE

    //atributos
    private int matricula;
    private String curso;
    
    //metodos
    public void pagarMensal(){ //se eu colocar "public void FINAL pagarMensal()" o método não poderá ser sobreposto (override) em "Bolsista"
        System.out.println("Pagando mensalidade do aluno " + this.getNome()); //PRECISA DO GET POIS ESTÁ PRIVATE. SE NÃO TIVESSE ERA APENAS THIS.NOME
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
