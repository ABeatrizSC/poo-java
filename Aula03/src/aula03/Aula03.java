
package aula03;

public class Aula03 {

    public static void main(String[] args) {
        CanetaAula3 c1 = new CanetaAula3(); //instanciar - criar o objeto c1, uma caneta
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f NÃO É POSSIVEL MEXER POIS ESTÁ PRIVADO
        c1.carga = 80; //É possível mexer no atributo protegido pois ele está dentro de uma CLASSE que utiliza a CLASSE CanetaAula3
        c1.tampada = true;
        //c1.rabiscar(); NÃO É POSSÍVEL UTILIZAR ESTE MÉTODO POIS ELE É PRIVADO
        c1.status();
        
    }
    
}

