package tuts.tut9.todo.adapter;

import tuts.tut9.todo.adapter.adapter.SquarePegAdapter;
import tuts.tut9.todo.adapter.round.RoundHole;
import tuts.tut9.todo.adapter.round.RoundPeg;
import tuts.tut9.todo.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
    public static void main(String[] args) {
        //TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        //TO-DO: If RoundHole instance can "fits" with RoundPeg instance => show a message
        if (hole.fits(peg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }
        //TO-DO: Create 2 instances of SquarePeg with 2 different widths
        SquarePeg smallPeg = new SquarePeg(5);
        SquarePeg bigPeg = new SquarePeg(10);
        //Note: You can't make RoundHole instance "fit" with SquarePeg instance
        //Therefore, we need to use Adapter for solving the problem.
        SquarePegAdapter smallPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter bigPegAdapter = new SquarePegAdapter(bigPeg);

        //TO-DO: Create 2 corresponding instances of SquarePegAdapter

        //TO-DO: If the RoundHole instance can "fits" with "small" RoundPegAdapter instance
        //show a suitable message
        if (hole.fits(smallPegAdapter)) {
            System.out.println("Square peg w5 fits round hole r5.");
        }
        //TO-DO: If the RoundHole instance can not "fits" with "big" RoundPegAdapter instance
        //show a suitable message
        if (!hole.fits(bigPegAdapter)) {
            System.out.println("Square peg w10 does not fit into round hole r5.");
        }
    }
}