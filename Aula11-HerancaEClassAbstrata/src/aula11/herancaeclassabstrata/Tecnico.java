package aula11.herancaeclassabstrata;
public class Tecnico extends Aluno { //CLASSE "ALUNO" É A CLASSE MÃE DESSA CLASSE
    private int registroProfissional;
    
    public void praticar(){
        System.out.println("Praticando...");
        
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
    
}
