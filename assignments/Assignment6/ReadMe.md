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
 

II. Write two differences between ArrayList and LinkedList. (Score 1)
 
III. Given two strings s and t , write a function to determine if t is an anagram of s. (Score 2)
    
            Example 1:
    
            Input: s = "anagram", t = "nagaram"
            Output: true
            
            Example 2:
            Input: s = "rat", t = "car"
            Output: false
            
            Note:
            You may assume the string contains only lowercase alphabets.
    
            public boolean isAnagram(String s, String t) {}
       
     
 IV. Given an array of integers arr, 
 write a function that returns true if and only if the number of occurrences of each value in the array is unique. (Score 1)
    
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
        
 V. Design a HashMap without using any built-in hash table libraries. (Score - 1)
    
    To be specific, your design should include these functions:
    
    put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
    get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
    remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
    
    Example:
    
    MyHashMap hashMap = new MyHashMap();
    hashMap.put(1, 1);          
    hashMap.put(2, 2);         
    hashMap.get(1);            // returns 1
    hashMap.get(3);            // returns -1 (not found)
    hashMap.put(2, 1);          // update the existing value
    hashMap.get(2);            // returns 1 
    hashMap.remove(2);          // remove the mapping for 2
    hashMap.get(2);            // returns -1 (not found) 
    
    Note:
    
    All keys and values will be in the range of [0, 1000000].
    The number of operations will be in the range of [1, 10000].
    Please do not use the built-in HashMap library.