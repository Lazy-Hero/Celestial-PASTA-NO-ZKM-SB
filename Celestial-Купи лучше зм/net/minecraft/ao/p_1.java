/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.ac;
import net.minecraft.ao.b1;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.d;

public class p
extends j {
    public static final /* synthetic */ List<net.minecraft.A.h> j;
    private final /* synthetic */ int h;
    private /* synthetic */ int g;
    private /* synthetic */ int i;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b(int n2, int n3) {
        int n4 = n2;
        int n5 = n3;
        String[] arrstring = u.b();
        int n6 = n2;
        if (arrstring != null) {
            if (n6 < 0) {
                n2 -= this.g - 1;
            }
            n6 = n3;
        }
        if (arrstring != null) {
            if (n6 < 0) {
                n3 -= this.g - 1;
            }
            n6 = n2 / this.g;
        }
        int n7 = n6;
        int n8 = n3 / this.g;
        Random random = this.d.a(n7, n8, 10387312);
        n7 *= this.g;
        n8 *= this.g;
        int n9 = n4;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n7 += random.nextInt(this.g - 8))) return 0 != 0;
        n9 = n5;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n8 += random.nextInt(this.g - 8))) return 0 != 0;
        return this.d.B().a(n4 * 16 + 8, n5 * 16 + 8, 0, j);
    }

    @Override
    protected ac a(int n2, int n3) {
        return new b1(this.d, this.a, n2, n3, this.i);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public p() {
        this.g = 32;
        this.h = 8;
    }

    public p(Map<String, String> map) {
        this();
        String[] arrstring = u.b();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            block7: {
                boolean bl2;
                block5: {
                    block6: {
                        bl2 = entry.getKey().equals("size");
                        if (arrstring == null) break block5;
                        if (!bl2) break block6;
                        this.i = net.minecraft.k.h.a(entry.getValue(), this.i, 0);
                        if (arrstring != null) break block7;
                    }
                    bl2 = entry.getKey().equals("distance");
                }
                if (bl2) {
                    this.g = net.minecraft.k.h.a(entry.getValue(), this.g, 9);
                }
            }
            if (arrstring != null) continue;
        }
    }

    static {
        j = Arrays.asList(net.minecraft.u.d.s, net.minecraft.u.d.ab, net.minecraft.u.d.q, net.minecraft.u.d.Z);
    }

    @Override
    public String a() {
        return "Village";
    }

    @Override
    public n a(z z2, n n2, boolean bl2) {
        this.d = z2;
        return p.a(z2, this, n2, this.g, 8, 10387312, false, 100, bl2);
    }
}

