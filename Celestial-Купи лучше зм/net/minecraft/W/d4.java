/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.W.cL;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class d4
extends y {
    private /* synthetic */ d i;

    public void a(d d10) {
        this.i = d10;
        this.b();
    }

    @Override
    public r a(r r2) {
        boolean bl2 = cL.e();
        r r3 = super.a(r2);
        if (bl2) {
            if (!this.a().G()) {
                r2.a("RecordItem", this.a().a(new r()));
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public void c(r r2) {
        block3: {
            int n2;
            block1: {
                block2: {
                    boolean bl2 = cL.e();
                    super.c(r2);
                    boolean bl3 = bl2;
                    n2 = r2.a("RecordItem", 10);
                    if (!bl3) break block1;
                    if (n2 == 0) break block2;
                    this.a(new d(r2.h("RecordItem")));
                    if (bl3) break block3;
                }
                n2 = r2.m("Record");
            }
            if (n2 > 0) {
                this.a(new d(k.a(r2.m("Record"))));
            }
        }
    }

    public d a() {
        return this.i;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public d4() {
        this.i = net.minecraft.w.d.m;
    }
}

