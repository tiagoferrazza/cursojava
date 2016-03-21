/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Encapsule os atributos da classe Cliente
 * 
 */
public class Cliente {

    private String nome;
    private String cpf;

    /**
     * @param nomeCliente
     *            nome do cliente
     * @param cpfCliente
     *            cpf do cliente
     */
    public void inicializaCliente(String nomeCliente, String cpfCliente) {
        this.cpf = cpfCliente;
        this.nome = nomeCliente;
    }

    public void getNome(String nome){
        this.nome = nome;
    }

    public String setNome(){
        return nome;
    }

    public void getCpf(String cpf){
        this.cpf = cpf;
    }

    public String setCpf(){
        return cpf;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("----------------------");
    }
}
