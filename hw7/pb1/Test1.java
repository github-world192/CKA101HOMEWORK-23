import java.math.BigInteger;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {

        Collection<Object> list = new ArrayList<>();

        // 加入資料
        list.add(Integer.valueOf(100));
        list.add(Double.valueOf(3.14));
        list.add(Long.valueOf(21L));
        list.add(Short.valueOf("100"));
        list.add(Double.valueOf(5.1));
        list.add("Kitty");
        list.add(Integer.valueOf(100));
        list.add(new Object());
        list.add("Snoopy");
        list.add(new BigInteger("1000"));

        System.out.println("=== 原始資料 ===");

        // Iterator
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 傳統for
        System.out.println("=== 傳統for ===");
        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // foreach
        System.out.println("=== foreach ===");
        for (Object obj : list) {
            System.out.println(obj);
        }

        // 移除非Number
        Iterator<Object> it2 = list.iterator();
        while (it2.hasNext()) {
            Object obj = it2.next();
            if (!(obj instanceof Number)) {
                it2.remove();
            }
        }

        System.out.println("=== 移除非Number後 ===");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
