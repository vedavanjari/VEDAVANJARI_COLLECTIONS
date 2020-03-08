package collections;

import java.util.*;
class Implementation{
  public static List myList(Object[] a) {
     return new ArrayList(a);
  }
}
  class ArrayList extends AbstractList{
  
private Object[] x;

ArrayList(Object[] array) {
    x = array;
}
public Object get(int index) {
    return x[index];
}
public Object set(int index, Object element) {
    Object oldVal = x[index];
    x[index] = element;
    return oldVal;
}
public int size() {
    return x.length;
}
  }
public class collectionsImplementation{
 public static void main(String[] args) {
      try{
    String s[]={"My", "Custom", "Implementation","for","first","time","on","giving","a","project"};
    Object o;
    int i=0;
    Implementation a= new Implementation();
    List lst=a.myList(s);
    System.out.println("The list is: "+lst);
    ArrayList al=new ArrayList(s);
    Scanner sin=new Scanner(System.in);
    System.out.println("enter the elements position to be fetched");
    int z=sin.nextInt();
    o=al.get(z);
    System.out.println("The fetched element is: "+o);
    String s1="Collection";
    o=al.set(6,s1);
    System.out.println("The set element in place of Implementation is: "+s1);
    System.out.println("Now the new list is: "+lst);
    i=al.size();
    System.out.println("The size of the array list is: "+i);
    }
    catch(Exception e){
    	System.out.println("exception caught");
    }
  }
  }