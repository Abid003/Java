package labreport;

public class Problem9 {

    public static abstract class Mobile {

        int ram;
        int rom;
        int camera;

        Mobile(int ram, int rom, int camera) {
            this.ram = ram;
            this.rom = rom;
            this.camera = camera;

        }

        public abstract void details();
    }

    public static class Samsung extends Mobile {

        Samsung(int ram, int rom, int camera) {
            super(ram, rom, camera);
        }

        @Override
        public void details() {
            System.out.println("for samsung");
            System.out.println("RAM = " + ram + "gb");
            System.out.println("ROM = " + rom + "gb");
            System.out.println("Camera = " + ram + "Megapixels");
        }
    }

    public static class Apple extends Mobile {

        Apple(int ram, int rom, int camera) {
            super(ram, rom, camera);
        }

        @Override
        public void details() {
             System.out.println("for Apple");
            System.out.println("RAM = " + ram + "gb");
            System.out.println("ROM = " + rom + "gb");
            System.out.println("Camera = " + ram + "Megapixels");
        }
    }
    public static void main(String[] args) {
        Samsung a30 = new Samsung(4,64,21);
        a30.details();
        
        Apple iphone5 = new Apple (1,32,12);
        iphone5.details();
    }
}
