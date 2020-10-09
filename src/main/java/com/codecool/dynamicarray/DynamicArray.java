package com.codecool.dynamicarray;

import java.util.Arrays;

public class DynamicArray {
    private int[] array;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
    }

    public DynamicArray() {
        this.array = new int[4];
    }

    public int getCapacity() {
        return this.array.length;
    }

    public int size() {
        return this.array.length;
    }

    public void add(int value) {
        this.array = Arrays.copyOf(this.array, this.array.length * 2);
        this.array[this.array.length - 1] = value;
    }

    public int get(int index) {
        if(index < this.array.length){
            return this.array[index];
        }else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void remove(int indexToBeRemoved) {
        if(indexToBeRemoved < this.array.length){
            int[] newArray = new int[this.array.length - 1];
            for (int i = 0, k = 0; i < this.array.length ; i++) {
                if (i == indexToBeRemoved){
                    continue;
                }
                newArray[k++] = array[i];
            }
            this.array = newArray;
        } else if (indexToBeRemoved < 0){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void insert(int index, int newValue) {
        int [] newArray = new int[this.array.length + 1];
        if (index > this.array.length){
            index = this.array.length;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < this.array.length; i++){
            newArray[i] = this.array[i];
        }
        newArray[index] = newValue;
        for (int i = index; i < this.array.length; i++){
            newArray[i+1] = this.array[i];
        }
        this.array = newArray;
    }
}
