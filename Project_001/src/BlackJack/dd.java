package BlackJack;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playerTotal = 0;
        int dealerTotal = 0;
        
        System.out.println("Welcome to Blackjack!\n");
        
        // Player's turn
        playerTotal += (int)(Math.random() * 11 + 1);
        playerTotal += (int)(Math.random() * 11 + 1);
        System.out.println("Your cards are: " + playerTotal);
        System.out.println("Do you want to hit or stand? (h/s)");
        String playerMove = input.nextLine();
        
        while (playerMove.equals("h")) {
            int hit = (int)(Math.random() * 11 + 1);
            playerTotal += hit;
            System.out.println("You hit and got a " + hit + ". Your total is now " + playerTotal);
            if (playerTotal > 21) {
                System.out.println("You busted!");
                break;
            }
            System.out.println("Do you want to hit or stand? (h/s)");
            playerMove = input.nextLine();
        }
        
        // Dealer's turn
        dealerTotal += (int)(Math.random() * 11 + 1);
        dealerTotal += (int)(Math.random() * 11 + 1);
        System.out.println("\nDealer's cards are: " + dealerTotal);
        
        while (dealerTotal < 17) {
            int hit = (int)(Math.random() * 11 + 1);
            dealerTotal += hit;
            System.out.println("Dealer hits and got a " + hit + ". Their total is now " + dealerTotal);
        }
        
        // Determine the winner
        if (dealerTotal > 21) {
            System.out.println("Dealer busted! You win!");
        } else if (dealerTotal > playerTotal) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("You win!");
        }
        
        input.close();
    }
}