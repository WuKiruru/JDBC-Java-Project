package jdbc_alejandro.dao;

import jdbc_alejandro.model.Product;

public interface ProductDAO {
    public boolean insert (Product product);
    public boolean update (Product product);
    public boolean delete (Integer id);
    public Product read (Integer id);
}
