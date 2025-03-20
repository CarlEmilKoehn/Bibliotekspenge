public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    protected double calculatePoints() {
        double points = pages * convertLiteratureType() * super.copies;
        return points;
    }
}
