package jdbc_alejandro.dao;

import jdbc_alejandro.model.Product;

public interface ProductDAO {
    public void insert (Product product);
    public void update (Product product);
    public void delete (Integer id);
    public Product read (Integer id);
}
