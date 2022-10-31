package aula14.projetovideo;
public class Visualizacao {
    private Gafanhoto espectador; //POLIMORFISMO - ATRIBUTO COM INSTÂNCIAS DE OUTRA CLASSE
    private Video filme; //POLIMORFISMO
    
    //CONSTRUTOR
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1); //total que ele tem agora(this.espectador) + 1
        this.filme.setViews(this.filme.getViews() + 1);
    }
    //SOBRECARGA DE METODOS (MESMA ASSINATURA, PARAMETROS DIFERENTES)
    public void avaliar(){
        this.filme.setAvaliacao(5); //se não passar a avaliaçao sera 5
        
    }
    
     public void avaliar(int nota){
         this.filme.setAvaliacao(nota); //se passar avaliaçao. a avaliação será "nota"
        
    }
     
    public void avaliar(float porc){ //se passar uma porcentagem
        int tot = 0;
        if (porc <= 20){ //se a pessoa assistiu 20% do video ou menos
            tot = 3;
        } else if (porc <=50){
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot); //no fim a avaliação recebe "tot"
        
        
    }

    //GET E SET
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + 
                ", filme=" + filme + '}';
    }
    
    
    
    
    
    
}
