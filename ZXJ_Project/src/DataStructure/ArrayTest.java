package DataStructure;



public class ArrayTest {

	public static void main(String[] args) {
		int value[] = new int[10];  
        for (int i = 0; i < 10; i++) {  
            value[i] = i;  
        }  
  

        int[] i_value =  insert(value, 666, 5);
        for(int i = 0;i<i_value.length;i++){
        	System.out.println(i_value[i]);
        } 
//        int[] c_value = delete(value, 3);
//        for(int i = 0;i<c_value.length;i++){
//        	System.out.println(c_value[i]);
//        }  
        
        
        
       
	}
	private static int[] insert(int[] value, int insertValue, int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index > value.length-1){
			System.out.println("value not exist");
		}else{
			for(int k = value.length-1;k>index;k--){
				value[k] = value[k-1];
			}	
			value[index] = insertValue;
		}
		return value;
	}
	
	public static int[] delete(int[] value,int index){
		if(index < 0 || index > value.length-1){
			System.out.println("value not exist");
		}else{
			for(int k = index;k<value.length-1;k++){
				value[k] = value[k+1];
			}
			value[value.length-1] = 0;
		}
		return value;
	}
	
	

	
}
