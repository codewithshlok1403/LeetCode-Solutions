class Solution { 
    public boolean checkDivisibility(int n) { 
        if (n <= 0) { 
            return false; 
        } 
        
        int temp = n; 
        int sumOfDigit = 0; 
        int productOfDigit = 1; 
        
        while (temp != 0) { 
            int rem = temp % 10; 
            sumOfDigit += rem; 
            productOfDigit *= rem; 
            temp = temp / 10; 
        } 
        
        int total = productOfDigit + sumOfDigit; 
        

        if (total == 0) {
            return false;
        }
        
        return n % total == 0; 
    } 
}
