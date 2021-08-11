/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.n;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.U.B;
import net.minecraft.az.k;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.n.b;
import net.minecraft.client.n.d;
import net.minecraft.client.n.e;
import net.minecraft.client.n.h;

public class a
implements b {
    private /* synthetic */ long d;
    private /* synthetic */ boolean c;
    private final /* synthetic */ List<net.minecraft.w.d> e;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(net.minecraft.w.d d10) {
        block3: {
            block2: {
                String[] arrstring = net.minecraft.client.n.d.b();
                a a10 = this;
                if (arrstring == null) break block2;
                if (!a10.e.add(d10)) break block3;
                a10 = this;
            }
            a10.c = true;
        }
    }

    public a(net.minecraft.w.d d10) {
        this.e = Lists.newArrayList();
        this.e.add(d10);
    }

    public static void a(e e10, k k2) {
        block4: {
            a a10;
            block2: {
                a a11;
                block3: {
                    a11 = e10.a(a.class, b);
                    String[] arrstring = net.minecraft.client.n.d.b();
                    a10 = a11;
                    if (arrstring == null) break block2;
                    if (a10 != null) break block3;
                    e10.a(new a(k2.d()));
                    if (arrstring != null) break block4;
                }
                a10 = a11;
            }
            a10.a(k2.d());
        }
    }

    @Override
    public h a(e e10, long l2) {
        String[] arrstring = net.minecraft.client.n.d.b();
        int n2 = this.c;
        if (arrstring != null) {
            if (n2 != 0) {
                this.d = l2;
                this.c = false;
            }
            n2 = this.e.isEmpty() ? 1 : 0;
        }
        if (arrstring != null) {
            if (n2 != 0) {
                return h.HIDE;
            }
            e10.a().aN().b(a);
            v.c(1.0f, 1.0f, 1.0f);
            e10.a(0, 0, 0, 32, 160, 32);
            e10.a().a6.b(net.minecraft.client.D.h.a("recipe.toast.title", new Object[0]), 30.0f, 7.0f, -11534256);
            e10.a().a6.b(net.minecraft.client.D.h.a("recipe.toast.description", new Object[0]), 30.0f, 18.0f, -16777216);
            a0.b();
            e10.a().Y().a((B)null, this.e.get((int)(l2 / (5000L / (long)this.e.size()) % (long)this.e.size())), 8, 8);
            long l3 = l2 - this.d - 5000L;
            n2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        }
        return n2 >= 0 ? h.HIDE : h.SHOW;
    }
}

