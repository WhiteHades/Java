class TV {
    public void switchON() {
        System.out.println("TV is switched on");
    }

    public void changeChannel() {
        System.out.println("TV channel is changed.");
    }

}

class smartTV extends TV {
    @Override
    public void switchON() {
        System.out.println("Smart TV is switched on");
    }

    @Override
    public void changeChannel() {
        System.out.println("Smart TV channel is changed.");
    }

    public void browse() {
        System.out.println("Smart browse.");
    }
}

public class overridingmethod2 {
    public static void main(String[] args) {

    }
}
