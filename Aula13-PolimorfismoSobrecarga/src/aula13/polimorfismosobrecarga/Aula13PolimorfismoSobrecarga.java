package aula13.polimorfismosobrecarga;
public class Aula13PolimorfismoSobrecarga {
//programa principal
    public static void main(String[] args) {
        
        //utilizando polimorfismo por sobreposição
        Cachorro c = new Cachorro();
        c.emitirSom();
        System.out.println("---------");
        
        //utilizando polimorfismo por SOBRECARGA
        c.reagir("Olá");
        System.out.println("---------");
        c.reagir(11,00);
        c.reagir(19,00);
        System.out.println("---------");
        c.reagir(false);
        c.reagir(true);
        System.out.println("---------");
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
    
    
    
    
}
