package ru.nosov;

public class Plain {

    private String name;

    public Plain(String name) {
        this.name = name;
    }

    class Wing {
        private float weight;

        public Wing(float weight) {
            this.weight = weight;
        }

        public void showWeight () {
            System.out.println("Вес крыла " + name + ": " + weight + " кг.");
        }
    }

    public static void main(String[] args) {
        // write your code here

        Plain boing747 = new Plain("Boing 747");
        Plain.Wing wingBoing = boing747.new Wing(747);
        wingBoing.showWeight();


        Plain su35 = new Plain("Су-35");
        Plain.Wing wingSu35 = su35.new Wing(666);
        wingSu35.showWeight();





    }
}
