package hu.petrik.embrerekoop;

public class Main {
    public static void main(String[] args) {
        Ember human=new Ember("Beka Kálmán","2003-04-20",  "Budapest");
        Ember human2=new Ember("Hü Jenő","2004-05-22", "Kecskemét");
        Ember human3=new Ember("Nagy Árpi","2001-02-12", "Győr");
        Emberek emberek=new Emberek((new Ember[]{human, human2, human3}));
        System.out.println(emberek);
    }
}