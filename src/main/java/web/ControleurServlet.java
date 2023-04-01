package web;

import metier.ImetierCatalogue;
import metier.MetierImpl;
import metier.Produit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name="cs", urlPatterns = {"/controleur"}) //annotation remplace web.xml
// (discripteur de deploiment)
public class ControleurServlet extends HttpServlet {
    private ImetierCatalogue metier; // interface ImetierCatalogue implimented by MetierImpl
    @Override
    public void init() throws ServletException{
        metier = new MetierImpl(); //instanciate MetierImpl
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException{
        String mc = request.getParameter("motCle");//prendre parametre de lien
        ProduitModele mod = new ProduitModele(); // creer un modele produit
        mod.setMotCle(mc); // affecter mc dans modele
        List<Produit> prods = metier.getProduitsParMotCle(mc); //appeler getproduit
        mod.setProduits(prods);
        //passer modele mod qui a mc et prods a jsp
        request.setAttribute("modele", mod);
        request.getRequestDispatcher("ProduitsView.jsp").forward(request, response);

    }
}
