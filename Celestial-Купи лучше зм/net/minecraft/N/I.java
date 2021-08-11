/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import javax.annotation.Nullable;
import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.Q.ag;
import net.minecraft.av.b;
import net.minecraft.k.m;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class I
extends y {
    private /* synthetic */ k j;
    private /* synthetic */ int i;

    @Override
    public r r() {
        return this.a(new r());
    }

    public static void a(b b10) {
    }

    public d b() {
        return this.j == null ? net.minecraft.w.d.m : new d(this.j, 1, this.i);
    }

    @Nullable
    public k a() {
        return this.j;
    }

    public int c() {
        return this.i;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c(r r2) {
        block4: {
            r r3;
            block2: {
                I i2;
                block3: {
                    m[] arrm = net.minecraft.N.j.f();
                    i2 = this;
                    r3 = r2;
                    if (arrm != null) break block2;
                    super.c(r3);
                    if (!r2.a("Item", 8)) break block3;
                    this.j = k.a(r2.j("Item"));
                    if (arrm == null) break block4;
                }
                i2 = this;
                r3 = r2;
            }
            i2.j = k.a(r3.m("Item"));
        }
        this.i = r2.m("Data");
    }

    public I(k k2, int n2) {
        this.j = k2;
        this.i = n2;
    }

    public I() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public r a(r var1_1) {
        v0 = net.minecraft.N.j.f();
        super.a(var1_1);
        var2_2 = v0;
        v1 = var3_3 = k.q.b(this.j);
        if (var2_2 != null) ** GOTO lbl11
        if (v1 == null) {
            v2 = "";
        } else {
            v1 = var3_3;
lbl11:
            // 2 sources

            v2 = v1.toString();
        }
        var1_1.a("Item", v2);
        var1_1.b("Data", this.i);
        return var1_1;
    }

    public void a(d d10) {
        this.j = d10.w();
        this.i = d10.d();
    }

    @Override
    @Nullable
    public ag k() {
        return new ag(this.d, 5, this.r());
    }
}

