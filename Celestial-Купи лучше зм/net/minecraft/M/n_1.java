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
import net.minecraft.M.I;
import net.minecraft.M.aA;
import net.minecraft.M.aT;
import net.minecraft.M.q;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.k.l;

public class n
implements aO<I> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, aT> a;

    @Override
    public void b(a4 a42, aG<I> aG2) {
        aT aT2 = this.a.get(a42);
        int n2 = t.b();
        aT aT3 = aT2;
        if (n2 == 0) {
            if (aT3 == null) {
                aT2 = new aT(a42);
                this.a.put(a42, aT2);
            }
            aT3 = aT2;
        }
        aT3.b(aG2);
    }

    static v b() {
        return b;
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public I a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        q q2 = q.a(jsonObject.get("distance"));
        aA aA2 = aA.a(jsonObject.get("duration"));
        return new I(q2, aA2);
    }

    @Override
    public v a() {
        return b;
    }

    public void a(k k2, l l2, int n2) {
        block3: {
            aT aT2;
            block2: {
                aT aT3 = this.a.get(k2.Y());
                int n3 = t.c();
                aT2 = aT3;
                if (n3 == 0) break block2;
                if (aT2 == null) break block3;
                aT2 = aT3;
            }
            aT2.a(k2, l2, n2);
        }
    }

    public n() {
        this.a = Maps.newHashMap();
    }

    @Override
    public void a(a4 a42, aG<I> aG2) {
        block5: {
            aT aT2;
            int n2;
            block4: {
                aT aT3 = this.a.get(a42);
                n2 = t.b();
                aT2 = aT3;
                if (n2 != 0) break block4;
                if (aT2 == null) break block5;
                aT3.a(aG2);
                aT2 = aT3;
            }
            if (n2 == 0 && aT2.a()) {
                aT2 = this.a.remove(a42);
            }
        }
    }

    static {
        b = new v("levitation");
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

