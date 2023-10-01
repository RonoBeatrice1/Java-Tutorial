public class AnotherVar{
    public static void main(String[] args){
        int myNum = 4;
        System.out.println("My favourite number is:" + myNum);
            }
}

//You can also declare a variable without assigning the value, and assign the value later:
//int myNum;
// myNum = 15;
// System.out.println(myNum);

//Note that if you assign a new value to an existing variable, it will overwrite the previous value:
//int myNum = 15;
// myNum = 20;  // myNum is now 20
// System.out.println(myNum);

//If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
// final int myNum = 15;
// myNum = 20;  // will generate an error: cannot assign a value to a final variable

int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";