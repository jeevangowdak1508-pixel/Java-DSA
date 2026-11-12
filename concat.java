public class concat {
    public static void main(String[] args) {
        String firstname = "Jeevan";
        String lastname = "Gowda";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        // string compare
        if(firstname.compareTo(lastname)==0){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal");
        }
        // substring
        String sentence = "My name is Jeevan";
        String name = sentence.substring(11,sentence.length());
        System.out.println(name);
        // Strings are immutable
    }
}
