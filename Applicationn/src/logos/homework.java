package logos;

public class homework {
	

	
		public static void main(String args[]){
			for(int i=1;i<110;i++){  //перше завдання
			    if(i%2==0){
			      }else{System.out.println(i);}
			    }
			for(int a=90;a>0;a--){   //друге завдання
			    if(a%5==0){
			    	System.out.println(a);
			      }else {
			    }
	            }
			int b=65;                 //третє завдання
			    if(b%2==0){       
			    	System.out.println("Число парне");
			      }else {
			    	System.out.println("Число не парне");
			      }
			double m=8.5;
			double n=11.45;
			double o=10.0;
			 if(o-m>n-o){       //четверте завдання
				 System.out.println(n);
			 }else {
			    	System.out.println(m);
			      } 
			 int array[] = new int[]{10, 11, 88, 2, 12, 120};
			    int max = getMax(array);
			    System.out.println("Maximum Value is: "+max);
			    int min = getMin(array);
			    System.out.println("Minimum Value is: "+min);
			  }
			  public static int getMax(int[] inputArray){ 
			    int maxValue = inputArray[0]; 
			    for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
			         maxValue = inputArray[i]; 
			      } 
			    } 
			    return maxValue; 
			  }
			 public static int getMin(int[] inputArray){ 
			    int minValue = inputArray[0]; 
			    for(int i=1;i<inputArray.length;i++){ 
			      if(inputArray[i] < minValue){ 
			        minValue = inputArray[i]; 
			      } 
			    } 
			    return minValue;
			 
	}}


