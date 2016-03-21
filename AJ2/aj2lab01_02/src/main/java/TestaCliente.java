/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        Cliente c = new Cliente();
        // Inicializacao do cliente
        c.inicializaCliente("Tiago Ferrazza","111.222.333-44");
        // Impressao dos dados do cliente
        c.imprimeDados();
    }
}
