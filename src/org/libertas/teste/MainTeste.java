package org.libertas.teste;

import java.util.List;

import org.libertas.dao.PessoaDao;
import org.libertas.pojo.Pessoa;

public class MainTeste {
	public static void main(String[] args) {
		
		PessoaDao pdao = new PessoaDao();
		
		Pessoa p1 = new Pessoa();
		//p1.setCidade("SSP");
		p1.setEmail("teste@gmail.com");
		p1.setIdpessoa(0);
		p1.setNome("Ze");
		p1.setTelefone("1234-1234");
		//pdao.salvar(p1);
		
		//List<Pessoa> lista = pdao.listar();
		//for (Pessoa p : lista) {
		//	System.out.println(p.getNome());
		//}
		
		pdao.excluir(3);
	}
}
