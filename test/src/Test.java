
public class Test {
	public static void main(String[] args) {
	
		int[] nums = new int[52];
		int spade = (int)(Math.random() * 13 ) + 1;
		int diamond = (int)(Math.random() * 13 ) + 1 + 13; 
		int club = (int)(Math.random() * 13 ) + 1 + 13 + 13;
		int heart = (int)(Math.random() * 13 ) + 1 + 13 + 13 + 13;
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = i + 1;
		}		

		System.out.println(nums[51]);
		int rnd = (int)(Math.random());
		
		
		for(int i = 0 ; i < 100 ; i++) {
			int index1 = (int)(rnd * nums.length);
			int index2 = (int)(rnd * nums.length);
			
			int _temp = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _temp;
		}
		
		
			
			for(int i = 0 ; i < 2 ; i++) {
				System.out.printf("%d\t",nums[i]);
				
		}
			System.out.println(rnd);
		
		}
	}


