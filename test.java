jshell> class A {                        jdk.
   ...>     int a;                       netscape.
   ...>     String s;                    s
   ...>     A(int ab, String S) {        sun.
   ...>         a = ab;                  this
   ...>         s = S;                   x
   ...> }
   ...> String getS() {
   ...>         return s;
   ...>     }
   ...> }
|  created class A

jshell> A abc = new A(3, "Строка");
abc ==> A@47c62251

jshell> A bca = abc
bca ==> A@47c62251

jshell> bca.getS()
$8 ==> "Строка"

jshell> int[] array1 = new int[10]
array1 ==> int[10] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }

jshell> array1[5] = 200;
$10 ==> 200

jshell> a
|  Error:
|  cannot find symbol
|    symbol:   variable a
|  a
|  ^

jshell> array1
array1 ==> int[10] { 0, 0, 0, 0, 0, 200, 0, 0, 0, 0 }

jshell> /history

/help intro
int x
int inc(x) {
    x++;
    return x;
}
int inc(int x) {
    x++;
    return x;
}
i
/help intro
/history
inc(5)
System.out.println($3)
class A {
    int a;
    String s;
    A(int ab, String S) {
        a = ab;
        s = S;
}
String getS() {
        return s;
    }
}
A abc = new A(3, "Строка");
A bca = abc
bca.getS()
int[] array1 = new int[10]
array1[5] = 200;
a
array1
