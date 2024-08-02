

package projeto.contabanco;

public class ContaCorrente {
   public int numConta;
   protected String tipo;
   private  String dono;
   private float saldo;
   private  boolean status;
  
    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Número da Conta = " + this.getNumConta());
        System.out.println("Tipo da Conta = " + this.getTipo());
        System.out.println("Nome Titular = " + this.getDono());
        System.out.println("Saldo da Conta = " + this.getSaldo());
        System.out.println("Status = " + this.getStatus());
    }
   
   // Método construtor
   public ContaCorrente(){
       this.setSaldo(0);
       this.setStatus(false);
       
   }
    
    public void abrirConta(String tipo){
       this.setTipo(tipo);
       this.setStatus(true);
       if(tipo == "cc"){
           this.setSaldo(50);
           
       }else if(tipo == "cp"){
           this.setSaldo(150);
           
       }
        System.out.println("Conta aberta com sucesso !!! ");
    }
    
   public void  fecharConta(){
        if(this.getSaldo() >0){
            System.out.println("Conta com saldo positivo!!!  Zerar a conta antes de fechar. " + " Saldo Atualizado = " + this.saldo);
        }else if(this.getSaldo() < 0){
            System.out.println("Seu Saldo está negativo." + " Saldo Atualizado = " + this.saldo);
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso !!! " + this.saldo);
        }
    }
    
    public void depositar(float deposito){
          if(this.getStatus()){
              this.setSaldo(this.getSaldo() + deposito);
              System.out.println("Depósito realizado com sucesso !! " + " Saldo Atualizado = " + this.saldo);
          }else{
              System.out.println("Conta fechada impossível depositar!! ");
           
          }
    }
    
    public void sacar(float sacar){
        if(this.getStatus()){
            if(this.getSaldo() >= sacar){
                this.setSaldo(this.getSaldo() - sacar);
            System.out.println("Saque realizado com sucesso " + " Saldo Atualizado = " + this.saldo);
            }
        } else{
            System.out.println("Limite indisponível " + " Saldo = " + this.saldo);
        
        }
         
        }
   
    public void pagarMensalidade(){
       float mensalidade = 0;
        
       if(this.getTipo() == "cc"){
       mensalidade = 12;
       
    }else if(this.getTipo() == "cp"){
        mensalidade = 20;
     }
       if(getStatus() == true){
            if(this.getSaldo() >= mensalidade){
                this.setSaldo(this.getSaldo() - saldo);
                System.out.println("Mensalidade paga !! " + " Saldo Atualizado = " + this.saldo);
              
            }else{
                System.out.println("Sem saldo na conta !! " + " Saldo " + this.saldo);
             
            }
       }
              
     }
    
    public int getNumConta() {
        return numConta;
    }
      
    public void setNumConta(int numConta) {
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
