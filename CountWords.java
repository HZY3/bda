import java.util.Scanner;
public class CountWords 
{

   public static void main(String[] args)
   {
      String input="Welcome to Java Session Session Session";  //Input String 
      String[] words=input.split(" ");  //Split the word from String
      int wrc=1;    //Variable for getting Repeated word count
      
      for(int i=0;i<words.length;i++) //Outer loop for Comparison       
      {
         for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
         {
            
         if(words[i].equals(words[j]))  //Checking for both strings are equal
            {
               wrc=wrc+1;    //if equal increment the count
               words[j]="0"; //Replace repeated words by zero
            }
         }
         if(words[i]!="0")
         System.out.println(words[i]+"--"+wrc); //Printing the word along with count
         wrc=1;
         
        }  
         
   }

}
































/*/*
MapReduce is a technique in which a huge program is subdivided into small tasks and run parallelly 
to make computation faster, save time, and mostly used in distributed systems. It has 2 important parts: 

    Mapper: It takes raw data input and organizes into key, value pairs. 
            For example, In a dictionary, you search for the word “Data” and its associated meaning is 
            “facts and statistics collected together for reference or analysis”. Here the Key is Data and 
            the Value associated with is facts and statistics collected together for reference or analysis.
    Reducer: It is responsible for processing data in parallel and produce final output.
