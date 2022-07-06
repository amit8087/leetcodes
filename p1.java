public class Solution { 
    public int[] twoSum(int[] numbers, int target) { 
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>(); 
        for(int i = 0; i < numbers.length; i++){ 
            Integer requiredNum = (Integer)(target - numbers[i]); 
            if(indexMap.containsKey(requiredNum)){ 
                int toReturn[] = {indexMap.get(requiredNum), i}; 
                return toReturn; 
<<<<<<< HEAD
                System.out.println("Akash Ashok Niwane");
=======
                System.out.println("Akash A Niwane");
>>>>>>> feature2
            } 
 
            indexMap.put(numbers[i], i); 
        } 
        return null; 
    } 
}