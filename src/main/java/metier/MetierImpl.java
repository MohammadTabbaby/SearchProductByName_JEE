package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue{
    @Override
    public List<Produit> getProduitsParMotCle(String mc){
        List<Produit> prods = new ArrayList<Produit>();
        Connection conn = SingletonConnection.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement("select * from produits where nom LIKE ?");
            ps.setString(1,"%" + mc + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Produit p = new Produit();
                p.setId(rs.getLong("id"));
                p.setNom(rs.getString("nom"));
                p.setPrix(rs.getInt("prix"));
                prods.add(p);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return prods;
    }
    @Override
    public void addProduit(Produit p){

    }
}
