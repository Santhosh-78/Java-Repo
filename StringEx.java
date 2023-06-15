import java.lang.String;
public class StringEx{
public static void main(String args[]){
String value = " Batch15 is toxic ";
String value1 = "BATCH15 ";
String value2 = "kgm@fs@batch15@thursday";
//contains() check whether the given value is available in the give variable along with case sensitive
 System.out.println("contains():"+value.contains("Is")); 

//concat() is used to add two different string and present it as single string
 System.out.println("concat(): "+value.concat(" by birth"));

//equals() check whether the variable and the given string is equal are not it is case sensitive and space concerned
 System.out.println("equals(): "+value.equals("Batch15 is toxic "));

//equalsIgnoreCase() ignore the case sensitive and check the value with the variable,also space concerned
System.out.println("equalsIgnoreCase(): "+value.equalsIgnoreCase("BATCH15 IS TOXIC"));

//toUpperCase()changes all the alphabets to capital letters
System.out.println("toUpperCase(): "+value.toUpperCase());

//toLowerCase()changes all the alphabets to small letters
System.out.println("toLowerCase(): "+value.toLowerCase());

//length() return the length of the variable along with space
System.out.println("length(): "+value.length());

//CharAt() return the char that has been available in the specified index value
System.out.println("charAt(): "+value.charAt(4));

//compareTo() return the lexicographic postive value if it contains any term that has been available in the variable
System.out.println("compareTo(): "+value.compareTo(value1));
System.out.println("compareTo(): "+value.compareTo("hello"));

//compareToIgnoreCase() return the lexicographic zero value if the variable are same
System.out.println("compareToIgnoreCase(): "+value.compareToIgnoreCase(value1));

//indexOf() returns the index value of specified char 
System.out.println("indexOf(): "+value.indexOf("s"));

//isEmpty() is used to check given variable is empty or not
System.out.println("isEmpty(): "+value.isEmpty());

//replace() used to replace the specified word with the specified value
System.out.println("replace(): "+value.replace("toxic","Vedappu"));

//substring() is used to get the string that has mentioned from start index to end
System.out.println("substring(): "+value.substring(3,11));

//trim() is used to remove the space from start and end.
System.out.println("trim(): "+value.trim());

//lastIndexOf() return the index of last occurrence of the given character
System.out.println("lastIndexOf(): "+value.lastIndexOf('i'));

//hashCode() return the key from the hash table which hold variable as values
System.out.println("hashCode(): "+value.hashCode());

//format() changes the given data in the specified format
System.out.println("format(): "+String.format("%x",5));

//join() method is used to set a delimiter and join the parameterized values
System.out.println("join(): "+String.join("kavin","santhosh","pavithra","chandru"));

//replaceAll() 
System.out.println("replaceAll(): "+value.replaceAll("i","y"));

//split() 
String[] arr1 = value2.split("@",3);
System.out.println(arr1);
for(String a1: arr1){
System.out.println("pattern1"+a1);
}
}
}
