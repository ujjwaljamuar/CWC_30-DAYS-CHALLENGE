// Program to swap bits with O(1) time complexity

public class Q6 {
    static int swapBits(int x)
    {
        // Get all even bits of x
        int even_bits = x & 0xAAAAAAAA;
     
        // Get all odd bits of x
        int odd_bits = x & 0x55555555;
     
        // Right shift even bits
        even_bits >>= 1;
         
        // Left shift even bits
        odd_bits <<= 1;
         
        // Combine even and odd bits
        return (even_bits | odd_bits);
    }
     
    // Driver program to test above function
    public static void main(String[] args)
    {
        int x = 20; 
     
        
        System.out.println(swapBits(x));  // Output is 40 
    }
}
