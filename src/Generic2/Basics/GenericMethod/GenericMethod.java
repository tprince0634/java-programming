package Generic2.Basics.GenericMethod;

public class GenericMethod {
    // Generic method
    public <T> void printArray(T [] array){
        for(T i: array){
            System.out.println(i + " ");
        }
    }


    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();

        Integer [] arr = {1,2,4,5,6,7,8,9};
        String [] arr2 = {"Dhoni","Mailinga","MurliDharma"};

        gm.printArray(arr);
        gm.printArray(arr2);
    }
}
