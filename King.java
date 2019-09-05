package WH_01;

public class King extends Character {

    public King(String aName)
    {
        super(aName);
        setWeaponBehavior(new WeaponSword());
    }

    public void display()
    {
        System.out.println(this.name + " is a Noble King");
    }
}
