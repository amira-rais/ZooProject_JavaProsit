public class Animal {
    String family ;
    String name ;
    int age ;
    boolean isMammal ;

    /* Instruction 6 */
    public Animal (String family , String name , int age , boolean isMammal) {
        this.family = family ;
        this.name = name ;
        this.age = age ;
        this.isMammal = isMammal ;
    }
    public Animal () {
        this.family = "anyfamily" ;
        this.name = "anyname" ;
        this.age = 1 ;
    }

    /* Instruction 9 */
    @Override
    public String toString() {
        return "Animal name : " + this.name + " - Family : " + this.family + " - Age : " + this.age ;
    }
}
