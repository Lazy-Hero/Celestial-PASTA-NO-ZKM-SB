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
import net.minecraft.M.H;
import net.minecraft.M.aC;
import net.minecraft.M.al;
import net.minecraft.M.au;
import net.minecraft.M.t;
import net.minecraft.U.x;
import net.minecraft.a4;
import net.minecraft.aG;
import net.minecraft.aO;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class W
implements aO<H> {
    private final /* synthetic */ Map<a4, au> b;
    private final /* synthetic */ v a;

    public void a(k k2, x x2, G g10) {
        block3: {
            au au2;
            block2: {
                au au3 = this.b.get(k2.Y());
                int n2 = t.c();
                au2 = au3;
                if (n2 == 0) break block2;
                if (au2 == null) break block3;
                au2 = au3;
            }
            au2.a(k2, x2, g10);
        }
    }

    @Override
    public H a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return new H(this.a, al.a(jsonObject.get("entity")), aC.a(jsonObject.get("killing_blow")));
    }

    @Override
    public void a(a4 a42, aG<H> aG2) {
        block5: {
            au au2;
            int n2;
            block4: {
                au au3 = this.b.get(a42);
                n2 = t.b();
                au2 = au3;
                if (n2 != 0) break block4;
                if (au2 == null) break block5;
                au3.a(aG2);
                au2 = au3;
            }
            if (n2 == 0 && au2.a()) {
                au2 = this.b.remove(a42);
            }
        }
    }

    @Override
    public v a() {
        return this.a;
    }

    @Override
    public void a(a4 a42) {
        this.b.remove(a42);
    }

    public W(v v2) {
        this.b = Maps.newHashMap();
        this.a = v2;
    }

    @Override
    public void b(a4 a42, aG<H> aG2) {
        au au2 = this.b.get(a42);
        int n2 = t.b();
        au au3 = au2;
        if (n2 == 0) {
            if (au3 == null) {
                au2 = new au(a42);
                this.b.put(a42, au2);
            }
            au3 = au2;
        }
        au3.b(aG2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

