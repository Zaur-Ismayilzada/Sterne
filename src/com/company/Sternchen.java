package com.company;

public class Sternchen {
    private final int ANZAHL;

    public Sternchen(int anzahl){
        ANZAHL = anzahl;
    }

    public void zeig(){
        square();
        System.out.println();
        descendr();
        System.out.println();
        descendl();
        System.out.println();
        zero();
        System.out.println();
        triangle();
        System.out.println();
        System.out.println();
        right();
    }

    private void square(){
        for(int i = 0; i < ANZAHL; i++){
            for(int j = 0; j < ANZAHL; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void descendr(){
        for(int i = 0; i < ANZAHL; i++){
            for(int j = ANZAHL - i - 1; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void descendl(){

        for(int i = 0; i < ANZAHL; i++){
            for(int j = 0; j < ANZAHL; j++){
                if(j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void zero(){

        for(int i = 0; i < ANZAHL; i++){
            for(int j = 0; j < ANZAHL; j++){
                if(i == 0 || i == ANZAHL - 1)
                    System.out.print("*");
                else{
                    if(j == 0 || j == ANZAHL - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void triangle(){
        if(ANZAHL % 2 == 0){
            System.out.println("Um einen Dreieck zu bilden, muss Anzahl" +
                    " ungerade sein.");
            return;
        }

        int     k         = ANZAHL / 2;
        boolean completed = false;

        for(int i = 0; i < ANZAHL; i++){
            for(int j = 0; j < ANZAHL; j++){
                if(k - i  <= 0 || k + i >= ANZAHL - 1)
                {System.out.print("*"); completed = true;}
                else if(j == k - i || j == k + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if(completed)
                return;
            else
                System.out.println();
        }
    }

    private void right(){
        for(int i = 0; i < ANZAHL; i++){
            for(int j = 0; j < ANZAHL; j++){
                if(i != ANZAHL - 1){
                    if(j == 0)
                        System.out.print("*");
                    if(i == j && i != 0)
                        System.out.print("*");
                    else{
                        if(j != 0)
                            System.out.print(" ");
                    }
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

}
