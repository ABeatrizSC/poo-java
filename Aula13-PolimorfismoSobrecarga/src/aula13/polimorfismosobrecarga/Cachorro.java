package aula13.polimorfismosobrecarga;
public class Cachorro extends Lobo {
    
    //POLIMORFISMO POR SOBREPOSIÇÃO
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    
    //POLIMORFISMO POR SOBRECARCA - METODOS:
    //METODOS DE NOMES IGUAIS, MAS ASSINATURA (PARÂMETROS E SEUS TIPOS, DIFERENTES). 
    //SE TIVER UM MÉTODO COM TIPOS DE PARAMETROS E QUANTIDADES IGUAIS, DARÁ ERRO.
    //OBS: (int, float) é diferente dos parâmetros (float, int).
    
    public void reagir(String frase){
        if (frase.equals("Comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        } else if(hora >=18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
     
    public void reagir(boolean dono){
        if (dono){ //se for dono - true 
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    } 
      
    public void reagir(int idade, float peso){
        if (idade<5){ //se ele for novinho
            if(peso<10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else { //se ele for velho
            if (peso<10) {
            System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
