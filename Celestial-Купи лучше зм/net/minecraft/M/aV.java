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
import net.minecraft.M.N;
import net.minecraft.M.i;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class aV
implements aO<N> {
    private final /* synthetic */ Map<a4, i> b;
    private static final /* synthetic */ v a;

    static v b() {
        return a;
    }

    static {
        a = new v("recipe_unlocked");
    }

    @Override
    public N a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        v v2 = new v(net.minecraft.ar.aG.f(jsonObject, "recipe"));
        net.minecraft.az.k k2 = net.minecraft.az.t.a(v2);
        if (k2 == null) {
            throw new JsonSyntaxException("Unknown recipe '" + v2 + "'");
        }
        return new N(k2);
    }

    @Override
    public void b(a4 a42, aG<N> aG2) {
        i i2 = this.b.get(a42);
        int n2 = t.c();
        i i3 = i2;
        if (n2 != 0) {
            if (i3 == null) {
                i2 = new i(a42);
                this.b.put(a42, i2);
            }
            i3 = i2;
        }
        i3.b(aG2);
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    public void a(k k2, net.minecraft.az.k k3) {
        block3: {
            i i2;
            block2: {
                i i3 = this.b.get(k2.Y());
                int n2 = t.c();
                i2 = i3;
                if (n2 == 0) break block2;
                if (i2 == null) break block3;
                i2 = i3;
            }
            i2.a(k3);
        }
    }

    public aV() {
        this.b = Maps.newHashMap();
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    @Override
    public v a() {
        return a;
    }

    @Override
    public void a(a4 a42, aG<N> aG2) {
        block5: {
            i i2;
            int n2;
            block4: {
                i i3 = this.b.get(a42);
                n2 = t.c();
                i2 = i3;
                if (n2 == 0) break block4;
                if (i2 == null) break block5;
                i3.a(aG2);
                i2 = i3;
            }
            if (n2 != 0 && i2.a()) {
                i2 = this.b.remove(a42);
            }
        }
    }
}

