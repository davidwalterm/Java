public class PrivateInnerClass {
    public static void main(String[] args){
        OuterClass2 myOuter = new OuterClass2();
        //Errors because InnerClass2 is private
        //OuterClass.InnerClass2 myInner = myOuter.new InnerClass2();
        System.out.println(/*myInner.y*/ + myOuter.x);
    }
}
