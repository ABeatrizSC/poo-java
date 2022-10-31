package aula10.heranca;
public class Aluno extends Pessoa {
    //ATRIBUTOS:
    private int Matr;
    private String curso;
    
    //METODOS:
    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
        
    }

    public int getMatr() {
        return Matr;
    }

    public void setMatr(int Matr) {
        this.Matr = Matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
