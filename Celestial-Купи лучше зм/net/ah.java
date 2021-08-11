/*
 * Decompiled with CFR 0.150.
 */
package net;

import java.util.HashMap;
import java.util.Map;
import net.I;
import net.minecraft.client.Q;
import net.minecraft.client.r.Y;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.S;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ah
extends I {
    private static /* synthetic */ Map<String, Integer> e;

    private static Map<String, Integer> a() {
        String[] arrstring = I.c();
        Map<String, Integer> map = e;
        if (arrstring != null) {
            if (map != null) {
                return e;
            }
            e = new HashMap<String, Integer>();
            e.put("back_left_leg", 0);
            e.put("back_right_leg", 1);
            e.put("front_left_leg", 2);
            e.put("front_right_leg", 3);
            e.put("tail", 4);
            e.put("tail2", 5);
            e.put("head", 6);
            e.put("body", 7);
            map = e;
        }
        return map;
    }

    public ah() {
        super(net.minecraft.ag.S.class, "ocelot", 0.4f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        Y y2 = new Y(a42);
        y2.i = j2;
        y2.a = f10;
        return y2;
    }

    static {
        e = null;
    }

    @Override
    public c a(j j2, String string) {
        block6: {
            int n2;
            S s2;
            block5: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof S)) {
                        return null;
                    }
                    j3 = j2;
                }
                s2 = (S)j3;
                Map<String, Integer> map = ah.a();
                n2 = map.containsKey(string);
                if (arrstring == null) break block5;
                if (n2 == 0) break block6;
                n2 = map.get(string);
            }
            int n3 = n2;
            return (c)cq.a((Object)s2, cq.c7, n3);
        }
        return null;
    }

    @Override
    public j e() {
        return new S();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

