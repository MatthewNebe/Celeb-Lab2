public class Celebrity
{
    private String name;
    private String hint;

    public String getName()
    {
        return name;
    }

    public String getHint()
    {
        return hint;
    }

    public Celebrity(String n, String h)
    {
        name = n;
        hint = h;
    }

    public String toString()
    {
        return name + ", " + hint;
    }
}