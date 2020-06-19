package org.libertas.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.libertas.dao.CidadeDao;
import org.libertas.dao.PessoaDao;
import org.libertas.dao.ProfissaoDao;
import org.libertas.pojo.Cidade;
import org.libertas.pojo.Pessoa;
import org.libertas.pojo.Profissao;


public class SalvarPessoa implements Modelo {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		try {
			
			if (request.getParameter("idpessoa")==null) {
				return "idpessoa é obrigatório!";
			}
			if (request.getParameter("nome")==null) {
				return "nome é obrigatório!";
			}
			if (request.getParameter("nome").equals("")) {
				return "nome é obrigatório!";
			}
			
			Pessoa p = new Pessoa();
			p.setNome(request.getParameter("nome"));
			p.setIdpessoa(Integer.parseInt(request.getParameter("idpessoa")));
			
			CidadeDao cdao = new CidadeDao();
			Cidade c = cdao.consultar( Integer.parseInt(request.getParameter("cidade")));
			
			ProfissaoDao profdao = new ProfissaoDao();
			Profissao prof = profdao.consultar(Integer.parseInt(request.getParameter("profissao")));
			
			
			//p.setCidade(request.getParameter("cidade"));
			p.setEmail(request.getParameter("email"));
			p.setTelefone(request.getParameter("telefone"));
			p.setDataNascto(request.getParameter("dataNascto"));
			p.setCidade(c);
			p.setProfissao(prof);
			
			PessoaDao pdao = new PessoaDao();
			pdao.salvar(p);
			if (p.getIdpessoa()>0) {
				return "registro alterado com sucesso";
			} else {
				return "registro inserido com sucesso";
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
