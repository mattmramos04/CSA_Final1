public class Shop implements ColorInterface
{

    static Events f = new Events();

    //Owner of the shop
    public static void shopName(String shopName)
    {
        System.out.println("The shops name is " + shopName);
    }

    //Prints out in the
    public static void shopOptions()
    {
        System.out.println(f.shopEvent);
        System.out.println(f.shopEvent2);
    }

    String[] shops = {"Steve's Hardware", "Fairbanks Steelworks", "Moti's Iron emporium"};

    String[] shop = {"Pencil", "Sword", "Axe"};
}
