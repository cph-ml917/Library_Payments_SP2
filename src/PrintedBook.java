public class PrintedBook extends Title{
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    //Calculate the points:
    @Override
    protected double calculatePoints() {
        return this.pages*this.calculateLiteraturePoints() * this.copies;
    }

    //Calculate the points for the different categories (literatureType)
    @Override
    protected double calculateLiteraturePoints() {
        return switch (super.getLiteratureType()) {
            case "BI", "TE" -> 3.00;
            case "LYRIK" -> 6.00;
            case "SKØN" -> 1.70;
            case "FAG" -> 1.0;
            default -> 0;
        };

    }
}

