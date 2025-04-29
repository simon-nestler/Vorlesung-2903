public class App {
    public static void main(String[] args) throws Exception {
        Knoten knot8 = new Knoten(
                8,
                new Knoten(7),
                new Knoten(9));
        Knoten knot6 = new Knoten(
                6,
                new Knoten(5),
                knot8);
        Knoten knot4 = new Knoten(
                4,
                new Knoten(3),
                knot6);
        Knoten links = new Knoten(
                2,
                new Knoten(1),
                knot4);

        Knoten knot21 = new Knoten(
                21,
                new Knoten(19),
                new Knoten(23));
        Knoten knot17 = new Knoten(
                17,
                new Knoten(16),
                knot21);
        Knoten knot15 = new Knoten(
                15,
                null,
                knot17);
        Knoten rechts = new Knoten(
                13,
                new Knoten(11),
                knot15);

        Knoten wurzel = new Knoten(
                10,
                links,
                rechts);

        wurzel.preOrder();
        System.out.println();
    }
}
