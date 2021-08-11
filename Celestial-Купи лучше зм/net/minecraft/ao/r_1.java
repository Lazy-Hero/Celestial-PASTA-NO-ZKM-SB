/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.h;
import net.minecraft.ah.z;
import net.minecraft.ao.ac;
import net.minecraft.ao.bl;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.k.n;
import net.minecraft.u.d;

public class r
extends j {
    private final /* synthetic */ int j = 20;
    private final /* synthetic */ net.minecraft.aA.u g;
    public static final /* synthetic */ List<h> h;
    private final /* synthetic */ int i = 80;

    @Override
    public String a() {
        return "Mansion";
    }

    @Override
    protected ac a(int n2, int n3) {
        return new bl(this.d, this.g, this.a, n2, n3);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        h = Arrays.asList(net.minecraft.u.d.Y, net.minecraft.u.d.H);
    }

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
                n4 = n2 - 79;
            }
            n6 = n3;
        }
        if (arrstring != null) {
            if (n6 < 0) {
                n5 = n3 - 79;
            }
            n6 = n4 / 80;
        }
        int n7 = n6;
        int n8 = n5 / 80;
        Random random = this.d.a(n7, n8, 10387319);
        n7 *= 80;
        n8 *= 80;
        int n9 = n2;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n7 += (random.nextInt(60) + random.nextInt(60)) / 2)) return 0 != 0;
        n9 = n3;
        if (arrstring == null) return n9 != 0;
        if (n9 != (n8 += (random.nextInt(60) + random.nextInt(60)) / 2)) return 0 != 0;
        return this.d.B().a(n2 * 16 + 8, n3 * 16 + 8, 32, h);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public n a(z z2, n n2, boolean bl2) {
        block5: {
            b b10;
            block4: {
                b b11;
                this.d = z2;
                String[] arrstring = u.b();
                b10 = b11 = z2.B();
                if (arrstring == null) break block4;
                if (!b10.a()) break block5;
                b10 = b11;
            }
            if (b10.e() != net.minecraft.u.d.Y) {
                return null;
            }
        }
        n n3 = r.a(z2, this, n2, 80, 20, 10387319, true, 100, bl2);
        return n3;
    }

    public r(net.minecraft.aA.u u2) {
        this.i = 80;
        this.j = 20;
        this.g = u2;
    }
}

