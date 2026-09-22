package application;

import entities.Department;
import entities.Seller;
import java.util.List;
import model.DaoFactory;
import model.SellerDao;

public class Program {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        System.out.println("===TESTE 1: seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

         System.out.println("\n===TESTE 2: seller findByDepartment ===");
         Department department = new Department(2, null);
         List<Seller> list = sellerDao.findByDepartment(department);
         list.forEach(System.out :: println);
         
         System.out.println("\n===TESTE 3: seller findAll ===");
         list = sellerDao.findAll();
         list.forEach(System.out :: println);
    }
}
