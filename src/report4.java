public class report4 {
    public static void main(String[] args){
        try {                     //tryの中でエラーが起きた時↓
            String str = null;
            System.out.println(str.length());

        } catch(NullPointerException e){
            System.out.println("NullPointerException"+"が発生");
            System.out.println(e.getMessage());
        }

    }

    }
