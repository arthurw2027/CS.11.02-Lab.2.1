/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
System.out.println(roundNegativeValueToNearestInteger(-7.41));
    }
    public static int add(int a, int g){
        return a + g;
    }
    public static int add(int c, int d, int e, int f){
        return add(c, d) + add(e,f);
    }
    public static String morningGreeting(String name){
        return "早上好 " + name;
    }
    public static String afternoonGreeting(String Name){
        return "下午好 " + Name;
    }
    public static String triple(String three){
        return three + three + three;
    }
    public static double half(double halves){
        return halves/2;
    }
    public static double roundPositiveValueToNearestInteger(double rounded){
        return (int) (rounded + 0.5);
    }
    public static double roundNegativeValueToNearestInteger(double roundDown){
        return (int) (roundDown - 0.5);

    }


    // 1. add
    
    // 2. add

    // 3. morningGreeting

    // 4. afternoonGreeting

    // 5. triple

    // 6. half

    // 7. roundPositiveValueToNearestInteger

    // 8. roundNegativeValueToNearestInteger

}
