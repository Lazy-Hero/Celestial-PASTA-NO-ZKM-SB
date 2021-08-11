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
import net.minecraft.M.a0;
import net.minecraft.M.c;
import net.minecraft.M.t;
import net.minecraft.M.y;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.v;
import net.minecraft.i.k;
import net.minecraft.w.d;

public class Y
implements aO<y> {
    private static final /* synthetic */ v a;
    private final /* synthetic */ Map<a4, c> b;

    @Override
    public void a(a4 a42, aG<y> aG2) {
        block5: {
            c c10;
            int n2;
            block4: {
                c c11 = this.b.get(a42);
                n2 = t.c();
                c10 = c11;
                if (n2 == 0) break block4;
                if (c10 == null) break block5;
                c11.b(aG2);
                c10 = c11;
            }
            if (n2 != 0 && c10.a()) {
                c10 = this.b.remove(a42);
            }
        }
    }

    static {
        a = new v("consume_item");
    }

    @Override
    public void b(a4 a42, aG<y> aG2) {
        c c10 = this.b.get(a42);
        int n2 = t.b();
        c c11 = c10;
        if (n2 == 0) {
            if (c11 == null) {
                c10 = new c(a42);
                this.b.put(a42, c10);
            }
            c11 = c10;
        }
        c11.a(aG2);
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    @Override
    public v a() {
        return a;
    }

    public void a(k k2, d d10) {
        block3: {
            c c10;
            block2: {
                c c11 = this.b.get(k2.Y());
                int n2 = t.c();
                c10 = c11;
                if (n2 == 0) break block2;
                if (c10 == null) break block3;
                c10 = c11;
            }
            c10.a(d10);
        }
    }

    static v b() {
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public y a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        a0 a02 = a0.a(jsonObject.get("item"));
        return new y(a02);
    }

    public Y() {
        this.b = Maps.newHashMap();
    }
}

