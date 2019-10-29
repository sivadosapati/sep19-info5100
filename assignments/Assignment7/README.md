# Assignment 7
## Instructions
* Max score is 10.
* Deadline is 4th November 2019, 11:59pm.
* Recommend all input and output files are txt type.
* Write Unit Test for functions
* Try to attempt every question and keep practising from other online sites. 
## Questions
Write a program that read sentences from a file and reverse sentences word by word. After reverse, create a new file to save sentences. (Extreme corner case is not mandatory.)
```
Example:
Input file: the sky is blue.
Output file: blue is the sky.
```
---

Write a program that decode a file. Given an encoded file, create its decoded file. 
The encoding rule is: `k[encoded_string]`, where the `encoded_string` inside the square brackets is being repeated exactly `k` times. Note that `k` is guaranteed to be a positive integer.

Assume that the string from input file is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, assume that the original data does not contain any digits and that digits are only for those repeat numbers, `k`. For example, there won't be input like `3a` or `2[4]`.

```java
Examples:
Input file: "3[a]2[bc]", output file: "aaabcbc".
Input file: "3[a2[c]]", output file: "accaccacc".
Input file: "2[abc]3[cd]ef", output file: "abcabccdcdcdef".
```

---

Write a program that will count the number of lines in each file that is specified on the command line. 

Assume that the files are text files. 

Note that multiple files can be specified, as in "java LineCounts file1.txt file2.txt file3.txt". Write each file name, along with the number of lines in that file, to standard output. If an error occurs while trying to read from one of the files, you should print an error message for that file, but you should still process all the remaining files.

---

Write a program that calculate the sum value in an array of ints using 4 threads. You should construct an 4,000,000 long array of random numbers and return the sum of the array.
Please finish those two method: generateRandomArray and sum.

```java
public class SumValue {
    
    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){

    }

    /*get sum of an array using 4 threads*/
    static long sum(int[] arr){
        return 0;
    }

    public static void main(String[] args){
        int[] arr = new int[4000000];
        generateArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }
}
```

---
