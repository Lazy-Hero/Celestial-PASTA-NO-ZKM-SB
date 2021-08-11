/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.client.e;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.client.e.C;
import net.minecraft.client.e.a;
import net.minecraft.client.e.b;
import net.minecraft.client.e.s;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k
implements a<b> {
    private final /* synthetic */ v c;
    private final /* synthetic */ Random b;
    private final /* synthetic */ net.minecraft.at.k a;
    private final /* synthetic */ List<a<b>> d;

    @Nullable
    public net.minecraft.at.k b() {
        return this.a;
    }

    @Override
    public int b() {
        int n2;
        block2: {
            int n3 = 0;
            Iterator<a<b>> iterator = this.d.iterator();
            m[] arrm = s.b();
            while (iterator.hasNext()) {
                a<b> a10 = iterator.next();
                n2 = n3 + a10.b();
                if (arrm != null) {
                    n3 = n2;
                    if (arrm != null) continue;
                }
                break block2;
            }
            n2 = n3;
        }
        return n2;
    }

    public k(v v2, @Nullable String string) {
        this.d = Lists.newArrayList();
        this.b = new Random();
        this.c = v2;
        this.a = string == null ? null : new h(string, new Object[0]);
    }

    @Override
    public b a() {
        block6: {
            int n2;
            m[] arrm;
            block7: {
                int n3;
                block5: {
                    n3 = this.b();
                    arrm = s.b();
                    n2 = this.d.isEmpty();
                    if (arrm == null) break block5;
                    if (n2 != 0) break block6;
                    n2 = n3;
                }
                if (arrm == null) break block7;
                if (n2 == 0) break block6;
                n2 = this.b.nextInt(n3);
            }
            int n4 = n2;
            for (a<b> a10 : this.d) {
                if ((n4 -= a10.b()) < 0) {
                    return a10.a();
                }
                if (arrm != null) continue;
            }
            return C.a;
        }
        return C.a;
    }

    public void a(a<b> a10) {
        this.d.add(a10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public v c() {
        return this.c;
    }
}

