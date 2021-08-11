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
import net.minecraft.M.aA;
import net.minecraft.M.b;
import net.minecraft.M.t;
import net.minecraft.M.x;
import net.minecraft.N.K;
import net.minecraft.a4;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class aG
implements aO<x> {
    private static final /* synthetic */ v a;
    private final /* synthetic */ Map<a4, b> b;

    @Override
    public v a() {
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public x a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        aA aA2 = aA.a(jsonObject.get("level"));
        return new x(aA2);
    }

    @Override
    public void a(a4 a42, net.minecraft.aG<x> aG2) {
        block5: {
            b b10;
            int n2;
            block4: {
                b b11 = this.b.get(a42);
                n2 = t.b();
                b10 = b11;
                if (n2 != 0) break block4;
                if (b10 == null) break block5;
                b11.a(aG2);
                b10 = b11;
            }
            if (n2 == 0 && b10.a()) {
                b10 = this.b.remove(a42);
            }
        }
    }

    public void a(k k2, K k3) {
        block3: {
            b b10;
            block2: {
                b b11 = this.b.get(k2.Y());
                int n2 = t.b();
                b10 = b11;
                if (n2 != 0) break block2;
                if (b10 == null) break block3;
                b10 = b11;
            }
            b10.a(k3);
        }
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    public aG() {
        this.b = Maps.newHashMap();
    }

    @Override
    public void b(a4 a42, net.minecraft.aG<x> aG2) {
        b b10 = this.b.get(a42);
        int n2 = t.c();
        b b11 = b10;
        if (n2 != 0) {
            if (b11 == null) {
                b10 = new b(a42);
                this.b.put(a42, b10);
            }
            b11 = b10;
        }
        b11.b(aG2);
    }

    static {
        a = new v("construct_beacon");
    }

    static v b() {
        return a;
    }
}

