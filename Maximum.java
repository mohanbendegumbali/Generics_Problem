
public class Maximum<T extends Comparable<T>>{

    public <T extends Comparable<T>> void testIntegerMaximum(T ...n) {
        Integer i=0;
        T max=n[i];
        for(T data:n){
            if(n[i].compareTo(max)>0){
                max=n[i];
            }
            i++;
        }
        printMax(max);
    }

    public <T> void printMax(T max) {
        System.out.println("The maximum value is "+max);
    }
}