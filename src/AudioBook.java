public class AudioBook extends Title implements IAudioBook {
    private double durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {

        double points = durationInMinutes * 0.5 * convertLiteratureType() * super.copies;
        return points;
    }
}
