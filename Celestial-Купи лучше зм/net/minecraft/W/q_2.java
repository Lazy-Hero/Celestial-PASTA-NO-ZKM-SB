/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.K.i;
import net.minecraft.K.k;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.u.a;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.o;
import net.minecraft.z.f;
import net.minecraft.z.h;

public class q
extends o {
    @Override
    public d b() {
        return k.a(super.b(), net.minecraft.u.a.c);
    }

    @Override
    public void a(net.minecraft.ad.a a10, a2<d> a22) {
        int n2 = bl.g();
        if (this.b(a10)) {
            for (i i2 : i.d) {
                boolean bl2 = i2.a().isEmpty();
                if (n2 != 0 && !bl2) {
                    bl2 = a22.add(k.a(new d(this), i2));
                }
                if (n2 != 0) continue;
            }
        }
    }

    @Override
    public f a(z z2, d d10, B b10) {
        h h2 = new h(z2, b10);
        h2.b(d10);
        return h2;
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, net.minecraft.client.B.o o2) {
        k.a(d10, list, 0.125f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String h(d d10) {
        return net.minecraft.ab.a.a(k.d(d10).b("tipped_arrow.effect."));
    }
}

