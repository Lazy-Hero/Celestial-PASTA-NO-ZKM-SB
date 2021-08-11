/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.a;

import com.google.common.base.MoreObjects;
import java.awt.Color;
import java.util.Objects;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ar.a3;
import net.minecraft.ar.aC;
import net.minecraft.ar.aW;
import net.minecraft.aw.s;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.aN;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.a.p;
import net.minecraft.client.a.v;
import net.minecraft.client.j.c;
import net.minecraft.client.j.j;
import net.minecraft.client.q.a;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.ae;
import net.minecraft.client.r.b;
import net.minecraft.client.x.d;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.w.an;
import net.minecraft.w.k;
import org.lwjgl.opengl.GL11;

public class z {
    public /* synthetic */ float j;
    private static final /* synthetic */ net.minecraft.ar.v i;
    public final /* synthetic */ p g;
    public /* synthetic */ net.minecraft.w.d l;
    public /* synthetic */ float d;
    public /* synthetic */ net.minecraft.w.d h;
    public /* synthetic */ float c;
    public /* synthetic */ float k;
    private static final /* synthetic */ net.minecraft.ar.v e;
    public final /* synthetic */ Q a;
    public final /* synthetic */ a4 b;

    private void a(float f10, float f11) {
        v.M();
        v.a(f10, 1.0f, 0.0f, 0.0f);
        v.a(f11, 0.0f, 1.0f, 0.0f);
        a0.c();
        v.B();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(float f10, float f11, float f12) {
        float f13 = net.minecraft.k.h.a(f12);
        float f14 = -0.2f * net.minecraft.k.h.g(f12 * (float)Math.PI);
        float f15 = -0.4f * net.minecraft.k.h.g(f13 * (float)Math.PI);
        v.b(0.0f, -f14 / 2.0f, f15);
        float f16 = this.d(f10);
        v.b(0.0f, 0.04f + f11 * -1.2f + f16 * -0.5f, -0.72f);
        v.a(f16 * -85.0f, 1.0f, 0.0f, 0.0f);
        this.c();
        float f17 = net.minecraft.k.h.g(f13 * (float)Math.PI);
        v.a(f17 * 20.0f, 1.0f, 0.0f, 0.0f);
        v.d(2.0f, 2.0f, 2.0f);
        this.a(this.l);
    }

    private void a(net.minecraft.w.d d10) {
        String string = I.j();
        v.a(180.0f, 0.0f, 1.0f, 0.0f);
        v.a(180.0f, 0.0f, 0.0f, 1.0f);
        v.d(0.38f, 0.38f, 0.38f);
        v.y();
        this.a.aN().b(e);
        W w2 = W.c();
        I i2 = w2.b();
        v.b(-0.5f, -0.5f, 0.0f);
        String string2 = string;
        v.d(0.0078125f, 0.0078125f, 0.0078125f);
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c(-7.0, 135.0, 0.0).a(0.0, 1.0).d();
        i2.c(135.0, 135.0, 0.0).a(1.0, 1.0).d();
        i2.c(135.0, -7.0, 0.0).a(1.0, 0.0).d();
        i2.c(-7.0, -7.0, 0.0).a(0.0, 0.0).d();
        w2.a();
        s s2 = ea.a(net.minecraft.u.h.a9, d10, this.a.e);
        if (string2 == null) {
            if (s2 != null) {
                this.a.Y.k().a(s2, false);
            }
            v.j();
        }
    }

    static {
        e = new net.minecraft.ar.v("textures/map/map_background.png");
        i = new net.minecraft.ar.v("textures/misc/underwater.png");
    }

    public void e(float f10) {
        block17: {
            float f11;
            float f12;
            float f13;
            net.minecraft.client.q.c c10;
            block19: {
                boolean bl2;
                block18: {
                    boolean bl3;
                    String string;
                    a3 a32;
                    float f14;
                    block13: {
                        boolean bl4;
                        block14: {
                            float f15;
                            float f16;
                            block16: {
                                block15: {
                                    block11: {
                                        boolean bl5;
                                        float f17;
                                        block12: {
                                            c10 = this.a.s;
                                            f14 = c10.c(f10);
                                            a32 = (a3)((Object)MoreObjects.firstNonNull((Object)((Object)c10.aY), (Object)((Object)a3.MAIN_HAND)));
                                            string = I.j();
                                            f13 = c10.E + (c10.at - c10.E) * f10;
                                            f17 = c10.ak + (c10.e - c10.ak) * f10;
                                            bl5 = true;
                                            bl4 = true;
                                            bl3 = ((B)c10).aq();
                                            if (string != null) break block11;
                                            if (!bl3) break block12;
                                            net.minecraft.w.d d10 = c10.a();
                                            bl3 = d10.G();
                                            if (string != null) break block11;
                                            if (!bl3 && d10.w() == net.minecraft.u.h.i) {
                                                a3 a33 = ((B)c10).aN();
                                                boolean bl6 = bl5 = a33 == a3.MAIN_HAND;
                                                if (string == null) {
                                                    bl6 = !bl6;
                                                }
                                                bl4 = bl6;
                                            }
                                        }
                                        this.a(f13, f17);
                                        this.a();
                                        this.b(f10);
                                        v.q();
                                        bl3 = bl5;
                                    }
                                    if (string != null) break block13;
                                    if (!bl3) break block14;
                                    f16 = a32 == a3.MAIN_HAND ? f14 : 0.0f;
                                    f15 = 1.0f - (this.j + (this.d - this.j) * f10);
                                    bl3 = cq.dE.b();
                                    if (string != null) break block15;
                                    if (!bl3) break block16;
                                    bl3 = cq.a(cq.dE, new Object[]{a3.MAIN_HAND, Float.valueOf(f10), Float.valueOf(f13), Float.valueOf(f16), Float.valueOf(f15), this.l});
                                }
                                if (string != null) break block13;
                                if (bl3) break block14;
                            }
                            this.a(c10, f10, f13, a3.MAIN_HAND, f16, this.l, f15);
                        }
                        bl3 = bl4;
                    }
                    if (!bl3) break block17;
                    f12 = a32 == a3.OFF_HAND ? f14 : 0.0f;
                    f11 = 1.0f - (this.c + (this.k - this.c) * f10);
                    bl2 = cq.dE.b();
                    if (string != null) break block18;
                    if (!bl2) break block19;
                    bl2 = cq.a(cq.dE, new Object[]{a3.OFF_HAND, Float.valueOf(f10), Float.valueOf(f13), Float.valueOf(f12), Float.valueOf(f11), this.h});
                }
                if (bl2) break block17;
            }
            this.a(c10, f10, f13, a3.OFF_HAND, f12, this.h, f11);
        }
        v.u();
        a0.a();
    }

    private void a(float f10, float f11, net.minecraft.ar.b b10) {
        block22: {
            block27: {
                ae ae2;
                net.minecraft.client.q.c c10;
                block26: {
                    boolean bl2;
                    String string;
                    block25: {
                        int n2;
                        block23: {
                            block24: {
                                Color color;
                                block21: {
                                    block20: {
                                        block19: {
                                            boolean bl3;
                                            block14: {
                                                block15: {
                                                    block18: {
                                                        int n3;
                                                        block16: {
                                                            block17: {
                                                                string = I.j();
                                                                bl2 = b10 != net.minecraft.ar.b.LEFT;
                                                                float f12 = bl2 ? 1.0f : -1.0f;
                                                                float f13 = net.minecraft.k.h.a(f11);
                                                                float f14 = -0.3f * net.minecraft.k.h.g(f13 * (float)Math.PI);
                                                                float f15 = 0.4f * net.minecraft.k.h.g(f13 * ((float)Math.PI * 2));
                                                                float f16 = -0.4f * net.minecraft.k.h.g(f11 * (float)Math.PI);
                                                                v.b(f12 * (f14 + 0.64000005f), f15 + -0.6f + f10 * -0.6f, f16 + -0.71999997f);
                                                                v.a(f12 * 45.0f, 0.0f, 1.0f, 0.0f);
                                                                float f17 = net.minecraft.k.h.g(f11 * f11 * (float)Math.PI);
                                                                float f18 = net.minecraft.k.h.g(f13 * (float)Math.PI);
                                                                v.a(f12 * f18 * 70.0f, 0.0f, 1.0f, 0.0f);
                                                                v.a(f12 * f17 * -20.0f, 0.0f, 0.0f, 1.0f);
                                                                c10 = this.a.s;
                                                                this.a.aN().b(c10.e());
                                                                v.b(f12 * -1.0f, 3.6f, 3.5f);
                                                                v.a(f12 * 120.0f, 0.0f, 0.0f, 1.0f);
                                                                v.a(200.0f, 1.0f, 0.0f, 0.0f);
                                                                v.a(f12 * -135.0f, 0.0f, 1.0f, 0.0f);
                                                                v.b(f12 * 5.6f, 0.0f, 0.0f);
                                                                ae2 = (ae)this.b.b(c10);
                                                                v.E();
                                                                Color color2 = new Color(cv.k.o());
                                                                color = new Color(color2.getRed(), color2.getGreen(), color2.getBlue());
                                                                bl3 = cj.b.i.a(cv.class).i();
                                                                if (string != null) break block14;
                                                                if (!bl3) break block15;
                                                                GL11.glPushMatrix();
                                                                GL11.glEnable((int)10754);
                                                                GL11.glPolygonOffset((float)1.0f, (float)1000000.0f);
                                                                as.a(as.p, 240.0f, 240.0f);
                                                                GL11.glEnable((int)3042);
                                                                GL11.glDisable((int)3553);
                                                                GL11.glDisable((int)2896);
                                                                GL11.glBlendFunc((int)770, (int)771);
                                                                n3 = cv.l.l();
                                                                if (string != null) break block16;
                                                                if (n3 != 0) break block17;
                                                                GL11.glColor4f((float)((float)color.darker().getRed() / 255.0f), (float)((float)color.darker().darker().getGreen() / 255.0f), (float)((float)color.darker().getBlue() / 255.0f), (float)cv.m.r());
                                                                if (string == null) break block18;
                                                            }
                                                            n3 = cj.h().darker().getRed();
                                                        }
                                                        GL11.glColor4f((float)((float)n3 / 255.0f), (float)((float)cj.h().darker().getGreen() / 255.0f), (float)((float)cj.h().darker().getBlue() / 255.0f), (float)cv.m.r());
                                                    }
                                                    GL11.glDisable((int)2929);
                                                    GL11.glDepthMask((boolean)false);
                                                }
                                                bl3 = f;
                                            }
                                            if (string == null) {
                                                if (!bl3 && ae2 == null) {
                                                    throw new AssertionError();
                                                }
                                                bl3 = bl2;
                                            }
                                            if (!bl3) break block19;
                                            ae2.b(c10);
                                            if (string == null) break block20;
                                        }
                                        ae2.d(c10);
                                    }
                                    n2 = cj.b.i.a(cv.class).i();
                                    if (string != null) break block21;
                                    if (n2 == 0) break block22;
                                    GL11.glEnable((int)2929);
                                    GL11.glDepthMask((boolean)true);
                                    n2 = cv.l.l() ? 1 : 0;
                                }
                                if (string != null) break block23;
                                if (n2 != 0) break block24;
                                GL11.glColor4f((float)((float)color.darker().getRed() / 255.0f), (float)((float)color.darker().darker().getGreen() / 255.0f), (float)((float)color.darker().getBlue() / 255.0f), (float)cv.m.r());
                                if (string == null) break block25;
                            }
                            n2 = cj.h().darker().getRed();
                        }
                        GL11.glColor4f((float)((float)n2 / 255.0f), (float)((float)cj.h().darker().getGreen() / 255.0f), (float)((float)cj.h().darker().getBlue() / 255.0f), (float)cv.m.r());
                    }
                    if (!bl2) break block26;
                    ae2.b(c10);
                    if (string == null) break block27;
                }
                ae2.d(c10);
            }
            GL11.glEnable((int)3553);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2896);
            GL11.glPolygonOffset((float)1.0f, (float)-1000000.0f);
            GL11.glDisable((int)10754);
            GL11.glPopMatrix();
        }
        v.c();
    }

    private void a(float f10, net.minecraft.ar.b b10, net.minecraft.w.d d10) {
        float f11;
        float f12;
        String string = I.j();
        gn gn2 = new gn(b10);
        af.a(gn2);
        float f13 = (float)this.a.s.G() - f10 + 1.0f;
        String string2 = string;
        float f14 = f12 = f13 / (float)d10.o();
        float f15 = 0.8f;
        if (string2 == null) {
            if (f14 < f15) {
                f11 = net.minecraft.k.h.e(net.minecraft.k.h.c(f13 / 4.0f * (float)Math.PI) * 0.1f);
                v.b(0.0f, f11, 0.0f);
            }
            f14 = 1.0f;
            f15 = (float)Math.pow(f12, 27.0);
        }
        f11 = f14 - f15;
        int n2 = b10 == net.minecraft.ar.b.RIGHT ? 1 : -1;
        v.b(f11 * 0.6f * (float)n2, f11 * -0.5f, f11 * 0.0f);
        v.a((float)n2 * f11 * 90.0f, 0.0f, 1.0f, 0.0f);
        v.a(f11 * 10.0f, 1.0f, 0.0f, 0.0f);
        v.a((float)n2 * f11 * 30.0f, 0.0f, 0.0f, 1.0f);
    }

    public void a(B b10, net.minecraft.w.d d10, d d11, boolean bl2) {
        block5: {
            block11: {
                boolean bl3;
                block10: {
                    String string;
                    block6: {
                        boolean bl4;
                        block7: {
                            boolean bl5;
                            block8: {
                                block9: {
                                    net.minecraft.w.d d12;
                                    block4: {
                                        string = I.j();
                                        d12 = d10;
                                        if (string != null) break block4;
                                        if (d12.G()) break block5;
                                        d12 = d10;
                                    }
                                    k k2 = d12.w();
                                    K k3 = K.a(k2);
                                    v.M();
                                    bl3 = bl4 = this.g.a(d10) && k3.p() == aC.TRANSLUCENT;
                                    if (string != null) break block6;
                                    if (!bl3) break block7;
                                    bl5 = fU.ag();
                                    if (string != null) break block8;
                                    if (!bl5) break block9;
                                    bl3 = cS.ee;
                                    if (string != null) break block6;
                                    if (bl3) break block7;
                                }
                                bl5 = false;
                            }
                            v.a(bl5);
                        }
                        this.g.a(d10, b10, d11, bl2);
                        bl3 = bl4;
                    }
                    if (string != null) break block10;
                    if (!bl3) break block11;
                    bl3 = true;
                }
                v.a(bl3);
            }
            v.B();
        }
    }

    private void b() {
        v.b(-0.5f, 0.08f, 0.0f);
        v.a(20.0f, 0.0f, 1.0f, 0.0f);
        v.a(-80.0f, 1.0f, 0.0f, 0.0f);
        v.a(20.0f, 0.0f, 1.0f, 0.0f);
    }

    private void d() {
        block7: {
            String string;
            block9: {
                boolean bl2;
                block8: {
                    string = I.j();
                    bl2 = cj.b.i.a(c7.class).i();
                    if (string != null) break block8;
                    if (!bl2) break block9;
                    bl2 = c7.q.l();
                }
                if (bl2) {
                    GL11.glTranslatef((float)0.0f, (float)-0.5f, (float)0.0f);
                }
            }
            W w2 = W.c();
            I i2 = w2.b();
            v.b(1.0f, 1.0f, 1.0f, 0.9f);
            v.o(519);
            v.a(false);
            v.a();
            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            for (int i3 = 0; i3 < 2; ++i3) {
                v.M();
                c c10 = this.a.an().b("minecraft:blocks/fire_layer_1");
                this.a.aN().b(net.minecraft.client.j.j.x);
                float f10 = c10.i();
                float f11 = c10.l();
                float f12 = c10.u();
                float f13 = c10.m();
                v.b((float)(-(i3 * 2 - 1)) * 0.24f, -0.3f, 0.0f);
                v.a((float)(i3 * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
                i2.a(7, net.minecraft.client.y.b.m);
                i2.c(-0.5, -0.5, -0.5).a(f11, f13).d();
                i2.c(0.5, -0.5, -0.5).a(f10, f13).d();
                i2.c(0.5, 0.5, -0.5).a(f10, f12).d();
                i2.c(-0.5, 0.5, -0.5).a(f11, f12).d();
                w2.a();
                v.B();
                if (string == null) {
                    if (string == null) continue;
                }
                break block7;
            }
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            v.f();
            v.a(true);
            v.o(515);
        }
    }

    public void a(a3 a32) {
        block2: {
            block1: {
                String string;
                block0: {
                    string = I.j();
                    if (string != null) break block0;
                    if (a32 != a3.MAIN_HAND) break block1;
                    this.d = 0.0f;
                }
                if (string == null) break block2;
            }
            this.k = 0.0f;
        }
    }

    public void a(B b10, net.minecraft.w.d d10, d d11) {
        this.a(b10, d10, d11, false);
    }

    private void a(float f10, net.minecraft.ar.b b10, float f11, net.minecraft.w.d d10) {
        String string = I.j();
        float f12 = b10 == net.minecraft.ar.b.RIGHT ? 1.0f : -1.0f;
        v.b(f12 * 0.125f, -0.125f, 0.0f);
        if (string == null) {
            if (!this.a.s.a3()) {
                v.M();
                v.a(f12 * 10.0f, 0.0f, 0.0f, 1.0f);
                this.a(f10, f11, b10);
                v.B();
            }
            v.M();
            v.b(f12 * 0.51f, -0.08f + f10 * -1.2f, -0.75f);
        }
        float f13 = net.minecraft.k.h.a(f11);
        float f14 = net.minecraft.k.h.g(f13 * (float)Math.PI);
        float f15 = -0.5f * f14;
        float f16 = 0.4f * net.minecraft.k.h.g(f13 * ((float)Math.PI * 2));
        float f17 = -0.3f * net.minecraft.k.h.g(f11 * (float)Math.PI);
        v.b(f12 * f15, f16 - 0.3f * f14, f17);
        v.a(f14 * -45.0f, 1.0f, 0.0f, 0.0f);
        v.a(f12 * f14 * -30.0f, 0.0f, 1.0f, 0.0f);
        this.a(d10);
        v.B();
    }

    private void a(float f10) {
        block3: {
            block2: {
                String string = I.j();
                if (string != null) break block2;
                if (fU.ag() && !cS.B()) break block3;
                this.a.aN().b(i);
            }
            W w2 = W.c();
            I i2 = w2.b();
            float f11 = this.a.s.S();
            v.b(f11, f11, f11, 0.5f);
            v.a();
            v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            v.M();
            float f12 = -this.a.s.e / 64.0f;
            float f13 = this.a.s.at / 64.0f;
            i2.a(7, net.minecraft.client.y.b.m);
            i2.c(-1.0, -1.0, -0.5).a(4.0f + f12, 4.0f + f13).d();
            i2.c(1.0, -1.0, -0.5).a(0.0f + f12, 4.0f + f13).d();
            i2.c(1.0, 1.0, -0.5).a(0.0f + f12, 0.0f + f13).d();
            i2.c(-1.0, 1.0, -0.5).a(4.0f + f12, 0.0f + f13).d();
            w2.a();
            v.B();
            v.b(1.0f, 1.0f, 1.0f, 1.0f);
            v.f();
        }
    }

    private void b(float f10, float f11) {
        v.b(0.56f, -0.44f, -0.71999997f);
        v.b(0.0f, f10 * -0.6f, 0.0f);
        v.a(45.0f, 0.0f, 1.0f, 0.0f);
        float f12 = net.minecraft.k.h.g(f11 * f11 * (float)Math.PI);
        float f13 = net.minecraft.k.h.g(net.minecraft.k.h.a(f11) * (float)Math.PI);
        v.a(f12 * -20.0f, 0.0f, 0.0f, 0.0f);
        v.a(f13 * -20.0f, 0.0f, 0.0f, 1.0f);
        v.a(f13 * -80.0f, 0.01f, 0.0f, 0.0f);
        v.b(0.4f, 0.2f, 0.2f);
    }

    private void a(net.minecraft.ar.b b10) {
        block5: {
            ae ae2;
            block4: {
                this.a.aN().b(this.a.s.e());
                b b11 = this.b.b(this.a.s);
                String string = I.j();
                ae2 = (ae)b11;
                v.M();
                float f10 = b10 == net.minecraft.ar.b.RIGHT ? 1.0f : -1.0f;
                v.a(92.0f, 0.0f, 1.0f, 0.0f);
                v.a(45.0f, 1.0f, 0.0f, 0.0f);
                v.a(f10 * -41.0f, 0.0f, 0.0f, 1.0f);
                v.b(f10 * 0.3f, -1.1f, 0.45f);
                assert (ae2 != null);
                if (b10 != net.minecraft.ar.b.RIGHT) break block4;
                ae2.b(this.a.s);
                if (string == null) break block5;
            }
            ae2.d(this.a.s);
        }
        v.B();
    }

    private float d(float f10) {
        float f11 = 1.0f - f10 / 45.0f + 0.1f;
        f11 = net.minecraft.k.h.c(f11, 0.0f, 1.0f);
        f11 = -net.minecraft.k.h.c(f11 * (float)Math.PI) * 0.5f + 0.5f;
        return f11;
    }

    private void c() {
        block3: {
            z z2;
            block2: {
                String string = I.j();
                z2 = this;
                if (string != null) break block2;
                if (z2.a.s.a3()) break block3;
                v.E();
                v.M();
                v.a(90.0f, 0.0f, 1.0f, 0.0f);
                this.a(net.minecraft.ar.b.RIGHT);
                z2 = this;
            }
            z2.a(net.minecraft.ar.b.LEFT);
            v.B();
            v.c();
        }
    }

    private void b(float f10) {
        net.minecraft.client.q.c c10 = this.a.s;
        float f11 = c10.cL + (c10.da - c10.cL) * f10;
        float f12 = c10.dd + (c10.cX - c10.dd) * f10;
        v.a((c10.at - f11) * 0.1f, 1.0f, 0.0f, 0.0f);
        v.a((c10.e - f12) * 0.1f, 0.0f, 1.0f, 0.0f);
    }

    private void a() {
        net.minecraft.client.q.c c10 = this.a.s;
        int n2 = this.a.e.a(new n(c10.a, c10.aF + (double)c10.l(), c10.ax), 0);
        String string = I.j();
        int n3 = fU.bi();
        if (string == null) {
            if (n3 != 0) {
                n2 = gk.a(this.a.Z(), n2);
            }
            n3 = n2 & 0xFFFF;
        }
        float f10 = n3;
        float f11 = n2 >> 16;
        as.a(as.p, f10, f11);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(a var1_1, float var2_2, float var3_3, a3 var4_4, float var5_5, net.minecraft.w.d var6_6, float var7_7) {
        block25: {
            block34: {
                block35: {
                    block36: {
                        block39: {
                            block38: {
                                block40: {
                                    block37: {
                                        block32: {
                                            block33: {
                                                block31: {
                                                    block27: {
                                                        block30: {
                                                            block29: {
                                                                block28: {
                                                                    block26: {
                                                                        block22: {
                                                                            block23: {
                                                                                block24: {
                                                                                    block21: {
                                                                                        block20: {
                                                                                            block19: {
                                                                                                var8_8 = I.j();
                                                                                                v0 = fU.ag();
                                                                                                if (var8_8 != null) break block19;
                                                                                                if (!v0) break block20;
                                                                                                v1 = var4_4;
                                                                                                if (var8_8 != null) break block21;
                                                                                                v0 = cS.a(v1);
                                                                                            }
                                                                                            if (v0 != false) return;
                                                                                        }
                                                                                        v1 = var4_4;
                                                                                    }
                                                                                    var9_9 = v1 == a3.MAIN_HAND;
                                                                                    var10_10 = var9_9 != false ? var1_1.al() : var1_1.al().a();
                                                                                    v.M();
                                                                                    v2 = var6_6.G();
                                                                                    if (var8_8 != null) break block22;
                                                                                    if (!v2) break block23;
                                                                                    v3 = var9_9;
                                                                                    if (var8_8 != null) break block24;
                                                                                    if (!v3) break block25;
                                                                                    v3 = var1_1.a3();
                                                                                }
                                                                                if (v3) break block25;
                                                                                this.a(var7_7, var5_5, var10_10);
                                                                                if (var8_8 == null) break block25;
                                                                            }
                                                                            v2 = var6_6.w() instanceof an;
                                                                        }
                                                                        if (var8_8 != null) break block26;
                                                                        if (!v2) break block27;
                                                                        v2 = var9_9;
                                                                    }
                                                                    if (var8_8 != null) break block28;
                                                                    if (!v2) break block29;
                                                                    v4 = this;
                                                                    if (var8_8 != null) break block30;
                                                                    v2 = v4.h.G();
                                                                }
                                                                if (!v2) break block29;
                                                                this.a(var3_3, var7_7, var5_5);
                                                                if (var8_8 == null) break block25;
                                                            }
                                                            v4 = this;
                                                        }
                                                        v4.a(var7_7, var10_10, var5_5, var6_6);
                                                        if (var8_8 == null) break block25;
                                                    }
                                                    var11_11 = var10_10 == net.minecraft.ar.b.RIGHT ? 1 : 0;
                                                    v5 = var1_1.aq();
                                                    if (var8_8 != null) break block31;
                                                    if (v5 == 0) break block32;
                                                    v6 = var1_1;
                                                    if (var8_8 != null) break block33;
                                                    v5 = v6.G();
                                                }
                                                if (v5 <= 0) break block32;
                                                v6 = var1_1;
                                            }
                                            if (v6.aN() != var4_4) break block32;
                                            v7 = var11_11;
                                            if (var8_8 == null) {
                                                v7 = var12_12 = v7 != 0 ? 1 : -1;
                                            }
                                            if (var8_8 != null) ** GOTO lbl68
                                            switch (aN.a[var6_6.h().ordinal()]) {
                                                case 1: {
                                                    this.b(var10_10, var7_7);
lbl68:
                                                    // 2 sources

                                                    if (var8_8 == null) break;
                                                }
                                                case 2: 
                                                case 3: {
                                                    this.a(var2_2, var10_10, var6_6);
                                                    this.b(var10_10, var7_7);
                                                    if (var8_8 == null) break;
                                                }
                                                case 4: {
                                                    this.b(var10_10, var7_7);
                                                    if (var8_8 == null) break;
                                                }
                                                case 5: {
                                                    this.b(var10_10, var7_7);
                                                    v.b((float)var12_12 * -0.2785682f, 0.18344387f, 0.15731531f);
                                                    v.a(-13.935f, 1.0f, 0.0f, 0.0f);
                                                    v.a((float)var12_12 * 35.3f, 0.0f, 1.0f, 0.0f);
                                                    v.a((float)var12_12 * -9.785f, 0.0f, 0.0f, 1.0f);
                                                    var13_14 = (float)var6_6.o() - ((float)this.a.s.G() - var2_2 + 1.0f);
                                                    var14_15 = var13_14 / 20.0f;
                                                    var14_15 = (var14_15 * var14_15 + var14_15 * 2.0f) / 3.0f;
                                                    cfr_temp_0 = var14_15 - 1.0f;
                                                    v8 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                    if (var8_8 == null) {
                                                        if (v8 > 0) {
                                                            var14_15 = 1.0f;
                                                        }
                                                        v8 = (cfr_temp_1 = var14_15 - 0.1f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                    }
                                                    if (var8_8 == null) {
                                                        if (v8 > 0) {
                                                            var15_16 = net.minecraft.k.h.g((var13_14 - 0.1f) * 1.3f);
                                                            var16_18 = var14_15 - 0.1f;
                                                            var17_19 = var15_16 * var16_18;
                                                            v.b(var17_19 * 0.0f, var17_19 * 0.004f, var17_19 * 0.0f);
                                                        }
                                                        v.b(var14_15 * 0.0f, var14_15 * 0.0f, var14_15 * 0.04f);
                                                        v.d(1.0f, 1.0f, 1.0f + var14_15 * 0.2f);
                                                        v8 = var12_12;
                                                    }
                                                    v.a((float)v8 * 45.0f, 0.0f, -1.0f, 0.0f);
                                                    break;
                                                }
                                            }
                                            if (var8_8 == null) break block34;
                                        }
                                        var12_13 = -0.4f * net.minecraft.k.h.g(net.minecraft.k.h.a(var5_5) * 3.1415927f);
                                        var13_14 = 0.2f * net.minecraft.k.h.g(net.minecraft.k.h.a(var5_5) * 6.2831855f);
                                        var14_15 = -0.2f * net.minecraft.k.h.g(var5_5 * 3.1415927f);
                                        v9 = var11_11;
                                        if (var8_8 == null) {
                                            v9 = v9 != 0 ? 1 : -1;
                                        }
                                        var15_17 = v9;
                                        var16_18 = 1.0f - (this.j + (this.d - this.j) * var2_2);
                                        var17_19 = this.a.s.c(var2_2);
                                        v10 = bB.k.l();
                                        if (var8_8 != null) break block35;
                                        if (v10 == 0) break block36;
                                        v10 = cj.b.i.a(bn.class).i() ? 1 : 0;
                                        if (var8_8 != null) break block35;
                                        if (v10 == 0 || bn.l == null) break block36;
                                        cfr_temp_2 = this.a.s.o(bn.l) - bn.m.r();
                                        v10 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                        if (var8_8 != null) break block35;
                                        if (v10 > 0) break block36;
                                        v10 = cj.b.i.a(bB.class).i() ? 1 : 0;
                                        if (var8_8 != null) break block35;
                                        if (v10 == 0) break block36;
                                        v11 = bB.k.l();
                                        if (var8_8 != null) break block37;
                                        if (!v11) break block38;
                                        v11 = cj.b.i.a(bn.class).i();
                                    }
                                    if (!v11 || bn.l == null) break block38;
                                    v12 = this;
                                    if (var8_8 != null) break block39;
                                    if (!(v12.a.s.o(bn.l) <= bn.m.r()) || !cj.b.i.a(bB.class).i()) break block38;
                                    if (var10_10 == net.minecraft.ar.b.LEFT) break block40;
                                    this.b(var16_18 / 3.0f, var17_19);
                                    this.b();
                                    if (var8_8 == null) break block34;
                                }
                                v.b((float)var15_17 * var12_13, var13_14, var14_15);
                                this.b(var10_10, var7_7);
                                this.a(var10_10, var5_5);
                                if (var8_8 == null) break block34;
                            }
                            this.b(var10_10, var7_7);
                            v12 = this;
                        }
                        v12.a(var10_10, var5_5);
                        if (var8_8 == null) break block34;
                    }
                    v10 = var15_17;
                }
                v.b((float)v10 * var12_13, var13_14, var14_15);
                this.b(var10_10, var7_7);
                this.a(var10_10, var5_5);
            }
            v13 = var11_11 != 0 ? net.minecraft.client.x.d.FIRST_PERSON_RIGHT_HAND : net.minecraft.client.x.d.FIRST_PERSON_LEFT_HAND;
            v14 = var11_11;
            if (var8_8 == null) {
                v14 = v14 == 0 ? 1 : 0;
            }
            this.a(var1_1, var6_6, v13, (boolean)v14);
        }
        v.B();
    }

    public void e() {
        block33: {
            z z2;
            block34: {
                float f10;
                block32: {
                    net.minecraft.w.d d10;
                    String string;
                    block30: {
                        float f11;
                        block31: {
                            float f12;
                            net.minecraft.w.d d11;
                            block22: {
                                float f13;
                                block24: {
                                    boolean bl2;
                                    boolean bl3;
                                    block29: {
                                        z z3;
                                        block28: {
                                            boolean bl4;
                                            block27: {
                                                block25: {
                                                    block26: {
                                                        boolean bl5;
                                                        block23: {
                                                            net.minecraft.client.q.c c10;
                                                            net.minecraft.client.q.c c11;
                                                            block20: {
                                                                block21: {
                                                                    this.j = this.d;
                                                                    this.c = this.k;
                                                                    string = I.j();
                                                                    c11 = this.a.s;
                                                                    d11 = c11.av();
                                                                    d10 = c11.b();
                                                                    c10 = c11;
                                                                    if (string != null) break block20;
                                                                    if (!c10.D()) break block21;
                                                                    this.d = net.minecraft.k.h.c(this.d - 0.4f, 0.0f, 1.0f);
                                                                    this.k = net.minecraft.k.h.c(this.k - 0.4f, 0.0f, 1.0f);
                                                                    if (string == null) break block22;
                                                                }
                                                                c10 = c11;
                                                            }
                                                            f13 = c10.e(1.0f);
                                                            bl5 = cq.bA.b();
                                                            if (string != null) break block23;
                                                            if (!bl5) break block24;
                                                            bl5 = cq.a(cq.bA, this.l, d11, c11.cB.a);
                                                        }
                                                        bl3 = bl5;
                                                        bl2 = cq.a(cq.bA, this.h, d10, -1);
                                                        bl4 = bl3;
                                                        if (string != null) break block25;
                                                        if (bl4) break block26;
                                                        bl4 = Objects.equals(this.l, d11);
                                                        if (string != null) break block25;
                                                        if (!bl4) {
                                                            this.l = d11;
                                                        }
                                                    }
                                                    bl4 = bl3;
                                                }
                                                if (string != null) break block27;
                                                if (bl4) break block28;
                                                z3 = this;
                                                if (string != null) break block29;
                                                bl4 = Objects.equals(z3.h, d10);
                                            }
                                            if (!bl4) {
                                                this.h = d10;
                                            }
                                        }
                                        z3 = this;
                                    }
                                    z3.d += net.minecraft.k.h.c((!bl3 ? f13 * f13 * f13 : 0.0f) - this.d, -0.4f, 0.4f);
                                    boolean bl6 = bl2;
                                    if (string == null) {
                                        bl6 = !bl6;
                                    }
                                    this.k += net.minecraft.k.h.c((float)bl6 - this.k, -0.4f, 0.4f);
                                    if (string == null) break block22;
                                }
                                this.d += net.minecraft.k.h.c((Objects.equals(this.l, d11) ? f13 * f13 * f13 : 0.0f) - this.d, -0.4f, 0.4f);
                                boolean bl7 = Objects.equals(this.h, d10);
                                if (string == null) {
                                    bl7 = bl7;
                                }
                                this.k += net.minecraft.k.h.c((float)bl7 - this.k, -0.4f, 0.4f);
                            }
                            f10 = (f12 = this.d - 0.1f) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (string != null) break block30;
                            if (f10 >= 0) break block31;
                            this.l = d11;
                            f10 = (float)fU.ag();
                            if (string != null) break block30;
                            if (f10 != false) {
                                cS.b(this.l);
                            }
                        }
                        f10 = (f11 = this.k - 0.1f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    }
                    if (string != null) break block32;
                    if (f10 >= 0) break block33;
                    z2 = this;
                    if (string != null) break block34;
                    z2.h = d10;
                    f10 = (float)fU.ag();
                }
                if (f10 == false) break block33;
                z2 = this;
            }
            cS.c(z2.h);
        }
    }

    private void a(net.minecraft.ar.b b10, float f10) {
        block4: {
            int n2;
            block2: {
                int n3;
                block3: {
                    float f11 = System.currentTimeMillis() / 3L % 360L;
                    String string = I.j();
                    n3 = b10 == net.minecraft.ar.b.RIGHT ? 1 : -1;
                    float f12 = net.minecraft.k.h.g(f10 * f10 * (float)Math.PI);
                    v.a((float)n3 * (45.0f + f12 * -20.0f), 0.0f, 1.0f, 0.0f);
                    float f13 = net.minecraft.k.h.g(net.minecraft.k.h.a(f10) * (float)Math.PI);
                    v.a((float)n3 * f13 * -20.0f, 0.0f, 0.0f, 1.0f);
                    v.a(f13 * -80.0f, 1.0f, 0.0f, 0.0f);
                    n2 = cj.b.i.a(bB.class).i();
                    if (string != null) break block2;
                    if (n2 == 0) break block3;
                    n2 = bB.l.l() ? 1 : 0;
                    if (string != null) break block2;
                    if (n2 == 0) break block3;
                    v.a(f11, 0.0f, 1.0f, 0.0f);
                    if (string == null) break block4;
                }
                n2 = n3;
            }
            v.a((float)n2 * -45.0f, 0.0f, 1.0f, 0.0f);
        }
        v.b(0.0f, 0.02f, 0.0f);
    }

    public z(Q q2) {
        this.l = net.minecraft.w.d.m;
        this.h = net.minecraft.w.d.m;
        this.a = q2;
        this.b = q2.aQ();
        this.g = q2.Y();
    }

    public void c(float f10) {
        block23: {
            boolean bl2;
            block26: {
                String string;
                block24: {
                    block25: {
                        block22: {
                            block19: {
                                block20: {
                                    Object object;
                                    n n2;
                                    i i2;
                                    block21: {
                                        String string2 = I.j();
                                        v.v();
                                        string = string2;
                                        bl2 = this.a.s.ap();
                                        if (string != null) break block19;
                                        if (!bl2) break block20;
                                        i2 = this.a.e.d(new n(this.a.s));
                                        n2 = new n(this.a.s);
                                        net.minecraft.client.q.c c10 = this.a.s;
                                        int n3 = 0;
                                        while (n3 < 8) {
                                            double d10 = c10.a + (double)(((float)(n3 % 2) - 0.5f) * c10.ad * 0.8f);
                                            double d11 = c10.aF + (double)(((float)((n3 >> 1) % 2) - 0.5f) * 0.1f);
                                            double d12 = c10.ax + (double)(((float)((n3 >> 2) % 2) - 0.5f) * c10.ad * 0.8f);
                                            n n4 = new n(d10, d11 + (double)c10.l(), d12);
                                            i i3 = this.a.e.d(n4);
                                            if (string == null) {
                                                bl2 = i3.b();
                                                if (string != null) break block19;
                                                if (bl2) {
                                                    i2 = i3;
                                                    n2 = n4;
                                                }
                                                ++n3;
                                            }
                                            if (string == null) continue;
                                        }
                                        object = i2.n();
                                        if (string != null) break block21;
                                        if (object == aW.INVISIBLE) break block20;
                                        object = cq.a(cq.bQ);
                                    }
                                    aW aW2 = object;
                                    bl2 = cq.a(cq.bu, new Object[]{this.a.s, Float.valueOf(f10), aW2, i2, n2});
                                    if (string != null) break block19;
                                    if (!bl2) {
                                        this.a(this.a.W().b().a(i2));
                                    }
                                }
                                bl2 = this.a.s.ae();
                            }
                            if (string != null) break block22;
                            if (bl2) break block23;
                            bl2 = this.a.s.a(net.minecraft.ac.c.L);
                        }
                        if (string != null) break block24;
                        if (!bl2) break block25;
                        bl2 = cq.a(cq.c, this.a.s, Float.valueOf(f10));
                        if (string != null) break block24;
                        if (!bl2) {
                            this.a(f10);
                        }
                    }
                    bl2 = this.a.s.p();
                }
                if (string != null) break block26;
                if (!bl2) break block23;
                bl2 = cq.a(cq.S, this.a.s, Float.valueOf(f10));
            }
            if (!bl2) {
                this.d();
            }
        }
        v.e();
    }

    private void a(c c10) {
        this.a.aN().b(net.minecraft.client.j.j.x);
        W w2 = W.c();
        I i2 = w2.b();
        v.b(0.1f, 0.1f, 0.1f, 0.5f);
        v.M();
        float f10 = c10.i();
        float f11 = c10.l();
        float f12 = c10.u();
        float f13 = c10.m();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c(-1.0, -1.0, -0.5).a(f11, f13).d();
        i2.c(1.0, -1.0, -0.5).a(f10, f13).d();
        i2.c(1.0, 1.0, -0.5).a(f10, f12).d();
        i2.c(-1.0, 1.0, -0.5).a(f11, f12).d();
        w2.a();
        v.B();
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void b(net.minecraft.ar.b b10, float f10) {
        gn gn2 = new gn(b10);
        af.a(gn2);
        int n2 = b10 == net.minecraft.ar.b.RIGHT ? 1 : -1;
        v.b((float)n2 * 0.56f, -0.52f + f10 * -0.6f, -0.72f);
    }
}

