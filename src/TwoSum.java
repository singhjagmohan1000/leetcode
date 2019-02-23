import java.util.*;


public class TwoSum{

	public static int[] twoSum(int arr[], int target){

		int result[] = new int[2];

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();

		map.put(target-arr[0],0);

		for(int i=1;i<arr.length;i++){

			if(map.containsKey(arr[i])){
				result[0]=map.get(arr[i]);
				result[1]=i;
				break;

			}
			else{
				map.put(target-arr[i],i);
			}

		}

		return result;
			
	}
	

public static void main(String args[]){

	int[] arr = {2,7,11,15};
	int target = 13;

	int[] result = twoSum(arr,target);
	System.out.print("Result is: ");

	for(int i=0;i<result.length;i++){

		System.out.print(result[i]+" ");

		}


	}

}