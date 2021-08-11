/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.J.p;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.i;
import net.minecraft.client.w.G;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aE
extends I {
    public aE() {
        this("end_crystal");
    }

    @Override
    public q a(j j2, float f10) {
        b b10;
        a4 a42 = Q.P().aQ();
        String[] arrstring = I.c();
        b b11 = b10 = a42.c().get(p.class);
        if (arrstring != null) {
            if (!(b11 instanceof i)) {
                fU.h("Not an instance of RenderEnderCrystal: " + b10);
                return null;
            }
            b11 = b10;
        }
        i i2 = (i)b11;
        boolean bl2 = cq.P.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderEnderCrystal.modelEnderCrystal");
                return null;
            }
            bl2 = cq.a((Object)i2, cq.P, (Object)j2);
        }
        i2.a = f10;
        return i2;
    }

    private static gP a(gP gP2) {
        return gP2;
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
            G g10;
            block8: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof G)) {
                        return null;
                    }
                    j3 = j2;
                }
                g10 = (G)j3;
                bl2 = string.equals("cube");
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)g10, cq.aq, 0);
                    }
                    bl2 = string.equals("glass");
                }
                if (arrstring == null) break block8;
                if (bl2) {
                    return (c)cq.a((Object)g10, cq.aq, 1);
                }
                object = string;
                if (arrstring == null) break block9;
                bl2 = ((String)object).equals("base");
            }
            if (!bl2) return null;
            object = cq.a((Object)g10, cq.aq, 2);
        }
        c c10 = (c)object;
        return c10;
    }

    @Override
    public j e() {
        return new G(0.0f, true);
    }

    protected aE(String string) {
        super(p.class, string, 0.5f);
    }
}

