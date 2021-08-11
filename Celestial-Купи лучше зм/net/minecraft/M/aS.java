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
import net.minecraft.M.P;
import net.minecraft.M.a3;
import net.minecraft.M.al;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ag.C;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class aS
implements aO<P> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, a3> a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(k k2, C c10) {
        block3: {
            a3 a32;
            block2: {
                a3 a33 = this.a.get(k2.Y());
                int n2 = t.b();
                a32 = a33;
                if (n2 != 0) break block2;
                if (a32 == null) break block3;
                a32 = a33;
            }
            a32.a(k2, c10);
        }
    }

    @Override
    public P a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        al al2 = al.a(jsonObject.get("entity"));
        return new P(al2);
    }

    public aS() {
        this.a = Maps.newHashMap();
    }

    @Override
    public v a() {
        return b;
    }

    static {
        b = new v("tame_animal");
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public void a(a4 a42, aG<P> aG2) {
        block5: {
            a3 a32;
            int n2;
            block4: {
                a3 a33 = this.a.get(a42);
                n2 = t.c();
                a32 = a33;
                if (n2 == 0) break block4;
                if (a32 == null) break block5;
                a33.a(aG2);
                a32 = a33;
            }
            if (n2 != 0 && a32.a()) {
                a32 = this.a.remove(a42);
            }
        }
    }

    static v b() {
        return b;
    }

    @Override
    public void b(a4 a42, aG<P> aG2) {
        a3 a32 = this.a.get(a42);
        int n2 = t.c();
        a3 a33 = a32;
        if (n2 != 0) {
            if (a33 == null) {
                a32 = new a3(a42);
                this.a.put(a42, a32);
            }
            a33 = a32;
        }
        a33.b(aG2);
    }
}

