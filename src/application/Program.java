package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("#################### test 01");
		Seller seller = sellerDao.findById(1);

		System.out.println(seller);

		System.out.println("#################### test 02");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findDepartment(department);

		for (Seller obj : list){
			System.out.println(obj);
		}

		
	}

}