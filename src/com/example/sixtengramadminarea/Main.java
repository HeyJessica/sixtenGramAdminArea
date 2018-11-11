package com.example.sixtengramadminarea;

import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

    // fråga användare om fakta
        System.out.print("Hur många likes vill du ha?: ");
        int inputLikeCounter = scan.nextInt();

        System.out.print("Skriv en beskrivning: ");
        String description = scan.next();

        System.out.print("Vilket datum är det: ");
        String date = scan.next();

        System.out.print("Vilket användarnamn?: ");
        String userName = scan.next();

        System.out.print("Klistra in url: ");
        String imageUrl = scan.next();

        Post userInput = new Post(inputLikeCounter, description, date, userName, imageUrl);

        //skicka faktan till databasen
        addPostToDb(userInput);
}

    public static void addPostToDb(Post inlagg){
        try {
            String url = "jdbc:mysql://localhost:3306/sixtengram";
            Connection conn = DriverManager.getConnection(url,"root","");
            Statement stmt = conn.createStatement();
            ResultSet rs;

            stmt.execute("INSERT INTO `post` (`id`, `likeCounter`, `description`, `date`, `userName`, `imageUrl`) VALUES (NULL, '"+inlagg.getLikeCounter()+"', '"+inlagg.getDescription()+"', '"+inlagg.getDate()+"', '"+inlagg.getUserName()+"', '"+inlagg.getImageUrl()+"');");
         //   while ( rs.next() ) {
            // String userName = rs.getString("userName");
               // System.out.println(userName);
           // }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
