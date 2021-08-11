/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 */
package net.minecraft.M;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.Map;
import net.minecraft.M.F;
import net.minecraft.M.a0;
import net.minecraft.M.aA;
import net.minecraft.M.k;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.h;
import net.minecraft.k.m;

public class a_
implements aO<F> {
    private final /* synthetic */ Map<a4, k> a;
    private static final /* synthetic */ v b;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public v a() {
        return b;
    }

    static {
        b = new v("inventory_changed");
    }

    @Override
    public void b(a4 a42, aG<F> aG2) {
        k k2 = this.a.get(a42);
        int n2 = t.b();
        k k3 = k2;
        if (n2 == 0) {
            if (k3 == null) {
                k2 = new k(a42);
                this.a.put(a42, k2);
            }
            k3 = k2;
        }
        k3.a(aG2);
    }

    @Override
    public F a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        F f10;
        block0: {
            JsonObject jsonObject2 = net.minecraft.ar.aG.a(jsonObject, "slots", new JsonObject());
            int n2 = t.b();
            aA aA2 = aA.a(jsonObject2.get("occupied"));
            aA aA3 = aA.a(jsonObject2.get("full"));
            aA aA4 = aA.a(jsonObject2.get("empty"));
            a0[] arra0 = a0.b(jsonObject.get("items"));
            f10 = new F(aA2, aA3, aA4, arra0);
            if (m.d()) break block0;
            t.b(++n2);
        }
        return f10;
    }

    static v b() {
        return b;
    }

    public void a(net.minecraft.i.k k2, h h2) {
        block3: {
            k k3;
            block2: {
                k k4 = this.a.get(k2.Y());
                int n2 = t.c();
                k3 = k4;
                if (n2 == 0) break block2;
                if (k3 == null) break block3;
                k3 = k4;
            }
            k3.a(h2);
        }
    }

    public a_() {
        this.a = Maps.newHashMap();
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public void a(a4 a42, aG<F> aG2) {
        block5: {
            k k2;
            int n2;
            block4: {
                k k3 = this.a.get(a42);
                n2 = t.c();
                k2 = k3;
                if (n2 == 0) break block4;
                if (k2 == null) break block5;
                k3.b(aG2);
                k2 = k3;
            }
            if (n2 != 0 && k2.a()) {
                k2 = this.a.remove(a42);
            }
        }
    }
}

