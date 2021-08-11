/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.T.a0;
import net.minecraft.ah.z;
import net.minecraft.ao.ac;
import net.minecraft.ao.bv;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.d;

public class q
extends j {
    public static final /* synthetic */ List<net.minecraft.A.h> k;
    private /* synthetic */ int i;
    private static final /* synthetic */ List<net.minecraft.A.d> h;
    public static final /* synthetic */ List<net.minecraft.A.h> j;
    private /* synthetic */ int g;

    static {
        j = Arrays.asList(net.minecraft.u.d.e, net.minecraft.u.d.J, net.minecraft.u.d.d, net.minecraft.u.d.ak, net.minecraft.u.d.g);
        k = Arrays.asList(net.minecraft.u.d.J);
        h = Lists.newArrayList();
        h.add(new net.minecraft.A.d(a0.class, 1, 2, 4));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public n a(z z2, n n2, boolean bl2) {
        this.d = z2;
        return q.a(z2, this, n2, this.i, this.g, 10387313, true, 100, bl2);
    }

    public q(Map<String, String> map) {
        this();
        String[] arrstring = u.b();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            block7: {
                boolean bl2;
                block5: {
                    block6: {
                        bl2 = entry.getKey().equals("spacing");
                        if (arrstring == null) break block5;
                        if (!bl2) break block6;
                        this.i = net.minecraft.k.h.a(entry.getValue(), this.i, 1);
                        if (arrstring != null) break block7;
                    }
                    bl2 = entry.getKey().equals("separation");
                }
                if (bl2) {
                    this.g = net.minecraft.k.h.a(entry.getValue(), this.g, 1);
                }
            }
            if (arrstring != null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b(int n2, int n3) {
        int n4 = n2;
        String[] arrstring = u.b();
        int n5 = n3;
        int n6 = n2;
        if (arrstring != null) {
            if (n6 < 0) {
                n2 -= this.i - 1;
            }
            n6 = n3;
        }
        if (arrstring != null) {
            if (n6 < 0) {
                n3 -= this.i - 1;
            }
            n6 = n2 / this.i;
        }
        int n7 = n6;
        int n8 = n3 / this.i;
        Random random = this.d.a(n7, n8, 10387313);
        n7 *= this.i;
        n8 *= this.i;
        int n9 = n4;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n7 += (random.nextInt(this.i - this.g) + random.nextInt(this.i - this.g)) / 2)) return 0 != 0;
        n9 = n5;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n8 += (random.nextInt(this.i - this.g) + random.nextInt(this.i - this.g)) / 2)) return 0 != 0;
        boolean bl2 = this.d.B().a(n4 * 16 + 8, n5 * 16 + 8, 16, k);
        if (arrstring == null) return bl2;
        if (!bl2) {
            return false;
        }
        bl2 = this.d.B().a(n4 * 16 + 8, n5 * 16 + 8, 29, j);
        return bl2;
    }

    @Override
    protected ac a(int n2, int n3) {
        return new bv(this.d, this.a, n2, n3);
    }

    public q() {
        this.i = 32;
        this.g = 5;
    }

    @Override
    public String a() {
        return "Monument";
    }

    public List<net.minecraft.A.d> a() {
        return h;
    }
}

