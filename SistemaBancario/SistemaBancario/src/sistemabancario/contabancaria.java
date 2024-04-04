
package sistemabancario;


public class contabancaria {
    private double Saldo;
    private String numConta;
    private String Cliente;
    private int Contadestino;
    private int ContaOrigem;
    
    public contabancaria (double Saldo, String numConta,String Cliente){
    this.Cliente = Cliente;
    this.Saldo = Saldo;
    this.numConta = numConta;
    }
     public double setSaldo (double Saldo){
        this.Saldo = Saldo;
        return Saldo;
    }
     public double getSaldo(){
      return Saldo;   
    }
     public String setnumConta (String numConta) {
         this.numConta = numConta;
         return numConta;
     }
     public String getnumConta (){
         return numConta;
     }
     public String setcliente (String Cliente){
         this.Cliente = Cliente;
         return Cliente;
     }
     public String getCliente(){
         return Cliente;
     }
     public int getContaOrigem (){
         return ContaOrigem;
     }
     public int getContaDestino (){
         return Contadestino;
     }
     public void exibir (){
         System.out.println("Cliente" + Cliente);
         System.out.println("numConta "+ numConta );
         System.out.println("Saldo " +Saldo);
     }
     public void exSal (){
         System.out.println("Saldo " + Saldo);
     }
     
      public double RealizarTrancacao (){
            
           
}     