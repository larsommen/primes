class PrimesV3

{
	public static void smartPrimes()
	{
		boolean isPrime = true;
		int totalPrimes = 2;
		for(int number = 5; number <=100000; number+=2)
		{
			for(int devider = 3; devider <= Math.sqrt(number); devider++)
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
		smartPrimes();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time (milliseconds): " + (endTime - startTime) );
	}
}