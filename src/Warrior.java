public class Warrior extends Hero{
    public Warrior(int heath, int damage, String superPower){
        super(heath,damage,superPower);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Воин в шоке от происходящиго");
    }
}
