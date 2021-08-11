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
import net.minecraft.M.aX;
import net.minecraft.M.t;
import net.minecraft.M.w;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ah.p;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class an
implements aO<w> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, aX> a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public an() {
        this.a = Maps.newHashMap();
    }

    static v b() {
        return b;
    }

    @Override
    public void b(a4 a42, aG<w> aG2) {
        aX aX2 = this.a.get(a42);
        int n2 = t.b();
        aX aX3 = aX2;
        if (n2 == 0) {
            if (aX3 == null) {
                aX2 = new aX(a42);
                this.a.put(a42, aX2);
            }
            aX3 = aX2;
        }
        aX3.b(aG2);
    }

    public void a(k k2, p p2, p p3) {
        block3: {
            aX aX2;
            block2: {
                aX aX3 = this.a.get(k2.Y());
                int n2 = t.c();
                aX2 = aX3;
                if (n2 == 0) break block2;
                if (aX2 == null) break block3;
                aX2 = aX3;
            }
            aX2.a(p2, p3);
        }
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public v a() {
        return b;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public w a(JsonObject var1_1, JsonDeserializationContext var2_2) {
        var3_3 = t.b();
        v0 = var1_1;
        v1 = "from";
        if (var3_3 != 0) ** GOTO lbl8
        if (v0.has(v1)) {
            v0 = var1_1;
            v1 = "from";
lbl8:
            // 2 sources

            v2 = p.a(net.minecraft.ar.aG.f(v0, v1));
        } else {
            v2 = null;
        }
        var4_4 = v2;
        v3 = var1_1;
        v4 = "to";
        if (var3_3 != 0) ** GOTO lbl18
        if (v3.has(v4)) {
            v3 = var1_1;
            v4 = "to";
lbl18:
            // 2 sources

            v5 = p.a(net.minecraft.ar.aG.f(v3, v4));
        } else {
            v5 = null;
        }
        var5_5 = v5;
        return new w(var4_4, var5_5);
    }

    @Override
    public void a(a4 a42, aG<w> aG2) {
        block5: {
            aX aX2;
            int n2;
            block4: {
                aX aX3 = this.a.get(a42);
                n2 = t.c();
                aX2 = aX3;
                if (n2 == 0) break block4;
                if (aX2 == null) break block5;
                aX3.a(aG2);
                aX2 = aX3;
            }
            if (n2 != 0 && aX2.a()) {
                aX2 = this.a.remove(a42);
            }
        }
    }

    static {
        b = new v("changed_dimension");
    }
}

