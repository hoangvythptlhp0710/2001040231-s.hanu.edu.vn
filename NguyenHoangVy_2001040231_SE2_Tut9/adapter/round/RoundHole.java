package tuts.tut9.todo.adapter.round;

/**
 * RoundHoles are compatible with RoundPegs.
 */
public class RoundHole {
    //TO-DO: Declare an attribute: name = radius, type = double
    private double radius;

    //TO-DO: Declare the constructor with a parameter
	public RoundHole(double radius) {
        this.radius = radius;
    }

    //TO-DO: Implement getRadius() method
    public double getRadius() {
        return radius;
    }

    //TO-DO: Implement fits() method
    public boolean fits(RoundPeg peg) {
        //if getRadius() of RoundHole >= getRadius() of RoundPeg => return true
        //else return false
        return this.getRadius() >= peg.getRadius();
    }
}
