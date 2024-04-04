
package sistemabancario;


public class Cliente {
    private String nome;
       private String cpf;

       public Cliente (String nome, String cpf){
           this.nome = nome;
           this.cpf = cpf;
       }
       public String getnome () {
           return nome;
       }
       public String getcpf (){
           return cpf;
       }
       public String setnome (String nome){
           this.nome = nome;
           return nome;
       }
       public String setcpf (String cpf){
           this.cpf = cpf;
           return cpf;
       }
       public void exibir() {
           System.out.println("nome: "+ nome);
           System.out.println("cpf: "+ cpf);
           
       }
       
}
