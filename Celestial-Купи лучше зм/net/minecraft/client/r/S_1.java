/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.r;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.ag.I;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.j.h;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.L;
import net.minecraft.k.m;

public class S
extends u<I> {
    private static final /* synthetic */ Map<String, v> z;

    protected v a(I i2) {
        v v2;
        String string = i2.r();
        m[] arrm = b.b();
        v v3 = v2 = z.get(string);
        if (arrm == null) {
            if (v3 == null) {
                v2 = new v(string);
                Q.P().aN().a(v2, new h(i2.q()));
                z.put(string, v2);
            }
            v3 = v2;
        }
        return v3;
    }

    public S(a4 a42) {
        super(a42, new L(), 0.75f);
    }

    static {
        z = Maps.newHashMap();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

