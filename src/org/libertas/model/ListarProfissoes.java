package org.libertas.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.libertas.dao.CidadeDao;
import org.libertas.dao.ProfissaoDao;
import org.libertas.pojo.Cidade;
import org.libertas.pojo.Profissao;

import com.google.gson.Gson;

public class ListarProfissoes implements Modelo {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) {
		try {
			ProfissaoDao pdao = new ProfissaoDao();
			List<Profissao> profissoes = pdao.listar();
			Gson gson = new Gson();
			String json = gson.toJson(profissoes);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
