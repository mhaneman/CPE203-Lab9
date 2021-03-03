class CircleException extends RuntimeException
{
    public CircleException(String message)
    {
        super(message);
    }
}

class ZeroRadiusException extends CircleException
{
    public ZeroRadiusException()
    {
        super("zero radius");
    }
}

class NegativeRadiusException extends CircleException
{
    private double radius;

    public NegativeRadiusException(double radius)
    {
        super("negative radius");
        this.radius = radius;
    }

    public void radius()
    {

    }
}