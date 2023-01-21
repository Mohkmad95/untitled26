public class Medic extends Hero{
    public Medic(int heath, int damage, String superPower){
        super(heath,damage,superPower);

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик очнулся и в шоке от Мага");
    }
}

