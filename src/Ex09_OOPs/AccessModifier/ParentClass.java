package Ex09_OOPs.AccessModifier;

public class ParentClass {
    public String Publicvar = "Public variable";
    private String Privatevar = "Private Variable";
    protected String Protectedvar = "Protected Variable";
    String Defaultvar = "Default Variable";

    public void Public () {
        System.out.println("Public method");
    }
    private void Private() {
        System.out.println("Private method");
    }
    protected void Protected (){
        System.out.println("Protected method");
    }
    void Default() {
        System.out.println("Default method");
    }

    public void testAccess(){
        System.out.println(Publicvar);
        System.out.println(Privatevar);
        System.out.println(Protectedvar);
        System.out.println(Defaultvar);

        Public();
        Private();
        Protected();
        Default();
    }

    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        obj.testAccess();
    }
}
