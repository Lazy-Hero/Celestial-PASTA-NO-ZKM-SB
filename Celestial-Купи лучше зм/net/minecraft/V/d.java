/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.k.l;
import net.minecraft.v.b;
import net.minecraft.v.c;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class d
extends c {
    private /* synthetic */ int e;
    private /* synthetic */ l d;
    private static final /* synthetic */ Logger a;

    public b<d> b() {
        return b.i;
    }

    public void a(l l2) {
        this.d = l2;
    }

    static {
        a = LogManager.getLogger();
    }

    public d(net.minecraft.h.d d10) {
        super(d10);
    }

    @Override
    public void h() {
        block4: {
            d d10;
            block10: {
                block8: {
                    double d11;
                    int[] arrn;
                    block9: {
                        block7: {
                            d d12;
                            block5: {
                                block6: {
                                    block2: {
                                        block3: {
                                            arrn = net.minecraft.v.c.b();
                                            d12 = this;
                                            if (arrn != null) break block2;
                                            if (d12.d != null) break block3;
                                            a.warn("Aborting charge player as no target was set.");
                                            this.c.d().b(b.e);
                                            if (arrn == null) break block4;
                                        }
                                        d12 = this;
                                    }
                                    if (arrn != null) break block5;
                                    if (d12.e <= 0) break block6;
                                    d12 = this;
                                    if (arrn != null) break block5;
                                    if (d12.e++ < 10) break block6;
                                    this.c.d().b(b.e);
                                    if (arrn == null) break block4;
                                }
                                d12 = this;
                            }
                            double d13 = d12.d.b(this.c.a, this.c.aF, this.c.ax);
                            double d14 = d13 - 100.0;
                            d11 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                            if (arrn != null) break block7;
                            if (d11 < 0) break block8;
                            double d15 = d13 - 22500.0;
                            d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        }
                        if (arrn != null) break block9;
                        if (d11 > 0) break block8;
                        d10 = this;
                        if (arrn != null) break block10;
                        d11 = (double)d10.c.aE;
                    }
                    if (d11 != false) break block8;
                    d10 = this;
                    if (arrn != null) break block10;
                    if (!d10.c.B) break block4;
                }
                d10 = this;
            }
            ++d10.e;
        }
    }

    @Override
    public float g() {
        return 3.0f;
    }

    @Override
    public void c() {
        this.d = null;
        this.e = 0;
    }

    @Override
    @Nullable
    public l e() {
        return this.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

