/*
 * Decompiled with CFR 0.150.
 */
package net;

import java.util.HashMap;
import java.util.Map;
import net.I;
import net.minecraft.ag.P;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aw;
import net.minecraft.client.w.a1;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class a5
extends I {
    private static /* synthetic */ Map<String, Integer> e;

    @Override
    public c a(j j2, String string) {
        block6: {
            int n2;
            a1 a12;
            block5: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof a1)) {
                        return null;
                    }
                    j3 = j2;
                }
                a12 = (a1)j3;
                Map<String, Integer> map = a5.a();
                n2 = map.containsKey(string);
                if (arrstring == null) break block5;
                if (n2 == 0) break block6;
                n2 = map.get(string);
            }
            int n3 = n2;
            return (c)cq.a((Object)a12, cq.bR, n3);
        }
        return null;
    }

    @Override
    public j e() {
        return new a1();
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aw aw2 = new aw(a42);
        aw2.i = j2;
        aw2.a = f10;
        return aw2;
    }

    private static Map<String, Integer> a() {
        String[] arrstring = I.c();
        Map<String, Integer> map = e;
        if (arrstring != null) {
            if (map != null) {
                return e;
            }
            e = new HashMap<String, Integer>();
            e.put("left_foot", 0);
            e.put("right_foot", 1);
            e.put("left_thigh", 2);
            e.put("right_thigh", 3);
            e.put("body", 4);
            e.put("left_arm", 5);
            e.put("right_arm", 6);
            e.put("head", 7);
            e.put("right_ear", 8);
            e.put("left_ear", 9);
            e.put("tail", 10);
            e.put("nose", 11);
            map = e;
        }
        return map;
    }

    static {
        e = null;
    }

    public a5() {
        super(P.class, "rabbit", 0.3f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

