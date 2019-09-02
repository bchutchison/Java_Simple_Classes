public class Printer {

    private int numberOfSheets;
    private int pages;
    private int copies;

    public Printer(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;
    }

    public int print(int pages, int copies) {
        if (this.numberOfSheets > pages * copies) {
            return this.numberOfSheets - pages * copies;
        } else {
            return this.numberOfSheets;
        }

    }


}
