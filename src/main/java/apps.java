/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("What is the length? ");
        String length=in.nextLine();

        System.out.print("What is the width? ");
        String width=in.nextLine();

        int lengthNum=Integer.parseInt(length);
        int widthNum=Integer.parseInt(width);


        int area=lengthNum*widthNum;
        int feetCovered=350;
        double numGallons=(double)area/(double)feetCovered;

        int numGals=(int)Math.ceil(numGallons);

        System.out.print("You will need to purchase "+numGals+" gallons of paint to cover "+area+" square feet.");
        in.close();
    }
}
