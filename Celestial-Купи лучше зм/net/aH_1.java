/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.X;
import net.minecraft.client.F.b;
import net.minecraft.client.F.f;
import net.minecraft.client.F.s;
import net.minecraft.client.w.E;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aH
extends I {
    @Override
    public j e() {
        return new E(0.0f);
    }

    public aH() {
        super(X.class, "head_dragon", 0.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        Object object;
        block7: {
            boolean bl2;
            E e10;
            block6: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof E)) {
                        return null;
                    }
                    j3 = j2;
                }
                e10 = (E)j3;
                bl2 = string.equals("head");
                if (arrstring == null) break block6;
                if (bl2) {
                    return (c)cq.a(e10, cq.cz);
                }
                object = string;
                if (arrstring == null) break block7;
                bl2 = ((String)object).equals("jaw");
            }
            if (!bl2) return null;
            object = cq.a(e10, cq.bf);
        }
        c c10 = (c)object;
        return c10;
    }

    @Override
    public q a(j j2, float f10) {
        b b10 = b.e;
        s s2 = b10.a(X.class);
        String[] arrstring = I.c();
        s s3 = s2;
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
        boolean bl2 = cq.d5.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntitySkullRenderer.dragonHead");
                return null;
            }
            bl2 = cq.a((Object)s2, cq.d5, (Object)j2);
        }
        return s2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

