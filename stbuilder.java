public class stbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'S');
        System.out.println(sb);
        sb.insert(1,'t');
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        System.out.println(sb.append('a'));
    }
}
