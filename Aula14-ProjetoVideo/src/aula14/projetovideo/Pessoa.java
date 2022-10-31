package aula14.projetovideo;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    //METODO ABSTRATO
    public abstract void ganharExp();
    
    //CONSTRUTOR

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    //GET E SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    //TOSTRING PARA QUANDO CHAMAR APARECER TODOS OS DADOS DE CADA OBJETO CRIADO
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + 
                ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
    
    
        
    
}
