package jcontainer;

/**
 *
 * @author tondeur-h
 */
public class Patient {
   //9001234567;CHVDSI, Herve;12/01/1970;691123456;0991
    private final String ipp;
    private final String nomcomplet;
    private final String nom;
    private final String prenom;
    private final String ddn;
    private final int iep;
    private final int uf;

    @Override
    public String toString() {
        return "Patient{" + "ipp=" + ipp + ", nomcomplet=" + nomcomplet + ", nom=" + nom + ", prenom=" + prenom + ", ddn=" + ddn + ", iep=" + iep + ", uf=" + uf + '}';
    }

    public Patient(String ipp, String nomcomplet, String ddn, int iep, int uf) {
        this.ipp = ipp;
        this.nomcomplet = nomcomplet;
        String[] cutName=nomcomplet.split(",", -1);
        nom=cutName[0].trim();
        prenom=cutName[1].trim();
        this.ddn = ddn;
        this.iep = iep;
        this.uf = uf;
    }

    public String getIpp() {
        return ipp;
    }
    
    public String getNomcomplet() {
        return nomcomplet;
    }

    public String getNom() {
        return nom;
    }

        public String getPrenom() {
        return prenom;
    }

    public String getDdn() {
        return ddn;
    }

    public int getIep() {
        return iep;
    }

    public int getUf() {
        return uf;
    }
}
