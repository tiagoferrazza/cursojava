/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criacao da conta
        Conta c = new Conta();
        // Inicializacao da conta
        c.inicializaConta(2000,"123","Tiago Ferrazza", 321,45);
        // Impressao dos dados da conta
        c.imprimeDados();
        // Saque da conta
        c.saque(500);
        // Impressao dos dados da conta
        c.imprimeDados();
        // Deposito em conta
        c.deposito(250);
        // Impressao dos dados da conta
        c.imprimeDados();
    }
}
