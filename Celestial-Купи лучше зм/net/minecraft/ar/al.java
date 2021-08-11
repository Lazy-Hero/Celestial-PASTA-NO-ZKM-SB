/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import java.util.List;
import java.util.Random;
import net.minecraft.ar.v;
import net.minecraft.ar.w;

public class al {
    public static int a(List<? extends w> list) {
        int n2;
        block2: {
            int n3 = 0;
            int n4 = v.b();
            int n5 = list.size();
            for (int i2 = 0; i2 < n5; ++i2) {
                w w2 = list.get(i2);
                n2 = n3 + w2.a;
                if (n4 == 0) {
                    n3 = n2;
                    if (n4 == 0) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    public static <T extends w> T a(Random random, List<T> list, int n2) {
        int n3 = v.d();
        int n4 = n2;
        if (n3 != 0) {
            if (n4 <= 0) {
                throw new IllegalArgumentException();
            }
            n4 = random.nextInt(n2);
        }
        int n5 = n4;
        return al.a(list, n5);
    }

    public static <T extends w> T a(Random random, List<T> list) {
        return al.a(random, list, al.a(list));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static <T extends w> T a(List<T> list, int n2) {
        int n3 = 0;
        int n4 = list.size();
        int n5 = v.d();
        while (n3 < n4) {
            w w2 = (w)list.get(n3);
            n2 -= w2.a;
            if (n5 != 0) {
                if (n2 < 0) {
                    return (T)w2;
                }
                ++n3;
            }
            if (n5 != 0) continue;
        }
        return null;
    }
}

