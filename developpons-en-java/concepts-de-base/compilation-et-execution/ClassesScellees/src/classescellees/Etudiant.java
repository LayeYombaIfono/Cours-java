/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classescellees;

/**
 *
 * @author Ifono
 */
public final class Etudiant extends Person{
    
    private String matricule;
    private String niveau;
    private String departement;

    public Etudiant(String matricule, String niveau, String departement, String name, String prenom, String telephone, String email) {
        super(name, prenom, telephone, email);
        this.matricule = matricule;
        this.niveau = niveau;
        this.departement = departement;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
    
    
}
