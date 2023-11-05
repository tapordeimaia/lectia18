package customarraylist;

import java.util.ArrayList;

public class CustomArrayList {

    String[] array = new String[5];

    int size = 0;

    public void add(String val) {
        if(size >= array.length) {
            increaseArraySize();
        }

        array[size] = val;

        size++;
    }

    public String get(int index) {
        return array[index];
    }

    public boolean remove(int index) {
        if (index > array.length -1 || index < 0) {
            return false;
        }

        array[index] = null;

        // decreaseArray

        return true;
    }

    public void increaseArraySize() {
        String[] array2 = new String[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        array = array2;
    }

    public int size() {
        int couter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                couter++;
            }
        }

        return couter;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(String val) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == val) {
                return true;
            }
        }

        return false;
    }

    public String set(int index, String newElement){
        String[] array2 = new String[array.length];
        for (int i = 0; i<array.length; i++){
            if (i==index){
                array2[i] = newElement;
            } else{
                array2[i] = array[i];
            }
        }
        array = array2;
        return newElement;
    }

    public void clear(){
        String[] array2 = new String[0];
        array = array2;
    }

    public boolean equals(String[] customArrayList){
        for(int i =0; i<array.length; i++){
            if (customArrayList[i] == array[i]){
                return true;
            }
        }
        return false;
    }
}
