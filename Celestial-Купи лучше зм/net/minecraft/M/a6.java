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
import net.minecraft.M.Q;
import net.minecraft.M.l;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class a6
implements aO<Q> {
    public static final /* synthetic */ v a;
    private final /* synthetic */ Map<a4, l> b;

    @Override
    public Q a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return new Q();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a6() {
        this.b = Maps.newHashMap();
    }

    @Override
    public void b(a4 a42, aG<Q> aG2) {
        l l2 = this.b.get(a42);
        int n2 = t.b();
        l l3 = l2;
        if (n2 == 0) {
            if (l3 == null) {
                l2 = new l(a42);
                this.b.put(a42, l2);
            }
            l3 = l2;
        }
        l3.b(aG2);
    }

    @Override
    public v a() {
        return a;
    }

    public void a(k k2) {
        block3: {
            l l2;
            block2: {
                l l3 = this.b.get(k2.Y());
                int n2 = t.b();
                l2 = l3;
                if (n2 != 0) break block2;
                if (l2 == null) break block3;
                l2 = l3;
            }
            l2.a();
        }
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    static {
        a = new v("tick");
    }

    @Override
    public void a(a4 a42, aG<Q> aG2) {
        block5: {
            l l2;
            int n2;
            block4: {
                l l3 = this.b.get(a42);
                n2 = t.c();
                l2 = l3;
                if (n2 == 0) break block4;
                if (l2 == null) break block5;
                l3.a(aG2);
                l2 = l3;
            }
            if (n2 != 0 && l2.b()) {
                l2 = this.b.remove(a42);
            }
        }
    }
}

