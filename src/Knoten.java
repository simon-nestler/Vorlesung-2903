public class Knoten {
    private int wert;
    private Knoten links;
    private Knoten rechts;

    public Knoten(int wert, Knoten links, Knoten rechts) {
        this.wert = wert;
        this.links = links;
        this.rechts = rechts;
    }

    public Knoten(int wert) {
        this(wert, null, null);
    }

    public int getWert() {
        return wert;
    }

    public Knoten getLinks() {
        return links;
    }

    public Knoten getRechts() {
        return rechts;
    }

    public void preOrder() {
        System.out.print(wert + "-");
        if (links != null) {
            links.preOrder();
        }
        if (rechts != null) {
            rechts.preOrder();
        }
    }
}
