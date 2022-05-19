package rps;

import java.util.Random;
import java.util.Scanner;

//public class RockPaperScissors {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            String[] rpslk = {"rock", "paper", "scissors", "lizard", "spock"};
//            String computerMove = rpslk[new Random().nextInt(rpslk.length)];
//
//            String playerMove;
//
//            while (true) {
//                System.out.println("Please enter your move (Rock, Paper, Scissors, Lizard, or Spock)");
//                playerMove = sc.nextLine();
//                if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper")
//                        || playerMove.equalsIgnoreCase("scissors") || playerMove.equalsIgnoreCase("lizard")
//                        || playerMove.equalsIgnoreCase("spock")) {
//                    break;
//                }
//                System.out.println(playerMove + " is not a valid move, try again...");
//            }
//
//            System.out.println("Computer played " + computerMove);
//            if (playerMove.equals(computerMove)) {
//                System.out.println("The game was a tie!");
//            } else if (playerMove.equalsIgnoreCase("rock")) {
//                if (computerMove.equals("paper")) {
//                    System.out.println("Paper covers rock. You lose!");
//                } else if (computerMove.equals("scissors")) {
//                    System.out.println("Rock crushes scissors. You win!");
//                } else if (computerMove.equals("lizard")) {
//                    System.out.println("Rock crushes lizard. You win!");
//                } else if (computerMove.equals("spock")) {
//                    System.out.println("Spock vaporizes rock. You lose!");
//                }
//            } else if (playerMove.equalsIgnoreCase("paper")) {
//                if (computerMove.equals("rock")) {
//                    System.out.println("Paper covers rock. You win!");
//                } else if (computerMove.equals("scissors")) {
//                    System.out.println("Scissor cut paper. You lose!");
//                } else if (computerMove.equals("lizard")) {
//                    System.out.println("Lizard eats paper. You lose!");
//                } else if (computerMove.equals("spock")) {
//                    System.out.println("Paper disproves Spock. You win!");
//                }
//            } else if (playerMove.equalsIgnoreCase("scissors")) {
//                if (computerMove.equals("paper")) {
//                    System.out.println("Scissor cut paper.You win!");
//                } else if (computerMove.equals("rock")) {
//                    System.out.println("Rock crushes scissors. You lose!");
//                } else if (computerMove.equals("lizard")) {
//                    System.out.println("Scissors decapitate lizard. You win!");
//                } else if (computerMove.equals("spock")) {
//                    System.out.println("Spock smashes scissors. You lose!");
//                }
//            } else if (playerMove.equalsIgnoreCase("lizard")) {
//                if (computerMove.equals("paper")) {
//                    System.out.println("Lizard eats paper.You win!");
//                } else if (computerMove.equals("rock")) {
//                    System.out.println("Rock crushes lizard. You lose!");
//                } else if (computerMove.equals("scissors")) {
//                    System.out.println("Scissors decapitate lizard. You lose!");
//                } else if (computerMove.equals("spock")) {
//                    System.out.println("Lizard poisons Spock. You win!");
//                }
//            } else if (playerMove.equalsIgnoreCase("spock")) {
//                if (computerMove.equals("paper")) {
//                    System.out.println("Paper disproves Spock.You lose!");
//                } else if (computerMove.equals("rock")) {
//                    System.out.println("Spock vaporizes rock. You win!");
//                } else if (computerMove.equals("lizard")) {
//                    System.out.println("Lizard poisons Spock. You lose!");
//                } else if (computerMove.equals("scissors")) {
//                    System.out.println("Spock smashes scissors. You win!");
//                }
//            }
//
//
//            System.out.println("would you like to play again? (y/n)");
//            String playAgain = sc.nextLine();
//
//            if (!playAgain.equalsIgnoreCase("y")) {
//                break;
//            }
//        }
//        sc.close();
//    }
//}