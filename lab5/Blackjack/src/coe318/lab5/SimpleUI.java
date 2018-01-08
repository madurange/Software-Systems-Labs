package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("THE HOUSE HOLDS:\n"+game.getHouseCards());
        System.out.println("YOU HOLD:\n"+game.getYourCards());
    }

  @Override
    public boolean hitMe() {
        char x; 
        do{
            System.out.print("Do You Want Another Card?(Y/N) : ");
            x=user.next().charAt(0);
            if(x=='Y' || x=='y'){
                return true;
            }else if(x=='N' || x=='n'){
                return false;
            }
            System.out.println("--Invaild Input--\n");
        }while(x!='N' && x!='Y');
        return false;
    }

  @Override
    public void gameOver() {
        System.out.println("\n**GAME OVER**");
        display();
        System.out.println("Your Score: "+game.score(game.getYourCards()));
        System.out.println("The House's Score: "+game.score(game.getHouseCards())+"\n");
        if(game.score(game.getYourCards())>21 || game.score(game.getYourCards())==game.score(game.getHouseCards())){
            System.out.println("THE HOUSE WINS - YOU LOSE :(");
        }else if(game.score(game.getHouseCards())>21 && game.score(game.getYourCards())<=21){
            System.out.println("YOU WIN :)");
        }else if(game.score(game.getHouseCards())<=21 && game.score(game.getYourCards())>game.score(game.getHouseCards())){
            System.out.println("YOU WIN :)");
        }else{
            System.out.println("THE HOUSE WINS - YOU LOSE :(");
        }
    }

}