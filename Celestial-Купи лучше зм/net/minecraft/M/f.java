/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package net.minecraft.M;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import net.minecraft.M.M;
import net.minecraft.M.Z;
import net.minecraft.M.aE;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class f
implements aO<M> {
    private final /* synthetic */ v a;
    private final /* synthetic */ Map<a4, aE> b;

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    @Override
    public void b(a4 a42, aG<M> aG2) {
        aE aE2 = this.b.get(a42);
        int n2 = t.b();
        aE aE3 = aE2;
        if (n2 == 0) {
            if (aE3 == null) {
                aE2 = new aE(a42);
                this.b.put(a42, aE2);
            }
            aE3 = aE2;
        }
        aE3.a(aG2);
    }

    public void a(k k2) {
        block3: {
            aE aE2;
            block2: {
                aE aE3 = this.b.get(k2.Y());
                int n2 = t.c();
                aE2 = aE3;
                if (n2 == 0) break block2;
                if (aE2 == null) break block3;
                aE2 = aE3;
            }
            aE2.a(k2.n(), k2.a, k2.aF, k2.ax);
        }
    }

    @Override
    public v a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a4 a42, aG<M> aG2) {
        block5: {
            aE aE2;
            int n2;
            block4: {
                aE aE3 = this.b.get(a42);
                n2 = t.c();
                aE2 = aE3;
                if (n2 == 0) break block4;
                if (aE2 == null) break block5;
                aE3.b(aG2);
                aE2 = aE3;
            }
            if (n2 != 0 && aE2.a()) {
                aE2 = this.b.remove(a42);
            }
        }
    }

    public f(v v2) {
        this.b = Maps.newHashMap();
        this.a = v2;
    }

    @Override
    public M a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Z z2 = Z.a((JsonElement)jsonObject);
        return new M(this.a, z2);
    }
}

