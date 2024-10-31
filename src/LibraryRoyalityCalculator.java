public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        Author author1 = new Author("Tom Rachman");

        //author1.addTitle(new AudioBook("The Imperfectionists", "SKØN", 25, 272));
        author1.addTitle(new PrintedBook("De ufuldkomne", "SKØN", 100, 324));
        //author1.addTitle(new AudioBook("De ufuldkomne", "SKØN", 25, 324));
        //author1.addTitle(new AudioBook("The Rise & Fall of Great Powers", "SKØN", 10, 384));
        author1.addTitle(new PrintedBook("Storhed & fald", "SKØN", 45, 380));
        //author1.addTitle(new AudioBook("The Italian Teacher", "SKØN", 30, 340));
        author1.addTitle(new PrintedBook("Den italienske mester", "SKØN", 30, 345));
        author1.addTitle(new PrintedBook("The Imposters", "SKØN", 40, 352));

        System.out.println("This year " + author1.getName() +" will receive " + String.format("%.2f", author1.calculateTotalPay()) + " DKK from the The Public Lending Right Program.");
    }
}
