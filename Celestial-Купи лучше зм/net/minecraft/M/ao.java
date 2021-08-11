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
import net.minecraft.M.B;
import net.minecraft.M.a0;
import net.minecraft.M.aA;
import net.minecraft.M.m;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.w.d;

public class ao
implements aO<B> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, m> a;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        b = new v("enchanted_item");
    }

    static v b() {
        return b;
    }

    @Override
    public void a(a4 a42, aG<B> aG2) {
        block5: {
            m m2;
            int n2;
            block4: {
                m m3 = this.a.get(a42);
                n2 = t.c();
                m2 = m3;
                if (n2 == 0) break block4;
                if (m2 == null) break block5;
                m3.a(aG2);
                m2 = m3;
            }
            if (n2 != 0 && m2.a()) {
                m2 = this.a.remove(a42);
            }
        }
    }

    public void a(k k2, d d10, int n2) {
        block3: {
            m m2;
            block2: {
                m m3 = this.a.get(k2.Y());
                int n3 = t.b();
                m2 = m3;
                if (n3 != 0) break block2;
                if (m2 == null) break block3;
                m2 = m3;
            }
            m2.a(d10, n2);
        }
    }

    @Override
    public void b(a4 a42, aG<B> aG2) {
        m m2 = this.a.get(a42);
        int n2 = t.b();
        m m3 = m2;
        if (n2 == 0) {
            if (m3 == null) {
                m2 = new m(a42);
                this.a.put(a42, m2);
            }
            m3 = m2;
        }
        m3.b(aG2);
    }

    public ao() {
        this.a = Maps.newHashMap();
    }

    @Override
    public B a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        a0 a02 = a0.a(jsonObject.get("item"));
        aA aA2 = aA.a(jsonObject.get("levels"));
        return new B(a02, aA2);
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public v a() {
        return b;
    }
}

