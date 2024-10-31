import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Title> bookTitles = new ArrayList<Title>();

    public Author(String name){
        this.name = name;
        this.bookTitles = new ArrayList<>();
    }

    public void addTitle(Title titles) {
        this.bookTitles.add(titles);
    }

    public float calculateTotalPay() {
        float totalPay = 0;
        for(Title t: bookTitles) {
            totalPay += (float) t.calculateRoyalty();

        }
        return totalPay;
    }

    public String getName() {
        return name;
    }

}