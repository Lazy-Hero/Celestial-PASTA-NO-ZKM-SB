/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.c;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.c.c;
import net.minecraft.c.d;
import net.minecraft.c.f;
import net.minecraft.c.h;
import net.minecraft.c.j;
import net.minecraft.c.k;
import net.minecraft.c.m;
import net.minecraft.c.o;
import net.minecraft.k.n;

public class l {
    private final /* synthetic */ List<h> f;
    private final /* synthetic */ f c;
    private final /* synthetic */ String d;
    private /* synthetic */ StackTraceElement[] e;
    private static /* synthetic */ String b;

    public static String a(int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(String.format("World: (%d,%d,%d)", n2, n3, n4));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        stringBuilder.append(", ");
        try {
            int n13 = n2 >> 4;
            n12 = n4 >> 4;
            n11 = n2 & 0xF;
            n10 = n3 >> 4;
            n9 = n4 & 0xF;
            n8 = n13 << 4;
            n7 = n12 << 4;
            n6 = (n13 + 1 << 4) - 1;
            n5 = (n12 + 1 << 4) - 1;
            stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", n11, n10, n9, n13, n12, n8, n7, n6, n5));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding chunk loc)");
        }
        stringBuilder.append(", ");
        try {
            int n14 = n2 >> 9;
            n12 = n4 >> 9;
            n11 = n14 << 5;
            n10 = n12 << 5;
            n9 = (n14 + 1 << 5) - 1;
            n8 = (n12 + 1 << 5) - 1;
            n7 = n14 << 9;
            n6 = n12 << 9;
            n5 = (n14 + 1 << 9) - 1;
            int n15 = (n12 + 1 << 9) - 1;
            stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", n14, n12, n11, n10, n9, n8, n7, n6, n5, n15));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        return stringBuilder.toString();
    }

    public static void b(String string) {
        b = string;
    }

    public static String a(n n2) {
        return l.a(n2.e(), n2.b(), n2.a());
    }

    public int b(int n2) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        String string = l.b();
        int n3 = arrstackTraceElement.length;
        if (string == null) {
            if (n3 <= 0) {
                return 0;
            }
            this.e = new StackTraceElement[arrstackTraceElement.length - 3 - n2];
            System.arraycopy(arrstackTraceElement, 3 + n2, this.e, 0, this.e.length);
            n3 = this.e.length;
        }
        return n3;
    }

    public void a(String string, Object object) {
        this.f.add(new h(string, object));
    }

    public void a(StringBuilder stringBuilder) {
        block7: {
            StackTraceElement[] arrstackTraceElement;
            String string;
            block9: {
                block8: {
                    stringBuilder.append("-- ").append(this.d).append(" --\n");
                    String string2 = l.b();
                    stringBuilder.append("Details:");
                    string = string2;
                    for (h h2 : this.f) {
                        stringBuilder.append("\n\t");
                        stringBuilder.append(h2.a());
                        stringBuilder.append(": ");
                        stringBuilder.append(h2.b());
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block7;
                    }
                    arrstackTraceElement = this.e;
                    if (string != null) break block8;
                    if (arrstackTraceElement == null) break block7;
                    arrstackTraceElement = this.e;
                }
                if (string != null) break block9;
                if (arrstackTraceElement.length <= 0) break block7;
                stringBuilder.append("\nStacktrace:");
                arrstackTraceElement = this.e;
            }
            for (StackTraceElement stackTraceElement : arrstackTraceElement) {
                stringBuilder.append("\n\tat ");
                stringBuilder.append(stackTraceElement);
                if (string == null) continue;
            }
        }
    }

    static {
        if (l.b() != null) {
            l.b("s5RzLb");
        }
    }

    public void a(String string, Throwable throwable) {
        this.a(string, (Object)throwable);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        block8: {
            StackTraceElement stackTraceElement3;
            String string;
            block7: {
                string = l.b();
                boolean bl2 = this.e.length;
                if (string != null) return bl2;
                if (!bl2) return false;
                StackTraceElement stackTraceElement4 = stackTraceElement;
                if (string == null) {
                    if (stackTraceElement4 == null) return false;
                    stackTraceElement4 = this.e[0];
                }
                StackTraceElement stackTraceElement5 = stackTraceElement4;
                boolean bl3 = stackTraceElement5.isNativeMethod();
                if (string != null) return bl3;
                if (bl3 != stackTraceElement.isNativeMethod()) return false;
                bl3 = stackTraceElement5.getClassName().equals(stackTraceElement.getClassName());
                if (string != null) return bl3;
                if (!bl3) return false;
                bl3 = stackTraceElement5.getFileName().equals(stackTraceElement.getFileName());
                if (string != null) return bl3;
                if (!bl3) return false;
                bl3 = stackTraceElement5.getMethodName().equals(stackTraceElement.getMethodName());
                if (string != null) return bl3;
                if (!bl3) return false;
                int n2 = stackTraceElement2 != null ? 1 : 0;
                int n3 = this.e.length;
                if (string == null) {
                    n3 = n3 > 1 ? 1 : 0;
                }
                if (n2 != n3) {
                    return false;
                }
                stackTraceElement3 = stackTraceElement2;
                if (string != null) break block7;
                if (stackTraceElement3 == null) break block8;
                stackTraceElement3 = this.e[1];
            }
            boolean bl4 = stackTraceElement3.equals(stackTraceElement2);
            if (string != null) return bl4;
            if (!bl4) {
                return false;
            }
        }
        this.e[0] = stackTraceElement;
        return true;
    }

    public static void a(l l2, n n2, K k2, int n3) {
        int n4 = K.b(k2);
        l2.a("Block type", new c(n4, k2));
        l2.a("Block data value", new m(n3));
        l2.a("Block location", new o(n2));
    }

    public static void a(l l2, n n2, i i2) {
        l2.a("Block", new j(i2));
        l2.a("Block location", new d(n2));
    }

    public void a(int n2) {
        StackTraceElement[] arrstackTraceElement = new StackTraceElement[this.e.length - n2];
        System.arraycopy(this.e, 0, arrstackTraceElement, 0, arrstackTraceElement.length);
        this.e = arrstackTraceElement;
    }

    public static String a(double d10, double d11, double d12) {
        return String.format("%.2f,%.2f,%.2f - %s", d10, d11, d12, l.a(new n(d10, d11, d12)));
    }

    public StackTraceElement[] a() {
        return this.e;
    }

    public l(f f10, String string) {
        this.f = Lists.newArrayList();
        this.e = new StackTraceElement[0];
        this.c = f10;
        this.d = string;
    }

    public static String b() {
        return b;
    }

    public void a(String string, k<String> k2) {
        try {
            this.a(string, k2.call());
        }
        catch (Throwable throwable) {
            this.a(string, throwable);
        }
    }
}

