package aula11.herancaeclassabstrata;
public class Aula11HerancaEClassAbstrata {
    public static void main(String[] args) {
        
        //Pessoa p1 = new Pesso(); -> NÃO É POSSIVEL CRIAR OBJETO POIS A CLASSE 'PESSOA" É ABSTRATA
        
        //CLASSE "VISITANTE", FILHA DE "PESSOA" - HERANÇA DE IMPLEMENTAÇÃO
        Visitante v1 = new Visitante(); //CRIANDO OBJETO
        v1.setNome("Joao");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        //ALUNO É UM ESPECILIZAÇÃO DE PESSOA, E PESSOA É UMA GENERALIZACAO DE ALUNO
        //BOLSISTA É UMA ESPECIALIZAÇÃO DE ALUNO
        
        //CLASSE "ALUNO", FILHA DE "PESSOA" - HERANÇA PARA DIFERENÇA
        Aluno a1 = new Aluno(); //CRIANDO OBJETO.
        a1.setNome("Julia");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensal();
        
        //CLASSE "BOLSISTA", FILHA DE "ALUNO"
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Pedro");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensal(); //esse método será diferente do pagarMensal() acima
       
    }
    
}
