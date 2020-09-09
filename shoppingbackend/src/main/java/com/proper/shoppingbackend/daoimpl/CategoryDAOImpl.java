package com.proper.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proper.shoppingbackend.dao.CategoryDAO;
import com.proper.shoppingbackend.dto.Category;



@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	@Override
	public List<Category> list() {
		//System.out.println(categories);
		// TODO Auto-generated method stub
		String selectActiveQuery = "from Category where active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveQuery);
		
		query.setParameter("active", true);
		
		return query.getResultList();
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
		
	}


	@Override
	
	public boolean add(Category category) {
		
		try
		{
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}



	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}


	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		
		category.setActive(false);
		
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
