/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.C;

import net.minecraft.C.E;
import net.minecraft.C.F;
import net.minecraft.C.K;
import net.minecraft.C.W;
import net.minecraft.C.m;
import net.minecraft.ar.aw;

public class H {
    private static F a(F f10) {
        return f10;
    }

    public static <T extends W> void a(K<T> k2, T t2, aw aw2) throws F {
        block3: {
            aw aw3;
            block2: {
                int n2 = m.b();
                aw3 = aw2;
                if (n2 != 0) break block2;
                if (aw3.d()) break block3;
                aw3 = aw2;
            }
            aw3.a(new E(k2, t2));
            throw F.a;
        }
    }
}

