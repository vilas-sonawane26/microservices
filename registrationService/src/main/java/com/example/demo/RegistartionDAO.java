package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class RegistartionDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Transactional()
	public User saveNewUser(User user)
	{
		return entityManager.merge(user);	
	}
	
	public User getUser(long id)
	{
		Session session = entityManager.unwrap(Session.class);
		User u = session.get(User.class, id);
		return u;
	}
	

}
