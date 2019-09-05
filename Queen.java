package WH_01;

public class Queen extends Character{

    public Queen(String aName)
    {
        super(aName);
        setWeaponBehavior(new WeaponKnife());
    }

    public void display()
    {
        System.out.println(this.name + "is a beautiful queen");
    }
}
