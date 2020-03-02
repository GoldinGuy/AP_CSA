package Q2;

public class slotMachine implements Game {
    private double Balance=15;
    private boolean enoughMoney, won=false;



public String getPrize() {
    String s=""+Balance;
    return s;
}


public String equipmentNeeded() {
    if(Balance<5){
        enoughMoney=false;
        return "You need more money.";
    }
    else
        enoughMoney=true;
        return "Good luck... the game definetely isn't rigged";
}


public String rules() {
    return "The game costs five cents to play. If you win, you get ten cents. To start the game you must pull the lever that spins the wheels. If 3 out of the 5 wheels have cherries and the remaining wheels aren't lemons then you win!";

}
public boolean pullLever(){
    if(enoughMoney)
        return true;
    else{
        System.out.println("You have "+Balance+". You need at least five to play");
        return false;
    }
}
public void playGame(){
    String choices[]={"cherries", "oranges", "lemons", "wild card", "bananas"};
    String guess[]=new String[5];
    Balance=Balance-5;
    if(pullLever()){
        for(int i=0; i<choices.length; i++){
            guess[i]=choices[(int)(Math.random()*6)];
        }
        for(int x=0; x<guess.length-2; x++){
            if(guess[x].equals("cherries")==false){
                System.out.println(guess[x]);
                won=false;
            }
            else
                for(int w=4; w<=5; w++){
                    if(guess[w].equals("lemons")){
                        won=false;
                        System.out.println("guess[w]");
                    }
                    else
                        won=true;
                }

        }
    }
    if(won=true){
        Balance=Balance+10;
        System.out.println("You have won!");
    }
    else
        System.out.println("Try again!");
}


}