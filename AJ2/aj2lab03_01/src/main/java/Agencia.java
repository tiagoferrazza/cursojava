/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Encapsule os atributos da classe Agencia = tornar os atributos privados e criar getters e setters
 * 
 */
public class Agencia {

    private String numero;
    private int banco;

    /**
     * @param num
     *            Numero da agencia
     * @param bc
     *            banco ao qual a agencia pertence
     */
    public void inicializaAgencia(String num, int bc) {
        numero = num;
        banco = bc;
    }

    public void getNumero(String numero){
        this.numero = numero;
    }

    public String setNumero(){
        return numero;
    }

    public void getBanco(int banco){
        this.banco = banco;
    }

    public int setBanco(){
        return banco;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + numero);
        System.out.println("Banco no." + banco);
        System.out.println("----------------------");
    }
}
