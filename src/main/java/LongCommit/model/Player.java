package LongCommit.model;


import LongCommit.exception.InvalidMoneyAmountException;

public class Player extends Person{
    private final Wallet wallet;
    private int bet;
    private int playerNumber;

    public Player(){
        wallet = new Wallet(100);
    }

    /**
     * @return the balance of the player's wallet
     */
    public int balance(){
        return wallet.getAmount();
    }

    /**
     * withdraws a certain amount of money from the player's wallet
     * @param amount: int
     * @pre amount >= 0
     * @throws InvalidMoneyAmountException: if not enough money or invalid amount
     */
    public void withdraw(int amount) throws InvalidMoneyAmountException {
        if (amount < 0) {
            throw new InvalidMoneyAmountException();
        }
        wallet.withdraw(amount);
    }

    /**
     * Adds a certain amount of money to the Player's wallet. If trying to add a negative number, it ends the program
     * @param amount: integer, should be positive
     */
    public void receiveMoney(int amount) throws InvalidMoneyAmountException {
        wallet.put(amount);
    }

    /**
     * Converts an array of all possible hand values to an appropriate String
     * @return String
     */
    public String getAllHandValues() {
        // The min is 1 value, max is 2 values. Do not count an ace as 11 if it busts the hand, only 1
        int[] allValues = hand.getAllValues();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("(");
        stringBuilder.append(allValues[0]);
        if(allValues.length == 2){
            stringBuilder.append(", ");
            stringBuilder.append(allValues[1]);
        }
        stringBuilder.append(")");
        return " ".repeat(8 - stringBuilder.length()) + stringBuilder;
    }

    /**
     * @return integer: current bet
     */
    public int getBet(){return bet;}

    /**
     * allows setting amount of current bet
     * @param bet: integer with value of current bet
     */
    public void setBet(int bet){this.bet = bet;}

    /**
     * @return current playerNumber
     */
    public int getPlayerNumber(){return playerNumber;}

    /**
     * assigns a new number to a player
     * @param newPlayerNumber: integer
     */
    public void setPlayerNumber(int newPlayerNumber){this.playerNumber = newPlayerNumber;}
}
