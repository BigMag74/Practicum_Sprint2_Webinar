package org.example;

public class Elevator {

    short maxFloor;
    int maxWeight;
    int currentWeight;

    public Elevator(short maxFloor, int maxWeight) {
        this.maxFloor = maxFloor;
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public boolean isAllowedToEnter(int additionalWeight, short floorRequested){
        return ((currentWeight + additionalWeight) < maxWeight && floorRequested <= maxFloor);
    }

    public boolean addPeron(Person person){
        if(isAllowedToEnter(person.weight, person.targetFloor)){
            currentWeight += person.weight;
            System.out.println("Новый вес лифта " + currentWeight + " кг");
            return true;
        }
        System.out.println(person.name + " никуда не едет");
        return false;
    }

}