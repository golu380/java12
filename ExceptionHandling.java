class MyExps extends Exception{
    String message;

    MyExps(String mess){
        message = mess;
    }
    public String getMessage(){
        return message;
    }
}

public class ExceptionHandling{

    public static void main(String []args){

        try{

            System.out.println("i am in try block");
            throw new MyExps("error occured!");

        }catch(MyExps err){
            System.out.println(err.getMessage());
        }

        System.out.println("hii");
    }
}