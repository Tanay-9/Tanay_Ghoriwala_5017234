public class Computer {
    // Attributes
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final boolean isGraphicsCard;
    private final boolean isBluetooth;

    // Private constructor that takes a Builder as a parameter
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsCard = builder.isGraphicsCard;
        this.isBluetooth = builder.isBluetooth;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
               ", isGraphicsCard=" + isGraphicsCard + ", isBluetooth=" + isBluetooth + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private final String CPU;
        private final String RAM;

        // Optional parameters
        private String storage = "256GB SSD";
        private boolean isGraphicsCard = false;
        private boolean isBluetooth = false;

        // Constructor for required parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Method to set optional parameter
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean isGraphicsCard) {
            this.isGraphicsCard = isGraphicsCard;
            return this;
        }

        public Builder setBluetooth(boolean isBluetooth) {
            this.isBluetooth = isBluetooth;
            return this;
        }

        // Build method to return the final Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
