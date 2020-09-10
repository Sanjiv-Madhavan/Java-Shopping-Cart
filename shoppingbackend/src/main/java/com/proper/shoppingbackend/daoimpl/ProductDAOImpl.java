package com.proper.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proper.shoppingbackend.dao.ProductDAO;
import com.proper.shoppingbackend.dto.Product;


@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Product get(int productId) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().
					get(Product.class, Integer.valueOf(productId));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().
				createQuery("FROM Product", Product.class).getResultList();
	}

	@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		try {
			product.setActive(false);
			return this.update(product);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public List<Product> listActiveProducts() {
		// TODO Auto-generated method stub
		String selectActiveProducts = "FROM Product where isActive = :isActive";
		return sessionFactory.getCurrentSession().
				createQuery(selectActiveProducts, Product.class).
				setParameter("isActive", true).getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		// TODO Auto-generated method stub
		String selectActiveProductsByCategory = "FROM Product where isActive = :isActive AND categoryId = :categoryId";
		return sessionFactory.getCurrentSession().
				createQuery(selectActiveProductsByCategory, Product.class).
				setParameter("isActive", true).
				setParameter("categoryId", categoryId).getResultList();
	}

	@Override
	public List<Product> latestActiveProducts(int count) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().
				createQuery("FROM Product where isActive = :isActive order by Id", Product.class).
				setParameter("isActive", true).
				setFirstResult(0).
				setMaxResults(count).getResultList();
	}

}
