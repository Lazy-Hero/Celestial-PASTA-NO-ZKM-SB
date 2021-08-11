/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.X;
import net.minecraft.client.F.b;
import net.minecraft.client.F.f;
import net.minecraft.client.F.s;
import net.minecraft.client.w.a9;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aX
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof a9)) {
                return null;
            }
            j3 = j2;
        }
        a9 a92 = (a9)j3;
        return string.equals("head") ? a92.i : null;
    }

    public aX() {
        super(X.class, "head_skeleton", 0.0f);
    }

    @Override
    public q a(j j2, float f10) {
        s s2;
        b b10 = b.e;
        String[] arrstring = I.c();
        s s3 = s2 = b10.a(X.class);
        if (arrstring != null) {
            if (!(s3 instanceof s)) {
                return null;
            }
            s3 = s2;
        }
        if (s3.b() == null) {
            s2 = new s();
            ((f)s2).a(b10);
        }
        boolean bl2 = cq.a1.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntitySkullRenderer.humanoidHead");
                return null;
            }
            bl2 = cq.a((Object)s2, cq.a1, (Object)j2);
        }
        return s2;
    }

    @Override
    public j e() {
        return new a9(0, 0, 64, 32);
    }
}

