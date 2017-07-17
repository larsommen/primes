class PrimesV2

{
	public static void primes()
	{
		boolean isPrime = true;
		int totalPrimes = 0;
		for(int number = 2; number <=100000; number++)
		{
			for(int devider = 2; devider < number; devider++)
			{
				if (number % devider == 0 )
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				totalPrimes++;
			}
			isPrime = true;
		}
		System.out.println("Total number of primes found: "+ totalPrimes);
	}

	public static void main(String[] args) 
	{
		System.out.println("This algorithm breaks if a number is not a prime:");
		final long startTime = System.currentTimeMillis();
		primes();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time (milliseconds): " + (endTime - startTime) );
	}

}
