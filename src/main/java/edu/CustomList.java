package edu;

public class CustomList {
    private int[] ints;


    public CustomList(){
        ints = new int[0];
    }
    public CustomList(int[] ints){
        this.ints = ints;
    }

    public boolean any(){
        return ints.length > 0;
    }

    public int[] getAll() {
        return ints;
    }

    public void add (int number){
        int [] newArray = new int [ints.length+1];
        for (int i=0; i<ints.length; i++){
            newArray[i] = ints[i];
        }
        newArray[ints.length] = number;
        ints = newArray;
    }
    public int[] removeAt(int index){
        int [] smallerArray = new int [ints.length-1];
        for (int i=0,k=0; i<ints.length; i++){
            if (i == index){
                continue;
            }
           smallerArray[k++]=ints[i];
        }
        ints = smallerArray;
        return smallerArray;
    }
}
