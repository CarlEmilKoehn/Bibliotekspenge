public abstract class Title {

    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574; //dkk

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public double calculateRoylaty() {

        return 0.0;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType() {
        switch (literatureType) {
            case "BI":
                return 3;

            case "TE":
                return 3;

            case "LYRIK":
                return 6;

            case "SKØN":
                return 1.7;

            case "FAG":
                return 1;

            default:
                System.out.println("Fejl på typen");
                return -1;

        }
    }

}
