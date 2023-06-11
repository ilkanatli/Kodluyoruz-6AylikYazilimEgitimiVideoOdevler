public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0) {
                while (this.f1.startChance == this.f2.startChance) {
                    this.f1.startChance = Math.round(Math.random());
                    this.f2.startChance = Math.round(Math.random());
                }
                System.out.println("===========YENI ROUND=============");

                if (this.f1.startChance > this.f2.startChance) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.startChance = 0;
                    this.f2.startChance = 1;
                }
                if (this.f1.startChance < this.f2.startChance) {

                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }

                    this.f1.startChance = 1;
                    this.f2.startChance = 0;
                }
                System.out.println(this.f1.name + " saglik : " + this.f1.health);
                System.out.println(this.f2.name + " saglik : " + this.f2.health);
            }
        } else {
            System.out.println("Sporcularin sikletleri uyusmuyor!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandi !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandi !");
            return true;
        } else {
            return false;
        }
    }
}