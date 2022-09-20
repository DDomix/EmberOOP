package hu.petrik.embrerekoop;

public class Main {
    public static void main(String[] args) {
        Ember human=new Ember("Beka Kálmán","2003-04-20",  "Budapest");
        Ember human2=new Ember("Hü Jenő","2004-05-22", "Kecskemét");
        Ember human3=new Ember("Nagy Árpi","2001-02-12", "Győr");
        System.out.println(human);
        System.out.println(human2);
        System.out.println(human3);
    }
}