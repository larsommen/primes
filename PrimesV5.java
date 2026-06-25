class PrimesV5

{
	// Sieve of Eratosthenes.
	//
	// V1–V4 ask the same question of every number: "is THIS one prime?".
	// V4 even throws threads at it. The Sieve flips the problem on its head:
	// it never tests a single number for primality. It starts with all numbers
	// assumed prime and repeatedly crosses out the multiples of each prime it
	// finds. What's left standing is the answer.
	//
	// Same machine, same language — the work just collapses from O(n*sqrt(n))
	// to O(n*log log n). That is the whole point of this repo:
	// you don't need a faster computer, you need a better algorithm.

	public static void sievePrimes()
	{
		int limit = 100000;
		// composite[n] == true  => n is NOT prime. Default false = "assume prime".
		boolean[] composite = new boolean[limit];
		int totalPrimes = 0;

		for (int number = 2; number < limit; number++)
		{
			if (!composite[number])
			{
				totalPrimes++;
				// Cross out every multiple of this prime.
				for (int multiple = number * 2; multiple < limit; multiple += number)
				{
					composite[multiple] = true;
				}
			}
		}

		System.out.println("Total number of primes found: " + totalPrimes);
	}

	public static void main(String[] args)
	{
		System.out.println("This is the Sieve of Eratosthenes — a better algorithm, not a faster computer:");
		final long startTime = System.currentTimeMillis();
		sievePrimes();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time (milliseconds): " + (endTime - startTime) );
	}

}
