/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classescellees;

/**
 *
 * @author Ifono
 */
public final class Professeur extends Person{
    
    private final int NOMBRE_DE_SEMAINE = 4;      
    private String cours;
    private  int tauxHoraire;
    private  int heure;

    public Professeur( String name, String prenom, String telephone, String email, String cours, int tauxHoraire, int heure) {
        super(name, prenom, telephone, email);
        this.cours = cours;
        this.tauxHoraire = tauxHoraire;
        this.heure = heure;
    }



    public int getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(int tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    
   public  void  calculSalaireProfesseur(){
       int salaireBrut = this.getTauxHoraire() * this.getHeure();
       int salaireNet = salaireBrut * NOMBRE_DE_SEMAINE;
       
       System.out.println("Salaire net : "+salaireNet+" GNF");
   }

}
