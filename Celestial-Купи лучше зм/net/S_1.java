/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.M;
import net.minecraft.T.aS;
import net.minecraft.client.Q;
import net.minecraft.client.r.C;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.t;
import net.q;

public class S
extends M {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        Object object;
        block7: {
            boolean bl2;
            t t2;
            block6: {
                c c10;
                String[] arrstring = I.c();
                if (!(j2 instanceof t)) {
                    return null;
                }
                c c11 = c10 = super.a(j2, string);
                if (arrstring == null) return c11;
                if (c11 != null) {
                    c11 = c10;
                    return c11;
                }
                t2 = (t)j2;
                bl2 = string.equals("left_wing");
                if (arrstring == null) break block6;
                if (bl2) {
                    return (c)cq.a(t2, cq.aX);
                }
                object = string;
                if (arrstring == null) break block7;
                bl2 = ((String)object).equals("right_wing");
            }
            if (!bl2) return null;
            object = cq.a(t2, cq.ab);
        }
        c c12 = (c)object;
        return c12;
    }

    @Override
    public j e() {
        return new t();
    }

    public S() {
        super(aS.class, "vex", 0.3f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        C c10 = new C(a42);
        c10.i = j2;
        c10.a = f10;
        return c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

