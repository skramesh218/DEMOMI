class STUDENT
{
    String sname;
    int Regno;
    int sem;
    String dname;
    void getSTUDENT(String sn,int re,int se,String dn)
    {
        sname=sn;
        Regno=re;
        sem=se;
        dname=dn;
    }

}
class TEST extends STUDENT
{
    int test1;
    int test2;
    int test3;
    void gettest(int t1,int t2,int t3)
    {
        test1=t1;
        test2=t2;
        test3=t3;
    }
}
interface sports
{
    final float s=0.5f;
    abstract void display();
}
class marks extends TEST implements sports
{
     public void display()
    {
      System.out.println("sname\t\tRegno\t\tsem\t\tdname");
      System.out.println("--------------------------------------------------------");
      System.out.println(sname+"\t\t"+Regno+"\t\t"+sem+"\t\t"+dname);
      System.out.println("test1\t\ttest2\t\ttest3");
      System.out.println("-----------------------------------------");
      System.out.println(test1+"\t\t"+test2+"\t\t"+test3);
    }
}
class demoMI
{
    public static void main(String arg[])
    {
        marks obj1=new marks();
        obj1.getSTUDENT("ramesh",141,4,"CSE");
        obj1.gettest(90,76,81);
        obj1.display();
    }
}
