package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "mursal";
        int age = 99;
        int temperature = 11;

            if(age > 20 && age < 45 && temperature <= 30 && temperature >= -20 ){
                System.out.println(name + " can go out");
            }else if(age < 20 && temperature > 0 && temperature < 28){
                System.out.println( name + " can go hangout");

            }else if(age > 45 && temperature >= -10 && temperature<= 25){
            System.out.println(name + " go out");

        }


        }

    }

