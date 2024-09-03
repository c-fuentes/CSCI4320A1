package edu.clayton.csit.antlab.person;

import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Qu
 * @version 1.1
 */
//edited by Celso Fuentes
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
          Random rand = new Random();
          char[] word = input.toCharArray();
          int num_of_times_to_randomize = input.length()/2;
          int length = input.length();
          for(int i = 0; i < num_of_times_to_randomize; i++){
              char temp;
              int firstChar = rand.nextInt(length);
              int secondChar = rand.nextInt(length);
              temp = word[firstChar];
              word[firstChar] = word[secondChar];
              word[secondChar] = temp;
          }
          String output = String.valueOf(word);
	  return output;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
