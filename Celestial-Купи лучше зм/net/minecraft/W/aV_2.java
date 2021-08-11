/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.W.aZ;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.h;
import net.minecraft.w.k;

public class aV
extends k {
    private final /* synthetic */ net.minecraft.ar.d s;
    private final /* synthetic */ String t;
    private static final /* synthetic */ Map<net.minecraft.ar.d, aV> u;

    public String b() {
        return net.minecraft.ab.a.a(this.t);
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, o o2) {
        list.add(this.b());
    }

    protected aV(String string, net.minecraft.ar.d d10) {
        this.t = "item.record." + string + ".desc";
        this.s = d10;
        this.f = 1;
        this.a(net.minecraft.ad.a.n);
        u.put(this.s, this);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block5: {
            boolean bl2;
            i i2;
            block6: {
                i i3;
                int n3;
                block4: {
                    i2 = z2.d(n2);
                    n3 = bl.g();
                    i3 = i2;
                    if (n3 == 0) break block4;
                    if (i3.b() != g.ct) break block5;
                    i3 = i2;
                }
                bl2 = i3.b(aZ.z);
                if (n3 == 0) break block6;
                if (bl2) break block5;
                bl2 = z2.C;
            }
            if (!bl2) {
                d d10 = j2.c(a32);
                ((aZ)g.ct).a(z2, n2, i2, d10);
                z2.a(null, 1010, n2, k.a(this));
                d10.b(1);
                j2.b(m.A);
            }
            return aX.SUCCESS;
        }
        return aX.PASS;
    }

    static {
        u = Maps.newHashMap();
    }

    @Override
    public h a(d d10) {
        return net.minecraft.w.h.RARE;
    }

    @Nullable
    public static aV a(net.minecraft.ar.d d10) {
        return u.get(d10);
    }

    public net.minecraft.ar.d a() {
        return this.s;
    }
}

