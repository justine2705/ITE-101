class Main {
    public static void main(String[] args) {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();
        
        led.turnOn();    
        halogen.turnOn();
        halogen.turnOff();
    }
}

class Lamp {
    public void turnOn() {
        System.out.println("The lamp is on.");
    }
    
    public void turnOff() {
        System.out.println("The lamp is off.");
    }
}
