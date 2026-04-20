import java.util.*;

class PrimeInRange{
    public static void main(String args[]){
        System.out.println("Given Interger K find all the prime numbers till K ");
        int K = 50;
        ArrayList<Integer> primes = printPrimes(K);
        System.out.println(primes);
    }

     public static ArrayList<Integer> printPrimes(int K){
        boolean[] isPrime = new boolean[K+1];

        // Fill all the numbers as true in the begining
        Arrays.fill(isPrime, true);

        //remove edge cases
        if (K >= 0) isPrime[0] = false;
        if (K >= 1) isPrime[1] = false;

        //starts loop from 2 to the value K
        for(int i=2; i*i<=K; i++){
            if(isPrime[i]){
                int j = i*i;
                //Mark non prime numbers as false
                while(j <= K){
                    isPrime[j] = false;
                    j+=i;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=2; i<=K; i++){
            if(isPrime[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}