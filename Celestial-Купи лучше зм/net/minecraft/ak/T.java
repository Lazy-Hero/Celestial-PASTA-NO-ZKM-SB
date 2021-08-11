/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.x;
import net.minecraft.ag.D;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.i.j;
import net.minecraft.k.l;

public class T
extends h {
    private /* synthetic */ double f;
    private /* synthetic */ double d;
    private /* synthetic */ double c;
    private final /* synthetic */ D g;
    private final /* synthetic */ double e;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
        this.g.l().a(this.d, this.c, this.f, this.e);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        block17: {
            block16: {
                block15: {
                    block14: {
                        var1_1 = h.h();
                        v0 = this.g.aD();
                        if (var1_1 != null) break block14;
                        if (v0 != 0) return;
                        v1 = this.g.f();
                        if (var1_1 != null) break block15;
                        v0 = v1.nextInt(50);
                    }
                    if (v0 != 0) return;
                    v1 = this.g.j().get(0);
                }
                v2 = var2_2 = (x)v1;
                if (var1_1 == null) {
                    if (v2 == null) {
                        return;
                    }
                    v2 = var2_2;
                }
                v3 = v2 instanceof j;
                if (var1_1 != null) break block16;
                if (v3 == 0) break block17;
                v3 = this.g.R();
            }
            var3_3 = v3;
            v4 = var4_4 = this.g.aA();
            if (var1_1 == null) {
                if (v4 > 0) {
                    v4 = this.g.f().nextInt(var4_4);
                    if (var1_1 == null) {
                        if (v4 < var3_3) {
                            this.g.c((j)var2_2);
                            return;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v4 = this.g.n(5);
                }
            }
        }
        this.g.at();
        this.g.P();
        this.g.aG.a((x)this.g, (byte)6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.g.aD();
        if (string == null) {
            if (bl2) return false;
            bl2 = this.g.l().o();
        }
        if (string == null) {
            if (bl2) return false;
            bl2 = this.g.aU();
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String string = h.h();
        boolean bl2 = this.g.aD();
        if (string != null) return bl2;
        if (bl2) return false;
        bl2 = this.g.aU();
        if (string != null) return bl2;
        if (!bl2) return false;
        l l2 = net.minecraft.ak.g.a(this.g, 5, 4);
        if (string != null) return true;
        if (l2 == null) {
            return false;
        }
        this.d = l2.e;
        this.c = l2.d;
        this.f = l2.b;
        return true;
    }

    public T(D d10, double d11) {
        this.g = d10;
        this.e = d11;
        this.a(1);
    }
}

