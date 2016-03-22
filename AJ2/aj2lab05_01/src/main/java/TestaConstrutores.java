/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	Conta conta = new Conta(3000,"123","Tiago Ferrazza","452",25);
    	conta.imprimeDados();
    	Cliente cli = new Cliente("Tiago Ferrazza","111.222.333-444");
    	cli.imprimeDados();

    }
}
