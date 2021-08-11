/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.ar;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.ar.aS;
import net.minecraft.ar.v;
import net.minecraft.k.h;
import net.minecraft.w.k;

public class y {
    private /* synthetic */ int a;
    private final /* synthetic */ Map<k, aS> b;

    public float a(k k2, float f10) {
        block3: {
            aS aS2;
            aS aS3;
            block2: {
                aS3 = this.b.get(k2);
                int n2 = v.d();
                aS2 = aS3;
                if (n2 == 0) break block2;
                if (aS2 == null) break block3;
                aS2 = aS3;
            }
            float f11 = aS2.b - aS3.c;
            float f12 = (float)aS3.b - ((float)this.a + f10);
            return h.c(f12 / f11, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    protected void a(k k2, int n2) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(k k2, int n2) {
        this.b.put(k2, new aS(this, this.a, this.a + n2, null));
        this.a(k2, n2);
    }

    public boolean c(k k2) {
        int n2 = v.b();
        float f10 = this.a(k2, 0.0f) - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (n2 == 0) {
            f11 = f11 > 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    public void a() {
        block4: {
            Map<k, aS> map;
            int n2;
            block3: {
                ++this.a;
                n2 = v.d();
                map = this.b;
                if (n2 == 0) break block3;
                if (map.isEmpty()) break block4;
                map = this.b;
            }
            Iterator<Map.Entry<k, aS>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                block6: {
                    Map.Entry<k, aS> entry;
                    block5: {
                        entry = iterator.next();
                        if (n2 == 0) break block5;
                        if (entry.getValue().b > this.a) break block6;
                        iterator.remove();
                    }
                    this.a(entry.getKey());
                }
                if (n2 != 0) continue;
            }
        }
    }

    protected void a(k k2) {
    }

    public y() {
        this.b = Maps.newHashMap();
    }

    public void b(k k2) {
        this.b.remove(k2);
        this.a(k2);
    }
}

