package l11;

public class dynamicArray {
	int data[];
	int nextIndex;
	
	public dynamicArray(){
		data=new int[5];
		nextIndex=0;
	}
	
	public boolean isEmpty(){
		if(size()==0)
			return true;
		else
			return false;
	}
	
	public int removeLast(){
		int t=0;
		return t;		
	}
	
	private void restructure(){
		int temp[]=data;
		data=new int[data.length*2];
		for(int i=0;i<temp.length;i++){
			data[i]=temp[i];
		}
	}
	
	public void add(int element){
		if(nextIndex==data.length){
			restructure();
		}
		data[nextIndex]=element;
		nextIndex++;
	}
	
	public int size(){
		return nextIndex;
	}
	
	public int get(int index){
		return data[index];
	}

	public static void main(String[] args) {
		

	}

}
