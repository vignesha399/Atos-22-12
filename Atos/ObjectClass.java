class ObjectClass extends Object{
    @Override
    public String toString() {
        return "hello";
    }
    @Override
    public int hashCode() {
        return 456;
    }
    public static void main(String[] args) {
        Object  o1 = new Object();
        String s1 = o1.toString();
        System.out.println(s1);
        ObjectClass o2 = new ObjectClass();
        System.out.println(o2.toString());
        System.out.println(o1.equals(o2));
        System.out.println(o2.hashCode());
        String s2 = new String("Vignesh");
        System.out.println(s2.hashCode());
    }
}