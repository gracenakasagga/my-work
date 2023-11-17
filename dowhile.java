
public class DoWhileLoopMain {
 
   
class DoWhile{
 public static void main(String[] args) {
        DoWhileLoopMain dwl=new DoWhileLoopMain();
        int arr[] ={32,45,53,65,43,23};
        System.out.println(dwl.findElementInArr(arr, 53));
    }
 
public String findElementInArr(int arr[],int elementTobeFound)
{
    int i=0;
    do
    {
        if(arr[i]==elementTobeFound)
        {
            System.out.println(elementTobeFound+" is present in the array ");
            return "PRESENT";
        }
        i++;
    }
while(i<arr.length);
 
    return "NOT PRESENT";
 }
}
 