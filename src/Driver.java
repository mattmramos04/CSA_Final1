import java.util.Scanner;

public class Driver implements ColorInterface
{
    //Color

    public static void main (String[] args)
    {
        //Other classes
        Events f = new Events();
        Enemies enemyObj;
        enemyObj = new Enemies("Slimes", "Spiders", "Goats", "Bigger Spiders", "Orcs");


        System.out.println(enemyObj.isItColored());

        boolean loop = true;

        System.out.println("Chonky's Text Based Adventure\n");



        Scanner scan = new Scanner(System.in);
        System.out.println("\n-----------Choose Starting Area-----------");
        System.out.println("1. Place1 - " + TEXT_RED + "Hardest Difficulty\n" + TEXT_RESET + "2. Place2 - " + TEXT_GREEN + "EZ\n" + TEXT_RESET + "3. Le Forest - " + TEXT_GREEN + "EZ\nType the place bruv" + TEXT_RESET);


        //This is where you choose the world
        while (loop)
        {
            int chosen = scan.nextInt();
            if (chosen == 1)
            {
                System.out.println("You chose Place1");
                System.out.println("Choose again");
            }
            else if (chosen == 2)
            {
                System.out.println("You chose Place2.... why");
                System.out.println("Choose again");
            }
            else if (chosen == 3)
            {
                System.out.println("You chose Le Forest");
                loop = false;
            }
            else
            {
                System.out.println("CHOOSE AGAIN DUMMY");
            }
        }//end of the world loop


        loop = true;
        //------------ The Forest ------------
        System.out.println("\n-----------New Event-----------\n".concat(f.event1));
        while(loop)
        {
            int c1 = scan.nextInt();
            if (c1 == 1)
            {
                System.out.println(f.event1a);
                loop = false;
            }
            else if (c1 == 2)
            {
                System.out.println(f.event1b + "Choose again");
            }
            else if (c1 == 3)
            {
                System.out.println(f.event1c);
                System.out.println("1. Keep Sitting");
                c1 = scan.nextInt();
                if(c1 == 1)
                {
                    System.out.println(f.event1c);
                    System.out.println("1. Keep Sitting");
                    c1 = scan.nextInt();
                    if(c1 == 1)
                    {
                        System.out.println(f.event1c1);
                        System.out.println(f.event1c2);
                        loop = false;
                    }
                    else
                    {
                        System.out.println(f.event1c1);
                        System.out.println(f.event1c2);
                        loop = false;
                    }
                }
                else
                {
                    System.out.println(f.event1c1);
                    System.out.println(f.event1c2);
                    loop = false;
                }
            }
            else
            {
                System.out.println("CHOOSE AGAIN DUMMY:");
            }
        }//end of 2nd while loop


        loop = true;
        System.out.println("\n-----------New Event-----------\n".concat(f.event1a1));
        while (loop)
        {
            int c2 = scan.nextInt();
            if (c2 == 1)
            {
                System.out.println(f.event1aa1);
            }
            else if (c2 == 2)
            {
                System.out.println(f.event1aa2);
            }
            else if (c2 == 3)
            {
                System.out.println(f.event1aa3);
                loop = false;
            }
            else
            {
                System.out.println("CHOOSE AGAIN DUMMY");
            }
        }//end of the 3rd while loop

        loop = true;
        System.out.println("\n-----------New Event-----------\n".concat(f.event2));
        while(loop)
        {
            int c3 = scan.nextInt();
            if(c3 == 1)
            {
                Events.whereAmI("Village");
            }
            else if (c3 == 2)
            {
                Shop.shopName("Steve's Hardware");
                System.out.println(f.event2b1);
                int c4 = scan.nextInt();
                if((c4 != 2) && (c4 == 1))
                {
                    System.out.println(f.event2b2);
                    Shop.shopOptions();
                    int c5 = scan.nextInt();
                    if ((c5 != 1) && (c5 == 2));
                    {
                        System.out.println("Chonky looks at all the available items");
                        Shop n = new Shop();
                        for (String s1 : n.shop)
                        {
                            System.out.println(s1);
                        }
                        System.out.println("\nChonky takes the " + n.shop[0] );
                        System.out.println("\nChonky decides to give up and go find the Treasure\n");
                        loop = false;
                    }
                }
                else if ((c4 != 1) && (c4 == 2))
                {
                    System.out.println(f.event2b3);
                    System.out.println("Chonky goes to look for the treasure");
                    loop = false;
                }
                else if (c4 == 3)
                {
                    Shop e = new Shop();
                    //For each loop
                    for (String shop1 : e.shops)
                    {
                        System.out.println("\n" + shop1);
                    }//end of for each loop
                    System.out.println("\nChonky decides to give up and go find the Treasure\n");
                    loop = false;
                }
                else
                {
                    System.out.println("Choose again dum dum");
                }

            }
            else if (c3 == 3)
            {
                System.out.println("Chonky goes to look for the treasure");
                loop = false;
            }
            else
            {
                System.out.println("CHOOSE AGAIN DUMMY");
            }
        }//end of the 4th while loop

        loop = true;
        System.out.println("-----------New Event-----------\n");
        System.out.println("Chonky finds the treasure\nWOWWW\n");
        while (loop)
        {
            System.out.println("1. Dig up to see how much treasure there is\n" +
                    "2. Sit there\n" +
                    "3. Guess how much treasure there is");
            int c7 = scan.nextInt();
            if(c7 == 1)
            {
                for(int i = 1; i < 11; i++)
                    System.out.println("There is " + i + "Gold");
                System.out.println("That is a lot of gold\nGame Over");
                loop = false;
            }
            else if (c7 ==2)
            {
                System.out.println("Chonky looks around and counts the monsters near him");
                for(int i = 1; i <= 11; i += i)
                {
                    System.out.println(i + " monsters");
                }
                System.out.println("There are 2 " + enemyObj.getSlime() + "\n" +
                        "3 " + enemyObj.getbSpider() + "\n" +
                        "and 3 " + enemyObj.getGoat());
                System.out.println("Game Over");
                loop = false;
            }
            else if(c7 == 3)
            {
                System.out.println("Guess how much gold there is");
                int guess = scan.nextInt();
                int ans = 10;
                while (guess != 10)
                {
                    guess = scan.nextInt();
                    System.out.println("Try again");
                }
                System.out.println("You did it\nGame is over");
                loop = false;
            }
        }//end of the 5th while loop
    }//end of the main method

    @Override
    public String isItColored()
    {
        return null;
    }
}//end of the class
