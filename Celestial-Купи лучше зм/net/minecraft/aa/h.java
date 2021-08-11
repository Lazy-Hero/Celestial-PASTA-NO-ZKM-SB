/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.o.l;

public class h {
    protected /* synthetic */ int c;
    protected /* synthetic */ z d;
    protected /* synthetic */ Random a;
    private static /* synthetic */ boolean b;

    public void a(z z2, int n2, int n3, l l2) {
        int n4 = this.c;
        boolean bl2 = h.a();
        this.d = z2;
        this.a.setSeed(z2.C());
        long l3 = this.a.nextLong();
        long l4 = this.a.nextLong();
        int n5 = n2 - n4;
        while (n5 <= n2 + n4) {
            block3: {
                for (int i2 = n3 - n4; i2 <= n3 + n4; ++i2) {
                    long l5 = (long)n5 * l3;
                    long l6 = (long)i2 * l4;
                    this.a.setSeed(l5 ^ l6 ^ z2.C());
                    this.a(z2, n5, i2, n2, n3, l2);
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block3;
                }
                ++n5;
            }
            if (!bl2) continue;
        }
    }

    static {
        if (!h.b()) {
            h.b(true);
        }
    }

    protected void a(z z2, int n2, int n3, int n4, int n5, l l2) {
    }

    public h() {
        this.c = 8;
        this.a = new Random();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static void a(long l2, Random random, int n2, int n3) {
        random.setSeed(l2);
        long l3 = random.nextLong();
        long l4 = random.nextLong();
        long l5 = (long)n2 * l3;
        long l6 = (long)n3 * l4;
        random.setSeed(l5 ^ l6 ^ l2);
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        boolean bl2 = h.b();
        return !bl2;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }
}

