package GenericCode;



class Test<T>
{
    T obj;
    Test(T obj){this.obj=obj;}
    public T getObj(){return this.obj;}
}
public class GenericPractice {
    public static void main(String[] args){
        Test<Integer> iobj=new Test<Integer>(12312);
        System.out.println(iobj.getObj());
        Test<String> sobj=new Test<String>("wqweqwe");
        System.out.println(sobj.getObj());
    }

}
