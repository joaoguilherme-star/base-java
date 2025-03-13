public class MyClass {

    public static void main (String [] args){

        String a = "BIA";
        String b = "TRIZ";

        String c = FullName(a, b);

        System.out.println(c);

        //using the same name from method FullName
        String FirstName = "João";
        String LastName = "Guilherme";

        String FullName = FullName(FirstName, LastName);

        System.out.print(FullName);
    }

    public static String FullName (String FirstName, String LastName){
        return "Result of the method: " + FirstName.concat(" ").concat(LastName);
    }
}
