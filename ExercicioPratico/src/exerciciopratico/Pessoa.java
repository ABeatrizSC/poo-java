package exerciciopratico;
public class Pessoa {
    //ATRIBUTOS:
    private String nome;
    private int idade;
    private String sexo;
    
    //CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo){    
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        
    }

    //METODO
    public void fazerAniversario() {
        this.setIdade(this.getIdade()+1);
                //this.getIdade = this.getIdade + 1;
        System.out.println("Nova idade: " + getIdade());
    }

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
    
    
}
