/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import net.minecraft.A.D;
import net.minecraft.A.G;
import net.minecraft.A.H;
import net.minecraft.A.S;
import net.minecraft.A.b;
import net.minecraft.ah.t;
import net.minecraft.k.n;
import net.minecraft.k.o;

public class J {
    private static final /* synthetic */ G a;
    private static final /* synthetic */ G b;
    private static final /* synthetic */ G c;

    public static int c(t t2, n n2) {
        return J.a(t2, n2, c);
    }

    public static int a(t t2, n n2) {
        return J.a(t2, n2, b);
    }

    private static int a(t t2, n n2, G g10) {
        int n3;
        block2: {
            int n4 = 0;
            boolean bl2 = net.minecraft.A.b.c();
            int n5 = 0;
            int n6 = 0;
            for (o o2 : n.a(n2.a(-1, 0, -1), n2.a(1, 0, 1))) {
                int n7 = g10.a(t2.c(o2), o2);
                n4 += (n7 & 0xFF0000) >> 16;
                n5 += (n7 & 0xFF00) >> 8;
                n3 = n6 + (n7 & 0xFF);
                if (bl2) {
                    n6 = n3;
                    if (bl2) continue;
                }
                break block2;
            }
            n3 = (n4 / 9 & 0xFF) << 16 | (n5 / 9 & 0xFF) << 8 | n6 / 9 & 0xFF;
        }
        return n3;
    }

    static {
        b = new S();
        c = new H();
        a = new D();
    }

    public static int b(t t2, n n2) {
        return J.a(t2, n2, a);
    }
}

