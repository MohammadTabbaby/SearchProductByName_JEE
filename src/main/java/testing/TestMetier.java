package testing;

import metier.MetierImpl;
import metier.Produit;
import java.util.List;

public class TestMetier {
    public static void main(String [] args){
        MetierImpl metier = new MetierImpl();
        List<Produit> prods = metier.getProduitsParMotCle("produit2");

        for (Produit p : prods)
            System.out.println(p.getNom());
    }

}
