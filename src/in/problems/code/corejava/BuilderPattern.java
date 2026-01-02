package in.problems.code.corejava;

public class BuilderPattern {
    // Required parameters
    private String HDD;
    private String RAM;

    // Optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    // 1. Private constructor: Only the Builder can create a Computer
    private BuilderPattern(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Getters only (Immutability is a key benefit of Builder)
    public String getHDD() { return HDD; }
    public String getRAM() { return RAM; }
    public boolean isGraphicsCardEnabled() { return isGraphicsCardEnabled; }
    public boolean isBluetoothEnabled() { return isBluetoothEnabled; }

    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", GraphicsCard=" + isGraphicsCardEnabled
                + ", Bluetooth=" + isBluetoothEnabled + "]";
    }

    // 2. Static Inner Builder Class
    public static class ComputerBuilder {
        // Same fields as the outer class
        private String HDD;
        private String RAM;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        // 3. Constructor for Required Parameters
        public ComputerBuilder(String hdd, String ram){
            this.HDD = hdd;
            this.RAM = ram;
        }

        // 4. Setter methods for Optional Parameters
        // Key feature: Return the Builder object itself to allow chaining
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this; // Returning 'this' enables chaining
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // 5. The final build method
        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }
}