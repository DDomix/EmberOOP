package hu.petrik.embrerekoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
   private List<Ember> emberek;

    public Emberek(Ember[] emberekTomb) {
        this.emberek=new ArrayList<>();
        this.emberek.addAll(Arrays.asList(emberekTomb));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Ember e: this.emberek){
            //sb.append((e.toString()).append(System.lineSeparator()));
        }
        return sb.toString();
    }
}
