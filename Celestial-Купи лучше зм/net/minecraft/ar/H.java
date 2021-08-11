/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ab.a;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.k.l;
import net.minecraft.w.d;

public class H
extends G {
    private /* synthetic */ boolean F;
    @Nullable
    protected /* synthetic */ x E;

    private static gP b(gP gP2) {
        return gP2;
    }

    public boolean d() {
        return this.F;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean i() {
        int n2 = v.d();
        x x2 = this.E;
        if (n2 != 0) {
            if (x2 == null) return false;
            x2 = this.E;
        }
        boolean bl2 = x2 instanceof B;
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = this.E instanceof j;
        }
        if (n2 == 0) return bl2;
        if (bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public k c(B var1_1) {
        block7: {
            block8: {
                block6: {
                    var2_2 = v.d();
                    v0 = this.E;
                    if (var2_2 == 0) ** GOTO lbl6
                    if (v0 instanceof B) {
                        v0 = this.E;
lbl6:
                        // 2 sources

                        v1 = ((B)v0).av();
                    } else {
                        v1 = net.minecraft.w.d.m;
                    }
                    var3_3 = v1;
                    var4_4 = "death.attack." + this.o;
                    var5_5 = var4_4 + ".item";
                    v2 = var3_3.G();
                    if (var2_2 == 0) break block6;
                    if (v2) break block7;
                    v2 = var3_3.c();
                }
                if (var2_2 == 0) break block8;
                if (!v2) break block7;
                v2 = net.minecraft.ab.a.c(var5_5);
            }
            if (v2) {
                v3 = new h(var5_5, new Object[]{var1_1.d(), this.E.d(), var3_3.F()});
                return v3;
            }
        }
        v3 = new h(var4_4, new Object[]{var1_1.d(), this.E.d()});
        return v3;
    }

    @Override
    @Nullable
    public x h() {
        return this.E;
    }

    public H(String string, @Nullable x x2) {
        super(string);
        this.E = x2;
    }

    public H a() {
        this.F = true;
        return this;
    }

    @Override
    @Nullable
    public l t() {
        return new l(this.E.a, this.E.aF, this.E.ax);
    }
}

