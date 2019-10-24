package Week5.phone;
public class MobilePhone {
        private String brand;
        private String model;
        private int batteryCapacity;
        private int batteryCharge;
        private int maxMemory;
        private int freeMemory;
        private int usedMemory = 0;

        public MobilePhone(String brand, String model, int batteryCapacity, int memory){
            this.brand = brand;
            this.model = model;
            this.batteryCapacity = batteryCapacity;
            batteryCharge = batteryCapacity;
            this.maxMemory = memory;
            freeMemory = maxMemory;
            System.out.println("Created device " + brand + " "+ model + "." );
            System.out.println("Battery capacity: " + batteryCapacity + ". Memory: "+ memory + "." );

        }

        public void InstallApp(String name, int size){
            if (size > freeMemory){
                System.out.println("Not enough memory. This app requires: " + size + " and the device only has: " + freeMemory);
            } else {
                freeMemory = freeMemory - size;
                System.out.println("Installed application " + name + " . Free memory remaining: " + freeMemory);
            }

        }

        public void UseApp(String name, int useTime){
            int powerUse = useTime * 5;
            if (powerUse > batteryCharge){
                System.out.println("Not enough battery power. This app requires: " + powerUse + " and the device only has: " + batteryCharge);
            } else {
                batteryCharge = batteryCharge - powerUse;
                System.out.println("Used application " + name + " for " + useTime + " hours. Battery remaining: " + batteryCharge);
            }
        }

        public void Charge(){
            batteryCharge = batteryCapacity;
            System.out.println("Battery has been recharged to: " + batteryCharge);
        }



}

