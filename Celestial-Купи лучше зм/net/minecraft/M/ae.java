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
import net.minecraft.M.a2;
import net.minecraft.M.al;
import net.minecraft.M.t;
import net.minecraft.M.u;
import net.minecraft.U.E;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ag.C;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class ae
implements aO<u> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, a2> a;

    static v b() {
        return b;
    }

    static {
        b = new v("bred_animals");
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    public ae() {
        this.a = Maps.newHashMap();
    }

    @Override
    public v a() {
        return b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(a4 a42, aG<u> aG2) {
        a2 a22 = this.a.get(a42);
        int n2 = t.b();
        a2 a23 = a22;
        if (n2 == 0) {
            if (a23 == null) {
                a22 = new a2(a42);
                this.a.put(a42, a22);
            }
            a23 = a22;
        }
        a23.b(aG2);
    }

    public void a(k k2, C c10, C c11, E e10) {
        block3: {
            a2 a22;
            block2: {
                a2 a23 = this.a.get(k2.Y());
                int n2 = t.c();
                a22 = a23;
                if (n2 == 0) break block2;
                if (a22 == null) break block3;
                a22 = a23;
            }
            a22.a(k2, c10, c11, e10);
        }
    }

    @Override
    public u a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        al al2 = al.a(jsonObject.get("parent"));
        al al3 = al.a(jsonObject.get("partner"));
        al al4 = al.a(jsonObject.get("child"));
        return new u(al2, al3, al4);
    }

    @Override
    public void a(a4 a42, aG<u> aG2) {
        block5: {
            a2 a22;
            int n2;
            block4: {
                a2 a23 = this.a.get(a42);
                n2 = t.c();
                a22 = a23;
                if (n2 == 0) break block4;
                if (a22 == null) break block5;
                a23.a(aG2);
                a22 = a23;
            }
            if (n2 != 0 && a22.a()) {
                a22 = this.a.remove(a42);
            }
        }
    }
}

