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
import net.minecraft.M.A;
import net.minecraft.M.X;
import net.minecraft.M.h;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class s
implements aO<A> {
    private final /* synthetic */ Map<a4, h> a;
    private static final /* synthetic */ v b;

    public s() {
        this.a = Maps.newHashMap();
    }

    public void a(k k2) {
        block3: {
            h h2;
            block2: {
                h h3 = this.a.get(k2.Y());
                int n2 = t.c();
                h2 = h3;
                if (n2 == 0) break block2;
                if (h2 == null) break block3;
                h2 = h3;
            }
            h2.a(k2);
        }
    }

    @Override
    public v a() {
        return b;
    }

    static v b() {
        return b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        b = new v("effects_changed");
    }

    @Override
    public void a(a4 a42, aG<A> aG2) {
        block5: {
            h h2;
            int n2;
            block4: {
                h h3 = this.a.get(a42);
                n2 = t.c();
                h2 = h3;
                if (n2 == 0) break block4;
                if (h2 == null) break block5;
                h3.a(aG2);
                h2 = h3;
            }
            if (n2 != 0 && h2.a()) {
                h2 = this.a.remove(a42);
            }
        }
    }

    @Override
    public void b(a4 a42, aG<A> aG2) {
        h h2 = this.a.get(a42);
        int n2 = t.b();
        h h3 = h2;
        if (n2 == 0) {
            if (h3 == null) {
                h2 = new h(a42);
                this.a.put(a42, h2);
            }
            h3 = h2;
        }
        h3.b(aG2);
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public A a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        X x2 = X.a(jsonObject.get("effects"));
        return new A(x2);
    }
}

