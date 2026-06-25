# primes
Experiments with different ways of calculating the number of primes below 100000 and getting that number:
<br><br>
Five java files in project:<br><br>
+1 Primes.java is a very brute force way of calculating the number of primes below 100.000<br><br>
+2 PrimesV2.java breakes when it finds that the number being checked is not a prime<br><br>
+3 PrimesV3.java is only looking at odd numbers and only checking dividers up to the square root of the number being checked<br><br>
+4 PrimesV4.java is a threaded version of PrimesV3.java<br><br>
+5 PrimesV5.java is the Sieve of Eratosthenes — instead of testing each number, it crosses out the multiples of every prime it finds. A fundamentally better algorithm: it finds the same 9592 primes in a fraction of the time, on the same machine.<br><br>
<b>You don't need a faster computer — you need a better algorithm.</b><br><br>
---
$Live demo (run all five in your browser) at <a href="https://ommen.it/algorithms/" target="_blank">https://ommen.it/algorithms/</a>
