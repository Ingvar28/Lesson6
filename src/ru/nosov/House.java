package ru.nosov;


public class House {
    private int floors;
    private int buildYear;
    private String name;

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", buildYear=" + buildYear +
                ", name='" + name + '\'' +
                '}';
    }

    private void printHouseAge(int age) {

        if (age < buildYear) {
            System.out.println("Дом еще не был построен");
        }else if (age == buildYear) {
            System.out.println("Дом построили в этом году");
        }else {
            System.out.println("Возраст дома: " + houseAge(age));
        }

    }

    private int houseAge(int age) {
        return age - buildYear;
    }

    public static void main(String[] args) {
        //TODO
        House cottage = new House();
        cottage.setFloors(2);
        cottage.setBuildYear(2018);
        cottage.setName("cottage");

        House apartment = new House();
        apartment.setFloors(20);
        apartment.setBuildYear(2020);
        apartment.setName("apartment");

        System.out.println(cottage.toString());
        cottage.printHouseAge(2021);
        System.out.println(apartment.toString());
        apartment.printHouseAge(2021);


    }
}
