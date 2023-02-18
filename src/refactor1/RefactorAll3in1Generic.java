package refactor1;
class Refact<T extends Comparable<T>> { // class refact Comparable class
    T[] arr;

    public Refact(T[] arr) {
        this.arr = arr;
    }

    //    Refact(T[] o) { //constructor
//        arr = o;
//    }
    public T max() { //max method to find
        T max = arr[0];  // assign max to arr[0]
        for (int i = 1; i < arr.length; i++)
            if (arr[i].compareTo(max) > 0) //compare for max
                max = arr[i]; //assign max
        return max;
    }
    public T min() { //max method to find
        T min = arr[0];  // assign max to arr[0]
        for (int i = 1; i < arr.length; i++)
            if (arr[i].compareTo(min) < 0) //compare for max
                min = arr[i]; //assign max
        return min;
    }

    public static void main(String args[]) {
        Integer iNum[] = { 10, 2, 5};   // values to find max integer
        String sString[] = { "Dev", "Pawan", "Akshay" };    // values to find max String
        Double ffloat[] = { 20.2, 45.4, 71.6};     // values to find max Float
        Refact<Integer> iobj = new Refact<Integer>(iNum);  //object for Integer
        Refact<String> sobj = new Refact<String>(sString); //object for String
        Refact<Double> fobj = new Refact<Double>(ffloat);  //object for float

        System.out.println("Max value in inums: " + iobj.max()); //print max integer
        System.out.println("Max value in chs: " + sobj.max());   //print max String
        System.out.println("Max value in chs: " + fobj.max());   //print max Float
        System.out.println("min value in inums: " + iobj.min()); //print max integer
        System.out.println("min value in chs: " + sobj.min());   //print max String
        System.out.println("min value in chs: " + fobj.min());   //print max Float
        Refact<Integer> kk = new Refact<>(iNum);
        System.out.println("Min value in inums: " +kk.min()); //print max integer


    }
}