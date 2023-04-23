public class Person implements IPerosn {

    public String firstName;

    public Person(String firstName) {


        this.firstName = firstName;
    }

    double silnia(double n){
        if(n== 0){
            return 1;
        } else {
            return  n * silnia(n-1);
        }
    }


    void showResult(double n){
        System.out.println(" silnia wynosi: " + silnia(n));

    }

    @Override
    public String show() {
        return null;
    }
}
