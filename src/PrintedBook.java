public class PrintedBook extends Title{

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    //Calculate the points:
    @Override
    protected double calculatePoints() {
        return pages * calculateLiteraturePoints() * super.copies;
    }

    //Calculate the points for the different categories (literatureType)
    @Override
    protected double calculateLiteraturePoints() {
        if(super.getLiteratureType().equals("BI") || super.getLiteratureType().equals("TE") ) {
            return 3.00;
        } else if (super.getLiteratureType().equals("LYRIK")) {
            return 6.00;
        } else if(super.getLiteratureType().equals("SKØN")) {
            return 1.70;
        }
        else if (super.getLiteratureType().equals("FAG")) {
            return 1.0;
        }
        return 0;

    }

}

