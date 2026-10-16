package tn.esprit.gestionzoo.entities;

public class Zoo {
    /* Instruction 14 */
    private final int nbrCages = 25 ;
    private Animal [] animals = new Animal[nbrCages] ;
    private String name ;
    private String city ;
    private int compteur = 0;

    /* Instruction 6 */
    public Zoo () {
        name = "zooname" ;
        city = "place" ;
        // nbrCages = 1 ;
    }
    public Zoo (String name , String city /*, int nbrCages*/) {
        setName(name); ;
        this.city = city ;
        // this.nbrCages = nbrCages ;
    }

    /* Instruction 18 */

    public int getNbrCages() {
        return nbrCages;
    }

    public int getCompteur() {
        return compteur;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public void setName(String name) {
        if (name == null && name.isEmpty())
            System.out.println("Zoo name cannot be empty");
        else
            this.name = name;
    }

    /* Instruction 8 */
    public void displayZoo () {
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
    public void displayAnimals() {
        System.out.println("Animals : ");
        for (int i = 0 ; i < compteur ; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0 ; i < compteur ; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i ;
            }
        }
        return -1 ;
    }

    /* Instruction 12 : improvement of intruc 10 */
    public boolean addAnimal (Animal animal) {
        if (isZooFull()) {
            System.out.println("Error: The zoo is full !");
            return false ;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Error: The animal " + animal.getName() + " already exists in the zoo");
            return false ;
        }

        animals[compteur] = animal ;
        compteur++ ;
        return true ;
    }

    /* Instruction 13 */
    public boolean removeAnimal (Animal animal) {
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
    public boolean isZooFull () {
        return compteur >= nbrCages ;
    }

    public static Zoo comparerZoo (Zoo z1, Zoo z2) {
        if (z1.compteur >= z2.compteur) {
            return z1 ;
        } else {
            return z2 ;
        }
    }
}
