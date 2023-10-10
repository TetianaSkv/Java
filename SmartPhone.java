package Homerwork.HW_280923;

public class SmartPhone extends Phone{

    private int ownNumber;

    public SmartPhone(int ownNumber) {
        this.ownNumber = ownNumber;
    }
    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(int number) {
        System.out.println("The Phone " + getPhoneName() + getOwnNumber());
        super.call(number);
    }

    @Override
    public void receiveCall(int number) {
        System.out.println("The Phone " + getPhoneName() + getOwnNumber());
        super.receiveCall(number);
    }
}
