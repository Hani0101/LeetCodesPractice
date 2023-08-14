

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false; 

        int temp=x,rev=0;

        while(temp!=0){
            
            rev=(rev*10)+(temp%10);  //use modulo operation to take the last value from the main variable. 
          //use the multiplication operation to create a room for this value that is taken from the modulo operation.


            temp=temp/10; //use division operation to dismiss the last values that are taken using the modulo operation.

        }
        return x==rev;
    }
}
