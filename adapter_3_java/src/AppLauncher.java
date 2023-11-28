import adapters.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class AppLauncher {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);
//        hole.fits(smallPeg);   --> won't compile

        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largePegAdapter = new SquarePegAdapter(largePeg);
        if (hole.fits(smallPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5");
        }
        if (!hole.fits(largePegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5");
        }
    }
}
