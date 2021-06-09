package be.intecbrussel.entiteit;

/**
 * Created by Mrrobot on 31/10/2017 heroes.
 *
 * Deze klasse krijgen jullie cadeau
 */
public abstract class Hero {

    protected int age;
    protected String alias;


    public Hero(){

    }


    /*
    Vergeet niet dat deze methode nog een implementatie
    nodig heeft in de subklassen.
    Dit mag een simpele sysout zijn.
     */
    public abstract void useSuperPower();

}
