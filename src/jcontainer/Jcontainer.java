package jcontainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tondeur-h
 */
public class Jcontainer {

/*
    définition de quelques patients
    Sous forme de chaines avec les informations séparées 
    par des ";", a noter le nom et prénom eux même sont 
    une chaine séparé par une "," et un espace
    Plus tard on s'interessera plutôt a lire un fichier CSV
    plutôt que de fixer les différents objets.
    Ci dessous on va définir 12 patients différents...
*/
String p1="9000005555;GOSLING, James;11/09/1962;691999455;7401";
String p2="71234980;NAUGHTON, Patrick;24/12/1995;691763984;0991";
String p3="9000001971;JOY, Bill;16/10/2018;691767843;1151";
String p4 = "8000001234;TORVALDS, Linus;28/12/1991;691765432;1001";
String p5 = "8000005678;GATES, Bill;01/01/1975;691765433;1002";
String p6 = "8000009101;LOVELACE, Ada;10/12/1842;691765434;1003";
String p7 = "8000011121;TURING, Alan;23/06/1912;691765435;1004";
String p8 = "8000013141;BERNERS-LEE, Tim;06/08/1991;691765436;1005";
String p9 = "8000015161;HOPPER, Grace;09/12/1943;691765437;1006";
String p10 = "8000017181;WOSNIAK, Steve;04/04/1976;691765438;1007";
String p11 = "8000019201;STALLMAN, Richard;27/09/1983;691765439;1008";
String p12 = "8000023241;MCAFEE, John;01/01/1987;691765441;1010";


List<String> lstPatientsStr=new ArrayList<>(); //liste liée de chaines de caractères
/*
Un ArrayList est un tableau dynamique de type <XXXX> qui contient des éléments stockés dasn des cases contigues
+-------+-------+-------+-------+-------+
| Case1 | Case2 | Case3 | Case4 | Case5 |
+-------+-------+-------+-------+-------+
| ABC   | 12345 | HELLO | TEST  | BYE   |
+-------+-------+-------+-------+-------+
| indx0 |indx1  | indx2 | indx3 | indx4 |
+-------+-------+-------+-------+-------+
*/
List<Patient> lstPatientsObj=new ArrayList<>(); //liste liée d'objets de type Patient(classe)
/*
Px est un objet de type Patient
+-------+-------+-------+-------+-------+
| Case1 | Case2 | Case3 | Case4 | Case5 |
+-------+-------+-------+-------+-------+
| P1    | P2    | P3    | P4    | P5    |
+-------+-------+-------+-------+-------+
| indx0 |indx1  | indx2 | indx3 | indx4 |
+-------+-------+-------+-------+-------+
*/
Map<String,Patient> mapPatientObj=new HashMap(); //map <=> association cle/valeur
/*
Un HashMap est un tableau dynamique associatif de type <cle,valeur> qui contient des éléments stockés dans des cases contigues par associations clé => Valeurs
+-----------+-----------+
|   Clé     |  Valeur   |
+-----------+-----------+
| IPP1      | NAUGHTON  |
+-----------+-----------+
| IPP2      | JOY       |
+-----------+-----------+
| IPP3      | GATES     |
+-----------+-----------+
*/

    /**
     * @param args the command line arguments
     * Méthode main principale
     */
    public static void main(String[] args) 
    {
       new Jcontainer(args); //appeler le constructeur par defaut pour éviter la manipulation de variable statique
    }

    /******************
     * Constructeur
     * @param args 
     ******************/
    public Jcontainer(String[] args) 
    {
        stringInList(); //appeler la fonction StringInList()  
    }

    /**************************
     * Stocker les chaines dasn un tableau
     * dynamique de type Liste liées
     **************************/
    private void stringInList() 
    {
        
         System.out.println("On va inserer les chaines p1 a p12 dans un conteneur ArrayList");
         lstPatientsStr.add(p1);  // on utilise la méthode add de ArrayList pour inserer un nouvel enregistrement chaine de caractères
         lstPatientsStr.add(p2);
         lstPatientsStr.add(p3);
         lstPatientsStr.add(p4);
         lstPatientsStr.add(p5);
         lstPatientsStr.add(p6);
         lstPatientsStr.add(p7);
         lstPatientsStr.add(p8);
         lstPatientsStr.add(p9);
         lstPatientsStr.add(p10);
         lstPatientsStr.add(p11);
         lstPatientsStr.add(p12);

         System.out.println("C'est fait !");
         System.out.println("On va lister les chaines p1 a P12 qui se trouvent dans la liste");
         //definition de la boucle d'itération dans la liste de chaines
         for (String patient:lstPatientsStr)
         {
             System.out.println(patient); //afficher les chaines
             //Creer une liste d'objet patients
             /*
                On va découper ces chaines pour les transformer en objets
                cette technique se nomme la "Serialisation", la technique
                inverse se nomme la "Deserialisation"
             La méthode stringToListPatien va permettre de gere cette découpe...
             */
             stringToListPatient(patient);
         }
         
       //afficher les objets
        System.out.println("Affichage des IPP => Prenom / Nom apres serialisation en objet");
       byte compteur=1;
         for (Patient p:lstPatientsObj)
         {
             System.out.println("IPP = "+p.getIpp()+" => Nom du patient Num "+compteur+" : "+p.getPrenom()+" / "+p.getNom());
             compteur++;
         }
         
         //afficher le patient Numéro 4
         System.out.println("Nom du patient 4 :"+lstPatientsObj.get(3).getNomcomplet());
         
         /*
         convertion en map de ces données
         ici on va prendre pour clé de la map l'IPP
         et valeur l'objet Patient correspondant
         */
         for (Patient ptomap:lstPatientsObj)
         {
             mapPatientObj.put(ptomap.getIpp(), ptomap);
         }
         
         //tester notre map
         // recherche dasn la map le patient dont l'IPP est 8000019201
         System.out.println("Rechercher patient IPP=8000019201");
         System.out.println(mapPatientObj.get("8000019201").toString());
         
         //rechercher par nom exemple WOSNIAK
         System.out.println("rechercher par nom exemple : WOSNIAK");
         //on itére dans la map (verifier tous les eneregistrements
         for (Map.Entry<String, Patient> entry : mapPatientObj.entrySet()) 
         {
            String cle = entry.getKey(); //récupérer la clé
            Patient valeur = entry.getValue(); //recupérer l'objet valeur de type Patient
            if (valeur.getNom().compareToIgnoreCase("WOSNIAK")==0)  //comparer chaque valeur avec le nom
            {
                System.out.println("IPP="+cle+" => "+valeur.toString()); //si correspond => afficher sur l'écran
            }
        }
    }

    /**
     * convertir la chaine en un tableau Statique 
     * qui va contenir les différentes informations du 
     * patient et qui va nous permettre d'instancier
     * les objets "Patient" pour stockage dans une liste 
     * liée d'objets.
     * @param patient 
     */
    private void stringToListPatient(String patient) 
    {
        String[] patTabStat=patient.split(";",-1); //split permet d'éclater une chaine en prenant en compte un séparateur ici le ";"
        lstPatientsObj.add(new Patient(patTabStat[0], patTabStat[1], patTabStat[2], Integer.parseInt(patTabStat[3],10), Integer.parseInt(patTabStat[4],10)));//ajouter l'objet dans la liste d'objets.
    }
    
}//fin du programme
