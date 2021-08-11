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
import net.minecraft.M.G;
import net.minecraft.M.a0;
import net.minecraft.M.aA;
import net.minecraft.M.g;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.w.d;

public class aD
implements aO<G> {
    private final /* synthetic */ Map<a4, g> a;
    private static final /* synthetic */ v b;

    @Override
    public void b(a4 a42, aG<G> aG2) {
        g g10 = this.a.get(a42);
        int n2 = t.b();
        g g11 = g10;
        if (n2 == 0) {
            if (g11 == null) {
                g10 = new g(a42);
                this.a.put(a42, g10);
            }
            g11 = g10;
        }
        g11.b(aG2);
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public G a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        a0 a02 = a0.a(jsonObject.get("item"));
        aA aA2 = aA.a(jsonObject.get("durability"));
        aA aA3 = aA.a(jsonObject.get("delta"));
        return new G(a02, aA2, aA3);
    }

    @Override
    public v a() {
        return b;
    }

    public aD() {
        this.a = Maps.newHashMap();
    }

    public void a(k k2, d d10, int n2) {
        block3: {
            g g10;
            block2: {
                g g11 = this.a.get(k2.Y());
                int n3 = t.c();
                g10 = g11;
                if (n3 == 0) break block2;
                if (g10 == null) break block3;
                g10 = g11;
            }
            g10.a(d10, n2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static v b() {
        return b;
    }

    static {
        b = new v("item_durability_changed");
    }

    @Override
    public void a(a4 a42, aG<G> aG2) {
        block5: {
            g g10;
            int n2;
            block4: {
                g g11 = this.a.get(a42);
                n2 = t.b();
                g10 = g11;
                if (n2 != 0) break block4;
                if (g10 == null) break block5;
                g11.a(aG2);
                g10 = g11;
            }
            if (n2 == 0 && g10.a()) {
                g10 = this.a.remove(a42);
            }
        }
    }
}

