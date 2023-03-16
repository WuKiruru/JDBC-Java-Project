package jdbc_alejandro;

import jdbc_alejandro.dao.ProductDAO;
import jdbc_alejandro.dao.ProductDAOimp;
import jdbc_alejandro.model.Product;

public class JDBC_Alejandro {
    public static void main(String[] args) {
        ProductDAO product = new ProductDAOimp();
        
        //POST{product}
        /*
        if ( product.insert(new Product(1, "PruebaCarmenPOST", 100.0)) != false) {
            System.out.println("Product Inserted successfully on DataBase.");
        } else {
            System.out.println("Product already registered on DataBase.");
        };
        */
        
        //PUT{product}
        /*
        if(product.update(new Product(1, "PruebaCarmenPUT", 50.0))!= false) {
            System.out.println("Product modified successfully.");
        } else {
            System.out.println("Product not modified, ID not in DataBase.");
        };
        */
        
        //DELETE{id}
        /*
        if (product.delete(1) != false) {
            System.out.println("Product deleted correctly.");
        } else {
            System.out.println("Product not deleted or Incorrect ID.");
        }
        */
        
        //GET{id}
        /*
        Product readProduct = product.read(1);
        if (readProduct != null) {
            System.out.println(readProduct);
        } else {
            System.out.println("La ID introducida no se encuentra en la BD.");
        }
        */
    }
}
