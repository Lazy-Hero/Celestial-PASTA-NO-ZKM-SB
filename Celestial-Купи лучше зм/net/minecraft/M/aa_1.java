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
import net.minecraft.M.J;
import net.minecraft.M.Z;
import net.minecraft.M.a7;
import net.minecraft.M.q;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.k.l;

public class aa
implements aO<J> {
    private final /* synthetic */ Map<a4, a7> a;
    private static final /* synthetic */ v b;

    @Override
    public v a() {
        return b;
    }

    @Override
    public void a(a4 a42, aG<J> aG2) {
        block5: {
            a7 a72;
            int n2;
            block4: {
                a7 a73 = this.a.get(a42);
                n2 = t.b();
                a72 = a73;
                if (n2 != 0) break block4;
                if (a72 == null) break block5;
                a73.b(aG2);
                a72 = a73;
            }
            if (n2 == 0 && a72.a()) {
                a72 = this.a.remove(a42);
            }
        }
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    static {
        b = new v("nether_travel");
    }

    public aa() {
        this.a = Maps.newHashMap();
    }

    static v b() {
        return b;
    }

    @Override
    public J a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Z z2 = Z.a(jsonObject.get("entered"));
        Z z3 = Z.a(jsonObject.get("exited"));
        q q2 = q.a(jsonObject.get("distance"));
        return new J(z2, z3, q2);
    }

    public void a(k k2, l l2) {
        block3: {
            a7 a72;
            block2: {
                a7 a73 = this.a.get(k2.Y());
                int n2 = t.c();
                a72 = a73;
                if (n2 == 0) break block2;
                if (a72 == null) break block3;
                a72 = a73;
            }
            a72.a(k2.n(), l2, k2.a, k2.aF, k2.ax);
        }
    }

    @Override
    public void b(a4 a42, aG<J> aG2) {
        a7 a72 = this.a.get(a42);
        int n2 = t.c();
        a7 a73 = a72;
        if (n2 != 0) {
            if (a73 == null) {
                a72 = new a7(a42);
                this.a.put(a42, a72);
            }
            a73 = a72;
        }
        a73.a(aG2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

