/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.I;

import java.io.IOException;
import net.minecraft.N.W;
import net.minecraft.W.K;
import net.minecraft.ar.X;
import net.minecraft.client.D.h;
import net.minecraft.client.F.b;
import net.minecraft.client.I.v;
import net.minecraft.client.b.L;
import net.minecraft.client.o.j;
import net.minecraft.d.n;
import net.minecraft.u.g;
import org.lwjgl.input.Keyboard;

public class s
extends L {
    private final /* synthetic */ W A;
    private /* synthetic */ net.minecraft.client.b.s B;
    private /* synthetic */ int z;
    private /* synthetic */ int y;

    @Override
    public void a(int n2, int n3, float f10) {
        int[] arrn;
        block11: {
            block10: {
                this.n();
                this.b(this.v, net.minecraft.client.D.h.a("sign.edit", new Object[0]), h / 2, 40, 0xFFFFFF);
                int[] arrn2 = net.minecraft.client.I.v.a();
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.b((float)(h / 2), 0.0f, 50.0f);
                float f11 = 93.75f;
                net.minecraft.client.a.v.d(-93.75f, -93.75f, -93.75f);
                net.minecraft.client.a.v.a(180.0f, 0.0f, 1.0f, 0.0f);
                K k2 = this.A.l();
                arrn = arrn2;
                if (k2 != g.aR) break block10;
                float f12 = (float)(this.A.m() * 360) / 16.0f;
                net.minecraft.client.a.v.a(f12, 0.0f, 1.0f, 0.0f);
                net.minecraft.client.a.v.b(0.0f, -1.0625f, 0.0f);
                if (arrn == null) break block11;
            }
            int n4 = this.A.m();
            float f13 = 0.0f;
            int n5 = n4;
            int n6 = 2;
            if (arrn == null) {
                if (n5 == n6) {
                    f13 = 180.0f;
                }
                n5 = n4;
                n6 = 4;
            }
            if (arrn == null) {
                if (n5 == n6) {
                    f13 = 90.0f;
                }
                n5 = n4;
                n6 = 5;
            }
            if (n5 == n6) {
                f13 = -90.0f;
            }
            net.minecraft.client.a.v.a(f13, 0.0f, 1.0f, 0.0f);
            net.minecraft.client.a.v.b(0.0f, -1.0625f, 0.0f);
        }
        s s2 = this;
        if (arrn == null) {
            if (s2.y / 6 % 2 == 0) {
                this.A.m = this.z;
            }
            b.e.a(this.A, -0.5, -0.75, -0.5, 0.0f);
            this.A.m = -1;
            net.minecraft.client.a.v.B();
            s2 = this;
        }
        super.a(n2, n3, f10);
    }

    @Override
    protected void a(net.minecraft.client.b.s s2) throws IOException {
        block2: {
            int n2;
            block1: {
                int[] arrn = net.minecraft.client.I.v.a();
                n2 = s2.h;
                if (arrn != null) break block1;
                if (n2 == 0) break block2;
                n2 = s2.g;
            }
            if (n2 == 0) {
                this.A.b();
                this.m.a((L)null);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void h() {
        int[] arrn = net.minecraft.client.I.v.a();
        Keyboard.enableRepeatEvents((boolean)false);
        int[] arrn2 = arrn;
        j j2 = this.m.ar();
        if (arrn2 == null) {
            if (j2 != null) {
                j2.a(new n(this.A.j(), this.A.k));
            }
            this.A.a(true);
        }
    }

    public s(W w2) {
        this.A = w2;
    }

    @Override
    public void r() {
        this.t.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.B = this.b(new net.minecraft.client.b.s(0, h / 2 - 100, w / 4 + 120, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.A.a(false);
    }

    @Override
    public void e() {
        ++this.y;
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block23: {
            s s2;
            block22: {
                int n3;
                int n4;
                block21: {
                    block19: {
                        String string;
                        int[] arrn;
                        block20: {
                            block17: {
                                block18: {
                                    block16: {
                                        block14: {
                                            int n5;
                                            int n6;
                                            block15: {
                                                block13: {
                                                    arrn = net.minecraft.client.I.v.a();
                                                    n6 = n2;
                                                    n5 = 200;
                                                    if (arrn == null) {
                                                        if (n6 == n5) {
                                                            this.z = this.z - 1 & 3;
                                                        }
                                                        n6 = n2;
                                                        n5 = 208;
                                                    }
                                                    if (arrn != null) break block13;
                                                    if (n6 == n5) break block14;
                                                    n6 = n2;
                                                    n5 = 28;
                                                }
                                                if (arrn != null) break block15;
                                                if (n6 == n5) break block14;
                                                n6 = n2;
                                                n5 = 156;
                                            }
                                            if (n6 != n5) break block16;
                                        }
                                        this.z = this.z + 1 & 3;
                                    }
                                    string = this.A.k[this.z].f();
                                    n4 = n2;
                                    if (arrn != null) break block17;
                                    if (n4 != 14) break block18;
                                    n4 = string.isEmpty() ? 1 : 0;
                                    if (arrn != null) break block17;
                                    if (n4 == 0) {
                                        string = string.substring(0, string.length() - 1);
                                    }
                                }
                                n4 = X.a(c10) ? 1 : 0;
                            }
                            if (arrn != null) break block19;
                            if (n4 == 0) break block20;
                            n4 = this.v.e(string + c10);
                            n3 = 90;
                            if (arrn != null) break block21;
                            if (n4 <= n3) {
                                string = string + c10;
                            }
                        }
                        s2 = this;
                        if (arrn != null) break block22;
                        s2.A.k[this.z] = new net.minecraft.at.g(string);
                        n4 = n2;
                    }
                    n3 = 1;
                }
                if (n4 != n3) break block23;
                s2 = this;
            }
            s2.a(this.B);
        }
    }
}

