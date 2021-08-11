/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.X;
import net.minecraft.client.F.b;
import net.minecraft.client.F.f;
import net.minecraft.client.F.s;
import net.minecraft.client.w.aA;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class a7
extends I {
    @Override
    public j e() {
        return new aA();
    }

    public a7() {
        super(X.class, "head_humanoid", 0.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        Object object;
        block9: {
            boolean bl2;
            aA aA2;
            block8: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof aA)) {
                        return null;
                    }
                    j3 = j2;
                }
                aA2 = (aA)j3;
                bl2 = string.equals("head");
                if (arrstring != null) {
                    if (bl2) {
                        return aA2.i;
                    }
                    bl2 = string.equals("head2");
                }
                if (arrstring == null) break block8;
                if (!bl2) return null;
                object = cq.dh;
                if (arrstring == null) break block9;
                bl2 = ((K)object).c();
            }
            if (!bl2) {
                return null;
            }
            object = cq.a(aA2, cq.dh);
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

    private static gP a(gP gP2) {
        return gP2;
    }
}

