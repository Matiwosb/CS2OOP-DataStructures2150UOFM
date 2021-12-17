package Homework6;

import java.util.ArrayList;
import java.util.Iterator;


class Kangaroo {
    private final int kangarooNum;
    public Kangaroo(int i) {
        kangarooNum = i;
    }
    public void hop() {
        System.out.println("Kangaroo " + kangarooNum + " hops");
    }
}

public class A6Q1 {
    public static void main(String[] args) {
        // add codes here to illustrate three different kinds of looping (hops)
        ArrayList<Kangaroo> kangaroos = new ArrayList<Kangaroo>();
        for (int i = 0;i<5;i++){
            Kangaroo k = new Kangaroo(i);
            kangaroos.add(k);
        }
        System.out.println("+++++++++++ hop in for loop");

        for(int i = 0;i<kangaroos.size();i++){
            kangaroos.get(i).hop();
        }

        System.out.println("----------- hop in Enhanced loop");
        for (var k: kangaroos){
            k.hop();
        }

        System.out.println("*********** hop in Iterator style");
        Iterator <Kangaroo> it = kangaroos.iterator();
        while (it.hasNext()){
            it.next().hop();
        }
    }
}

