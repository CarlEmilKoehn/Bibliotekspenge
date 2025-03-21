import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay() {
        float totalPay = 0;
        for (Title t : titles) {
           totalPay += t.calculateRoylaty();
        }
        return totalPay;
    }

    public String getName() {
        return this.name;
    }
}
