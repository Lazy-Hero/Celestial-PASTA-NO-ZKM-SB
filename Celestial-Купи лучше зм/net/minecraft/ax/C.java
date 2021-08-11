/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import java.util.Random;
import net.minecraft.B.X;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;
import net.minecraft.w.d;
import net.minecraft.w.m;

public class C
extends u {
    @Override
    public int a(int n2) {
        return 5 + (n2 - 1) * 8;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(d var0, int var1_1, Random var2_2) {
        var3_3 = T.b();
        v0 = var0.w() instanceof m;
        if (var3_3 == null) {
            if (v0 != 0) {
                cfr_temp_0 = var2_2.nextFloat() - 0.6f;
                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                if (var3_3 == null) {
                    if (v0 < 0) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var2_2.nextInt(var1_1 + 1);
            }
        }
        if (var3_3 != null) return (boolean)v0;
        if (v0 <= 0) return (boolean)0;
        return (boolean)1;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10) {
        String[] arrstring = T.b();
        boolean bl2 = d10.j();
        if (arrstring != null) return bl2;
        if (bl2) return true;
        bl2 = super.a(d10);
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public int f() {
        return 3;
    }

    protected C(a a10, X ... arrx) {
        super(a10, h.BREAKABLE, arrx);
        this.b("durability");
    }
}

