

package projeto.contabanco;

public class ContaBanco {

    public static void main(String[] args) {
       
        ContaCorrente conta1  = new ContaCorrente();
        
        conta1.setNumConta(111);
        conta1.setTipo("cc");
        conta1.setDono("Danilo alves");
        conta1.setSaldo(0);
        conta1.setStatus(true);
        
        conta1.abrirConta("cp");
        conta1.depositar(300);
        conta1.sacar(150);
        conta1.fecharConta();
        conta1.sacar(300);
        conta1.fecharConta();
        
        
        conta1.estadoAtual();
        
        
        
    }
}
