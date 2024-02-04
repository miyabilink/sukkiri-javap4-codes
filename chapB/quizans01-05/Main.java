import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Monster> list = new ArrayList<>();
        list.add(new Monster("ゴブリン", 10, false));
        list.add(new Monster("スライム", 10, false));
        list.add(new Monster("ドラゴン", 10, false));

        for (Monster m : list) {
            System.out.println(
                m.name() + 
                " HP=" + m.hp() +
                " BOSS=" + m.isBoss()
            );
        }
    }
}