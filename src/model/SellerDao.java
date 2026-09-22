package model;

import entities.Seller;
import java.util.List;

public interface SellerDao {

    void insert(Seller obj); //Insere 
    void update(Seller obj); //Atualiza
    void deleteById(Integer id); //Deleta um ID
    Seller findById(Integer id); //Consulta os id
    List<Seller> findAll(); //Lista
}
