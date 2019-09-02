public class Printer {

    private int numberOfSheets;
    private int tonerVolume;


    public Printer(int numberOfSheets, int tonerVolume) {
        this.numberOfSheets = numberOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int print(int pages, int copies) {
        if (this.numberOfSheets > pages * copies) {
            return this.numberOfSheets - pages * copies & this.tonerVolume - pages;
        } else {
            return this.numberOfSheets & this.tonerVolume;
        }

    }

}
