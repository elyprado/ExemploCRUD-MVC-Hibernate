package org.libertas.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.libertas.hibernate.HibernateUtil;
import org.libertas.pojo.Cidade;
import org.libertas.pojo.Pessoa;
import org.libertas.pojo.Profissao;

public class ProfissaoDao {

	public void salvar(Profissao p) {
		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transacao = session.beginTransaction();
			session.saveOrUpdate(p);
			transacao.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<Profissao> listar() {
		List<Profissao> lista = null; 
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transacao = session.beginTransaction();
			lista = session.createQuery("from Profissao").getResultList();
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	public Profissao consultar(int id) {
		Profissao p = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transacao = session.beginTransaction();
			p = (Profissao) session.createQuery("from Profissao WHERE idProfissao = " + id).getSingleResult();
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	public void excluir(int id) {
		Profissao p = consultar(id);
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction transacao = session.beginTransaction();
			session.delete(p);
			transacao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
