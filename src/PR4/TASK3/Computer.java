package PR4.TASK3;
// Перечисление для марок компьютера
enum ComputerBrand {
    ASUS, Dell, HP, Lenovo, Apple
}

// Класс, описывающий процессор компьютера
class Processor {
    private String model;
    private double clockSpeedGHz;

    public Processor(String model, double clockSpeedGHz) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public void overclock(double newClockSpeedGHz) {
        this.clockSpeedGHz = newClockSpeedGHz;
        System.out.println("Процессор разогнан до " + newClockSpeedGHz + " GHz.");
    }
}

// Класс, описывающий оперативную память компьютера
class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public String getType() {
        return type;
    }
}

// Класс, описывающий монитор компьютера
class Monitor {
    private String model;
    private int screenSizeInches;

    public Monitor(String model, int screenSizeInches) {
        this.model = model;
        this.screenSizeInches = screenSizeInches;
    }

    public String getModel() {
        return model;
    }

    public int getScreenSizeInches() {
        return screenSizeInches;
    }

    public void displayInfo() {
        System.out.println("Монитор: " + model + ", Размер экрана: " + screenSizeInches + " дюймов");
    }
}

// Класс, описывающий компьютер
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void displayInfo() {
        System.out.println("Компьютер марки: " + brand);
        System.out.println("Процессор: " + processor.getModel() + ", Частота: " + processor.getClockSpeedGHz() + " GHz");
        System.out.println("Оперативная память: " + memory.getSizeGB() + " GB, Тип: " + memory.getType());
        monitor.displayInfo();
    }
}
class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.5);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell UltraSharp", 27);

        Computer computer = new Computer(ComputerBrand.Dell, processor, memory, monitor);

        computer.displayInfo();
    }
}
