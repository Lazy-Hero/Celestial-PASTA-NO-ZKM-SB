/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import java.util.List;
import net.minecraft.T.aX;
import net.minecraft.ag.W;
import net.minecraft.ah.z;
import net.minecraft.ak.h;

public class x
extends h {
    private /* synthetic */ int e;
    private /* synthetic */ boolean c;
    private /* synthetic */ aX d;
    private final /* synthetic */ W f;

    public x(W w2) {
        this.f = w2;
        this.a(3);
    }

    @Override
    public boolean c() {
        int n2;
        block11: {
            List<aX> list;
            z z2;
            String string;
            block13: {
                int n3;
                block12: {
                    string = h.h();
                    n3 = this.f.z();
                    if (string != null) break block12;
                    if (n3 >= 0) {
                        return false;
                    }
                    z2 = this.f.aG;
                    if (string != null) break block13;
                    n3 = z2.R() ? 1 : 0;
                }
                if (n3 == 0) {
                    return false;
                }
                z2 = this.f.aG;
            }
            List<aX> list2 = list = z2.a(aX.class, this.f.m().a(6.0, 2.0, 6.0));
            if (string == null) {
                if (list2.isEmpty()) {
                    return false;
                }
                list2 = list;
            }
            for (aX aX2 : list2) {
                block15: {
                    block14: {
                        if (string != null) break block14;
                        n2 = aX2.e();
                        if (string != null) break block11;
                        if (n2 <= 0) break block15;
                        this.d = aX2;
                    }
                    if (string == null) break;
                }
                if (string == null) continue;
            }
            n2 = this.d != null ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    public void g() {
        this.d = null;
        this.f.l().f();
    }

    @Override
    public void b() {
        block6: {
            W w2;
            block7: {
                int n2;
                block5: {
                    String string = h.h();
                    this.f.I().a(this.d, 30.0f, 30.0f);
                    String string2 = string;
                    n2 = this.d.e();
                    if (string2 == null) {
                        if (n2 == this.e) {
                            this.f.l().a(this.d, 0.5);
                            this.c = true;
                        }
                        n2 = this.c ? 1 : 0;
                    }
                    if (string2 != null) break block5;
                    if (n2 == 0) break block6;
                    w2 = this.f;
                    if (string2 != null) break block7;
                    double d10 = w2.s(this.d) - 4.0;
                    n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                }
                if (n2 >= 0) break block6;
                this.d.a(false);
                w2 = this.f;
            }
            w2.l().f();
        }
    }

    @Override
    public void a() {
        this.e = this.f.f().nextInt(320);
        this.c = false;
        this.d.l().f();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.d.e();
        if (string == null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }
}

