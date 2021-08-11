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
import net.minecraft.M.R;
import net.minecraft.M.U;
import net.minecraft.M.aA;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.k.n;

public class ak
implements aO<R> {
    private static final /* synthetic */ v a;
    private final /* synthetic */ Map<a4, U> b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public ak() {
        this.b = Maps.newHashMap();
    }

    public void a(k k2, n n2) {
        U u2 = this.b.get(k2.Y());
        if (u2 != null) {
            double d10 = k2.a - (double)n2.e();
            double d11 = k2.ax - (double)n2.a();
            u2.a(d10 * d10 + d11 * d11);
        }
    }

    @Override
    public v a() {
        return a;
    }

    @Override
    public void a(a4 a42, aG<R> aG2) {
        block5: {
            U u2;
            int n2;
            block4: {
                U u3 = this.b.get(a42);
                n2 = t.b();
                u2 = u3;
                if (n2 != 0) break block4;
                if (u2 == null) break block5;
                u3.b(aG2);
                u2 = u3;
            }
            if (n2 == 0 && u2.a()) {
                u2 = this.b.remove(a42);
            }
        }
    }

    static {
        a = new v("used_ender_eye");
    }

    @Override
    public R a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        aA aA2 = aA.a(jsonObject.get("distance"));
        return new R(aA2);
    }

    @Override
    public void b(a4 a42, aG<R> aG2) {
        U u2 = this.b.get(a42);
        int n2 = t.b();
        U u3 = u2;
        if (n2 == 0) {
            if (u3 == null) {
                u2 = new U(a42);
                this.b.put(a42, u2);
            }
            u3 = u2;
        }
        u3.a(aG2);
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    static v b() {
        return a;
    }
}

