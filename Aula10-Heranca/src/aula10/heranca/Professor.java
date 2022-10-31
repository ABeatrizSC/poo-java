package aula10.heranca;
public class Professor extends Pessoa {
    //ATRIBUTOS:
    private String especialidade;
    private float salario;
    
    //METODOS:
    
    public void receberAum(float aum){
        this.salario = salario + aum;
        
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
