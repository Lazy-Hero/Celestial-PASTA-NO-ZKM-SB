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
import net.minecraft.az.g;
import net.minecraft.m.m;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class v
extends m {
    private static final /* synthetic */ Logger a;

    @Override
    public d a(d d10, Random random, k k2) {
        d d11;
        net.minecraft.k.m[] arrm = m.b();
        d d12 = d10;
        if (arrm != null) {
            if (d12.G()) {
                return d10;
            }
            d12 = g.a().b(d10);
        }
        d d13 = d11 = d12;
        if (arrm != null) {
            if (d13.G()) {
                a.warn("Couldn't smelt {} because there is no smelting recipe", (Object)d10);
                return d10;
            }
            d13 = d11.C();
        }
        d d14 = d13;
        d14.c(d10.t());
        return d14;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = LogManager.getLogger();
    }

    public v(net.minecraft.g.d[] arrd) {
        super(arrd);
    }
}

