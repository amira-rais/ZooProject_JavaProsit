package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat ;

    public Aquatic (String family , String name , int age , boolean isMammal, String habitat) {
        super (family, name, age, isMammal) ;
        this.habitat = habitat ;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return super.toString() + " Habitat : " + this.habitat ;
    }

    public abstract void swim () ;

    @Override
    public boolean equals (Object obj) {
        Aquatic objaqua = (Aquatic) obj ;
        if ( this.getName() == objaqua.getName() && this.getAge() == objaqua.getAge() && this.getHabitat() == objaqua.getHabitat() )
            return true ;
        return false ;
    }
}
