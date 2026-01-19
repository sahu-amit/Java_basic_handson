package ClassAndObjects;

public class Temperature {
    double celsius;

    double fahrenheit(){
        return ((celsius * 9/5)+32);
    }
}
class TMP{
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.celsius = 37;

        System.out.println("Temperature in Fahrenheit is: "+temp.fahrenheit()+" °F");
    }
}
