Python 3.11.5 (v3.11.5:cce6ba91b3, Aug 24 2023, 10:50:31) [Clang 13.0.0 (clang-1300.0.29.30)] on darwin
Type "help", "copyright", "credits" or "license()" for more information.
>>> import math as mh
... 
... 
... def permutacion(num1,num2):
...     return mh.factorial(num1)/mh.factorial(num1-num2)
... 
... def combinacion(num1,num2):
...     return mh.factorial(num1)/(mh.factorial(num2)*mh.factorial(num1-num2))
... 
... num1 = 10;
... num2 = 2;
... 
... 
... if(num1>0 and num2>0):
...     print(f"La permutacion de P({num1},{num2}) es  {permutacion(num1,num2)}");
...     print(f"La combinacion de C({num1},{num2}) es  {combinacion(num1,num2)}");
... else:
...         print(f"Ambos numeros deben ser positivos");
