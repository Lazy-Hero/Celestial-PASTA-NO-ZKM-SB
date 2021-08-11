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
import net.minecraft.M.al;
import net.minecraft.M.e;
import net.minecraft.M.t;
import net.minecraft.M.z;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ag.W;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class ay
implements aO<z> {
    private final /* synthetic */ Map<a4, e> a;
    private static final /* synthetic */ v b;

    @Override
    public void a(a4 a42, aG<z> aG2) {
        block5: {
            e e10;
            int n2;
            block4: {
                e e11 = this.a.get(a42);
                n2 = t.c();
                e10 = e11;
                if (n2 == 0) break block4;
                if (e10 == null) break block5;
                e11.a(aG2);
                e10 = e11;
            }
            if (n2 != 0 && e10.a()) {
                e10 = this.a.remove(a42);
            }
        }
    }

    @Override
    public void b(a4 a42, aG<z> aG2) {
        e e10 = this.a.get(a42);
        int n2 = t.c();
        e e11 = e10;
        if (n2 != 0) {
            if (e11 == null) {
                e10 = new e(a42);
                this.a.put(a42, e10);
            }
            e11 = e10;
        }
        e11.b(aG2);
    }

    @Override
    public v a() {
        return b;
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    public void a(k k2, net.minecraft.T.a4 a42, W w2) {
        block3: {
            e e10;
            block2: {
                e e11 = this.a.get(k2.Y());
                int n2 = t.b();
                e10 = e11;
                if (n2 != 0) break block2;
                if (e10 == null) break block3;
                e10 = e11;
            }
            e10.a(k2, a42, w2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static v b() {
        return b;
    }

    public ay() {
        this.a = Maps.newHashMap();
    }

    static {
        b = new v("cured_zombie_villager");
    }

    @Override
    public z a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        al al2 = al.a(jsonObject.get("zombie"));
        al al3 = al.a(jsonObject.get("villager"));
        return new z(al2, al3);
    }
}

