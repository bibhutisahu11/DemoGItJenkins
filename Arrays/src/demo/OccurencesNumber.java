package demo;

public class OccurencesNumber {

	public static void main(String[] args) {
		
				int[] num={1,5,9,6,5,4,3,2,1,6,3,2,7,7,7};
				int count[] = new int[20];
				int i;

				for( i = 0; i < num.length; i++){
	               int temp = num[i];
	                count[temp]++;
	            }

	        for(i=1; i < count.length; i++){

	            if(count[i] > 0 && count[i] == 1){
	             System.out.printf("%d occurs %d time\n",i, count[i]);
	             }
	            else if(count[i] >=2){
	                System.out.printf("%d occurs %d times\n",i, count[i]);
	            }


	         }
			    
			}
			}

		
	
