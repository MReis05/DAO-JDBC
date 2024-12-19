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
		
		System.out.println("======= TESTE 1 FindByID =======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("======= TESTE 2 FindByDepartment ==========");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
        
		System.out.println();
		System.out.println("======= TESTE 2 FindByDepartment ============");
		list = sellerDao.findAll();
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("======= TESTE 3 Insert ============");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 3000.00, dep );
		sellerDao.insert(newSeller);
		System.out.println("Inserted new Id: " + newSeller.getId());
	}

}
