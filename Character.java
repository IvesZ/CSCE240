package WH_01;

public abstract class Character{
    protected String name;
    protected WeaponBehavior weaponBehavior;

    public Character(String aName)
    {
        this.name = aName;
    }

    public void attack()
    {
        weaponBehavior.attack();
    }

    public void setWeaponBehavior(WH_01.WeaponBehavior wb) {
        weaponBehavior = wb;
        //System.out.println("set weapon");
    }

    public abstract void display();
}
