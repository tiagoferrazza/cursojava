/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestoes: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saida: 
 * Texto  Texto
 */
class TestaConta {
    public static void main(String[] args) {
    	Conta c = new Conta();

    	c.agencia = 1;
    	c.banco = 234;
    	c.numero = "01945";
    	c.titular = "Globalcode";
    	c.saldo = 2000.0;

    	System.out.println("-----------------------------");
    	System.out.println("AGENCIA: "+c.agencia +"\tBANCO: "+ c.banco);
    	System.out.println("NUMERO: " + c.numero);
    	System.out.println("TITULAR: "+ c.titular);
    	System.out.println("SALDO: " + c.saldo);
    	System.out.println("-----------------------------");
    }
}
