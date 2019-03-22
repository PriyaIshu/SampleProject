class Demo1
{
static int a=1000;
int b=2000;
Demo1()
{
}
Demo1(int a)
{
this(10,50);
System.out.println("1 Argumented Constructor");
int b=1000;
System.out.println(a+b);
}
Demo1(int a,int b)
{
System.out.println("2 Argumented Constructor");
}
static int add(int a,int b)
{
System.out.println("Static Method");
return a+b;
}
void add1(int a,int b)
{
System.out.println("Non-Static Method");
int sum=this.a+b;
System.out.println("Sum="+sum);
}
public static void main(String args[])
{
int a=10;
int  b=100;
System.out.println(a);
System.out.println(b);
Demo1 d=new Demo1();
Demo1 d1=new Demo1(10);
System.out.println(Demo1.a);
System.out.println(d.b);
int x=Demo1.add(10,10);
System.out.println("Add value="+x);
d1.add1(100,200);
}
}