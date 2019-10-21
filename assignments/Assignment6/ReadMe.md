I. Design an Automated Teller Machine (ATM). (Score 5).

    - Create a User class with attributes name, age, address, phoneNumber and bankAccountNumber.

    - Create a Atm class with attributes availableAmountInMachine, transactionFee and userData.

    - userData should store USER, PASSWORD, and other account details internally in a dataStructure of your choice.

    - The constructor should initialize all the attributes.

    - The machine should be able to perform these actions.

    - Ask for NEW USER or CURRENT USER as the start.

    - Create a NEW USER with a unique bankAccountNumber and password.

    - CURRENT USER should be able to login using bankAccountNumber and password.

    - CURRENT USER should be able to use FORGOT PASSWORD.

    - PASSWORD can be resetted by validating the name, age and phoneNumber of the user.

    - After login the user should be able to use availableBalance, withDrawal, deposit, recentTransactions, changePassword and exit.

    - recentTransaction should display the last 10 transactions, in a format of transactionName - amount. (transactionName is withDrawal or deposit).

    - Add a transactionFee for every transaction done and update the availableAmountInMachine.

    - Machine should not allow user to withdrawal more amount than his availableBalance.

    - You can add additional functions to make it pretty. UI is not required.


II.  When a program fails due to an uncaught exception, 
   the system automatically prints out the exception’s stack trace.
   If the failure is not easily reproducible, it may be difficult or impossible to get any more information.
   Therefore, it is critically important that the exception’s toString() method return, as much information as possible concerning the cause of the failure.
   In other words, the detail message of an exception should capture the failure for subsequent analysis. 
   To capture the failure, the detail message of an exception should contain the values of all parameters and fields that “contributed to the exception.”
   Create your own MyIndexOutOfBoundException Class. It should contain these parameters.  
   (Score 2).

- lowerBound - the lowest legal index value.

- upperBound - the highest legal index value.

- index - the current index value.

Test your code in main method, by creating an indexOutOfBoundException. Output error message should be like this:

 “Error Message: Index: 10, but Lower bound: 0, Upper bound: 9” 
 
 
III. Write two differences between ArrayList and LinkedList. (Score 1)
 
IV. Given two strings s and t , write a function to determine if t is an anagram of s. (Score 2)
    
            Example 1:
    
            Input: s = "anagram", t = "nagaram"
            Output: true
            
            Example 2:
            Input: s = "rat", t = "car"
            Output: false
            
            Note:
            You may assume the string contains only lowercase alphabets.
    
            public boolean isAnagram(String s, String t) {}
    
 V. Given an array of integers arr, 
 write a function that returns true if and only if the number of occurrences of each value in the array is unique. (Score 1)
 Extra Credit.
    
        Example 1:
        
        Input: arr = [1,2,2,1,1,3]
        Output: true
        Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. 
        No two values have the same number of occurrences.
        
        Example 2:
        
        Input: arr = [1,2]
        Output: false
        Example 3:
        
        Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
        Output: true
         
        Constraints:
        
        1 <= arr.length <= 1000
        -1000 <= arr[i] <= 1000
        
        
        public boolean uniqueOccurrences(int[] arr) {}
