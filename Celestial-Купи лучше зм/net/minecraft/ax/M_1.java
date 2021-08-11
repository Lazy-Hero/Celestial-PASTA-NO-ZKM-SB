/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import java.util.Random;
import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.G;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;
import net.minecraft.u.b;
import net.minecraft.w.d;
import net.minecraft.w.m;

public class M
extends u {
    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a(int n2) {
        return 10 + 20 * (n2 - 1);
    }

    @Override
    public int f() {
        return 3;
    }

    public static boolean a(int n2, Random random) {
        String[] arrstring = T.b();
        boolean bl2 = n2;
        if (arrstring == null) {
            if (bl2 <= false) {
                return false;
            }
            float f10 = random.nextFloat() - 0.15f * (float)n2;
            bl2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        }
        if (arrstring == null) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10) {
        String[] arrstring = T.b();
        boolean bl2 = d10.w() instanceof m;
        if (arrstring != null) return bl2;
        if (bl2) return true;
        bl2 = super.a(d10);
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public M(a a10, X ... arrx) {
        super(a10, h.ARMOR_CHEST, arrx);
        this.b("thorns");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(int n2, Random random) {
        int n3;
        String[] arrstring = T.b();
        int n4 = n2;
        int n5 = 10;
        if (arrstring == null) {
            if (n4 > n5) {
                n3 = n2 - 10;
                return n3;
            }
            n4 = 1;
            n5 = random.nextInt(4);
        }
        n3 = n4 + n5;
        return n3;
    }

    @Override
    public void a(B b10, x x2, int n2) {
        block9: {
            d d10;
            block10: {
                boolean bl2;
                d d11;
                block4: {
                    String[] arrstring;
                    block5: {
                        d d12;
                        block8: {
                            block7: {
                                x x3;
                                Random random;
                                block6: {
                                    random = b10.f();
                                    d11 = T.b(net.minecraft.u.b.a, b10);
                                    arrstring = T.b();
                                    bl2 = M.a(n2, random);
                                    if (arrstring != null) break block4;
                                    if (!bl2) break block5;
                                    x3 = x2;
                                    if (arrstring != null) break block6;
                                    if (x3 == null) break block7;
                                    x3 = x2;
                                }
                                x3.a(G.a((x)b10), (float)M.b(n2, random));
                            }
                            d12 = d11;
                            if (arrstring != null) break block8;
                            if (d12.G()) break block9;
                            d12 = d11;
                        }
                        d12.a(3, b10);
                        if (arrstring == null) break block9;
                    }
                    d10 = d11;
                    if (arrstring != null) break block10;
                    bl2 = d10.G();
                }
                if (bl2) break block9;
                d10 = d11;
            }
            d10.a(1, b10);
        }
    }
}

