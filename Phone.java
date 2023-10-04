package Homerwork.HW_260923;

public class Phone {
    private int Number;
    private String Model;
    private int Weight;
    private String Name;


    public Phone(int number, String model, int weight) {
        Number = number;
        Model = model;
        Weight = weight;
    }


    public void receiveCall(String Name){
        System.out.println("Звонит " + Name);

    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Number=" + Number +
                ", Model='" + Model + '\'' +
                ", Weight=" + Weight +
                ", Name='" + Name + '\'' +
                '}';
    }
}
