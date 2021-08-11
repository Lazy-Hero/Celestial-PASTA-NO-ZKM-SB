/*
 * Decompiled with CFR 0.150.
 */
package net;

import java.util.HashMap;
import java.util.Map;
import net.I;
import net.minecraft.client.Q;
import net.minecraft.client.r.S;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.L;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aF
extends I {
    private static /* synthetic */ Map<String, Integer> e;

    static {
        e = null;
    }

    public aF() {
        super(net.minecraft.ag.I.class, "horse", 0.75f);
    }

    protected aF(Class class_, String string, float f10) {
        super(class_, string, f10);
    }

    @Override
    public c a(j j2, String string) {
        block6: {
            int n2;
            L l2;
            block5: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof L)) {
                        return null;
                    }
                    j3 = j2;
                }
                l2 = (L)j3;
                Map<String, Integer> map = aF.a();
                n2 = map.containsKey(string);
                if (arrstring == null) break block5;
                if (n2 == 0) break block6;
                n2 = map.get(string);
            }
            int n3 = n2;
            return (c)cq.a((Object)l2, cq.aP, n3);
        }
        return null;
    }

    @Override
    public j e() {
        return new L();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        S s2 = new S(a42);
        s2.i = j2;
        s2.a = f10;
        return s2;
    }

    private static Map<String, Integer> a() {
        String[] arrstring = I.c();
        Map<String, Integer> map = e;
        if (arrstring != null) {
            if (map != null) {
                return e;
            }
            e = new HashMap<String, Integer>();
            e.put("head", 0);
            e.put("upper_mouth", 1);
            e.put("lower_mouth", 2);
            e.put("horse_left_ear", 3);
            e.put("horse_right_ear", 4);
            e.put("mule_left_ear", 5);
            e.put("mule_right_ear", 6);
            e.put("neck", 7);
            e.put("horse_face_ropes", 8);
            e.put("mane", 9);
            e.put("body", 10);
            e.put("tail_base", 11);
            e.put("tail_middle", 12);
            e.put("tail_tip", 13);
            e.put("back_left_leg", 14);
            e.put("back_left_shin", 15);
            e.put("back_left_hoof", 16);
            e.put("back_right_leg", 17);
            e.put("back_right_shin", 18);
            e.put("back_right_hoof", 19);
            e.put("front_left_leg", 20);
            e.put("front_left_shin", 21);
            e.put("front_left_hoof", 22);
            e.put("front_right_leg", 23);
            e.put("front_right_shin", 24);
            e.put("front_right_hoof", 25);
            e.put("mule_left_chest", 26);
            e.put("mule_right_chest", 27);
            e.put("horse_saddle_bottom", 28);
            e.put("horse_saddle_front", 29);
            e.put("horse_saddle_back", 30);
            e.put("horse_left_saddle_rope", 31);
            e.put("horse_left_saddle_metal", 32);
            e.put("horse_right_saddle_rope", 33);
            e.put("horse_right_saddle_metal", 34);
            e.put("horse_left_face_metal", 35);
            e.put("horse_right_face_metal", 36);
            e.put("horse_left_rein", 37);
            e.put("horse_right_rein", 38);
            map = e;
        }
        return map;
    }
}

