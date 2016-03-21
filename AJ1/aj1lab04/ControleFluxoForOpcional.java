/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoForOpcional {
  /**
   * Método para que esta classe possa ser executada com o utilitário java.
   * 
   * @param args
   *          - argumentos para o método main
   */
  public static void main(String[] args) {
  		for(int i = 100;i<=200;i++){

  			if(i%2 == 0 && i%3 ==0){
				System.out.println(i + " eh divisivel por 2 e por 3");
  			}else if(i % 2 == 0){
				System.out.println(i + " eh divisivel por 2");
			}
			else if(i % 3 == 0){
				System.out.println(i + "eh divisivel por 3");
			} 
			else{
				System.out.println("Nao eh divisivel nem por dois nem por 3");
			}
  		}
  }
}
