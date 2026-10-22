class StringHandling
{
    public static void main(String[] args) 
    {
        String t="hello world";
        String e=" yeah the first thing";
        String tt="hello";
        String ttt="Hello";
        System.out.println("The second string is: "+tt);
        System.out.println("The third string is: "+e);
        System.out.println("Length of the String is :"+t.length());
        System.err.println("The string in UPPER CASE: "+t.toUpperCase());
        System.out.println("The string in lower case: "+t.toLowerCase());
        System.out.println("The word \"world\" appears in the index: "+t.indexOf("world"));
        System.out.println("is hello and hello are equal: "+tt.equals(tt));
        System.out.println("is hello and Hello are equal: "+tt.equals(ttt));
        System.out.println("Both first and Second string concatinated: "+t.concat(e));
        System.out.println("hello is compared to Hello: "+tt.compareTo(ttt));
        System.out.println("hello is compared to Hello by ignoring case: "+tt.compareToIgnoreCase(ttt));      
    }
}