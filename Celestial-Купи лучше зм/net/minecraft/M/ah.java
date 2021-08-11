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
import net.minecraft.M.D;
import net.minecraft.M.a1;
import net.minecraft.M.aR;
import net.minecraft.M.t;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class ah
implements aO<D> {
    private static final /* synthetic */ v b;
    private final /* synthetic */ Map<a4, aR> a;

    @Override
    public void a(a4 a42, aG<D> aG2) {
        block5: {
            aR aR2;
            int n2;
            block4: {
                aR aR3 = this.a.get(a42);
                n2 = t.b();
                aR2 = aR3;
                if (n2 != 0) break block4;
                if (aR2 == null) break block5;
                aR3.a(aG2);
                aR2 = aR3;
            }
            if (n2 == 0 && aR2.a()) {
                aR2 = this.a.remove(a42);
            }
        }
    }

    @Override
    public D a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        a1 a12 = a1.a(jsonObject.get("damage"));
        return new D(a12);
    }

    @Override
    public void a(a4 a42) {
        this.a.remove(a42);
    }

    @Override
    public v a() {
        return b;
    }

    static {
        b = new v("entity_hurt_player");
    }

    static v b() {
        return b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(k k2, G g10, float f10, float f11, boolean bl2) {
        block3: {
            aR aR2;
            block2: {
                aR aR3 = this.a.get(k2.Y());
                int n2 = t.c();
                aR2 = aR3;
                if (n2 == 0) break block2;
                if (aR2 == null) break block3;
                aR2 = aR3;
            }
            aR2.a(k2, g10, f10, f11, bl2);
        }
    }

    public ah() {
        this.a = Maps.newHashMap();
    }

    @Override
    public void b(a4 a42, aG<D> aG2) {
        aR aR2 = this.a.get(a42);
        int n2 = t.b();
        aR aR3 = aR2;
        if (n2 == 0) {
            if (aR3 == null) {
                aR2 = new aR(a42);
                this.a.put(a42, aR2);
            }
            aR3 = aR2;
        }
        aR3.b(aG2);
    }
}

