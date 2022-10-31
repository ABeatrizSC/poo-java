
package aula02;
public class Caneta {
    
    //5 Atributos:
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: "  + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);       
    }
    
    //métodos:
    void rabiscar(){
        if (this.tampada == true){ //Se a caneta estiver tampada
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    
     void tampar(){
         this.tampada = true; //está tampada
    }
      void destampar(){
          this.tampada = false; //não está tampada
    }

    
    
}
