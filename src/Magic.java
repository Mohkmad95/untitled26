public class Magic extends Hero{
    public Magic(int heath, int damage, String superPower){
        super(heath,damage,superPower);
    }
    @Override
    public void applySuperAbility(){
        System.out.println(" Маг пришел к медику на разговор и чет там непонятки и маг вырубил медика: ");

    }
}
