package jdbc_alejandro;

import jdbc_alejandro.dao.ProductDAO;
import jdbc_alejandro.dao.ProductDAOimp;
import jdbc_alejandro.model.Product;

public class JDBC_Alejandro {
    public static void main(String[] args) {
        ProductDAO product = new ProductDAOimp();
        
        //Agregar nuevo producto
        //product.insert(new Product(36, "Polloasw", 15.0));
        
        //Update producto
        //product.update(new Product(36, "Polloasw22", 152.0));
        
        //Delete product
        //product.delete(200);
        
        //Objetener producto con id 10
        Product p = product.read(30);
        System.out.println(p);
    }
}
