class Solution { 
    public String longestCommonPrefix(String[] strs) { 
         
        String smallestString = strs[0]; 
  for (int i = 1; i < strs.length; i++) { 
   if (strs[i].length() < smallestString.length()) { 
    smallestString = strs[i]; 
   } 
  } 
         
  StringBuilder prefix = new StringBuilder(""); 
  for (int i = 0; i < smallestString.length(); i++) { 
   // get the character 
   char c = smallestString.charAt(i); 
 
   // check character in the remaining Strings at index 'i' 
   for (int j = 0; j < strs.length; j++) { 
    if (strs[j].charAt(i) != c) { 
     //if we do not find the character, we have to go and return the prefix as we won't find any other string  
     return prefix.toString(); 
    } 
   } 
   //if prefix is not returned it means the character matches in all strings, so add it to prefix string 
   prefix = prefix.append(c); 
  } 
  return prefix.toString(); 
    } 
}