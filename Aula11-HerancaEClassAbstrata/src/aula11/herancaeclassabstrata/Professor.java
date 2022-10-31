package aula11.herancaeclassabstrata;
public class Professor extends Pessoa { //CLASSE "PESSOA" É A CLASSE MÃE DESSA CLASSE
    private String especialidade;
    private float salario;
    
    //metodos
    public void receberAumento(float aum){
        this.salario += aum; 
        
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
