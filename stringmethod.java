public class stringmethod{
    public static void main(String[] args){
        String v = "JavaFundamental";
        String c = "Java Advanced";
        System.out.println(v.length());
        System.out.println(v.isEmpty());
        System.out.println(c.isBlank());
        System.out.println(v.equals(c));
        System.out.println(v.equalsIgnoreCase(c));
        System.out.println(v.compareTo(c));
        System.out.println(v.contains(c));
        System.out.println(v.charAt(5));
        System.out.println(v.substring(3,7));
        System.out.println(v.indexOf(c));
        System.out.println(v.lastIndexOf(c));
        System.out.println(v.trim());
        System.out.println(v.strip());
        System.out.println(v.replace("Java","c"));
        System.out.println(c.repeat(3));
        System.out.println(v.toUpperCase());
        System.out.println(v.toLowerCase());














    }
}