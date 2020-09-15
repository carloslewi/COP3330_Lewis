
public static int decrypt(int number)
{
   int x, y, i, j;
   x = number / 1000;
   y = (number % 1000) / 100;
   i = (number % 100) / 10;
   j = number % 10;
   // Replace
   x = (x + 3) % 10;
   y = (y + 3) % 10;
   i = (i + 3) % 10;
   j = (j + 3) % 10;
   return (i * 1000 + j * 100 + x * 10 + y);
}
