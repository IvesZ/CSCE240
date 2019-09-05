package WH_01;

public class Troll extends Character {

    public Troll(String aName)
    {
        super(aName);
        setWeaponBehavior(new WeaponAxe());
    }

    public void display()
    {
        System.out.println(this.name + " is a funny troll");
    }
}
