import java.util.ArrayList;

public class list {
	
	
		/*ArrayList<String> myList = new ArrayList<>();
		myList.add("1");
		myList.add("3");
		myList.add("4");
		myList.add(2,"2");
		myList.remove(1);
		System.out.println(myList);*/
		
		/*int arr1[] = {11,12,14,13};
		int arr2[] = new int[4];
		arr1 = arr2;
		System.out.println(arr1[3]);*/
		
		int t1 = 25;
	      public list(){
	         t1 = 50;
	      }
	      public list(int t1){
	          this.t1 = t1;
	       }
	       public static void main(String [] args) {
	           int t1 = 100;
	           list obj = new list(t1);
	           System.out.println(obj.t1);
	      


		
	}

}
