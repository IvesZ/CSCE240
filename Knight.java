package WH_01;

public class Knight extends Character {

    public Knight(String aName)
    {
        super(aName);
        setWeaponBehavior(new WeanponBow());
    }

    public void display()
    {
        System.out.println(this.name + " is a valiant knight");
    }
}
