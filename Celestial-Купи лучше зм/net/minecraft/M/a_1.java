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
import net.minecraft.M.S;
import net.minecraft.M.a0;
import net.minecraft.M.ab;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.w.d;

public class a
implements aO<S> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, ab> a;

    static v b() {
        return b;
    }

    static {
        b = new v("used_totem");
    }

    public void a(k k2, d d10) {
        block3: {
            ab ab2;
            block2: {
                ab ab3 = this.a.get(k2.Y());
                int n2 = t.c();
                ab2 = ab3;
                if (n2 == 0) break block2;
                if (ab2 == null) break block3;
                ab2 = ab3;
            }
            ab2.a(d10);
        }
    }

    public a() {
        this.a = Maps.newHashMap();
    }

    @Override
    public v a() {
        return b;
    }

    @Override
    public void b(a4 a42, aG<S> aG2) {
        ab ab2 = this.a.get(a42);
        int n2 = t.b();
        ab ab3 = ab2;
        if (n2 == 0) {
            if (ab3 == null) {
                ab2 = new ab(a42);
                this.a.put(a42, ab2);
            }
            ab3 = ab2;
        }
        ab3.a(aG2);
    }

    @Override
    public void a(a4 a42, aG<S> aG2) {
        block5: {
            ab ab2;
            int n2;
            block4: {
                ab ab3 = this.a.get(a42);
                n2 = t.c();
                ab2 = ab3;
                if (n2 == 0) break block4;
                if (ab2 == null) break block5;
                ab3.b(aG2);
                ab2 = ab3;
            }
            if (n2 != 0 && ab2.a()) {
                ab2 = this.a.remove(a42);
            }
        }
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public S a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        a0 a02 = a0.a(jsonObject.get("item"));
        return new S(a02);
    }
}

