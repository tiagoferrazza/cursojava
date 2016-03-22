/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Execute esta classe para testar a sobrecarga do metodo inicializaConta da classe
 * Conta 
 *
 */
public class TestaSobrecarga {

    public static void main(String[] args) {
        // 1. Instanciar uma Conta c1
        Conta c1 = new Conta();
        // 2. Chame o metodo inicializaConta informando o saldo
        c1.inicializaConta(3000,"123","Tiago Ferrazza","452",25);
        // 3. Imprima os dados da Conta, usando o metodo imprimeDados
        c1.imprimeDados();
        // 4. Instanciar uma Conta c2
        Conta c2 = new Conta();
        // 5. Chame o metodo inicializaConta informando sem informar o saldo
        c2.inicializaConta("321","Camila","568",52);
        // 6. Imprima os dados da Conta c2, usando o metodo imprimeDados
        c2.imprimeDados();
    }
}
