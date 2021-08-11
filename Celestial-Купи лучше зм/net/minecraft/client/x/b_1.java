/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.client.x.P;
import net.minecraft.w.d;
import net.minecraft.w.e;
import net.minecraft.w.k;

public class b {
    private final /* synthetic */ Map<v, Float> b;
    private final /* synthetic */ v a;

    public b(v v2, Map<v, Float> map) {
        this.a = v2;
        this.b = map;
    }

    boolean a(d d10, @Nullable z z2, @Nullable B b10) {
        k k2 = d10.w();
        Iterator<Map.Entry<v, Float>> iterator = this.b.entrySet().iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            block6: {
                int n2;
                block5: {
                    block4: {
                        float f10;
                        e e10;
                        Map.Entry<v, Float> entry;
                        block3: {
                            e e11;
                            entry = iterator.next();
                            e10 = e11 = k2.a(entry.getKey());
                            if (arrstring != null) break block3;
                            if (e10 == null) break block4;
                            e10 = e11;
                        }
                        n2 = (f10 = e10.a(d10, z2, b10) - entry.getValue().floatValue()) == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                        if (arrstring != null) break block5;
                        if (n2 >= 0) break block6;
                    }
                    n2 = 0;
                }
                return n2 != 0;
            }
            if (arrstring == null) continue;
        }
        return true;
    }

    public v a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

