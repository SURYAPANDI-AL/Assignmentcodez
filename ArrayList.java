//if the array is empty and there is no element to delete throw an exception as Array is empty.
class EmptyArrayException extends Exception{
	EmptyArrayException(){
		super("Array is empty");
	}
}

public class ArrayList{
  private int position=0;  //current position of the array.
  private int length=5;    //initial length of the array.
  private int array[]=new int [length];
  
  //insert a new element to the array.
  public void insert(int inputElement)
  {
  	//if the position is exceeded then increase the array length by 5.
      if(position==array.length)
      {
          int temp[]=array.clone();  //create a clone of the existing array. clone()func creates and returns copy of an object.
          length+=5;
          array=new int [length]; 
          
          //store the elements in the temporary array to the array.
          for(int element=0;element<length-5;element++)
          {
              array[element]=temp[element];
          }
      }
      //store the input element to the current position and increment the position by one.
      array[position++]=inputElement;
      
  }
  
  //delete the last element from the array && it throws an exception when the array is empty.
  public void delete() throws EmptyArrayException
  {
  	//if the position is zero there is no more element to delete so it throw an exception that the array is empty.
      if(position==0)
      {	
      	throw new EmptyArrayException();
      }
      position--;  //decrement the position by one.
      array[position]=0;  //change the value of that position to zero.
      
      //if the position is less than length of the array by 5 then decrement the array length by 5.
      if(position<length-5)
      {
          int temp[]=array.clone();//create a clone of the existing array. clone()func creates and returns copy of an object.
          length-=5;
          array=new int [length];
          
          //store the elements in the temporary array to the array.
          for(int element=0;element<length;element++)
          {
              array[element]=temp[element];
          }
      }
  }
  
  //function to print the array.
  public void print()
  {
      System.out.print("[");
      //loop from element at position zero to current position-1 and print the elements.
      for(int element=0;element<position;element++)
      {
          System.out.print(array[element]);
          if(element<=position-2)
          {
              System.out.print(",");
          }
      }
      System.out.print("]");
      System.out.println();
  }

}

