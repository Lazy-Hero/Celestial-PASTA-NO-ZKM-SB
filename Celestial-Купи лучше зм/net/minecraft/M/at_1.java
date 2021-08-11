/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft.M;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import net.minecraft.K.i;
import net.minecraft.M.aH;
import net.minecraft.M.t;
import net.minecraft.M.v;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.b.e;
import net.minecraft.i.k;

public class at
implements aO<v> {
    private final /* synthetic */ Map<a4, aH> a;
    private static final /* synthetic */ net.minecraft.ar.v b;

    public void a(k k2, i i2) {
        block3: {
            aH aH2;
            block2: {
                aH aH3 = this.a.get(k2.Y());
                int n2 = t.b();
                aH2 = aH3;
                if (n2 != 0) break block2;
                if (aH2 == null) break block3;
                aH2 = aH3;
            }
            aH2.a(i2);
        }
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    @Override
    public net.minecraft.ar.v a() {
        return b;
    }

    @Override
    public void b(a4 a42, aG<v> aG2) {
        aH aH2 = this.a.get(a42);
        int n2 = t.c();
        aH aH3 = aH2;
        if (n2 != 0) {
            if (aH3 == null) {
                aH2 = new aH(a42);
                this.a.put(a42, aH2);
            }
            aH3 = aH2;
        }
        aH3.b(aG2);
    }

    @Override
    public void a(a4 a42, aG<v> aG2) {
        block5: {
            aH aH2;
            int n2;
            block4: {
                aH aH3 = this.a.get(a42);
                n2 = t.c();
                aH2 = aH3;
                if (n2 == 0) break block4;
                if (aH2 == null) break block5;
                aH3.a(aG2);
                aH2 = aH3;
            }
            if (n2 != 0 && aH2.a()) {
                aH2 = this.a.remove(a42);
            }
        }
    }

    @Override
    public v a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        i i2 = null;
        int n2 = t.b();
        if (jsonObject.has("potion")) {
            net.minecraft.ar.v v2 = new net.minecraft.ar.v(net.minecraft.ar.aG.f(jsonObject, "potion"));
            e<net.minecraft.ar.v, i> e10 = i.d;
            net.minecraft.ar.v v3 = v2;
            if (n2 == 0) {
                if (e10.a(v3) == false) {
                    throw new JsonSyntaxException("Unknown potion '" + v2 + "'");
                }
                e10 = i.d;
                v3 = v2;
            }
            i2 = e10.a(v3);
        }
        return new v(i2);
    }

    static {
        b = new net.minecraft.ar.v("brewed_potion");
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    public at() {
        this.a = Maps.newHashMap();
    }

    static net.minecraft.ar.v b() {
        return b;
    }
}

