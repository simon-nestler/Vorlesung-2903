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

    public void inOrder() {
        traverseWithVisit(2);
    }

    public void preOrder() {
        traverseWithVisit(1);
    }

    public void postOrder() {
        traverseWithVisit(3);
    }

    private void traverseWithVisit(int visit) {
        if (visit == 1) {
            System.out.print(wert + " ");
        }
        if (links != null) {
            links.traverseWithVisit(visit);
        }
        if (visit == 2) {
            System.out.print(wert + " ");
        }
        if (rechts != null) {
            rechts.traverseWithVisit(visit);
        }
        if (visit == 3) {
            System.out.print(wert + " ");
        }
    }
}
