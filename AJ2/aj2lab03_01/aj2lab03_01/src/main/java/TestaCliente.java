/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        Cliente c = new Cliente();
        // Inicializacao do cliente usando o metodo inicializaCliente
        c.inicializaCliente("Tiago Ferrazza","111.222.333-444");
        // Impressao dos dados do cliente
        c.imprimeDados();
    }
}
