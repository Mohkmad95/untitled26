public class Main {
    public static void  main(String[] args){
        Warrior warrior = new Warrior(500,120,"Смех");
        Magic magic = new Magic(300,23,"Крик:");
        Medic medic = new Medic(200,0,"Укол яда");
        Hero[] heroes ={warrior,magic,medic};
        for (int i = 0; i < heroes.length; i++){
            heroes[i].applySuperAbility();
        }
    }
}
