/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.b;

import net.minecraft.as.b;
import net.minecraft.as.s;
import net.minecraft.client.Q;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.q;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ac
extends aL {
    private final /* synthetic */ s x;

    @Override
    protected void c() {
        this.x.h();
    }

    @Override
    protected boolean a(int n2) {
        return this.x.b(n2);
    }

    public int c() {
        return this.q;
    }

    @Override
    protected int h() {
        return this.x.g();
    }

    @Override
    public void f() {
        block2: {
            float f10;
            block1: {
                String[] arrstring = net.minecraft.client.b.q.b();
                super.f();
                String[] arrstring2 = arrstring;
                float f11 = this.r - 0.0f;
                f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (arrstring2 == null) break block1;
                if (f10 <= 0) break block2;
                f10 = (float)Mouse.getEventButtonState();
            }
            if (f10 != false) {
                this.x.a(this.s, this.o, this.m, this.f, this.a);
            }
        }
    }

    public void a(int n2, int n3, int n4, b b10) {
        this.x.a(n2, n3, n4, b10);
    }

    @Override
    protected int d() {
        return this.x.d();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.x.a(n2, bl2, n3, n4);
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        this.x.a(n2, n3, n4, n5, n6, n7);
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, float f10) {
        int n6 = this.d();
        String[] arrstring = net.minecraft.client.b.q.b();
        for (int i2 = 0; i2 < n6; ++i2) {
            int n7;
            ac ac2;
            int n8;
            int n9;
            block14: {
                block12: {
                    block13: {
                        int n10;
                        block10: {
                            block11: {
                                block9: {
                                    int n11;
                                    block8: {
                                        n9 = n3 + i2 * this.a + this.m;
                                        n8 = this.a - 4;
                                        n10 = n9;
                                        n11 = this.o;
                                        if (arrstring == null) break block8;
                                        if (n10 > n11) break block9;
                                        n10 = n9 + n8;
                                        if (arrstring == null) break block10;
                                        n11 = this.s;
                                    }
                                    if (n10 >= n11) break block11;
                                }
                                this.a(i2, n2, n9, f10);
                            }
                            ac2 = this;
                            if (arrstring == null) break block12;
                            n10 = ac2.l ? 1 : 0;
                        }
                        if (n10 == 0) break block13;
                        ac2 = this;
                        n7 = i2;
                        if (arrstring == null) break block14;
                        if (ac2.a(n7)) {
                            this.a(this.k, n9, n8, net.minecraft.as.b.b);
                        }
                    }
                    ac2 = this;
                }
                n7 = i2;
            }
            ac2.a(n7, n2, n9, n8, n4, n5, f10);
            if (arrstring != null) continue;
        }
    }

    public ac(s s2, int n2, int n3, int n4, int n5, int n6) {
        super(Q.P(), n2, n3, n4, n5, n6);
        this.x = s2;
    }

    public int b() {
        return this.i;
    }

    @Override
    protected int a() {
        return this.x.e();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int e() {
        return this.k;
    }
}

