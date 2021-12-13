public class Events implements ColorInterface
{
    static Shop s = new Shop();


    //Tells Chonky where he is in the story
    public static void whereAmI(String name)
    {
        System.out.println("Chonky is in the " + name);
    }

    String event1 = "Chonky finds himself stuck in the middle of an island he has a few choices to make\n" +
            "1. Follow the trail in front of him\n" +
            "2. Go to the water and try to swim away\n" +
            "3. Stay there";

    String event1a = "As you go up the trail, Chonky finds himself in a village what happens next?";
    String event1a1 = "Chonky talks to a local, what do you talk about?\n" +
            "1. The weather\n" +
            "2. The island\n" +
            "3. Stop talking to the local";
    String event1aa1= "Chonky talks about the weather";
    String event1aa2 = "Chonky talks about the island and learns there's treasure in the forest!";
    String event1aa3 = "Chonky stops talking to the local";

    String event1b = "Chonky drowns. L \n";
    String event1c = "Chonky sits there";
    String event1c1 = "Chonky explodes";
    String event1c2 = "Chonkey wakes up in a village";

    String event2 = "What do we do now?\n" +
            "1. Check where we are\n" +
            "2. Look for shops\n" +
            "3. Find the treasure\n";

    String event2b1 = "Does Chonky go to the shop?\n" +
            "1. Yes\n" +
            "2. No\n" +
            "3. Look at other shops";
    String event2b2 = "Chonky decides to go to Steve's Hardware";
    String event2b3 = "Chonky doesn't want to go to Steve's Hardware";

    String shopEvent = "Chonky walks to Steve's Hardware";
    String shopEvent2 = "Press 2 to open the door ";

    @Override
    public String isItColored() {
        return null;
    }
}
