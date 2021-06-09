package be.intecbrussel.entiteit;

public class ShapeShifter extends Hero {

    public ShapeShifter(){

    }

    public ShapeShifter(String alias){
        this.alias=alias;
    }

    public ShapeShifter(String alias, int age){
        this.alias=alias;
        this.age=age;
    }

    @Override
    public String toString() {
        return "ShapeShifter{" +
                "age=" + age +
                ", alias='" + alias + '\'' +
                '}';
    }

    @Override
    public void useSuperPower() {
        System.out.println("Disguises as enemy, attacks enemy from behind");
    }

}
