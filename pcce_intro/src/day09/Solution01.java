package day09;

public class Solution01 {
    public int solution(int hp) {
        Ant a1 = Ant.GENERAL;
        Ant a2 = Ant.SOLDIER;
        Ant a3 = Ant.WORKER;
        
        int i = 0;
        i += hp/a1.getValue();
        hp %= a1.getValue();
        i += hp/a2.getValue();
        hp %= a2.getValue();
        i += hp/a3.getValue();
        
        return i;
    }
}

enum Ant {
    GENERAL(5), SOLDIER(3), WORKER(1);

    private final int value;

    Ant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
