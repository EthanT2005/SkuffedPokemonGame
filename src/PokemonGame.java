import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PokemonGame {

    public static void main(String[] args) {

        int myHealth = 100;

        int enemyHP = 100;

        boolean game = true;// This allows the while statement to be keep on running



        while(game) {// This allows you to keep on playing till one of you dies

            try {//The try catch statement is to catch if the input is valid or not

                System.out.println("Pick 1 to punch and 2 to kick");
                System.out.println(" ");// These empty spaces are to add space between text filled outputs


                Scanner sc = new Scanner(System.in); // This scanner is to see what your inputs are

                int num1 = sc.nextInt();


                if(num1 == 1) { // if you choose 1 then you will do a punch that will do  15 - 30 damage

                    System.out.println("You punch him");
                    System.out.println(" ");


                    Random rnd1 = new Random(); // random number generator for the damage chance

                    int punchAtk;

                    punchAtk = rnd1.nextInt(5);

                    switch(punchAtk) {// This switch case is for the random damage

                        case 0:
                            for(int a = 1; a <= 15; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 15 damage");
                            System.out.println(" ");
                            break;

                        case 1:
                            for(int a = 1; a <= 15; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 15 damage");
                            System.out.println(" ");
                            break;

                        case 2:
                            for(int a = 1; a <= 15; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 15 damage");
                            System.out.println(" ");
                            break;

                        case 3:
                            for(int a = 1; a <= 20; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 20 damage");
                            System.out.println(" ");
                            break;

                        case 4:
                            for(int a = 1; a <= 30; a++) {

                                enemyHP--;

                            }
                            System.out.println("Critical Hit!");
                            System.out.println("You delt 30 damage");
                            System.out.println(" ");
                            break;

                        default:
                            break;


                    }


                    System.out.println("Your opponents health is " + enemyHP);
                    System.out.println(" ");

                }else if (num1 == 2){// if you choose 2 then you will kick your opponent and deal 7 - 35 damage to your opponent

                    System.out.println("You kicked your opponent");
                    System.out.println(" ");

                    Random rnd2 = new Random();

                    int kickAtk;

                    kickAtk = rnd2.nextInt(5);

                    switch(kickAtk) {

                        case 0:
                            for(int a = 1; a <= 10; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 10 damage");
                            System.out.println(" ");
                            break;

                        case 1:
                            for(int a = 1; a <= 10; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 10 damage");
                            System.out.println(" ");
                            break;

                        case 2:
                            for(int a = 1; a <= 10; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 10 damage");
                            System.out.println(" ");
                            break;

                        case 3:
                            for(int a = 1; a <= 15; a++) {

                                enemyHP--;

                            }
                            System.out.println("You delt 15 damage");
                            System.out.println(" ");
                            break;

                        case 4:
                            for(int a = 1; a <= 35; a++) {

                                enemyHP--;

                            }
                            System.out.println("CRITICAL HIT");
                            System.out.println("You delt 35 damage");
                            System.out.println(" ");
                            break;

                        default:
                            break;

                    }


                    System.out.println("Your opponents health is " + enemyHP);
                    System.out.println(" ");

                }


                if(enemyHP <= 0) { // This if-statement checks if your enemy Hp is down to zero and if so it stops the program


                    for(int l = 0; l <= 100; l++) {

                        System.out.println("You Win!");

                        try
                        {
                            Thread.sleep(50);
                        }
                        catch(InterruptedException ex)
                        {
                            Thread.currentThread().interrupt();
                        }

                    }


                    game = false;

                    System.exit(0);


                }else if(enemyHP >= 1) {

                    game = true;

                }


            }catch(InputMismatchException e) {// The InputMismatchException make sure that the user puts in the numbers 1 and 2

                System.err.println("Incorrect input please try again");


            }

            /*
             *
             * This is your opponent its attacks are random
             * and has a higher chance of a critical hit to you.
             *
             */

            Random rnd3 = new Random();

            int atck;

            atck= rnd3.nextInt(6);

            switch(atck) {

                case 0:
                    System.out.println("The enemy punch you");
                    System.out.println("The enemy did 10 damage");
                    System.out.println(" ");
                    for(int c = 1; c <= 10; c++) {

                        myHealth--;

                    }
                    System.out.println("Your health is now: " + myHealth);
                    System.out.println(" ");
                    break;

                case 1:
                    System.out.println("The enemy kicked you");
                    System.out.println("The enemy did 5 damage");
                    System.out.println(" ");
                    for(int c = 1; c <= 5; c++) {

                        myHealth--;

                    }
                    System.out.println("Your health is now: " + myHealth);
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("The enemy punch you");
                    System.out.println("The enemy did 15 damage");
                    System.out.println(" ");
                    for(int c = 1; c <= 15; c++) {

                        myHealth--;

                    }
                    System.out.println("Your health is now: " + myHealth);
                    System.out.println(" ");
                    break;

                case 03:
                    System.out.println("The enemy kicked you");
                    System.out.println("The enemy did 35 damage");
                    System.out.println(" ");
                    for(int c = 1; c <= 35; c++) {

                        myHealth--;

                    }
                    System.out.println("CRITICAL HIT!");
                    System.out.println("Your health is now: " + myHealth);
                    System.out.println(" ");
                    break;

                case 4:
                    System.out.println("The enemy punch you");
                    System.out.println("The enemy did 10 damage");
                    System.out.println(" ");
                    for(int c = 1; c <= 10; c++) {

                        myHealth--;

                    }
                    System.out.println("Your health is now: " + myHealth);
                    System.out.println(" ");
                    break;

                case 05:
                    System.out.println("The enemy punch you");
                    System.out.println("The enemy did 30 damage");
                    System.out.println(" ");
                    for(int c = 1; c <= 30; c++) {

                        myHealth--;

                    }
                    System.out.println("CRITICAL HIT!");
                    System.out.println("Your health is now: " + myHealth);
                    System.out.println(" ");
                    break;

                default:
                    break;

            }


            if(myHealth <= 0) { // This if-statement checks if your enemy Hp is down to zero and if so it stops the program

                System.out.println(" ");
                System.out.println("You Lose! Try again next time!");
                System.out.println(" ");

                System.exit(0);

                game = false;


            }else if(myHealth >= 1) {

                game = true;

            }


        }




    }
}
