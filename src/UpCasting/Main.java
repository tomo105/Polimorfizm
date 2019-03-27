package UpCasting;

public class Main {
    public static void main(String[] args) {
        Note note = Note.B_FLAT;
        System.out.println(note);

        Wind flute = new Wind();
        Music.tune(flute);  //rzutowanie w gore
    }
}
