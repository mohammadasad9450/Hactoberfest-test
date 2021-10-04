package Array_Implementation;

public class MyQueue {
	int[] arr;
	int nElements;
	int front;
	int rear;
	MyQueue(int x){
		arr=new int[x];
		nElements=0;
		rear=-1;
		front=0;
	}
	void add(int x) {
		if(rear==arr.length-1)
			rear=-1;
		arr[++rear]=x;
		nElements++;
	}
	int remove() {
		if(front==arr.length)
			front=0;
		nElements--;
		return arr[front++];
	}
	int peak() {
		return arr[front];
	}
	boolean isEmpty(){
		if(nElements==0)return true;
		else 
			return false;
	}
	boolean isFull() {
		if(nElements==arr.length)return true;
		else 
			return false;
	}
	/**public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue qu=new MyQueue(5);
		qu.add(10);            // insert 4 items
	      qu.add(20);
	      qu.add(30);
	      qu.add(40);

	      qu.remove();              // remove 3 items
	      qu.remove();              //    (10, 20, 30)
	      qu.remove();

	      qu.add(50);            // insert 4 more items
	      qu.add(60);            //    (wraps around)
	      qu.add(70);
	      qu.add(80);

	      while( !qu.isEmpty() )    // remove and display
	         {                            //    all items
	         long n = qu.remove();  // (40, 50, 60, 70, 80)
	         System.out.print(n);
	         System.out.print(" ");
	         }
	      System.out.println("");
		
	}**/

}
