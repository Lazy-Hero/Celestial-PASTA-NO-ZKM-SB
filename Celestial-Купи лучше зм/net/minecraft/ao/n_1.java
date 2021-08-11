/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.T.a5;
import net.minecraft.ao.a8;
import net.minecraft.ao.ac;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.ao.z;
import net.minecraft.k.h;
import net.minecraft.u.d;

public class n
extends j {
    private final /* synthetic */ List<net.minecraft.A.d> g;
    private final /* synthetic */ int i;
    private static final /* synthetic */ List<net.minecraft.A.h> j;
    private /* synthetic */ int h;

    @Override
    protected ac a(int n2, int n3) {
        return new a8(this.d, this.a, n2, n3);
    }

    static {
        j = Arrays.asList(net.minecraft.u.d.ab, net.minecraft.u.d.X, net.minecraft.u.d.l, net.minecraft.u.d.r, net.minecraft.u.d.n, net.minecraft.u.d.S, net.minecraft.u.d.aa);
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
                n2 -= this.h - 1;
            }
            n6 = n3;
        }
        if (arrstring != null) {
            if (n6 < 0) {
                n3 -= this.h - 1;
            }
            n6 = n2 / this.h;
        }
        int n7 = n6;
        int n8 = n3 / this.h;
        Random random = this.d.a(n7, n8, 14357617);
        n7 *= this.h;
        n8 *= this.h;
        int n9 = n4;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n7 += random.nextInt(this.h - 8))) return 0 != 0;
        n9 = n5;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n8 += random.nextInt(this.h - 8))) return 0 != 0;
        net.minecraft.A.h h2 = this.d.B().a(new net.minecraft.k.n(n4 * 16 + 8, 0, n5 * 16 + 8));
        if (h2 == null) {
            return false;
        }
        Iterator<net.minecraft.A.h> iterator = j.iterator();
        do {
            if (!iterator.hasNext()) return 0 != 0;
            net.minecraft.A.h h3 = iterator.next();
            if (h2 != h3) continue;
            return true;
        } while (arrstring != null);
        return 0 != 0;
    }

    public n(Map<String, String> map) {
        this();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String[] arrstring = u.b();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().equals("distance")) {
                this.h = net.minecraft.k.h.a(entry.getValue(), this.h, 9);
            }
            if (arrstring != null) continue;
        }
    }

    @Override
    public net.minecraft.k.n a(net.minecraft.ah.z z2, net.minecraft.k.n n2, boolean bl2) {
        this.d = z2;
        return n.a(z2, this, n2, this.h, 8, 14357617, false, 100, bl2);
    }

    public List<net.minecraft.A.d> a() {
        return this.g;
    }

    @Override
    public String a() {
        return "Temple";
    }

    public n() {
        this.g = Lists.newArrayList();
        this.h = 32;
        this.i = 8;
        this.g.add(new net.minecraft.A.d(a5.class, 1, 1, 1));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(net.minecraft.k.n n2) {
        ac ac2 = this.b(n2);
        String[] arrstring = u.b();
        ac ac3 = ac2;
        if (arrstring != null) {
            if (ac3 == null) return false;
            ac3 = ac2;
        }
        boolean bl2 = ac3 instanceof a8;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = ac2.c.isEmpty();
        if (arrstring == null) return bl2;
        if (bl2) return false;
        u u2 = ac2.c.get(0);
        return u2 instanceof z;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

