/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import java.util.Iterator;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ag.R;
import net.minecraft.ak.X;
import net.minecraft.ak.h;
import net.minecraft.k.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Z
extends X {
    private final /* synthetic */ Class<?>[] k;
    private final /* synthetic */ boolean l;
    private /* synthetic */ int m;

    protected void c() {
        double d10 = this.a();
        Iterator<?> iterator = this.e.aG.a(this.e.getClass(), new k(this.e.a, this.e.aF, this.e.ax, this.e.a + 1.0, this.e.aF + 1.0, this.e.ax + 1.0).a(d10, 10.0, d10)).iterator();
        String string = net.minecraft.ak.h.h();
        while (iterator.hasNext()) {
            block14: {
                boolean bl2;
                D d11;
                Object object = iterator.next();
                block1: while (true) {
                    D d12;
                    block16: {
                        B b10;
                        block15: {
                            d11 = (D)object;
                            b10 = this.e;
                            if (string != null) break block15;
                            if (b10 == d11) break block14;
                            d12 = d11;
                            if (string != null) break block16;
                            b10 = d12.J();
                        }
                        if (b10 != null) break block14;
                        d12 = this.e;
                    }
                    boolean bl3 = d12 instanceof R;
                    if (string == null) {
                        D d13;
                        if (bl3) {
                            d13 = (R)this.e;
                            if (string == null) {
                                if (((R)d13).a() != ((R)d11).a()) break block14;
                            }
                        } else {
                            d13 = d11;
                        }
                        bl3 = d13.e(this.e.aA());
                    }
                    if (string == null) {
                        if (bl3) break block14;
                        bl3 = false;
                    }
                    bl2 = bl3;
                    Class<?>[] arrclass = this.k;
                    int n2 = arrclass.length;
                    int n3 = 0;
                    while (n3 < n2) {
                        Class<?> class_ = arrclass[n3];
                        if (string == null) {
                            object = d11.getClass();
                            if (string != null) continue block1;
                            if (object == class_) {
                                bl2 = true;
                                if (string == null) break block1;
                            }
                            ++n3;
                        }
                        if (string == null) continue;
                    }
                    break;
                }
                if (!bl2) {
                    this.a(d11, this.e.aA());
                }
            }
            if (string == null) continue;
        }
    }

    @Override
    public void a() {
        this.e.d(this.e.aA());
        this.j = this.e.J();
        String string = net.minecraft.ak.h.h();
        this.m = this.e.Z();
        this.h = 300;
        Z z2 = this;
        if (string == null) {
            if (z2.l) {
                this.c();
            }
            z2 = this;
        }
        super.a();
    }

    public Z(D d10, boolean bl2, Class<?> ... arrclass) {
        super(d10, true);
        this.l = bl2;
        this.k = arrclass;
        this.a(1);
    }

    protected void a(D d10, B b10) {
        d10.d(b10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int n2 = this.e.Z();
        B b10 = this.e.aA();
        String string = net.minecraft.ak.h.h();
        if (n2 == this.m) return false;
        if (b10 == null) return false;
        boolean bl2 = this.a(b10, false);
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

