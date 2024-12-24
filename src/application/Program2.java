package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("======= TESTE 1 FindByID =======");
		Department dep = depDao.findById(3);
		System.out.println(dep);

		System.out.println();
		System.out.println("======= TESTE 2 Seller Insert ============");
		Department newDep = new Department(7, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted new Id: " + newDep.getId());

		System.out.println();
		System.out.println("======= TESTE 3 Seller Update ============");
		dep = depDao.findById(1);
		dep.setName("Food");
		depDao.update(dep);
		System.out.println("Update complete");

		System.out.println();
		System.out.println("======= TESTE 4 Seller Delete ============");
		depDao.deleteById(6);
		System.out.println("Delete complete");

		System.out.println();
		System.out.println("======= TESTE 5 FindAll ============");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();

		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}
