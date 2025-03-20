public class EAudioBook extends NetBook implements IAudioBook{

    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int copies, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, copies, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    protected double calculatePoints() {
        double points = durationInMinutes/2 * convertLiteratureType() *((super.reach * 5) + super.availability * 0.5) + super.use;
        return points;
    }
}
