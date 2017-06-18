class Primes

{
	public static void dumPrimes()
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
		final long startTime = System.currentTimeMillis();
		dumPrimes();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time (milliseconds): " + (endTime - startTime) );
	}

}