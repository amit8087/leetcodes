class Solution { 
    public int[] plusOne(int[] digits) { 
        int len = digits.length; 
        int carry = 1; 
        int i = len -1; 
        while(i >= 0 && carry == 1){ 
            int x = digits[i] + carry; 
            digits[i] = (x % 10); 
            if(x <= 9){ 
                carry = 0; 
            } 
            i--; 
        } 
        if(carry == 1){ 
            int res[] = new int[digits.length + 1]; 
            res[0] = 1; 
            for(int j = 0; j < len; j++){ 
                res[j+1] = digits[j]; 
            } 
            return res; 
        } 
        return digits; 
    } 
}