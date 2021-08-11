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
import net.minecraft.M.T;
import net.minecraft.M.a0;
import net.minecraft.M.al;
import net.minecraft.M.d;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ag.W;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class j
implements aO<T> {
    private final /* synthetic */ Map<a4, d> b;
    private static final /* synthetic */ v a;

    static v b() {
        return a;
    }

    @Override
    public void a(a4 a42, aG<T> aG2) {
        block5: {
            d d10;
            int n2;
            block4: {
                d d11 = this.b.get(a42);
                n2 = t.c();
                d10 = d11;
                if (n2 == 0) break block4;
                if (d10 == null) break block5;
                d11.a(aG2);
                d10 = d11;
            }
            if (n2 != 0 && d10.a()) {
                d10 = this.b.remove(a42);
            }
        }
    }

    static {
        a = new v("villager_trade");
    }

    public j() {
        this.b = Maps.newHashMap();
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    public void a(k k2, W w2, net.minecraft.w.d d10) {
        block3: {
            d d11;
            block2: {
                d d12 = this.b.get(k2.Y());
                int n2 = t.b();
                d11 = d12;
                if (n2 != 0) break block2;
                if (d11 == null) break block3;
                d11 = d12;
            }
            d11.a(k2, w2, d10);
        }
    }

    @Override
    public T a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        al al2 = al.a(jsonObject.get("villager"));
        a0 a02 = a0.a(jsonObject.get("item"));
        return new T(al2, a02);
    }

    @Override
    public v a() {
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(a4 a42, aG<T> aG2) {
        d d10 = this.b.get(a42);
        int n2 = t.c();
        d d11 = d10;
        if (n2 != 0) {
            if (d11 == null) {
                d10 = new d(a42);
                this.b.put(a42, d10);
            }
            d11 = d10;
        }
        d11.b(aG2);
    }
}

