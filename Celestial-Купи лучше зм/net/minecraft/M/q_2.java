/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.m;

import java.util.Random;
import java.util.UUID;
import net.minecraft.B.X;
import net.minecraft.aj.k;
import net.minecraft.j.f;
import net.minecraft.m.m;
import net.minecraft.m.w;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class q
extends m {
    private final /* synthetic */ w[] a;
    private static final /* synthetic */ Logger d;

    static {
        d = LogManager.getLogger();
    }

    @Override
    public d a(d d10, Random random, k k2) {
        w[] arrw = this.a;
        net.minecraft.k.m[] arrm = m.b();
        for (w w2 : arrw) {
            UUID uUID;
            block4: {
                UUID uUID2;
                block3: {
                    uUID2 = uUID = w.c(w2);
                    if (arrm == null) break block3;
                    if (uUID2 != null) break block4;
                    uUID2 = UUID.randomUUID();
                }
                uUID = uUID2;
            }
            X x2 = w.a(w2)[random.nextInt(w.a(w2).length)];
            d10.a(w.e(w2), new f(uUID, w.b(w2), w.f(w2).b(random), w.d(w2)), x2);
            if (arrm != null) continue;
        }
        return d10;
    }

    public q(net.minecraft.g.d[] arrd, w[] arrw) {
        super(arrd);
        this.a = arrw;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static w[] a(q q2) {
        return q2.a;
    }
}

