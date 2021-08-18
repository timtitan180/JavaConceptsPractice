
package base;
import java.util.HashMap;
import java.util.ArrayList;



class Main {
    public static void main(String[]args) {
        FirstClass hashMap = new FirstClass();
        int value = 11;
        hashMap.setHashMap(new HashMap<>());
        for(int i=1;i<=5;i++) {
            ++value;
            hashMap.getHashMap().put(i,value);
        }
        hashMap.display();
        SecondClass array = new SecondClass();
        int v = 0;
        array.setList(new ArrayList<>());
        for(int i=0;i<=4;i++) {

            array.getList().add(v+=2);
        }

        array.display();

        //{1=12,2=13,3=14,4=15,5=16}
        //HashMap<k=iteration,v=n + 1>
        //create an instance from the first class that created getter and setters for a hash map varibable an
        //{2,4,6,8,10}
        //Set 5 integers t
    }


}

 class SecondClass {
    SecondClass() {

    }
    public ArrayList<Integer> integerArray;

    public void setList(ArrayList<Integer> integerArray) {
        this.integerArray = integerArray;
    }

    public ArrayList<Integer> getList() {
        return integerArray;
    }

    public void display() {
        System.out.print(integerArray);
    }
}

class FirstClass {
    FirstClass() {

    }
    public HashMap<Integer,Integer> hashMap;

    public void setHashMap(HashMap<Integer,Integer> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap<Integer,Integer> getHashMap() {
            return hashMap;
    }

    public void display() {
        System.out.println(hashMap);
    }
}