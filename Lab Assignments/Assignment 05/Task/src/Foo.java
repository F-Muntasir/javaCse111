public class Foo{
   public int bar, buz;
   public Foo(int bar, int buz){
             this.bar = bar;
             this.buz = buz;
           }
 }
 class Quiz5{
   public int sum = 12, x = 2, y = 6;
   public Foo foo;
   public Quiz5(Foo f){
             foo = f;
             int x = this.foo.buz + y;
             sum = sum + (f.bar--) + y;
             System.out.println(foo.bar + " " + sum + " " + x);
             sum -= 10;
           }
   public void methodA(int bar, int buz){
             bar = 3 + bar - this.foo.bar;
             x = bar + 12 + y;
             y = foo.buz + buz + bar;
             sum = y + methodB(foo.buz, foo) + foo.buz;
             System.out.println(bar + " " + y + " " + sum);
           }
   public int methodB(int bar, Foo buz){
             int sum = bar + buz.bar + x;
             buz.buz = sum + this.sum;
             System.out.println(bar + " " + buz.buz + " " + sum);
             return sum;
           }
 }