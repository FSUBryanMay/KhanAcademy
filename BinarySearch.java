public class BinarySearch{
    public static void main(String[] args) {
        int[] firstTwentyFivePrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        System.out.println(binarySearch(firstTwentyFivePrimes, 73));
    }

    public static int binarySearch(int[] listOfPrimes, int target){
        int min = 0;
        int max = listOfPrimes.length - 1;

        while(max >= min){
            int guess = (max + min) / 2;

            if(listOfPrimes[guess] == target){
                return guess;
            }
            else if(listOfPrimes[guess] < target){
                min = guess + 1;
            }
            else {
                max = guess - 1;
            }
            
        }

        return -1;
    }
}