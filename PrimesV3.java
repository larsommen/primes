class PrimesV3
{
	static int totalPrimes = 2;
	static int startNumber=5;
	static int iteration=0;
	public static void smartPrimes()
	{
		int correction = 5;

		for (int currentNumber = 5; currentNumber<=100000; currentNumber+=(10000-correction))
		{
			primesPart(currentNumber, correction);
			correction=0;
		}

		System.out.println("Total number of primes found: "+ totalPrimes);
	}

	public static void incNumberOfPrimes()
	{
		totalPrimes++;
	}

	public static void primesPart(int from, int correction)
	{
		int endNumber = from+10000-correction;
		if (from>5)
		{
			endNumber = endNumber-5;
			from = from -5+1;
		}

		for(int number = from; number <endNumber; number+=2)
		{
			boolean isPrime = true;
			for(int devider = 3; devider <= Math.sqrt(number); devider+=2)
			{
				if (number % devider == 0 )
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
			{
				incNumberOfPrimes();
			}
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("This is a clever program");
		final long startTime = System.currentTimeMillis();
		smartPrimes();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time (milliseconds): " + (endTime - startTime) );
	}
}
