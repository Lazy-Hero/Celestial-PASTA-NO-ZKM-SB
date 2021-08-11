/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.aw;

import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.Q.aR;
import net.minecraft.aw.s;
import net.minecraft.aw.w;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class e {
    public /* synthetic */ int a;
    private /* synthetic */ int g;
    private /* synthetic */ int i;
    private /* synthetic */ int h;
    public final /* synthetic */ j c;
    private /* synthetic */ int f;
    private /* synthetic */ boolean e;
    private /* synthetic */ int b;
    final /* synthetic */ s d;

    public void a(int n2, int n3) {
        block4: {
            block2: {
                e e10;
                block3: {
                    String[] arrstring = w.d();
                    e10 = this;
                    if (arrstring == null) break block2;
                    if (!e10.e) break block3;
                    this.i = Math.min(this.i, n2);
                    this.g = Math.min(this.g, n3);
                    this.b = Math.max(this.b, n2);
                    this.f = Math.max(this.f, n3);
                    if (arrstring != null) break block4;
                }
                this.e = true;
                this.i = n2;
                this.g = n3;
                this.b = n2;
                e10 = this;
            }
            e10.f = n3;
        }
    }

    @Nullable
    public K<?> a(d d10) {
        String[] arrstring = w.d();
        int n2 = this.e;
        if (arrstring != null) {
            if (n2 != 0) {
                this.e = false;
                return new aR(d10.d(), this.d.c, this.d.g, this.d.i.values(), this.d.l, this.i, this.g, this.b + 1 - this.i, this.f + 1 - this.g);
            }
            n2 = this.h++ % 5;
        }
        return n2 == 0 ? new aR(d10.d(), this.d.c, this.d.g, this.d.i.values(), this.d.l, 0, 0, 0, 0) : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public e(s s2, j j2) {
        this.d = s2;
        this.e = true;
        this.b = 127;
        this.f = 127;
        this.c = j2;
    }
}

