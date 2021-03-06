package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> names = new ArrayList<String>();
       ArrayList<String> pickedArray = new ArrayList<String>();
       names.add("Berke");
       names.add("Busra");
       names.add("Huseyin");
       names.add("Enes");
       names.add("Sebnem");
           try {
               Random random = new Random();
               int index = random.nextInt(names.size());
               int index2 = random.nextInt(names.size());
               if (index == index2) index2 = random.nextInt(names.size());
               else {


                   pickedArray.add(names.get(index));
                   pickedArray.add(names.get(index2));
               }
           } catch (Exception e) {
               System.out.println("Try again!");
           }
           System.out.println("Soru soran: " + pickedArray.get(0) + "\nSoru sorulan: " + pickedArray.get(1));
           System.out.println();


       }







    }

