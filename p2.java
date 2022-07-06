class Solution { 
     
    static Map<Character, Integer> R_to_Int = new HashMap<>(); 
    static{ 
        R_to_Int.put('I',1); 
        R_to_Int.put('V',5); 
        R_to_Int.put('X',10); 
        R_to_Int.put('L',50); 
        R_to_Int.put('C',100); 
        R_to_Int.put('D',500); 
        R_to_Int.put('M',1000); 
    } 
    
    public int romanToInt(String s) {//use recursion 
        //base case: 
        if (s.length()==1){ 
            return R_to_Int.get(s.charAt(0)); 
        } 
  //recursion 
        int l = R_to_Int.get(s.charAt(0)); 
        int r = R_to_Int.get(s.charAt(1)); 
        if(l < r){ 
            return romanToInt(s.substring(1)) - l;  
        } 
        else { 
            return romanToInt(s.substring(1)) + l; 
            } 
         
} 
     
}