/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.K.j;
import net.minecraft.U.B;
import net.minecraft.U.g;
import net.minecraft.U.x;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;
import net.minecraft.u.c;
import net.minecraft.w.am;
import net.minecraft.w.d;

public class A
extends u {
    private static final /* synthetic */ String[] h;
    private static final /* synthetic */ int[] i;
    public final /* synthetic */ int g;
    private static final /* synthetic */ int[] j;
    private static final /* synthetic */ int[] f;

    @Override
    public String a() {
        return "enchantment.damage." + h[this.g];
    }

    @Override
    public int f() {
        return 5;
    }

    @Override
    public float a(int n2, g g10) {
        String[] arrstring = T.b();
        int n3 = this.g;
        if (arrstring == null) {
            if (n3 == 0) {
                return 1.0f + (float)Math.max(0, n2 - 1) * 0.5f;
            }
            n3 = this.g;
        }
        int n4 = 1;
        if (arrstring == null) {
            if (n3 == n4 && g10 == net.minecraft.U.g.UNDEAD) {
                return (float)n2 * 2.5f;
            }
            n3 = this.g;
            n4 = 2;
        }
        return n3 == n4 && g10 == net.minecraft.U.g.ARTHROPOD ? (float)n2 * 2.5f : 0.0f;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    static {
        h = new String[]{"all", "undead", "arthropods"};
        f = new int[]{1, 5, 5};
        j = new int[]{11, 8, 8};
        i = new int[]{20, 20, 20};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10) {
        String[] arrstring = T.b();
        boolean bl2 = d10.w() instanceof am;
        if (arrstring != null) return bl2;
        if (bl2) return true;
        bl2 = super.a(d10);
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void b(B b10, x x2, int n2) {
        block5: {
            x x3;
            block4: {
                String[] arrstring = T.b();
                x3 = x2;
                if (arrstring != null) break block4;
                if (!(x3 instanceof B)) break block5;
                x3 = x2;
            }
            B b11 = (B)x3;
            if (this.g == 2 && b11.ag() == net.minecraft.U.g.ARTHROPOD) {
                int n3 = 20 + b10.f().nextInt(10 * n2);
                b11.b(new j(c.f, n3, 3));
            }
        }
    }

    @Override
    public boolean a(u u2) {
        String[] arrstring = T.b();
        boolean bl2 = u2 instanceof A;
        if (arrstring == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + i[this.g];
    }

    public A(a a10, int n2, X ... arrx) {
        super(a10, net.minecraft.ax.h.WEAPON, arrx);
        this.g = n2;
    }

    @Override
    public int a(int n2) {
        return f[this.g] + (n2 - 1) * j[this.g];
    }
}

