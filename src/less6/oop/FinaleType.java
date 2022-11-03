package less6.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class FinaleType {
    public static void main(String[] args) {
        FinaleType man1 = new FinaleType();
        FinaleType man2 = new FinaleType();
        FinaleType man3 = new FinaleType();
        man3.addFriend(man1);
        man3.addFriend(man2);
        System.out.println(man3.getFriends());


    }
    private final ArrayList friends = new ArrayList<>();
    public ArrayList getFriends() {
        return friends;
    }
    public void addFriend(FinaleType friend) {
        friends.add(friend);
    }


}




