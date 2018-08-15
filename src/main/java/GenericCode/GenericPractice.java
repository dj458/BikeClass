package GenericCode;



class Test<T,U>
{
    T obj;
    U obj2;
    Test(T obj, U obj2)
    {
        this.obj=obj;
        this.obj2=obj2;
    }
    public T getObj(){return this.obj;}
}
public class GenericPractice {
    public static void main(String[] args){
        Test<Integer,String> iobj=new Test<Integer,String>(12312,"we2e21");
        System.out.println(iobj.obj.toString()+iobj.obj2.toString());
        Test<String,String> sobj=new Test<String,String>("wqweqwe","werwewqe");
        System.out.println(sobj.obj.toString()+sobj.obj2.toString());
        Test<Boolean,String> bobj=new Test<Boolean,String>(true,"qweqwe");
        System.out.println(bobj.obj.toString()+bobj.obj2.toString());
    }

}
