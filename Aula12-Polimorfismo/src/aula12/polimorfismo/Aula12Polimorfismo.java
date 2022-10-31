package aula12.polimorfismo;
public class Aula12Polimorfismo {
    public static void main(String[] args) {
       //animal n = New Animal(); -> não é possivel criar pois a classe é abstrata
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       
       m.setPeso(35.3f);
       m.setCorPelo("Marrom");
       m.alimentar();
       m.locomover();
       m.emitirSom();
       
       //mesmos metodos, respostas diferentes -> polimorfismo
       a.locomover();
       p.locomover();
       r.locomover();
       
       //criando objetos das filhas da classe de Mamifero, Reptil, Peixe e Ave
       Canguru c = new Canguru();
       Cachorro k = new Cachorro();
       Cobra j = new Cobra();
       Tartaruga t = new Tartaruga();
       Goldfish g = new Goldfish();
       Arara e = new Arara();
       
       //canguru
       c.locomover();
       c.emitirSom();
       
       //cachorro
       k.locomover();
       k.emitirSom();
       
    }
    
}
