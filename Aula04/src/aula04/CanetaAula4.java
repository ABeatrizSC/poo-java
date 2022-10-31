package aula04;

public class CanetaAula4 {
    //ATRIBUTOS:
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    //CONSTRUTOR:
    public CanetaAula4(String m, String c, float p){ //Possui o mesmo nome que a Classe -> parametros de modelo, cor e ponta
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar(); //Assim que criar uma caneta ela estará tampada
        this.cor = "Azul"; // E azul
        
    }
    
    //MÉTODOS GET E SET
    public String getModelo(){ //String pois o seu RETURN retorna um String
        return this.modelo;   
    }
    
    public void setModelo(String m){
        this.modelo = m;    
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar() {
       this.tampada = true;    
    }
    
    public void destampar(){
        this.tampada = false;
        
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        //System.out.println("Modelo: " + this.modelo); -> Também poderá ser feito assim
        System.out.println("Ponta: " + this.getPonta());
        //System.out.println("Ponta: " + this.ponta); -> Também poderá ser feito assim
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
         
}
