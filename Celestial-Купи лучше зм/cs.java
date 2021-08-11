/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import net.minecraft.Z.i;

public class cs {
    private static final /* synthetic */ ArrayDeque<int[]> a;
    private static final /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        b = 10;
        a = new ArrayDeque();
    }

    private static long a(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        String string = K.d();
        int[] arrn = new int[n2];
        for (int i2 = 0; i2 < n3; ++i2) {
            int[] arrn2 = (int[])arrn.clone();
            if (string == null) continue;
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static long a(Class class_, int n2, int n3) {
        long l2 = System.currentTimeMillis();
        String string = K.d();
        for (int i2 = 0; i2 < n3; ++i2) {
            Object[] arrobject = (Object[])Array.newInstance(class_, n2);
            if (string == null) continue;
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static long d(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        String string = K.d();
        for (int i2 = 0; i2 < n3; ++i2) {
            int[] arrn = (int[])Array.newInstance(Integer.TYPE, n2);
            if (string == null) continue;
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static long b(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        String string = K.d();
        for (int i2 = 0; i2 < n3; ++i2) {
            i[] arri = new i[n2];
            if (string == null) continue;
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    private static synchronized int[] a(int n2) {
        int[] arrn;
        block4: {
            int[] arrn2;
            block5: {
                int[] arrn3;
                block2: {
                    block3: {
                        arrn2 = a.pollLast();
                        String string = K.d();
                        arrn3 = arrn2;
                        if (string != null) break block2;
                        if (arrn3 == null) break block3;
                        arrn = arrn2;
                        if (string != null) break block4;
                        if (arrn.length >= n2) break block5;
                    }
                    arrn3 = new int[n2];
                }
                arrn2 = arrn3;
            }
            arrn = arrn2;
        }
        return arrn;
    }

    private static long c(int n2, int n3) {
        long l2 = System.currentTimeMillis();
        i[] arri = new i[n2];
        String string = K.d();
        for (int i2 = 0; i2 < n3; ++i2) {
            i[] arri2 = (i[])arri.clone();
            if (string == null) continue;
        }
        long l3 = System.currentTimeMillis();
        return l3 - l2;
    }

    public static void main(String[] arrstring) throws Exception {
        int n2 = 4096;
        int n3 = 500000;
        cs.d(n2, n3);
        cs.a(n2, n3);
        cs.b(n2, n3);
        cs.c(n2, n3);
        cs.a(i.class, n2, n3);
        long l2 = cs.d(n2, n3);
        long l3 = cs.a(n2, n3);
        long l4 = cs.b(n2, n3);
        long l5 = cs.c(n2, n3);
        long l6 = cs.a(i.class, n2, n3);
        fU.b("New: " + l2);
        fU.b("Clone: " + l3);
        fU.b("NewObj: " + l4);
        fU.b("CloneObj: " + l5);
        fU.b("NewObjDyn: " + l6);
    }

    public static synchronized void a(int[] arrn) {
        String string = K.d();
        int n2 = a.size();
        if (string == null && n2 < 10) {
            n2 = a.add(arrn) ? 1 : 0;
        }
    }
}

