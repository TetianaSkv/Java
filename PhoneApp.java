package Homerwork.HW_280923;


public class PhoneApp {
    public static void main(String[] args) {

        ButtonPhone buttonPhone = new ButtonPhone(3435);
        buttonPhone.setPhoneName("ButtonPhone ");
        buttonPhone.call(654321);
        buttonPhone.receiveCall(948758);

        SmartPhone smartPhone = new SmartPhone(35);
        smartPhone.setPhoneName("SmartPhone ");
        smartPhone.call(457);
        smartPhone.receiveCall(9875);

        RadioPhone radioPhone = new RadioPhone(46);
        radioPhone.setPhoneName("RadioPhone ");
        radioPhone.call(8746);
        radioPhone.receiveCall(76566498);

        Phone phone = new Phone();
        Phone[] phones = {buttonPhone, smartPhone, radioPhone};
        makeCall(phones);
    }

   // ??? со *
    private static void makeCall(Phone[] phones) {
        for (Phone phone : phones){
        phone.call(1);


        }
    }
}
