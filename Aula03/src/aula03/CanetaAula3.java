
package aula03;

public class CanetaAula3 {
    
//5 Atributos:
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
   
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: "  + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);       
    }
    
    //métodos:
    private void rabiscar(){
        if (this.tampada == true){ //Se a caneta estiver tampada
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    
     protected void tampar(){
         this.tampada = true; //Caneta está tampada
    }
     
      protected void destampar(){
          this.tampada = false; //Não está tampada
    }

    
    
}
