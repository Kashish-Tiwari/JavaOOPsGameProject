package game;

public class Main {
    public static void main(String[] args) {
        Player1 player= new Player1("Kashish","sword",100);
        System.out.println(player.getHealth());
        player.damageByGun1();
        player.damageByGun1();
        player.heal();
        Player2 goodPlayer= new Player2("nikka", "gun", 500, true);
    
        System.out.println(goodPlayer.getName());
        goodPlayer.damageByGun1();
        goodPlayer.damageByGun2();

    }
    
}
