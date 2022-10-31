package aula11.herancaeclassabstrata;
public class Bolsista extends Aluno { //CLASSE "ALUNO" É A CLASSE MÃE DESSA CLASSE
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override //METODO VAI SER SOBREPOSTO - JÁ EXISTE ESSE MÉTODO NA CLASSE MÃE "ALUNO"
    public void pagarMensal(){
        System.out.println(this.getNome()+ " é bolsista! Pagamento facilitado.");
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
