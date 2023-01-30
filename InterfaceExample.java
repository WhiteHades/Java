class Phone {
    public void call() {
        System.out.println("Phone call");
    }

    public void sms() {
        System.out.println("Phone sending sms");
    }
}

interface ICamera {
    void click();

    void record();
}

interface IMusicPlayer {
    void play();

    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() {
        System.out.println("Smart Phone video calling");
    }

    public void click() {
        System.out.println("Smart Phone clicking photo");
    }

    public void record() {
        System.out.println("Smart Phone recording video");
    }

    public void play() {
        System.out.println("Smart Phone playing music");
    }

    public void stop() {
        System.out.println("Smart Phone stoped playing music");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.click();
        sp.play();

        System.out.println();

        Phone sp2 = new SmartPhone();
        sp2.call();
        sp2.sms();

        System.out.println();

        ICamera sp3 = new SmartPhone();
        sp3.click();
        sp3.record();

        System.out.println();

        IMusicPlayer sp4 = new SmartPhone();
        sp4.play();
        sp4.stop();
    }
}
