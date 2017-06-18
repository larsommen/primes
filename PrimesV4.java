import java.util.concurrent.*;

class PrimesV4 implements Runnable

{
	int from,correction;
	static int totalPrimes = 2;
	static int startNumber=5;
	static int iteration=0;

	public PrimesV4(int a, int b)
	{
		this.from=a;
		this.correction=b;
	}

		public void partPrimes(int from, int correction)
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
	public static void smartPrimes()
	{

		int correction = 5;

		for (int currentNumber = 5; currentNumber<=100000; currentNumber+=(10000-correction))
		{

			try {
				Thread t = new Thread (new PrimesV4(currentNumber, correction));
				t.start();
				correction=0;
				t.join();
			}
			catch (Exception e) 
			{
            	System.out.println(e.getMessage());
        	}
		}

	}

	public void run(){
		this.partPrimes(from,correction);
	}

	public synchronized void incNumberOfPrimes()
	{
		synchronized(this)
		{	
			totalPrimes++;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("This is a threaded program");
		final long startTime = System.currentTimeMillis();
		smartPrimes();

		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time (milliseconds): " + (endTime - startTime) );
		System.out.println("Total number of primes found: "+ totalPrimes);

	}
}