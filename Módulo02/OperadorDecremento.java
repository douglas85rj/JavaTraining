public class OperadorDecremento {
  public static void main (String[] args) {
	
	int limiteTentativasLogin = 10;
	
	//limiteTentativasLogin--;

	int novoLimiteTentativasLogin = --limiteTentativasLogin;
	
	System.out.println("Limite de tentativas de Login:" + limiteTentativasLogin);
	System.out.println("Novo limite de tentativas de login:" + novoLimiteTentativasLogin);

 }

}
