public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    double startChance;

    public Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe) { // foe hasarı alacak sporcu

        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isDodge()) { // rakip kendini savunabilecek mi
            System.out.println(foe.name + " gelen hasari blokladi!");
            System.out.println("------------------------");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0; // retun u burada görünce aşağıyı okumayacak artık.
        }
        return foe.health - this.damage; // rakibin sağlığı vuran kişinin hasarı miktarı çıkarılır.
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100; // 0-100 arasında rastgele sayı üretmemizi sağlıyor.
        return randomNumber <= this.dodge; // savunma sanşı rasgtgele üretilen sayıdan büyük ya da eşitse savunma yapabilir.
    }
}
