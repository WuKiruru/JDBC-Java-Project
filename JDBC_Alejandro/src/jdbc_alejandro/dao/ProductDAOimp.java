package jdbc_alejandro.dao;

import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc_alejandro.model.Product;
import java.sql.*;

public class ProductDAOimp implements ProductDAO {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/apirest2?useSSL=false";
    static final String DB_USER = "root";
    static final String DB_PWD = "";

    private void registerDriver() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR: failed to load MySQL JDBC Driver");
            ex.printStackTrace();
        }
    }

    public void insert(Product product) {
        Connection conn = null;

        try {
            registerDriver();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("insert into product values ("
                    + product.getId() + ",'"
                    + product.getName() + "',"
                    + product.getPrice() + ");");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void update(Product product) {
        Connection conn = null;

        try {
            registerDriver();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("update product set name='"
                    + product.getName() + "', price="
                    + product.getPrice() + " where id="
                    + product.getId());
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void delete(Integer id) {
        Connection conn = null;

        try {
            registerDriver();

            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("delete from product where id=" + id + ";");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public Product read(Integer id) {
        Connection conn = null;
        Product prod = null;
        try {
            registerDriver();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);

            try ( PreparedStatement ps = conn.prepareStatement("select * from product where id = ?")) {
                ps.setInt(1, id);
                try ( ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        prod = new Product(id, rs.getString("name"), rs.getDouble("price"));
                    }
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return prod;
    }

}
