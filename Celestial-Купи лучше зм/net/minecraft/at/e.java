/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.at;

import net.minecraft.D.h;
import net.minecraft.E.J;
import net.minecraft.R.b;
import net.minecraft.ar.aD;
import net.minecraft.at.c;
import net.minecraft.at.k;
import net.minecraft.k.m;

public class e
extends c {
    private final /* synthetic */ String e;
    private /* synthetic */ String d;
    private final /* synthetic */ String f;

    public e a() {
        e e10;
        block2: {
            m[] arrm = net.minecraft.at.c.b();
            e e11 = new e(this.e, this.f);
            e11.a(this.d);
            m[] arrm2 = arrm;
            e11.a(this.e().g());
            for (k k2 : this.c()) {
                e10 = e11;
                if (arrm2 == null) {
                    e10.a(k2.d());
                    if (arrm2 == null) continue;
                }
                break block2;
            }
            e10 = e11;
        }
        return e10;
    }

    @Override
    public String b() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public e(String string, String string2) {
        this.d = "";
        this.e = string;
        this.f = string2;
    }

    public String c() {
        return this.e;
    }

    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.e + '\'' + "objective='" + this.f + '\'' + ", siblings=" + this.c + ", style=" + this.e() + '}';
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        m[] arrm = net.minecraft.at.c.b();
        Object object2 = this;
        if (arrm == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (arrm == null) {
            if (!(object2 instanceof e)) {
                return false;
            }
            object2 = object;
        }
        e e10 = (e)object2;
        boolean bl2 = this.e.equals(e10.e);
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = this.f.equals(e10.f);
        }
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = super.equals(object);
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public String d() {
        return this.f;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public void a(J j2) {
        block1: {
            block4: {
                h h2;
                String string;
                net.minecraft.D.b b10;
                m[] arrm;
                block3: {
                    boolean bl2;
                    b b11;
                    block2: {
                        b b12;
                        block0: {
                            b11 = j2.e();
                            arrm = net.minecraft.at.c.b();
                            b12 = b11;
                            if (arrm != null) break block0;
                            if (b12 == null) break block1;
                            b12 = b11;
                        }
                        bl2 = b12.ay();
                        if (arrm != null) break block2;
                        if (!bl2) break block1;
                        bl2 = aD.a(this.d);
                    }
                    if (!bl2) break block1;
                    net.minecraft.D.b b13 = b11.c(0).c();
                    h h3 = b13.h(this.f);
                    b10 = b13;
                    string = this.e;
                    h2 = h3;
                    if (arrm != null) break block3;
                    if (!b10.c(string, h2)) break block4;
                    b10 = b13;
                    string = this.e;
                    h2 = h3;
                }
                net.minecraft.D.e e10 = b10.d(string, h2);
                this.a(String.format("%d", e10.a()));
                if (arrm == null) break block1;
            }
            this.d = "";
        }
    }
}

