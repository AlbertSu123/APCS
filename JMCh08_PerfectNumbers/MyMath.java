/**
 * isprime checks if it is primg fibbonachi stuff calculates value of fibbonachi
 * 
 *
 * @author Albert Su
 * @version T9/22/17
 * @author Period: 2
 * @author Assignment: JMCh08_PerfectNumbers
 *
 * @author Sources: Fulk
 */
public class MyMath
{
    /**
     * Returns true if n is a prime; otherwise returns false.
     * 
     * @param n
     *            number to check if prime
     * @return true if n is a prime; otherwise returns false
     */
    public static boolean isPrime( int n )
    {
        if ( n <= 1 )
        {
            return false;
        }
        int m = 2;

        while ( m * m <= n )
        {
            if ( n % m == 0 )
            {
                return false;
            }
            m++;
        }

        return true;
    }


    /**
     * Question 8-15 Returns the n-th Fibonacci number
     * 
     * Find and read a few informative websites dedicated to Fibonacci numbers.
     * The following recursive method returns the n-th Fibonacci number:
     * 
     * // Returns the n-th Fibonacci number. // Precondition: n >= 1 public
     * static long fibonacci(int n) { if (n == 1 || n == 2) return 1; else
     * return fibonacci(n - 1) + fibonacci(n - 2); } Rewrite it without
     * recursion, using one loop.
     *
     * @param n
     *            Fibonacci number to find
     * @return n-th Fibonacci number
     */
    public static long fibonacci( int n )
    {
        if ( n <= 1 )
        {
            return n;
        }
        int fibo = 1;
        int fiboPrev = 1;
        for ( int i = 2; i < n; ++i )
        {
            int temp = fibo;
            fibo += fiboPrev;
            fiboPrev = temp;
        }
        return fibo;
    }


    /**
     * Returns true if n is a perfect number, false otherwise.
     * 
     * @param n
     *            number to test
     * @return true if n is a perfect number, false otherwise.
     */
    public static boolean isPerfect( int n )
    {

        int sum = 1;
        for ( int i = 2; i < n; i++ )
        {
            if ( n % i == 0 )
            {
                sum += i;
            }
        }

        return ( n == sum ); 
    }

    /**
     * Prints the first n perfect numbers
     * 
     * @param n
     *            number of perfect numbers to print
     */
    public static void printPerfectNums( int n )
    {
        System.out.println( "Perfect numbers: " );
        int count = 0;
        for ( int k = 1; count < n; k++ )
        {
            if ( isPerfect( k ) && k != 1 )
            {
                System.out.print( k + " " );
                count++;
            }
        }
        System.out.println();
    }


    /**
     * Prints the first n Mersenne primes
     * 
     * @param n
     *            number of Mersenne primes to print
     */
    public static void printMersennePrimes( int n )
    {
        System.out.println( "Mersenne primes: " );
        long number = 1;
        int count = 1;
        int t = 0;
        while ( count <= n )
        {
            number = number * 2;
            for ( int i = 2; i < number - 1; i++ )
            {
                if ( ( number - 1 ) % i == 0 )
                {
                    t = 0;
                    break;
                }
                else
                {
                    t = 1;
                }
            }
            if ( t == 1 )
            {
                System.out.print( number - 1 + " " );
                count++;
            }
        }
    }


    /**
     * Prints the first n even perfect numbers
     */
    /**
     * 
     * Prints even perfect numbers
     * 
     * @param n
     *            which numbner
     */
    public static void printEvenPerfectNums( int n )
    {
        {
            System.out.println( "Even perfect numbers: " );

            long number = 1;
            int count = 1;
            int j = 0;
            long even = 0;
            int p = 1;
            while ( count <= n )
            {
                number = number * 2;
                for ( int i = 2; i < number - 1; i++ )
                {
                    if ( ( number - 1 ) % i == 0 )
                    {
                        j = 0;
                        break;
                    }
                    else
                    {
                        j = 1;
                    }
                }
                if ( j == 1 )
                {
                    even = (long)( Math.pow( 2, p - 1 ) );
                    System.out.print( (long)( ( number - 1 ) * even ) + " " );
                    count++;
                }
                p++;
            }
            System.out.println();

        }
    }


    /*********************************************************************/
    /**
     * 
     * main method prints strings
     * 
     * @param args
     *            does the strings
     */
    public static void main( String[] args )
    {
        int n = 19;
        System.out.println( n + "-th Fibonacci number = " + fibonacci( n ) );

        printPerfectNums( 4 );
        printMersennePrimes( 6 );
        printEvenPerfectNums( 6 );
    }
}
/*
 * 19-th Fibonacci number = 4181 Perfect numbers: 6 28 496 8128 Mersenne primes:
 * 3 7 31 127 8191 131071 524287 Even perfect numbers: 6 28 496 8128 33550336
 * 8589869056 137438691328
 */