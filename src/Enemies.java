public class Enemies implements ColorInterface
{
    //Instance variables list
    private String slime;
    private String spider;
    private String goat;
    private String bSpider;
    private String Orc;

    //default constructor
    public Enemies()
    {
        slime = TEXT_GREEN + "";
        spider = TEXT_GREEN + "";
        goat = TEXT_RED + "";
        bSpider = TEXT_RED + "";
        Orc = TEXT_RED + "";
    }//end default constructor


    //multi argument constructor
    public Enemies(String newSlime, String newSpider, String newGoat, String newBSpider, String newOrc)
    {
        slime = newSlime;
        spider = newSpider;
        goat = newGoat;
        bSpider = newBSpider;
        Orc = newOrc;
    }//end of full constructor


    //Getters
    public String getSlime()
    {
        return TEXT_GREEN + slime + TEXT_RESET;
    }
    public String getSpider()
    {
        return TEXT_GREEN + spider + TEXT_RESET;
    }
    public String getGoat()
    {
        return TEXT_RED + goat + TEXT_RESET;
    }
    public String getbSpider()
    {
        return TEXT_RED + bSpider + TEXT_RESET;
    }
    public String getOrc()
    {
        return TEXT_RED + Orc + TEXT_RESET;
    }

    //Setters
    public void setSlime(String newSlime)
    {
        slime = newSlime;
    }
    public void setSpider(String newSpider)
    {
        spider = newSpider;
    }
    public void setGoat(String newGoat)
    {
        goat = newGoat;
    }
    public void setbSpider(String newBSpider)
    {
        bSpider = newBSpider;
    }
    public void setOrc(String newOrc)
    {
        Orc = newOrc;
    }


    @Override
    public String isItColored()
    {
        return "I have no idea";
    }
}
