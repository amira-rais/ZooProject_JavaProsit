import java.util.Scanner ;

public class ZooManagement {
    // Prosit 1
    private int nbCages ;
    private String zooName ;
    public static void main (String[] args) {
        ZooManagement zoo = new ZooManagement() ;
        Scanner sc = new Scanner(System.in) ;
        do {
            System.out.println ("Enter the zoo name : ") ;
            zoo.zooName = sc.nextLine ();
        } while (zoo.zooName.isEmpty());

        do {
            System.out.println ("Enter the number of cages : ") ;
            zoo.nbCages = sc.nextInt ();
        } while (zoo.nbCages <= 0);

        System.out.println (zoo.zooName + " have " + zoo.nbCages + " cages");

        //Prosit 2
        /* Instruction 5 */
        Animal lion = new Animal() ;
        Zoo myZoo = new Zoo() ;

        lion.family = "Felidae" ;
        lion.name = "Simba" ;
        lion.age = 7 ;
        lion.isMammal = true ;

        myZoo.name = "Friguia" ;
        myZoo.city = "Tunis" ;
        myZoo.nbrCages = 50 ;

        /* Instruction 6 */
        Animal tiger = new Animal("Felidae" , "Tigress" , 7 , true) ;
        Zoo myzoo2 = new Zoo("Belvedere" , "Tunis" , 55) ;

        /* Instruction 7 */
        Animal elephant = new Animal("Elephantidae", "Éléphant d'Afrique", 12, false);
        Animal eagle = new Animal("Accipitridae", "Aigle royal", 4, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile du Nil", 15, true);
        Animal wolf = new Animal("Canidae", "Loup gris", 5, true);

        /* Instruction 8 */
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        /* Instruction 9 */
        System.out.println(lion);
    }
}
