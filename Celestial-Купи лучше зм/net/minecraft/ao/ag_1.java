/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ao.C;
import net.minecraft.ao.ap;
import net.minecraft.ao.as;
import net.minecraft.ao.by;
import net.minecraft.ap.j;
import net.minecraft.ar.ae;
import net.minecraft.k.n;

public class ag {
    public static void a(j j2, n n2, ae ae2, List<C> list, Random random) {
        ap ap2 = new ap(random);
        as as2 = new as(j2, random);
        as2.a(n2, ae2, list, ap2);
    }

    public static void a() {
        by.b(C.class, "WMP");
    }
}

