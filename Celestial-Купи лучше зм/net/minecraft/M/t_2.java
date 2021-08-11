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
import net.minecraft.m.m;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t
extends m {
    private final /* synthetic */ l a;
    private static final /* synthetic */ Logger d;

    static l a(t t2) {
        return t2.a;
    }

    public t(net.minecraft.g.d[] arrd, l l2) {
        super(arrd);
        this.a = l2;
    }

    static {
        d = LogManager.getLogger();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public d a(d d10, Random random, k k2) {
        block4: {
            d d11;
            block2: {
                block3: {
                    net.minecraft.k.m[] arrm = m.b();
                    d11 = d10;
                    if (arrm == null) break block2;
                    if (!d11.j()) break block3;
                    d.warn("Couldn't set data of loot item {}", (Object)d10);
                    if (arrm != null) break block4;
                }
                d11 = d10;
            }
            d11.a(this.a.a(random));
        }
        return d10;
    }
}

