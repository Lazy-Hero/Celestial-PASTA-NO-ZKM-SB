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
import net.minecraft.ar.H;
import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.w.d;

public class I
extends H {
    private final /* synthetic */ x G;

    @Override
    @Nullable
    public x q() {
        return this.E;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public I(String string, x x2, @Nullable x x3) {
        super(string, x2);
        this.G = x3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public k c(B var1_1) {
        block9: {
            block10: {
                block8: {
                    var2_2 = v.d();
                    v0 = this.G;
                    if (var2_2 == 0) ** GOTO lbl8
                    if (v0 == null) {
                        v1 = this.E.d();
                    } else {
                        v0 = this.G;
lbl8:
                        // 2 sources

                        v1 = v0.d();
                    }
                    var3_3 = v1;
                    v2 = this.G;
                    if (var2_2 == 0) ** GOTO lbl14
                    if (v2 instanceof B) {
                        v2 = this.G;
lbl14:
                        // 2 sources

                        v3 = ((B)v2).av();
                    } else {
                        v3 = net.minecraft.w.d.m;
                    }
                    var4_4 = v3;
                    var5_5 = "death.attack." + this.o;
                    var6_6 = var5_5 + ".item";
                    v4 = var4_4.G();
                    if (var2_2 == 0) break block8;
                    if (v4) break block9;
                    v4 = var4_4.c();
                }
                if (var2_2 == 0) break block10;
                if (!v4) break block9;
                v4 = net.minecraft.ab.a.c(var6_6);
            }
            if (v4) {
                v5 = new h(var6_6, new Object[]{var1_1.d(), var3_3, var4_4.F()});
                return v5;
            }
        }
        v5 = new h(var5_5, new Object[]{var1_1.d(), var3_3});
        return v5;
    }

    @Override
    @Nullable
    public x h() {
        return this.G;
    }
}

