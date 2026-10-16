package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family ;
    private String name ;
    private int age ;
    private boolean isMammal ;

    /* Instruction 6 */
    public Animal (String family , String name , int age , boolean isMammal) {
        this.family = family ;
        this.name = name ;
        setAge(age);
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

    /* Instruction 18 */
    public String getFamily () {
        return family ;
    }
    public void setFamily (String family) {
        this.family = family ;
    }

    public String getName () {
        return name ;
    }
    public void setName (String name) {
        this.name = name ;
    }

    public int getAge () {
        return age ;
    }
    public void setAge (int age) {
        if (age < 0)
            System.out.println("Age cannot be negatif");
        else
            this.age = age ;
    }

    public boolean getIsMammal () {
        return isMammal ;
    }
    public void setMammal (boolean isMammal) {
        this.isMammal = isMammal ;
    }

}
