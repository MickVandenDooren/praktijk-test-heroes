package be.intecbrussel.app;

import be.intecbrussel.entiteit.*;
import be.intecbrussel.util.AllTheHeroes;

/**
 * Created by Mrrobot on 31/10/2017 heroes.
 *
 * Hier in deze klasse zullen jullie enkele zaken moeten aanvullen.
 */
public class HeroApp {

    public static void main (String[] args) {

        /*
        Kunnen jullie een instantie van de klasse AllTheHeroes maken?
        noem deze referentie variabele heroes
         */
        AllTheHeroes heroes = new AllTheHeroes();

        /*
        ik heb ook een verwijzing naar de Array uit deze instantie nodig
        misschien is er al een methode voorzien hiervoor?
        */
        Hero listOfHeroes[] = new Hero[100];


        //Ik maak alvast enkele instanties van je subklassen aan
        ArmoredHero ironMan = new ArmoredHero("Iron Man", 54);
        Tank hulk = new Tank("Hulk", 55);
        Energizer ironFist = new Energizer("Iron Fist",43);
        ShapeShifter misterFantastic = new ShapeShifter("Mister Fantastic",56);
        Energizer havok = new Energizer("Havok",48);
        ShapeShifter mystique = new ShapeShifter("Mystique",39);

            /*
            Nu we enkele instanties/objecten hebben kunnen jullie deze even opslaan?
            Maak misschien gebruik van een reeds bestaande methode
            */

       heroes.addSuperHero(ironMan);
       heroes.addSuperHero(hulk);
       heroes.addSuperHero(ironFist);
       heroes.addSuperHero(misterFantastic);


            /*
            Onderstaande methode kan je gebruiken om onze array af te printen.
            Ik vrees echter dat deze methode nog niet volledig af is.
            Los jij dit even op?
            */

        print(heroes.getHeroes());

        /*
        Iron fist en Mister Fantastic stellen teleur!
        verwijder deze uit de array.
         */

        heroes.removeSuperHero(ironFist);
        heroes.removeSuperHero(misterFantastic);

        /*
        Misschien kunnen we havok en mystique beter gebruiken in ons team
        voeg deze toe aan onze array met heroes
         */

        heroes.addSuperHero(havok);
        heroes.addSuperHero(mystique);

        /*
        Niet vergeten deze methode had nog wat werk nodig!!!
         */

        print(heroes.getHeroes());
    }

    private static void print(Hero[] listOfHeroes) {
        printHeader();

        /*
        Ik ben vergeten om de krachten van de heroes te gebruiken
        kan jij dit even oplossen?
         */
        for(int i = 0; i < listOfHeroes.length; i++) {
            if (listOfHeroes[i] != null) {
                System.out.println(listOfHeroes[i]);
                listOfHeroes[i].useSuperPower();
                fancyLines(55);
            }
        }
    }

    private static void printHeader() {
        fancyLines(45);
        System.out.println("\t\t\t\tLIST OF HEROES\n");
        fancyLines(45);
    }

    private static void fancyLines (int numbOfLines){
        for (int i = 0; i < numbOfLines; i++){
            System.out.print("-");
            if (i == (numbOfLines-1)){
                System.out.println("|\n");
            }
        }
    }

}
