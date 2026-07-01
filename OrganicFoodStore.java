package miniProject;

import java.util.Scanner;

public class OrganicFoodStore {

    Scanner s = new Scanner(System.in);

    static int total = 0;

    public void menu() {

        System.out.println("\n========== WELCOME TO GREEN ORGANIC STORE ==========");
        System.out.println("1. Organic Fruits 🍎");
        System.out.println("2. Organic Vegetables 🥦");
        System.out.println("3. Millets 🌾");
        System.out.println("4. Dry Fruits 🥜");
        System.out.println("5. Health Drinks 🥛");
        System.out.println("6. Total Bill");
        System.out.println("-----------------------------------");
        System.out.print("Choose option: ");

        int choice = s.nextInt();

        switch(choice)
        {
            case 1:
                fruits();
                break;

            case 2:
                vegetables();
                break;

            case 3:
                millets();
                break;

            case 4:
                dryFruits();
                break;

            case 5:
                drinks();
                break;

            case 6:
                totalBill();
                coupon();
                break;

            default:
                System.out.println("Invalid choice");
                menu();
        }
    }


    public void fruits()
    {
        System.out.println("\n----- Fruits -----");

        String fruit[]={
                "1.Apple - ₹50",
                "2.Banana - ₹20",
                "3.Orange - ₹40",
                "4.Guava - ₹35",
                "5.Papaya - ₹45"
        };

        for(String i:fruit)
            System.out.println(i);

        System.out.print("Select product:");
        int ch=s.nextInt();

        int price=0;

        switch(ch)
        {
            case 1: price=50; break;
            case 2: price=20; break;
            case 3: price=40; break;
            case 4: price=35; break;
            case 5: price=45; break;
        }

        quantity(price);
    }


    public void vegetables()
    {
        System.out.println("\n----- Vegetables -----");

        String veg[]={
                "1.Carrot - ₹30",
                "2.Tomato - ₹25",
                "3.Potato - ₹20",
                "4.Onion - ₹35",
                "5.Beetroot - ₹40"
        };

        for(String i:veg)
            System.out.println(i);

        System.out.print("Select product:");
        int ch=s.nextInt();

        int price=0;

        switch(ch)
        {
            case 1: price=30; break;
            case 2: price=25; break;
            case 3: price=20; break;
            case 4: price=35; break;
            case 5: price=40; break;
        }

        quantity(price);
    }


    public void millets()
    {
        System.out.println("\n----- Millets -----");

        String m[]={
                "1.Ragi - ₹60",
                "2.Thinai - ₹70",
                "3.Kambu - ₹80",
                "4.Samai - ₹75",
                "5.Varagu - ₹90"
        };

        for(String i:m)
            System.out.println(i);

        System.out.print("Select product:");
        int ch=s.nextInt();

        int price=0;

        switch(ch)
        {
            case 1: price=60; break;
            case 2: price=70; break;
            case 3: price=80; break;
            case 4: price=75; break;
            case 5: price=90; break;
        }

        quantity(price);
    }


    public void dryFruits()
    {
        System.out.println("\n----- Dry Fruits -----");

        String d[]={
                "1.Almond - ₹120",
                "2.Cashew - ₹150",
                "3.Dates - ₹80",
                "4.Pista - ₹140",
                "5.Walnut - ₹160"
        };

        for(String i:d)
            System.out.println(i);

        System.out.print("Select product:");
        int ch=s.nextInt();

        int price=0;

        switch(ch)
        {
            case 1: price=120; break;
            case 2: price=150; break;
            case 3: price=80; break;
            case 4: price=140; break;
            case 5: price=160; break;
        }

        quantity(price);
    }


    public void drinks()
    {
        System.out.println("\n----- Health Drinks -----");

        String h[]={
                "1.Aloe Vera Juice - ₹60",
                "2.Herbal Tea - ₹45",
                "3.Green Juice - ₹80",
                "4.Beetroot Juice - ₹50",
                "5.Millet Drink - ₹70"
        };

        for(String i:h)
            System.out.println(i);

        System.out.print("Select product:");
        int ch=s.nextInt();

        int price=0;

        switch(ch)
        {
            case 1: price=60; break;
            case 2: price=45; break;
            case 3: price=80; break;
            case 4: price=50; break;
            case 5: price=70; break;
        }

        quantity(price);
    }



    public void quantity(int price)
    {
        System.out.print("Enter quantity:");
        int qty=s.nextInt();

        int amount=price*qty;

        total+=amount;

        System.out.println("Amount = ₹"+amount);

        System.out.println("\n1.Continue Shopping");
        System.out.println("2.Total Bill");

        int op=s.nextInt();

        if(op==1)
            menu();
        else
        {
            totalBill();
            coupon();
        }

    }



    public void totalBill()
    {
        System.out.println("\nTotal Amount = ₹"+total);
    }


    public void coupon()
    {
        s.nextLine();

        System.out.println("Do you have coupon? yes/no");

        String ans=s.nextLine();

        if(ans.equalsIgnoreCase("yes"))
        {
            System.out.println("Enter coupon code:");

            String code=s.nextLine();

            if(code.equalsIgnoreCase("GREEN10"))
            {
                double dis=total*.10;

                System.out.println("Discount = ₹"+dis);

                System.out.println("Final Amount = ₹"+(total-dis));
            }
            else
            {
                System.out.println("Invalid coupon");
                System.out.println("Pay ₹"+total);
            }

        }
        else
        {
            if(total>=3000)
            {
                double dis=total*.15;

                System.out.println("Festival Discount 15%");
                System.out.println("Pay ₹"+(total-dis));
            }
            else
            {
                System.out.println("Pay ₹"+total);
            }
        }

        System.out.println("\n====== THANK YOU VISIT AGAIN ======");
    }


    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name=s.nextLine();

        System.out.print("Phone Number: ");
        long no=s.nextLong();

        OrganicFoodStore obj=
                new OrganicFoodStore();

        obj.menu();

    }

}
