public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

       // Author a = new Author("George R.R. Martin");
       // Author b = new Author("J.R. Tolkien");

       // a.addTitle(new PrintedBook("Fallen Leaves", "SKØN", 150, 312));
       // b.addTitle(new AudioBook("Master of Jewlery", "LYRIK", 13, 365));

        Author o = new Author("Olga Ravn");
        o.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        o.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));

        Author me = new Author("Carlus Pilatus");
        me.addTitle(new EBook("Min E-selvbiografi", "SKØN", 1, 97, 50,205, 360000, true));

        System.out.println(me.calculateTotalPay());
       // System.out.println("Total pay for " + o.getName() + ": " + Math.round(o.calculateTotalPay()));

    }
}
