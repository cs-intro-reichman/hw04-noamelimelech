public class Primes {
    
    public static void main(String[] args) {
    int number = Integer.parseInt(args[0]);
    boolean isprime[];
    int length = number +1;
    isprime = new boolean[length];
    for(int i=2; i<=number;i++){
        isprime[i]= true;
    }
    int p = 2;
    while(p*p<=number){
        if (isprime[p]) {
            int j = 2*p;
        while (j<=number) {
            isprime[j]=false;
            j=j+p;
        }
         }
         p++;
    }
    int primeCount = 0;
        System.out.println("Prime numbers up to " + number + ":");
        
        int i = 2;
        while (i <= number) {
            if (isprime[i]) { 
                System.out.println(i);
                primeCount++;
            }
            i++;
        }
        
        double percentage = ((double) primeCount / number) * 100;
        System.out.printf("There are %d primes between 2 and %d (%.0f%% are primes)\n", 
                   primeCount, number, percentage);
    }
}
    
    
