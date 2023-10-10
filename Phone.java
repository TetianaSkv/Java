package Homerwork.HW_280923;

public class Phone {

    private String phoneName;

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(int number){
        System.out.println("try to make a call to number " + number);
    }

    public void receiveCall(int number){
        System.out.println("try to receive a call from number " + number);
    }

    public void makeCall(){

    }
}
