
public class Empresa {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente("João", "123.123.123-12", 2222);
		
		Gerente victor = new Gerente("Victor", "000.000.000-00", 2222);

//		System.out.println(joao.getSalario());
		Bonificacao bonificacao = new Bonificacao();
//		System.out.println(bonificacao.getBonificacao(victor));
//		bonificacao.reajusteSalarial(victor);
//		bonificacao.reajusteSalarial(joao);
//		joao.exibirDados();
		victor.exibirDados();
	
		Sistema si = new Sistema();
		si.autentica(joao);
		si.autentica(victor);
//		System.out.println(joao.getSenha());
	}
}

