public class Demo {
    public static void main(String[] args) {
        Hole hole = new Hole(5);
        Peg rpeg = new Peg(10);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5." + hole.fits(rpeg));
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        Adapter smallAdapter = new Adapter(smallSqPeg);
        Adapter largeAdapter = new Adapter(largeSqPeg);
        if (hole.fits(smallAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.+++" + hole.fits(smallAdapter));
        }
        if (!hole.fits(largeAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5 ++." + hole.fits(smallAdapter));
        }
    }
}