public class EBook extends NetBook {

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int copies, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, copies, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }


    //Pseudosider udregnes her
    private double calculatePages() {
        double pages = 0;
        if (illustrated) {
            pages = (this.characters / 1800 + 20) * 1.1;
        } else {
            pages = (this.characters / 1800 + 20);
        }
        return pages;
    }

    protected double calculatePoints() {
        double points = calculatePages() * convertLiteratureType() * ((super.reach *5) + super.availability*5) + super.use;
        return points;
    }


}
