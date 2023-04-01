//Hetha Esmo JAVA BEAN//Hetha Esmo JAVA BEAN//Hetha Esmo JAVA BEAN//Hetha Esmo JAVA BEAN

package metier;

import java.io.Serializable;

public class Produit implements Serializable {
    private Long id;
    private String nom;
    private int prix;

    public Produit() {
        super();
    }
    public Produit(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
