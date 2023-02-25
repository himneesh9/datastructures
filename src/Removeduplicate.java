public class Removeduplicate {
    public static String remove(String s){
        StringBuilder sb = new StringBuilder("");
        boolean[] b = new boolean[26];
        for(int i = 0 ; i < s.length() ; i++){
            char currchar = s.charAt(i);
            if(b[currchar - 'a'] != true) {
                sb.append(currchar);
                b[currchar - 'a'] = true;
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        System.out.println(remove("appnnacollege"));
    }
}
