/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        Conta c = new Conta();
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        c.inicializaConta(2000,"123","Tiago Ferrazza",321,45);
        // executar um deposito
        c.deposito(125);
        // Imprimir o saldo apos o deposito
        c.imprimeDados();
        // executar um saque cujo valor seja menor que o saldo
        c.saque(35);
        // Imprimir o saldo apos o deposito
        c.imprimeDados();
        // executar uma retirada cujo valor seja maior que o saldo
        c.saque(2500);
        // Imprimir o saldo apos o deposito
        c.imprimeDados();
    }
}
