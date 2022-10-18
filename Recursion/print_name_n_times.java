class Solution {

    void printname(int N) {
        // code here
        if(N==0)
        {
            return;
        }
        printname(N-1);
        System.out.print("Sanidhya ");
    }
}