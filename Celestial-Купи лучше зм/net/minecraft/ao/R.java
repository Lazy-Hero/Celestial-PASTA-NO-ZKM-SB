/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.ao.Q;
import net.minecraft.ao.bT;
import net.minecraft.ao.be;
import net.minecraft.ao.u;

public class R
extends Q {
    public /* synthetic */ List<be> g;
    public /* synthetic */ List<u> j;
    public /* synthetic */ List<be> h;
    public /* synthetic */ be i;

    public R() {
        this.j = Lists.newArrayList();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public R(Random random, int n2, int n3) {
        be be2;
        int n4;
        String[] arrstring;
        int n5;
        be[] arrbe;
        block3: {
            super(random, n2, n3);
            this.j = Lists.newArrayList();
            this.h = Lists.newArrayList();
            arrbe = bT.b();
            n5 = arrbe.length;
            arrstring = u.b();
            for (n4 = 0; n4 < n5; ++n4) {
                be2 = arrbe[n4];
                be2.c = 0;
                this.h.add(be2);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block3;
            }
            this.g = Lists.newArrayList();
            arrbe = bT.c();
            n5 = arrbe.length;
        }
        for (n4 = 0; n4 < n5; ++n4) {
            be2 = arrbe[n4];
            be2.c = 0;
            this.g.add(be2);
            if (arrstring != null) continue;
        }
    }
}

