/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.ar.u;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;

public class aX
extends L
implements u {
    private /* synthetic */ String A;
    private /* synthetic */ boolean y;
    private /* synthetic */ String B;
    private /* synthetic */ int z;

    public aX() {
        this.B = "";
        this.A = "";
    }

    @Override
    public void d() {
        this.y = true;
    }

    @Override
    public void a(int n2) {
        this.z = n2;
    }

    @Override
    public void c(String string) {
        this.B = string;
        this.a("Working...");
    }

    @Override
    public void a(String string) {
        this.A = string;
        this.a(0);
    }

    @Override
    public void b(String string) {
        this.c(string);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block5: {
            aX aX2;
            block2: {
                block3: {
                    Q q2;
                    String[] arrstring;
                    block4: {
                        arrstring = q.b();
                        aX2 = this;
                        if (arrstring == null) break block2;
                        if (!aX2.y) break block3;
                        q2 = this.m;
                        if (arrstring == null) break block4;
                        if (q2.aB()) break block5;
                        q2 = this.m;
                    }
                    q2.a((L)null);
                    if (arrstring != null) break block5;
                }
                this.n();
                this.b(this.v, this.B, h / 2, 70, 0xFFFFFF);
                this.b(this.v, this.A + " " + this.z + "%", h / 2, 90, 0xFFFFFF);
                aX2 = this;
            }
            super.a(n2, n3, f10);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

