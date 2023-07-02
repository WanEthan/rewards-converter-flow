public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.cashValue = milesValue * 0.0035;
    }


    // Get the cash value of the RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Get the miles value of the RewardValue
    public int getMilesValue() {
        return (int) (this.cashValue / 0.0035);
    }
}


