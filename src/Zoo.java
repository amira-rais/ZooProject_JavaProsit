public class Zoo {
    Animal [] animals = new Animal[25] ;
    String name ;
    String city ;
    int nbrCages ;

    /* Instruction 6 */
    public Zoo () {
        name = "zooname" ;
        city = "place" ;
        nbrCages = 1 ;
    }
    public Zoo (String name , String city , int nbrCages) {
        this.name = name ;
        this.city = city ;
        this.nbrCages = nbrCages ;
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
}
