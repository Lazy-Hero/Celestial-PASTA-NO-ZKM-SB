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
import net.minecraft.M.L;
import net.minecraft.M.V;
import net.minecraft.M.a1;
import net.minecraft.M.al;
import net.minecraft.M.t;
import net.minecraft.U.x;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class p
implements aO<L> {
    private final /* synthetic */ Map<a4, V> a;
    private static final /* synthetic */ v b;

    @Override
    public void b(a4 a42, aG<L> aG2) {
        V v2 = this.a.get(a42);
        int n2 = t.b();
        V v3 = v2;
        if (n2 == 0) {
            if (v3 == null) {
                v2 = new V(a42);
                this.a.put(a42, v2);
            }
            v3 = v2;
        }
        v3.a(aG2);
    }

    @Override
    public v a() {
        return b;
    }

    static v b() {
        return b;
    }

    static {
        b = new v("player_hurt_entity");
    }

    public void a(k k2, x x2, G g10, float f10, float f11, boolean bl2) {
        block3: {
            V v2;
            block2: {
                V v3 = this.a.get(k2.Y());
                int n2 = t.c();
                v2 = v3;
                if (n2 == 0) break block2;
                if (v2 == null) break block3;
                v2 = v3;
            }
            v2.a(k2, x2, g10, f10, f11, bl2);
        }
    }

    @Override
    public L a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        a1 a12 = a1.a(jsonObject.get("damage"));
        al al2 = al.a(jsonObject.get("entity"));
        return new L(a12, al2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public void a(a4 a42, aG<L> aG2) {
        block5: {
            V v2;
            int n2;
            block4: {
                V v3 = this.a.get(a42);
                n2 = t.b();
                v2 = v3;
                if (n2 != 0) break block4;
                if (v2 == null) break block5;
                v3.b(aG2);
                v2 = v3;
            }
            if (n2 == 0 && v2.a()) {
                v2 = this.a.remove(a42);
            }
        }
    }

    public p() {
        this.a = Maps.newHashMap();
    }
}

