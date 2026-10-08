public class Zoo {
    /* Instruction 14 */
    final int nbrCages = 25 ;
    Animal [] animals = new Animal[nbrCages] ;
    String name ;
    String city ;
    int compteur = 0;

    /* Instruction 6 */
    public Zoo () {
        name = "zooname" ;
        city = "place" ;
        // nbrCages = 1 ;
    }
    public Zoo (String name , String city , int nbrCages) {
        this.name = name ;
        this.city = city ;
        // this.nbrCages = nbrCages ;
    }

    /* Instruction 8 */
    void displayZoo () {
        System.out.println("Zoo name : " + this.name + " - City : " + city + " - Number of cages : " + nbrCages);
    }

    /* Instruction 9 */
    @Override
    public String toString() {
        return "Zoo name : " + this.name + " - City : " + city + " - Number of cages : " + nbrCages ;
    }

    /* Instruction 10 */
    /*
    boolean addAnimal (Animal animal) {
        boolean response ;
        if (compteur < 25)
        {
            animals[compteur] = animal ;
            compteur++ ;
            response = true ;
        }
        else {
            response = false;
        }
        return response ;
    }
    */

    /* Instruction 11 */
    void displayAnimals() {
        System.out.println("Animals : ");
        for (int i = 0 ; i < compteur ; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        for (int i = 0 ; i < compteur ; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i ;
            }
        }
        return -1 ;
    }

    /* Instruction 12 : improvement of intruc 10 */
    boolean addAnimal (Animal animal) {
        if (compteur >= nbrCages || compteur >= animals.length) {
            System.out.println("Error: The zoo is full !");
            return false ;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Error: The animal " + animal.name + " already exists in the zoo");
            return false ;
        }

        animals[compteur] = animal ;
        compteur++ ;
        return true ;
    }

    /* Instruction 13 */
    boolean removeAnimal (Animal animal) {
        int index = searchAnimal(animal) ;
        if (index == -1) {
            return false ;
        }

        for (int i = index ; i < compteur - 1 ; i++) {
            animals[i] = animals[i + 1] ;
        }

        animals[compteur - 1] = null ;
        compteur-- ;
        return true ;
    }

    /* Instruction 15 */
    boolean isZooFull () {
        return compteur >= nbrCages ;
    }

    static Zoo comparerZoo (Zoo z1, Zoo z2) {
        if (z1.compteur >= z2.compteur) {
            return z1 ;
        } else {
            return z2 ;
        }
    }
}
