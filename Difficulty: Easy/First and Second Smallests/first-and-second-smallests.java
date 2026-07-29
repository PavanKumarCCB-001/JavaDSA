class Solution {
	public ArrayList<Integer> minAnd2ndMin(int[] arr) {
		
		int small = Integer.MAX_VALUE, sec_small = Integer.MAX_VALUE;
		
		// Stores the First & Second Smallest.
		ArrayList<Integer> res = new ArrayList<>();
		
		for (int i = 0; i<arr.length; i++) {
			
			if (arr[i] < small) {   // If the current element is less then,
				sec_small = small;
				small = arr[i]; 
			}
			// Atleast if the current element is less than second smallest then,
				else if (arr[i] < sec_small && arr[i] != small) 
					sec_small = arr[i]; 
		}
		
		// Adding elements if the second smallest is not equal to Integer Max.		
				if (sec_small != Integer.MAX_VALUE) {
					res.add(small);
					res.add(sec_small); 
				}
					else
						res.add(-1);       // If the Second Smallest Doesn't exist.
					
					return res;
				}
			}