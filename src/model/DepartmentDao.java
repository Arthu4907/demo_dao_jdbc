package model;

import entities.Department;
import java.util.List;

public interface DepartmentDao {

    void insert(Department obj); //Insere 
    void update(Department obj); //Atualiza
    void deleteById(Integer id); //Deleta um ID
    Department findById(Integer id); //Consulta os id
    List<Department> findAll(); //Lista

    
}
