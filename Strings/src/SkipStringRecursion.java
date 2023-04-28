public class SkipStringRecursion {

    public static void main(String[] args) {

        skip("abbccddaa","");
        System.out.println(skipWithoutArgument("aabbccddaaac"));
        System.out.println(skipApple("aapplebbccddaaac"));
        System.out.println(skipAppNotApple("appapplebbccddaaac"));

    }

    //argument for new string
    static void skip(String existing,String modified){

        if(existing.isEmpty()){
            System.out.println(modified);
            return;
        }

        char ch=existing.charAt(0);
        if(ch =='a'){
            skip(existing.substring(1),modified);
        }else{
            skip(existing.substring(1),modified+ch);
        }
    }

    static String skipWithoutArgument(String existing){

        if(existing.isEmpty()){
            return " ";
        }

        char ch=existing.charAt(0);
        if(ch =='a'){
             return skipWithoutArgument(existing.substring(1));
        }else{
            return  ch + skipWithoutArgument(existing.substring(1));
        }
    }


    static String skipApple(String existing){

        if(existing.isEmpty()){
            return "";
        }


        if(existing.startsWith("apple")){
            return skipApple(existing.substring(5));
        }else{
            return  existing.charAt(0) + skipApple(existing.substring(1));
        }
    }


    static String skipAppNotApple(String existing){

        if(existing.isEmpty()){
            return "";
        }


        if(existing.startsWith("app") && !existing.startsWith("apple")){
            return skipAppNotApple(existing.substring(3));
        }else{
            return  existing.charAt(0) + skipAppNotApple(existing.substring(1));
        }
    }



}
