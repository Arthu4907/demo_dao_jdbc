package application;

import entities.Seller;
import model.DaoFactory;
import model.SellerDao;

public class Program {
    public static void main(String[] args) {
        
        SellerDao sellerDao = DaoFactory.creatSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
