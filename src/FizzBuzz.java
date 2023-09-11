/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

//        for (int i = 1; i < 100; i++) {
        int i = 1;
        doFizzBuzz(i);
    }

    private static void doFizzBuzz(int i) {
        while (i < 100) {

          // Find out which numbers divide i.
          boolean divisibleBy3 = i % 3 == 0;
          boolean divisibleBy5 = i % 5 == 0;

          // Print our appropriate result.
          if (divisibleBy3 && divisibleBy5) {
              i++;

              System.out.println("Fizz Buzz");

          } else if (divisibleBy3) {
              i++;
              
          System.out.println("Fizz");

          } else if (divisibleBy5) {
              i++;

              System.out.println("Buzz");

          } else {
              i++;

              System.out.println(i);

          }
      }
    }
}
