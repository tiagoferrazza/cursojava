/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class ParametrosMain {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
  	String nome = "";
	String dataNascimento = "";
	String rg = "";
	String salario = "";
	String sexo = "";
	
	if(args.length == 5){
		System.out.println(args.length);
		
		String textNome = "O(a) Senhor(a) " + nome;
		String textNasc = ", nascido(a) em " + dataNascimento;
		String textRg = " portador(a)do rg de numero " + rg + ", \n";
		String textSexo = " do sexo " + sexo;
		String textTrabalho = ", está registrado(a) com o salário de R$ " + salario + ".";
		System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho);	
	}else{
		System.out.println("Voce deve iniciar passado os parametros corretamente: (Java ParametrosMain <nome> <data nascimento> <rg> <sexo> <salario>)");		
	}
  }
}
