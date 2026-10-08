import java.util.Scanner ;

public class ZooManagement {
    /*
    // Prosit 1
    private int nbCages ;
    private String zooName ; */
    public static void main (String[] args) {
        /*
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


       End_Posit1 */

        //Prosit 2
        /* Instruction 5 */
        Animal lion = new Animal() ;
        Zoo myZoo = new Zoo() ;

        lion.family = "Felidae" ;
        lion.name = "Simba" ;
        lion.age = 7 ;
        lion.isMammal = true ;

        /*
        myZoo.name = "Friguia" ;
        myZoo.city = "Tunis" ;
        myZoo.nbrCages = 50 ;
        */

        /* Instruction 6 */
        Animal tiger = new Animal("Felidae" , "Tigress" , 7 , true) ;
        Zoo myzoo2 = new Zoo("Belvedere" , "Tunis" , 55) ;

        /* Instruction 7 */
        Animal elephant = new Animal("Elephantidae", "Éléphant d'Afrique", 12, false);
        Animal eagle = new Animal("Accipitridae", "Aigle royal", 4, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile du Nil", 15, true);
        Animal wolf = new Animal("Canidae", "Loup gris", 5, true);

        /* Instruction 8 */
        // myZoo.displayZoo();
        // System.out.println(myZoo);
        // System.out.println(myZoo.toString());

        /* Instruction 9 */
        // System.out.println(lion);

        //Prosit 3
        /* Instruction 10 */
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(eagle);
        myZoo.addAnimal(crocodile);
        myZoo.addAnimal(wolf);
        for (int i = 0 ; i <20 ; i++) {
            System.out.println(myZoo.addAnimal(lion));
        }

        /* Instruction 11 */
        myZoo.displayAnimals();
        System.out.println(myZoo.searchAnimal(lion)); //The index of first lion found

        /* Instruction 13 */
        if (myZoo.removeAnimal(tiger)){
            System.out.println("Animal successfully removed");
        }
        System.out.println("New list : ");
        myZoo.displayAnimals();

        /* Instruction 15 */
        myZoo.isZooFull();
        System.out.println("The zoo with the most animals is : " + Zoo.comparerZoo(myZoo,myzoo2));
    }
}
