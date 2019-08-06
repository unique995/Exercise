package offer;

public class replaceNull {
    public static String replace(String str,int length){
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < length;i++){
            char c = str.charAt(i);
            if (c == ' '){
                sb.append("20%");
            }else
                sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String string = "i will find a good job";
        System.out.println(replace(string,string.length()));
    }
}
