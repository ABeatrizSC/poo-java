
package aula05;

public class ContaBanco {
    //Atributos:
    public Integer numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //METODOS
    
    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);  //acessando pelo método
        //this.status = true -> acessa diretamente o atributo
        if (t == "CC") {
            //this.saldo = 50;
            this.setSaldo (50);  
        } else if (t == "CP"){
            //this.saldo = 150;
            this.setSaldo(150);
        }  
        System.out.println("Conta aberta!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Impossível fechar conta. Ainda há dinheiro.");
        } else if (this.getSaldo() < 0){
            System.out.println("Não é possível fechar a conta pois ela está em débito.");   
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }            
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }  
    }
    
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v){
                //this.saldo = this.saldo - v;
                this.setSaldo(this.getSaldo() - v);  
                System.out.println("Saque realizado na conta de " + this.getDono() + " no valor de " + v + " reais");
            } else {
                System.out.println("Saldo insuficiente. Impossível sacar.");
            }  
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){ //se for conta corrente
            v = 12;
        } else if (this.getTipo() == "CP"){ //se for poupança
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada.");
        }    
    }
    
    //METODOS ESPECIAIS
    
    public void ContaBanco(){
        this.setSaldo(0);
        this.status = false;
        //this.saldo = 0;
        //this.status = false;    
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    } 
    
}
