/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.Q;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import net.minecraft.C.K;
import net.minecraft.Q.aD;
import net.minecraft.l.d;
import net.minecraft.l.m;
import net.minecraft.n.a;

public class j
implements K<a> {
    private /* synthetic */ Map<d, Integer> a;

    public j(Map<d, Integer> map) {
        this.a = map;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    public j() {
    }

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        int n2 = m2.a();
        this.a = Maps.newHashMap();
        boolean bl2 = aD.i();
        int n3 = 0;
        while (n3 < n2) {
            d d10 = m.a(m2.c(32767));
            int n4 = m2.a();
            if (bl2) {
                if (d10 != null) {
                    this.a.put(d10, n4);
                }
                ++n3;
            }
            if (bl2) continue;
        }
    }

    public Map<d, Integer> a() {
        return this.a;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        boolean bl2 = aD.c();
        m2.d(this.a.size());
        boolean bl3 = bl2;
        for (Map.Entry<d, Integer> entry : this.a.entrySet()) {
            m2.a(entry.getKey().c);
            m2.d(entry.getValue());
            if (!bl3) continue;
        }
    }
}

