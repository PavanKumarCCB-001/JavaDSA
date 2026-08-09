class Solution {
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
		
		ArrayList<Integer> res = new ArrayList<>();  // Stores the Element
		
		int left = 0, right = 0;
		
		while (left < a.length && right < b.length) {
		    
			if (a[left] < b[right]) {
				if(res.isEmpty() || res.get(res.size() - 1) != a[left])
				    res.add(a[left]);
				left++;
			}
			
			else if(a[left] == b[right]) {
			    if(res.isEmpty() || res.get(res.size() - 1) != a[left])
			        res.add(a[left]);
			    left++; 
			    right++;
			}
			
			else {
			    if(res.isEmpty() || res.get(res.size() - 1) != b[right])
			        res.add(b[right]);
			    right++;
			}
		}
		
		while (right < b.length) {
			if(res.get(res.size() - 1) != b[right])
			        res.add(b[right]);
			    right++;
		}
		
		while (left < a.length) {
			if(res.get(res.size() - 1) != a[left])
				    res.add(a[left]);
				left++;
		}
	
	    return res;
	}
}