package Tuan3.Bai4;

import java.io.*;

class GFG
{
    public static void main (String[] args)
    {

        String str = null;
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);


        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
    }
}
//Toán tử  ba ngôi
