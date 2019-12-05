package com.bridgeLabz.Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
 
public class Util
{
    static PrintWriter pw = new PrintWriter(System.out);
    
    ///////////////////////////////////////////create Scanner Method///////////////////////////////////////////////
    static Scanner sc = new Scanner(System.in);
    
    public static int readingInteger()
    
    {
        return sc.nextInt();
    }
    
    public static String readingString()
    {
        return sc.nextLine();
    }
    public static String readString()
    {
        return sc.next();
    }
    public static double readingDouble()
    {
        return sc.nextDouble();
    }
    public static char readingChar()
    {
        return sc.nextLine().charAt(0);
    }
    
////////////////////////////////////////this method for check LeapYear////////////////////////////////////
	/*
	 * static function to check the value is Leap Year or not from given equation,
	 * take input from user
	 * command Line Argument
	 * @param value
	 * @return boolean leapYear 
	 */ 
    public static String checkLeapYear(int val) 
	{		
		
		if(val%4 == 0)
		{
			if(val%100 == 0)
			{
				if(val%400 == 0)
				{
					return "Leap Year";
				}
				else
				{
					return "Not Leap Year";
				}
			}
			else
			{
				return "Leap Year";
			}
		}
		else
		{
			return "Not Leap Year";
		}
	}
	
	
////////////////////////////////////////this method for check prime Number///////////////////////////////////
	/*
	 * static function to check the value is Prime or not from given equation,
	 * take input from user
	 * command Line Argument
	 * @param value
	 * @return boolean Prime
	 */
    public static boolean checkPrime(int val)
	{
		for(int i=2; i<=val; i++)
		{
			if(val%i==0 && i != val)
			{
				return false;
			}
			if(val%i==0 && i == val)
			{
				return true;
			}
		}
		return false;
	}
	
	
////////////////////////////////////////this method for check Even Odd///////////////////////////////////
	/*
	 * static function to check the value is Even Odd or not from given equation,
	 * take input from user
	 * command Line Argument
	 * @param value
	 * @return boolean EvenOdd
	 */
    public boolean checkEvenOdd(int val)
	{
		if(val%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
////////////////////////////////////////this method for check nthHarmonic///////////////////////////////////
	/*
	 * static function to print the nthHarmonic from given equation,
	 * take input from user
	 * command Line Argument
	 * @param n
	 * @return void nthHarmonic
	 */
    public static double nthHarmonic(int N) 
	{ 
	    float harmonic = 1; 
	  
	    for (int i = 2; i <= N; i++) 
	    { 
	        harmonic += (float) 1/i; 
	    } 
	  
	     return harmonic; 
	 } 
	
	
////////////////////////////////////////this method for check Factorial///////////////////////////////////
    /*
	 * static function to print the factorial from given equation,
	 * take input from user
	 * command Line Argument
	 * @param val
	 * @return String factorial
	 */
    public static String fact(int val)
	{
		int i=1;
		int j=1;
		String s = "";
		String str = "";
		System.out.print(i+" ");
		for(int k=0; k<val; k++)
		{
			int temp = i+j;
			i = j;
			j = temp;
			
			 s = Integer.toString(j);
			 str += s;
			 char c = ' ';
			 str += c;
			 s = "";
		}
		return str;
	}
	
	
////////////////////////////////////////this method for Flip-Coin//////////////////////////////////////
    /*
	 * static function to print the find Percentage Of Head and Tell from given equation,
	 * take input from user
	 * command Line Argument
	 * @param numberofFlipCoin
	 * @return String Percentage Of Head and Tell
	 */
    public static String findPercentageOfHeadandTell(int numberOfFlipCoin)
	{
		int numberOfHead=0;
		int numberOfTell=0;
		for(int i=0;i<numberOfFlipCoin;i++)
		{
			double random=Math.random();
			if(random>0.5)
			{
				numberOfHead+=1;
			}
			else
			{
				numberOfTell+=1;
			}
		}

		 double percentageOfHead=(numberOfHead*100)/numberOfFlipCoin;
	     double percentageOfTail=(numberOfTell*100)/numberOfFlipCoin;

		 String str = ("Percentage of Head = "+percentageOfHead+" , "+"Percentage of Tail = "+percentageOfTail);
		 return str;
		
	}
	
////////////////////////////////////////this method for PowerOf2///////////////////////////////////
    /*
   	 * static function to print the print Power of 2 from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param val
   	 * @return void powerof2
   	 */
    public static void powerof2(int val)
	{
		int power = 1;
		System.out.println(power);
		for(int i=1; i<val; i++)
		{
			power = power*2;
			System.out.println(power);
		}
	}
	
////////////////////////////////////////this method replace word in String///////////////////////////////////
    /*
   	 * static function to replace the word and print from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param replacePlace, rplce
   	 * @return void replaceMessage
   	 */
    public static void replaceMessage(String msg,String rplce, String replacePlace)
	{
		String message =  msg.replace(replacePlace, rplce);
        
        System.out.println(message);
	}
	
////////////////////////////////////////this method for print Integer 2DArray/////////////////////////////////// 
    /*
   	 * static function to take rows[m],columns[n] Integer 2D Array from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param m, n
   	 * @return integer integer2DArray
   	 */
    public static int[][] integer2DArray(int m, int n) 
	{
        int[][] intArray = new int[m][n];
        System.out.print("Enter the value");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++) 
            {   
            	Scanner sc = new Scanner(System.in);
            	int k = sc.nextInt();
            	intArray[i][j] = k;
            }
            System.out.println();
        }   
        return intArray;
    }
    /*
   	 * static function to take print Integer 2D Array from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param a[][],m, n
   	 * @return void integer2DArray
   	 */
	public static void printInteger2DArray(int a[][],int m,int n)
	{
		for(int b[] : a)
		{
			for(int c : b)
			{
				pw.print(c+" ");
				pw.flush();
			}
			System.out.println();
		}
	}
	
	
////////////////////////////////////////this method for print Double 2DArray/////////////////////////////////// 
	/*
   	 * static function to take rows[m],columns[n] Double 2D Array from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param m, n
   	 * @return Double Double2DArray
   	 */
	public static double[][] double2DArray(int m, int n) 
	{
        double[][] doubleArray = new double[m][n];
        System.out.print("Enter the value");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++) 
            {   
            	Scanner sc = new Scanner(System.in);
            	double k = sc.nextDouble();
            	doubleArray[i][j] = k;
            }
            System.out.println();
        }   
        return doubleArray;
    }
	/*
   	 * static function to take print double 2D Array from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param a[][],m, n
   	 * @return void double2DArray
   	 */
	public static void printDouble2DArray(double a[][],int m,int n)
	{
		for(double b[] : a)
		{
			for(double c : b)
			{
				pw.print(c+" ");
				pw.flush();
			}
			System.out.println();
		}
	}

    
////////////////////////////////////////this method for print Boolean 2DArray/////////////////////////////////// 
	/*
   	 * static function to take rows[m],columns[n] Boolean 2D Array from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param m, n
   	 * @return Boolean Boolean2DArray
   	 */
	public static boolean[][] boolean2DArray(int m, int n) 
	{
        boolean[][] booleanArray = new boolean[m][n];
        System.out.print("Enter the value");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++) 
            {   
            	Scanner sc = new Scanner(System.in);
            	boolean k = sc.nextBoolean();
            	booleanArray[i][j] = k;
            }
            System.out.println();
        }   
        return booleanArray;
    }
	/*
   	 * static function to take print Boolean 2D Array from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param a[][],m, n
   	 * @return void boolean2DArray
   	 */
	public static void printBoolean2DArray(boolean a[][],int m,int n)
	{
		for(boolean b[] : a)
		{
			for(boolean c : b)
			{
				pw.print(c+" ");
				pw.flush();
			}
			System.out.println();
		}
	}
	
////////////////////////////////////////this method calculate distance of two value(x,y), value given by user  ////////////////	
	 /*
   	 * static function to calculate distance of two value(x,y) and print from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param x1, y1
   	 * @return double distance
   	 */
	public static double distance(int x1, int y1)
	{
		int x2 = 0;
		int y2 = 0;
		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return distance;
	}
	
	
////////////////////////////////////////this method find the root////////////////////////////////////		
	 /*
   	 * static function to find the root and print from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param a, b, c
   	 * @return String quadratic
   	 */
	public static String quadratic(double a, double b, double c)
	{
	
		double r1 = 0;
        double r2 = 0;
        String s = "";
        double discriminant = b * b - 4 * a * c;
 
        if (discriminant > 0)
        {
 
            // r = -b / 2 * a;  
            r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
 
             s = ("The equation has two real roots " + r1 + " and " + r2);
        }
 
 
        if (discriminant == 0)
        {
             s = ("The equation has one root " +r1);
 
            r1 = -b / (2 * a);
            r2 = -b / (2 * a);
 
        }
 
        if (discriminant < 0)
        {
             s = ("The equation has no real root");
 
        }
        return s;
	}
	
////////////////////////////////////////this Method for WindChill////////////////////////////////////	
	/*
   	 * static function to calculate temperature and print from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param at, ws
   	 * @return double temprature
   	 */
	public static double windChill(double at, double ws)
	{
		double temprature = 0;
		temprature = 35.74 + (0.6215*at) + ((0.4275*at) - 35.75)*Math.pow(ws,0.16);
		return temprature;
	}
	
	
	
////////////////////////////////////////this Method for Gambler Game////////////////////////////////////
	/*
   	 * static function to Gambler Game (win or loss) and print from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param stake, goal, trials
   	 * @return void gamblerGame 
   	 */
	public static void gamblerGame(int stake,int goal,int trials)
    {
    	int bets = 0;        
        int wins = 0;        
        for (int t = 0; t < trials; t++)
        {
            int cash = stake;
            while (cash > 0 && cash < goal) 
            {
                bets++;
                if (Math.random() < 0.5) 
                { 	
                   cash++;  
                }	
                else    
                {    	
                   cash--;
                }   
            }
            if (cash == goal) wins++;                
        }
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Average of bets = " + 1.0 * bets / trials);
    }
	
	
////////////////////////////////////////this Method for Coupon Numbers////////////////////////////////////	
	/*
   	 * static function to generate Coupon Numbers(your number match or not) and print from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param num
   	 * @return boolean 
   	 */
	public static boolean couponNumber(int num)
	{
		 Random r = new Random();
		 int rand = r.nextInt(10)+1;
		 String s = "";
		 System.out.println("Open Coupon number : "+rand);
		 if(rand == num)
		 {
			 return true; 
		 }
		 else
		 {
		    return false;
		 }
	}
	
	
////////////////////////////////////////this Method for Startwatch, Stopwatch, calculteTime////////////////////////////////////	
	/*
   	 * static function to calculate the time (start and end) and print from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param 
   	 * @return long start
   	 * return long stop
   	 * return long calculatingTime
   	 */
	public static long start()
    {
        long start = 0;
        start = System.currentTimeMillis();
        return start;
    }

    public static long stop()
    {
        long stop = 0;
        stop = System.currentTimeMillis();
        return stop;
    }
    public static long calculteTime(long start,long stop)
    {
    	long totalTime = stop - start;
    	return totalTime;
    }
    
    
////////////////////////////////////////this Method for VendingMachine "Change the money"////////////////////////////////////	 
    /*
   	 * static function to  VendingMachine "Change the money" from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param amt
   	 * return void Amount
   	 */
    public static int[] vendingMachine(int amt)
	{
    	int change[] = {1000,500,100,50,20,10,5,2,1};
    	int notes[] = new int[9];
    	for(int i=0; amt!=0; i++)
    	{
    		if(amt%change[i]==0)
    		{
    			notes[i] = amt/change[i];
    			amt = 0;
    		}
    		else
    		{
    			notes[i] = amt/change[i];
    			amt = amt-change[i]*notes[i];
    		}
    	}
    	return notes;
	}
	
////////////////////////////////////////this Method for DayOfWeek"////////////////////////////////////	
    /*
   	 * static function to find day from given equation,
   	 * take input from user
   	 * command Line Argument
   	 * @param day, month, year
   	 * @return void day
   	 */  
    public static String calculateDay(int day, int month, int year)
	  	 {
	  		int y0 = year -(14 - month)/12;
	  		int x = y0 + (y0/4) -(y0/100) + (y0/400);
	  		int m0 = month + 12*((14-month)/12)-2;
	  		int d0 = (day + x + 31*m0/12) % 7;
	        
	  		
	  		switch (d0) 
	  		{
			  case 0:
		  		return ("Sunday");
			case 1:
	  			return ("Monday");
	  		   
	  		  case 2:
	  			return ("Tuesday");
	  		   
	  		  case 3:
	  			return ("Wednesday");
	  		   
	  		  case 4:
	  			return ("Thursday");
	  		   
	  		  case 5:
	  			return ("Friday");
	  		 
	  		  case 6:
	  			return ("Saturday");
	  		    
	  		  case 7:
	  			return ("Sunday");
	  		   
	  		}
			return null;
	   	}
	  
	  
////////////////////////////////////////this Method for temperaturConversion/////////////////////////////
    /*
   	 * static function temperaturConversion Fahrenheit to Celsius,
   	 * from given equation,take input from user
   	 * command Line Argument
   	 * @param n
   	 * @return double res
   	 */ 
    
    public static double fahrenheitToCelsius(double n)
	{
		double res = ((n * 9/5) + 32);
        return res;
	}
    
    
    /*
   	 * static function temperaturConversion ,
   	 * from given equation,take input from user celsius To Fahrenheit
   	 * command Line Argument
   	 * @param n
   	 * @return double res
   	 */ 
	public static double celsiusToFahrenheit(double n)
	{
		double res = (n - 32) * 5/9;
		return res;
	}
    
	  
    
////////////////////////////////////////this Method for monthlyPayment/////////////////////////////  
    /*
   	 * static function calculate the monthly payment of loan
   	 *  from given equation,take input from user
   	 * command Line Argument
   	 * @param  P, Y, R
   	 * @return Double monthlyPayment
   	 */ 
    public static Double monthlyPayment(double P, double Y, double R)
		{
			double m = 12 *  Y;
			double r = R / (12 * 100);
			double payment = (P*r)/(1 - Math.pow((1+r), (-m)));
			
			return payment;
		}

	  
////////////////////////////////////////this Method for find Square Root/////////////////////////////
    /*
   	 * static function find Square Root
   	 *  from given equation,take input from user
   	 * command Line Argument
   	 * @param  n
   	 * @return double squareRoot
   	 */  
    public static double squareRoot(double n)
		{
			double eps = 1e-15;
	        double res = n;
	        while (Math.abs(res - n/res) > eps*res)
	        {
	            res = (n/res + res) / 2.0;
	        }
	        return res;
		}
	  
	  
////////////////////////////////////////this Method for Decimal convert TO Binary/////////////////////////////	  
    /*
   	 * static function for Decimal convert TO Binary
   	 *  from given equation,take input from user
   	 * command Line Argument
   	 * @param  n
   	 * @return String toBinary
   	 */  
    public static String toBinary(int n)
		{
			String s="";
			while(n>0)
			{
				int r=n%2;
				s =r+s;
				n=n/2;
				
			}
			return s;
		}
	  
	  
////////////////////////////////////////this Method for Binary convert TO Decimal/////////////////////////////  
    /*
   	 * static function for Binary convert TO Decimal
   	 *  from given equation,take input from user
   	 * command Line Argument
   	 * @param  num
   	 * @return String toDecimal
   	 */ 
    public static String toDecimal(String num)
	  {
		int incr = 1;
		int total = 0;
		int size = num.length();
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(String.valueOf(num.charAt(i)));     //arr[i] = Integer.parseInt(""+num.charAt(i));
		}
		
		for(int j=num.length()-1; j>=0; j--)
		{
			if(arr[j] == 1)
			{
				total += incr;
			} 
			incr *= 2;
		}
		String str = Integer.toString(total);
		return str;
     }
	  
	  
////////////////////////////////////////this Method for String Reverse/////////////////////////////
    /*
   	 * static function for String Reverse
   	 *  from given equation,take input from user
   	 * command Line Argument
   	 * @param  s
   	 * @return String stringReverse
   	 */   
	 
    public static String stringReverse(String s)
	  {
			String str = "";
			for(int i=s.length()-1; i>=0; i--)
			{
				str += s.charAt(i);
			}
			return str;
		}
	  
	  
	  
////////////////////////////////////////this Method for Binary search in the list/////////////////////////////	  
    /*
   	 * static function for Binary search in the list
   	 *  from given equation,take input from user
   	 * command Line Argument
   	 * @param  sr
   	 * @return boolean true or false
   	 */  
    public static boolean checkName(String sr) throws IOException
		{	
				String s1 = "";
				File f = new File("name.txt");
				FileReader fr = new FileReader(f);
				char[] ch = new char[(int)f.length()];
			    fr.read(ch);
				
				String sg = String.valueOf(ch);
//				System.out.println(sg);
				
				String[] str = sg.split("\n");
			   
			    fr.close();
			    for(int i=0; i<str.length; i++)
			    {
			    	if(str[i].equals(sr))
			    	{
			    		return true;
			    		
			    	}
			    	
			    }
			    return false;
		}
		
		public static void addName(String sr) throws IOException
		{
			FileWriter fw = new FileWriter("name.txt",true);
			fw.write("\n"+sr);
			fw.close();
			System.out.println("name added succefully.....");
		}
		
		
		
////////////////////////////////////////this Method for permutation of word/////////////////////////////			
		/*
	   	 * static function for permutation of word
	   	 * from given equation,take input from user
	   	 * command Line Argument
	   	 * @param  str, ans
	   	 * @return void printPermutn
	   	 */
		public static void printPermutn(String str, String ans) 
	    { 
		  
		        if (str.length() == 0)
		        { 
		            System.out.print(ans + " "); 
		            return; 
		        } 
		  
		        for (int i = 0; i < str.length(); i++)
		        { 
		            char ch = str.charAt(i); 
		            String ros = str.substring(0, i)+str.substring(i + 1); 
		 
		            printPermutn(ros, ans + ch); 
		        } 
	    } 
		
		
////////////////////////////////////////this Method for Insertion Sort/////////////////////////////
		/*
	   	 * static function for Insertion Sort
	   	 * from given equation,take input from user
	   	 * command Line Argument
	   	 * @param  array[]
	   	 * @return String[] insertionSort
	   	 */
		public static String[] insertionSort(String array[])
		{	
		   String temp="";
		   for(int i=0;i<array.length;i++) 
		   {
		      for(int j=i+1;j<array.length;j++)
		      {
		         if(array[i].compareToIgnoreCase(array[j])>0)
		         {
		            temp = array[i];
		            array[i]=array[j];
		            array[j]=temp;
		         }
		      }
		   }
		   return array;
		 }
			
		
////////////////////////////////////////this Method for Bubble Sort/////////////////////////////
		/*
	   	 * static function for Bubble Sort Integer Type
	   	 * from given equation,take input from user
	   	 * command Line Argument
	   	 * @param  arr[]
	   	 * @return int[] arr
	   	 */
		public static int[] bubbleSort(int arr[])
		{
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr.length-1; j++) 
				{
					if(arr[j] > arr[j+1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		return arr;
		}
////////////////////////////////////////this Method for Bubble Sort String/////////////////////////////		
		/*
	   	 * static function for Bubble Sort String Type
	   	 * from given equation,take input from user
	   	 * command Line Argument
	   	 * @param  arr[]
	   	 * @return String[] arr
	   	 */
		
		public static void bubbleSortInteger(Integer arr[])
		{
			for(int i=0; i<arr.length; i++) 
			{
				for(int j=0; j<arr.length-1; j++) 
				{
					if(arr[j].compareTo(arr[j+1])>0)
					{
						Integer temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			for(Integer ch : arr)
				System.out.println(ch);
		}
		
		
		
////////////////////////////////////////this Method for Merge Sort/////////////////////////////		
		/*
	   	 * static function for Merge Sort
	   	 * from given equation,take input from user
	   	 * command Line Argument
	   	 * @param  input
	   	 * @return  void mergesort
	   	 */
		public static void mergesort(String[] input)
		  {
		      mergesort(input, 0, input.length - 1);
		  }
		  
		  
		  public static void mergesort(String[] input, int start, int end) 
		  {

		      int mid = (start + end) / 2;
		      if (start < end)
		      {
		          mergesort(input, start, mid);
		          mergesort(input, mid + 1, end);
		      }
		    
		      int i = 0, first = start, last = mid + 1;
		      String[] tmp = new String[end - start + 1];

		      while (first <= mid && last <= end)
		      {
		          tmp[i++] = input[first].compareTo(input[last])<0  ? input[first++] : input[last++];
		      }
		      while (first <= mid) 
		      {
		         tmp[i++] = input[first++];
		      }
		      while (last <= end) 
		      {
		         tmp[i++] = input[last++];
		      }
		      i = 0;
		      while (start <= end)
		      {
		         input[start++] = tmp[i++];
		      }
		 }
		  
		  
////////////////////////////////////////this Method for Anagram/////////////////////////////		  
		     /*
		   	 * static function for Anagram
		   	 * from given equation,take input from user
		   	 * command Line Argument
		   	 * @param  s1, s2
		   	 * @return  boolean twoStringAnagram
		   	 */
		  public static boolean twoStringAnagram(String s1, String s2)
			{
				char[] arr1 = s1.toCharArray();
				char[] arr2 = s2.toCharArray();
				int count = 0;
				if(arr1.length != arr2.length)
				{
					return false;
				}
				else
				{
					Arrays.sort(arr1);
					Arrays.sort(arr2);
					
					for(int i=0; i<arr1.length; i++)
					{
						if(arr1[i] == arr2[i])
						{
							continue;
						}
						else
						{
							count++;
						}
					}
					if(count > 0)
					{
						return false;
					}
					else
					{
						return true;
					}
				}
				
				
			}
////////////////////////////////////////this Method for Prime Numbers/////////////////////////////		  
		  /*
		   	 * static function for Prime Numbers
		   	 * from given equation,take input from user
		   	 * command Line Argument
		   	 * @param  n
		   	 * @return  void primeNumbers
		   	 */   
		  public static void primeNumbers(int n)
		  {
			  for(int i=3; i<n; i++)
		      {
		    	  for(int j=2; j<=i; j++)
			      {
		    		  if(i%j == 0 && i != j)
			    	  {
			    		  break;
			    	  }
			    	  if(i%j == 0 && i == j)
			    	  {
			    		  System.out.println(j);
			    	  }
			      } 
		      }
		  }

		  
////////////////////////////////////////this Method for Integer Palindrom/////////////////////////////		  
		  /*
		   	 * static function for Integer Palindrom
		   	 * from given equation,take input from user
		   	 * command Line Argument
		   	 * @param  n
		   	 * @return  boolean palindromInteger
		   	 */ 	  
		  public static boolean palindromInteger(int n)
		  {
				int rem;
				int sum=0;
				int temp = n;     
		    
				  while(temp>0)
				  {    
				     rem=temp%10;  //getting remainder  
				     sum=(sum*10)+rem;    
				     temp=temp/10; 
				  }
				  
				  if(sum == n)
				  {
					 return true; 
				  }
				  else
				  {
					  return false; 
				  }
			}
////////////////////////////////////////this Method for GenericSort/////////////////////////////		  
/*
 * static function for GenericSort from given equation,take input from user
* command Line Argument
* @param  a
* @return  t[] a
*/
	 public static <T extends Comparable<T>> T[] genericSort(T[] a)
	 {
		 for(int i=0; i<a.length-1;i++)
		 {
			for(int j=0; j<a.length-i-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
				   T temp = a[j];
				    a[j] = a[j+1];
				    a[j+1] = temp;
				}    
			}
		}
		return a;
	}
////////////////////////////////////////this Method for Guessing Number/////////////////////////////		  
/*
* static function for Guessing Number from given equation,take input from user
* command Line Argument
* @param  n, arr
* @return String guess number 
*/	 
	 public static String guessGame(int n, int[] arr)
		{   
			Arrays.sort(arr);
			
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i] == n)
				{
				    return ("Your guessing number is="+arr[i]);
				}
			}
			return ("your guessing number "+n+" not in list");
			
		}
	 
////////////////////////////////////////this Method for Customize Message/////////////////////////////	 
	 /*
	 * static function for Customize Message from given equation,take input from user
	 * command Line Argument
	 * @param  fname fullname contact date
	 * @return String s
	 */		
	 
	 public static String customizeMessage(String fname,String fullname,String contact,String date)
		{
			
			String s1 = "Hello <<name>>, ";
		    String s2 = "We have your full name as <<full name>> in our system.";
		    String s3 = "your contact number is 91-xxxxxxxxxx.Please,let us know in case of any clarification.";
		    String s4 = "Thank you BridgeLabz 01/01/2016.";
		    
		    s1 = s1.replace("<<name>>",fname);
		    s2 = s2.replace("<<full name>>",fullname);
		    s3 = s3.replace("xxxxxxxxxx",contact);
		    s4 = s4.replace("01/01/2016",date);
		    
		    String s = (s1+"\n\n"+s2+"\n"+s3+"\n\n"+s4);
		    return s;
		}
	 
	 
	public static String[] readFile(String file) throws FileNotFoundException,IOException
	{
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
	    String str = br.readLine();
	    String str1 = "";
	    while(str != null)
	    {
	    	str1=str1+str+" ";
	    	str = br.readLine();
	    }
	    String arr[] = str1.split(" ");
	    br.close();	
	    return arr;
	}
////////////////////////////////////////this Method for Anagaram Integer /////////////////////////////	 
/*
* static function for check Integer Anagram from given equation,take input from user
* command Line Argument
* @param  n1, n2
* @return boolean true or false
*/		
	public static boolean anagram(int num1,int num2)
	  {
		  int[] num1count=count(num1);
		  int[] num2count=count(num2);
		  for(int i=0;i<num2count.length;i++)
		  {
			  if(num1count[i]!=num2count[i])
			  {
				  return false;
			  }
		  }
		  return true;
	  }
	
	public static int[] count(int num)
	{
		  int[] count=new int[10];
		  int temp=num;
		  while(temp!=0)
		  {
		  int r=temp%10;
		  count[r]++;
		  temp=temp/10;
		
		  }
		  return count;
	  }

}

