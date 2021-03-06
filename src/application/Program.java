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

		System.out.println("#################### test 03");
		List<Seller> list02 = sellerDao.findAll();

		for (Seller obj02 : list02){
			System.out.println(obj02);
		}

		System.out.println("#################### test 04");
		Seller newSeller = new Seller(null, "Chico", "chico@hotmail.com", new Date(), 5000.00, department);

		sellerDao.insert(newSeller);
		System.out.println("Inserido: Novo id: " + newSeller.getId());

		System.out.println("#################### test 05");

		seller = sellerDao.findById(1);
		seller.setName("MAria joaquina");
		sellerDao.update(seller);

		System.out.println("#################### test 06");

		sellerDao.deleteById(50);
	}

}