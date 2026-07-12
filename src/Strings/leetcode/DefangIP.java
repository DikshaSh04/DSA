package Strings.leetcode;
// Q: https://leetcode.com/problems/defanging-an-ip-address/
public class DefangIP {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defang(address));

    }
    //make a new StringBuilder object and traverse each character of original string
    //append the character if it is not a '.'
    //append [.] in the StringBuilder object if '.' is found in original string
    //return String value of StringBuilder object using .toString method


    public static String defang(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='.'){
                sb.append("[.]");
            }
            else{
                sb.append(c);
            }

        }
        return sb.toString();
    }
}
