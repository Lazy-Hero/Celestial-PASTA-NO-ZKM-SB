/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.ai;
import net.minecraft.T.f;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ak.h;
import net.minecraft.i.j;

class M
extends h {
    private final /* synthetic */ ai c;
    private /* synthetic */ int d;

    @Override
    public void b() {
        this.c.a((x)this.c.J(), 10.0f, 10.0f);
        ((f)this.c.w()).a(this.c.e, this.c.e());
    }

    @Override
    public void a() {
        this.d = 300;
        super.a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public M(ai ai2) {
        this.c = ai2;
        this.a(2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        var2_1 = this.c.J();
        var1_2 = S.f();
        v0 = var2_1;
        if (var1_2 != null) {
            if (v0 == null) {
                return false;
            }
            v0 = var2_1;
        }
        v1 = v0.aL();
        if (var1_2 != null) {
            if (v1 == 0) {
                return false;
            }
            v1 = var2_1 instanceof j;
        }
        if (var1_2 != null) {
            if (v1 != 0) {
                v1 = ((j)var2_1).cw.b;
                if (var1_2 != null) {
                    if (v1 != 0) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this.d = this.d - 1;
            }
        }
        if (var1_2 == null) return (boolean)v1;
        if (v1 <= 0) return (boolean)0;
        return (boolean)1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        B b10 = this.c.J();
        int[] arrn = S.f();
        B b11 = b10;
        if (arrn != null) {
            if (b11 == null) {
                return false;
            }
            b11 = b10;
        }
        boolean bl2 = b11.aL();
        if (arrn != null) {
            if (!bl2) {
                return false;
            }
            bl2 = b10 instanceof j;
        }
        if (arrn == null) return bl2;
        if (!bl2) return true;
        bl2 = ((j)b10).cw.b;
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }
}

