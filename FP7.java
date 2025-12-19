interface SomeTest<T> {
    boolean test(T n, T m);

}
class My class {
	static <T> boolean myGenMeth(T x, T y) {
		boolean resylt = false;
		//....
		return result;
	}
}
SomeTest<Integer>mRef = MyClass::<Integer>myGenMeth;
SomeTest <Integer> isractor = (n, d) -> (n%d)==0;
SomeTest <Double> isractorD = (n, d) -> (n%d) == 0;
SomeTest <String> isIn = (a, b) -> a.indexOf(b) != -1;
isIn.test("зачет", "Незачет")
interface StringFunc {
    String func(String str);
}
static String changeStr(StringFunc sf, String s) {
    return sf.func(s);
}
String outStr;
StringFunc reverse = (str) -> {
    String result = "";
    for(int i = str.length()-1; i>= 0; i--)
    result += str.charAt(i);
    return result;
};
outStr = changeStr(reverse, "Вторая строка");
outStr = changeStr((Str) -> {
    String result = "";
    char ch;
    for(int i=0;i<Str.length();i++){
        ch=Str.charAt(i);
        if(Character.isUpperCase(ch))
        result += Character.toLowerCase(ch);
        else
        result += Character.toUpperCase(ch);
    } return result;
}, outStr);
interface MyIOAction {
    boolean ioAction(reader rdr);
}
interface IntPrdicate {
    boolean test(int n);
}
class MyIntPredicates {
    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i=2; i <= n/i; i++) {
            if((n%i) == 0)
            return false;
       }
       
        return true;
    }
    
    static boolean isPositive(int n) {
        return n > 0;
    }
    static boolean isEven(int n) {
    return (n%2) == 0;
    }
}
static boolean numTest(IntPredicate p, int v) {
    return p.test(v);
}
class MyIntNum {
    private int v;
    MyIntNum(int x) {v = x;}
    int getNum() {return v;}
    
    boolean isFactor(int n) {
        return (v%n) == 0;
    }
}
