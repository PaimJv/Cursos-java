package br.com.bytebank_operacoes.conexao;



public class TesteConexao {

	public TesteConexao() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		try(Conexao con = new Conexao()){
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro na conexao");
		}
	}
}
