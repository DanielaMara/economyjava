package DAO;

import javax.persistence.EntityManager;

import Principal.Transacao;
import Util.HibernateUtil;

public class TransacaoDao 
{
EntityManager em = HibernateUtil.getEntityManager();
	
	public TransacaoDao() 
	{
	// TODO Auto-generated constructor stub
	}

	
	public void Insert(Transacao transacao)
	{
		em.getTransaction().begin();
		em.persist(transacao);
		em.getTransaction().commit();
	}

	public void Update(Transacao transacao)
	{
		em.getTransaction().begin();
		em.merge(transacao);
		em.getTransaction().commit();
	}

	public Transacao GetTransacaoById(Integer idtransacao)
	{
		Transacao transacao = em.find(Transacao.class, idtransacao);
		return transacao;
	}
}
