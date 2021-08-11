/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.m;

import java.util.Random;
import net.minecraft.aj.k;
import net.minecraft.aj.l;
import net.minecraft.k.h;
import net.minecraft.m.m;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class s
extends m {
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ l d;

    static l a(s s2) {
        return s2.d;
    }

    @Override
    public d a(d d10, Random random, k k2) {
        block1: {
            block0: {
                net.minecraft.k.m[] arrm = m.b();
                if (!d10.j()) break block0;
                float f10 = 1.0f - this.d.b(random);
                d10.a(h.d(f10 * (float)d10.E()));
                if (arrm != null) break block1;
            }
            a.warn("Couldn't set damage of loot item {}", (Object)d10);
        }
        return d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public s(net.minecraft.g.d[] arrd, l l2) {
        super(arrd);
        this.d = l2;
    }

    static {
        a = LogManager.getLogger();
    }
}

