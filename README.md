# JContainer

***

## Description

Démonstration 2 Session 3  

### Voir les commentaires dans le code source du projet.

Utilisation des tableaux statiques en Java.  
Utilisation de la méthode split() de la classe String  
Manipulation de la classe conteneur ArrayList()  
Manipulation de la classe conteneur HashMap()  

Exemple de sortie : 

``` shell
run:
On va inserer les chaines p1 a p12 dans un conteneur ArrayList
C'est fait !

On va lister les chaines p1 a P12 qui se trouvent dans la liste
9000005555;GOSLING, James;11/09/1962;691999455;7401
71234980;NAUGHTON, Patrick;24/12/1995;691763984;0991
9000001971;JOY, Bill;16/10/2018;691767843;1151
8000001234;TORVALDS, Linus;28/12/1991;691765432;1001
8000005678;GATES, Bill;01/01/1975;691765433;1002
8000009101;LOVELACE, Ada;10/12/1842;691765434;1003
8000011121;TURING, Alan;23/06/1912;691765435;1004
8000013141;BERNERS-LEE, Tim;06/08/1991;691765436;1005
8000015161;HOPPER, Grace;09/12/1943;691765437;1006
8000017181;WOSNIAK, Steve;04/04/1976;691765438;1007
8000019201;STALLMAN, Richard;27/09/1983;691765439;1008
8000023241;MCAFEE, John;01/01/1987;691765441;1010

Affichage des IPP => Prenom / Nom apres serialisation en objet
IPP = 9000005555 => Nom du patient Num 1 : James / GOSLING
IPP = 71234980 => Nom du patient Num 2 : Patrick / NAUGHTON
IPP = 9000001971 => Nom du patient Num 3 : Bill / JOY
IPP = 8000001234 => Nom du patient Num 4 : Linus / TORVALDS
IPP = 8000005678 => Nom du patient Num 5 : Bill / GATES
IPP = 8000009101 => Nom du patient Num 6 : Ada / LOVELACE
IPP = 8000011121 => Nom du patient Num 7 : Alan / TURING
IPP = 8000013141 => Nom du patient Num 8 : Tim / BERNERS-LEE
IPP = 8000015161 => Nom du patient Num 9 : Grace / HOPPER
IPP = 8000017181 => Nom du patient Num 10 : Steve / WOSNIAK
IPP = 8000019201 => Nom du patient Num 11 : Richard / STALLMAN
IPP = 8000023241 => Nom du patient Num 12 : John / MCAFEE

Nom du patient 4 :TORVALDS, Linus

Rechercher patient IPP=8000019201
Patient{ipp=8000019201, nomcomplet=STALLMAN, Richard, nom=STALLMAN, prenom=Richard, ddn=27/09/1983, iep=691765439, uf=1008}

rechercher par nom exemple : WOSNIAK
IPP=8000017181 => Patient{ipp=8000017181, nomcomplet=WOSNIAK, Steve, nom=WOSNIAK, prenom=Steve, ddn=04/04/1976, iep=691765438, uf=1007}
```  
