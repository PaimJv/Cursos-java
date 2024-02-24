
public class Sistema {

	private int senha = 2222;
	
	public Sistema() {
		// TODO Auto-generated constructor stub
	}
	public void autentica(Autenticavel g) {
		boolean autentica = g.autentica(this.senha);
		
		if(autentica) {
			System.out.println("Acesso liberado.");
		} else {
			System.out.println("Acesso negado.");
		}
	}
}
