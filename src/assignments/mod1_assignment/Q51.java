package assignments.mod1_assignment;
public class Q51 {
    public static void main(String[] args) {
        String s1 = "Gauri Chopra is a Yapper";
        String word = "";

        for (int i = 0; i < s1.length(); i++) {
        if(s1.charAt(i) != ' '){
        word+=s1.charAt(i);
        }else{
            if(!word.isEmpty()){
                System.out.println(word);
                word="";
            }
        }
//            System.out.println(word);
//            word="";
//            System.out.println("\n");
        }
        if(!word.isEmpty()){
            System.out.println(word);
            }
        }
    }

