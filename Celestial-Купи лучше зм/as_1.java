/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL30
 */
import java.nio.IntBuffer;
import net.minecraft.N.F;
import net.minecraft.U.x;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.client.G.a;
import net.minecraft.client.G.c;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.an;
import net.minecraft.client.a.v;
import net.minecraft.client.a.z;
import net.minecraft.client.j.j;
import net.minecraft.client.y.b;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class as {
    private static final /* synthetic */ net.minecraft.ar.v a;

    public static void a(net.minecraft.client.a.x x2, int n2, float f10, long l2) {
        block29: {
            int n3;
            int n4;
            int n5;
            Q q2;
            block35: {
                block30: {
                    int n6;
                    block36: {
                        block37: {
                            String string;
                            block31: {
                                block32: {
                                    int n7;
                                    block33: {
                                        block34: {
                                            int n8;
                                            block28: {
                                                string = dB.i();
                                                n8 = cS.ei;
                                                if (string == null) break block28;
                                                if (n8 <= 0) break block29;
                                                n8 = cS.dZ = cS.dZ - 1;
                                            }
                                            if (n8 > 0) break block29;
                                            q2 = Q.P();
                                            q2.an.a("shadow pass");
                                            aF aF2 = q2.a2;
                                            cS.dn = true;
                                            cS.dZ = cS.ch;
                                            cS.ab = q2.ac.L;
                                            q2.ac.L = 1;
                                            cS.a("pre shadow");
                                            GL11.glMatrixMode((int)5889);
                                            GL11.glPushMatrix();
                                            GL11.glMatrixMode((int)5888);
                                            GL11.glPushMatrix();
                                            q2.an.a("shadow clear");
                                            EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)cS.bz);
                                            cS.a("shadow bind sfb");
                                            cS.a(30);
                                            q2.an.a("shadow camera");
                                            x2.a(f10, 2);
                                            cS.a(f10);
                                            boolean bl2 = q2.ac.L;
                                            if (string != null) {
                                                bl2 = bl2;
                                            }
                                            an.a(q2.s, bl2);
                                            cS.a("shadow camera");
                                            GL20.glDrawBuffers((IntBuffer)cS.b1);
                                            cS.a("shadow drawbuffers");
                                            GL11.glReadBuffer((int)0);
                                            cS.a("shadow readbuffer");
                                            EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36096, (int)3553, (int)cS.h.get(0), (int)0);
                                            int n9 = cS.ac;
                                            if (string != null) {
                                                if (n9 != 0) {
                                                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)cS.aS.get(0), (int)0);
                                                }
                                                cS.g("shadow fb");
                                                GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                                                n9 = cS.ac;
                                            }
                                            if (string != null) {
                                                n9 = n9 != 0 ? 16640 : 256;
                                            }
                                            GL11.glClear((int)n9);
                                            cS.a("shadow clear");
                                            q2.an.a("shadow frustum");
                                            c c10 = fJ.b();
                                            q2.an.a("shadow culling");
                                            a a10 = new a(c10);
                                            x x3 = q2.Z();
                                            double d10 = x3.am + (x3.a - x3.am) * (double)f10;
                                            double d11 = x3.af + (x3.aF - x3.af) * (double)f10;
                                            double d12 = x3.n + (x3.ax - x3.n) * (double)f10;
                                            a10.a(d10, d11, d12);
                                            v.g(7425);
                                            v.t();
                                            v.o(515);
                                            v.a(true);
                                            v.a(true, true, true, true);
                                            v.E();
                                            q2.an.a("shadow prepareterrain");
                                            q2.aN().b(j.x);
                                            q2.an.a("shadow setupterrain");
                                            int n10 = 0;
                                            n10 = x2.m;
                                            x2.m = n10 + 1;
                                            aF2.a(x3, f10, a10, n10, q2.s.ae());
                                            q2.an.a("shadow updatechunks");
                                            q2.an.a("shadow terrain");
                                            v.q(5888);
                                            v.M();
                                            v.v();
                                            aF2.a(aC.SOLID, (double)f10, 2, x3);
                                            cS.a("shadow terrain solid");
                                            v.e();
                                            aF2.a(aC.CUTOUT_MIPPED, (double)f10, 2, x3);
                                            cS.a("shadow terrain cutoutmipped");
                                            q2.aN().a(j.x).a(false, false);
                                            aF2.a(aC.CUTOUT, (double)f10, 2, x3);
                                            cS.a("shadow terrain cutout");
                                            q2.aN().a(j.x).b();
                                            v.g(7424);
                                            v.a(516, 0.1f);
                                            v.q(5888);
                                            v.B();
                                            v.M();
                                            q2.an.a("shadow entities");
                                            n5 = cq.d3.b();
                                            if (string != null) {
                                                if (n5 != 0) {
                                                    cq.e(cq.d3, 0);
                                                }
                                                aF2.a(x3, a10, f10);
                                                cS.a("shadow entities");
                                                v.q(5888);
                                                v.B();
                                                v.a(true);
                                                v.f();
                                                v.c();
                                                v.e(770, 771, 1, 0);
                                                v.a(516, 0.1f);
                                                n5 = cS.ei;
                                            }
                                            if (string != null) {
                                                if (n5 >= 2) {
                                                    v.u(33989);
                                                    cS.a("pre copy shadow depth");
                                                    GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)cS.dN, (int)cS.L);
                                                    cS.a("copy shadow depth");
                                                    v.u(33984);
                                                }
                                                v.f();
                                                v.a(true);
                                                q2.aN().b(j.x);
                                                v.g(7425);
                                                cS.a("shadow pre-translucent");
                                                GL20.glDrawBuffers((IntBuffer)cS.b1);
                                                cS.a("shadow drawbuffers pre-translucent");
                                                cS.g("shadow pre-translucent");
                                                n5 = cS.aO() ? 1 : 0;
                                            }
                                            if (string != null) {
                                                if (n5 != 0) {
                                                    q2.an.a("shadow translucent");
                                                    aF2.a(aC.TRANSLUCENT, (double)f10, 2, x3);
                                                    cS.a("shadow translucent");
                                                }
                                                n5 = cq.d3.b() ? 1 : 0;
                                            }
                                            if (string != null) {
                                                if (n5 != 0) {
                                                    a0.c();
                                                    cq.d(cq.d3, 1);
                                                    aF2.a(x3, a10, f10);
                                                    cq.d(cq.d3, -1);
                                                    a0.a();
                                                    cS.a("shadow entities 1");
                                                }
                                                v.g(7424);
                                                v.a(true);
                                                v.c();
                                                v.f();
                                                GL11.glFlush();
                                                cS.a("shadow flush");
                                                cS.dn = false;
                                                q2.ac.L = cS.ab;
                                                q2.an.a("shadow postprocess");
                                                n5 = cS.x ? 1 : 0;
                                            }
                                            if (string == null) break block29;
                                            if (n5 == 0) break block30;
                                            int n3 = cS.ei;
                                            n3 = 1;
                                            if (string == null) break block31;
                                            if (n4 < n3) break block32;
                                            n7 = cS.du[0];
                                            if (string != null) {
                                                if (n7 != 0) {
                                                    v.u(33988);
                                                    v.t(cS.h.get(0));
                                                    GL30.glGenerateMipmap((int)3553);
                                                    int n11 = cS.z[0];
                                                    if (string != null) {
                                                        n11 = n11 != 0 ? 9984 : 9987;
                                                    }
                                                    GL11.glTexParameteri((int)3553, (int)10241, (int)n11);
                                                }
                                                n7 = cS.ei;
                                            }
                                            if (string == null) break block33;
                                            if (n7 < 2) break block34;
                                            n7 = cS.du[1];
                                            if (string == null) break block33;
                                            if (n7 != 0) {
                                                v.u(33989);
                                                v.t(cS.h.get(1));
                                                GL30.glGenerateMipmap((int)3553);
                                                int n12 = cS.z[1];
                                                if (string != null) {
                                                    n12 = n12 != 0 ? 9984 : 9987;
                                                }
                                                GL11.glTexParameteri((int)3553, (int)10241, (int)n12);
                                            }
                                        }
                                        n7 = 33984;
                                    }
                                    v.u(n7);
                                }
                                int n3 = cS.ac;
                                n3 = 1;
                            }
                            if (string == null) break block35;
                            if (n4 < n3) break block30;
                            n6 = cS.dP[0];
                            if (string != null) {
                                if (n6 != 0) {
                                    v.u(33997);
                                    v.t(cS.aS.get(0));
                                    GL30.glGenerateMipmap((int)3553);
                                    int n13 = cS.dm[0];
                                    if (string != null) {
                                        n13 = n13 != 0 ? 9984 : 9987;
                                    }
                                    GL11.glTexParameteri((int)3553, (int)10241, (int)n13);
                                }
                                n6 = cS.ac;
                            }
                            if (string == null) break block36;
                            if (n6 < 2) break block37;
                            n6 = cS.dP[1];
                            if (string == null) break block36;
                            if (n6 != 0) {
                                v.u(33998);
                                v.t(cS.aS.get(1));
                                GL30.glGenerateMipmap((int)3553);
                                int n14 = cS.dm[1];
                                if (string != null) {
                                    n14 = n14 != 0 ? 9984 : 9987;
                                }
                                GL11.glTexParameteri((int)3553, (int)10241, (int)n14);
                            }
                        }
                        n6 = 33984;
                    }
                    v.u(n6);
                }
                cS.a("shadow postprocess");
                EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)cS.by);
                int n3 = 0;
                n3 = 0;
            }
            GL11.glViewport((int)n4, (int)n3, (int)cS.cQ, (int)cS.bw);
            cS.cg = null;
            q2.aN().b(j.x);
            cS.a(7);
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            n5 = cS.a("shadow end");
        }
    }

    public static void j() {
        block6: {
            int n2;
            block2: {
                block3: {
                    int n3;
                    String string;
                    block4: {
                        block5: {
                            string = dB.i();
                            n2 = cS.dj;
                            if (string == null) break block2;
                            if (n2 == 0) break block3;
                            n3 = cS.h();
                            if (string == null) break block4;
                            if (n3 == 0) break block5;
                            n3 = cS.ao() ? 1 : 0;
                            if (string == null) break block4;
                            if (n3 == 0) break block5;
                            cS.a(19);
                            if (string != null) break block6;
                        }
                        n3 = 16;
                    }
                    cS.a(n3);
                    if (string != null) break block6;
                }
                n2 = 0;
            }
            cS.a(n2);
        }
    }

    public static void o() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = cS.dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 7;
            }
            cS.a(n2);
        }
    }

    static {
        a = new net.minecraft.ar.v("textures/entity/end_portal.png");
    }

    public static void i() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = cS.dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                v.a(true);
                n2 = 3;
            }
            cS.a(n2);
        }
    }

    public static void m() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = cS.dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 3;
            }
            cS.a(n2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void h() {
        cS.a(14);
    }

    public static void c(net.minecraft.client.a.x x2, float f10, int n2) {
        block6: {
            boolean bl2;
            boolean bl3;
            String string;
            block7: {
                boolean bl4;
                block8: {
                    boolean bl5;
                    block5: {
                        string = dB.i();
                        bl5 = cS.dn;
                        if (string == null) break block5;
                        if (bl5) break block6;
                        bl5 = cS.aD();
                    }
                    bl4 = bl5;
                    bl3 = cS.aA();
                    bl2 = bl4;
                    if (string == null) break block7;
                    if (!bl2) break block8;
                    bl2 = bl3;
                    if (string == null) break block7;
                    if (bl2) break block6;
                }
                cS.E();
                cS.ac();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                cS.a(bl4, bl3);
                x2.a(f10, n2, true, false, false);
                cS.at();
                bl2 = bl4;
            }
            if (string != null) {
                bl2 = !bl2;
            }
            boolean bl6 = bl3;
            if (string != null) {
                bl6 = !bl6;
            }
            cS.b(bl2, bl6);
            cS.a(false, false);
        }
    }

    public static void a(net.minecraft.client.a.x x2, float f10, int n2) {
        block3: {
            block2: {
                String string = dB.i();
                if (string == null) break block2;
                if (cS.dn) break block3;
                cS.N();
                x2.a(f10, n2, false, true, false);
            }
            cS.Y();
        }
    }

    public static boolean a(F f10, double d10, double d11, double d12, float f11, int n2, float f12) {
        String string;
        block15: {
            block16: {
                boolean bl2;
                block17: {
                    string = dB.i();
                    if (string == null) break block15;
                    if (cS.dn) break block16;
                    bl2 = cS.ef[cS.bf];
                    if (string == null) break block17;
                    if (bl2) break block16;
                    bl2 = false;
                }
                return bl2;
            }
            v.y();
            fU.o().b(a);
        }
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, b.s);
        float f13 = 0.5f;
        float f14 = f13 * 0.15f;
        float f15 = f13 * 0.3f;
        float f16 = f13 * 0.4f;
        float f17 = 0.0f;
        float f18 = 0.2f;
        float f19 = (float)(System.currentTimeMillis() % 100000L) / 100000.0f;
        int n3 = 240;
        boolean bl3 = f10.a(aA.SOUTH);
        if (string != null) {
            if (bl3) {
                i2.c(d10, d11, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f17 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f17 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11 + 1.0, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f18 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10, d11 + 1.0, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f18 + f19, f17 + f19).a(n3, n3).d();
            }
            bl3 = f10.a(aA.NORTH);
        }
        if (string != null) {
            if (bl3) {
                i2.c(d10, d11 + 1.0, d12).a(f14, f15, f16, 1.0f).a(f18 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11 + 1.0, d12).a(f14, f15, f16, 1.0f).a(f18 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11, d12).a(f14, f15, f16, 1.0f).a(f17 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10, d11, d12).a(f14, f15, f16, 1.0f).a(f17 + f19, f18 + f19).a(n3, n3).d();
            }
            bl3 = f10.a(aA.EAST);
        }
        if (string != null) {
            if (bl3) {
                i2.c(d10 + 1.0, d11 + 1.0, d12).a(f14, f15, f16, 1.0f).a(f18 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11 + 1.0, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f18 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f17 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11, d12).a(f14, f15, f16, 1.0f).a(f17 + f19, f18 + f19).a(n3, n3).d();
            }
            bl3 = f10.a(aA.WEST);
        }
        if (string != null) {
            if (bl3) {
                i2.c(d10, d11, d12).a(f14, f15, f16, 1.0f).a(f17 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10, d11, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f17 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10, d11 + 1.0, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f18 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10, d11 + 1.0, d12).a(f14, f15, f16, 1.0f).a(f18 + f19, f17 + f19).a(n3, n3).d();
            }
            bl3 = f10.a(aA.DOWN);
        }
        if (string != null) {
            if (bl3) {
                i2.c(d10, d11, d12).a(f14, f15, f16, 1.0f).a(f17 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11, d12).a(f14, f15, f16, 1.0f).a(f17 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f18 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10, d11, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f18 + f19, f17 + f19).a(n3, n3).d();
            }
            bl3 = f10.a(aA.UP);
        }
        if (string != null) {
            if (bl3) {
                i2.c(d10, d11 + (double)f12, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f17 + f19, f17 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11 + (double)f12, d12 + 1.0).a(f14, f15, f16, 1.0f).a(f17 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10 + 1.0, d11 + (double)f12, d12).a(f14, f15, f16, 1.0f).a(f18 + f19, f18 + f19).a(n3, n3).d();
                i2.c(d10, d11 + (double)f12, d12).a(f14, f15, f16, 1.0f).a(f18 + f19, f17 + f19).a(n3, n3).d();
            }
            w2.a();
            v.j();
            bl3 = true;
        }
        return bl3;
    }

    public static void l() {
        block3: {
            int n2;
            block4: {
                String string;
                block2: {
                    string = dB.i();
                    n2 = cS.dj;
                    if (string == null) break block2;
                    if (n2 == 0) break block3;
                    cS.a(11);
                    n2 = cS.ef[11];
                }
                if (string == null) break block4;
                if (n2 != cS.ef[7]) break block3;
                cS.a(cS.bF);
                n2 = 0;
            }
            v.a(n2 != 0);
        }
    }

    public static void k() {
        block6: {
            int n2;
            String string;
            block5: {
                string = dB.i();
                n2 = cS.dj;
                if (string == null) break block5;
                if (n2 == 0) break block6;
                n2 = cS.bo;
            }
            if (string != null) {
                if (n2 >= 2) {
                    v.u(33995);
                    cS.a("pre copy depth");
                    GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)cS.cQ, (int)cS.bw);
                    cS.a("copy depth");
                    v.u(33984);
                }
                n2 = 12;
            }
            cS.a(n2);
        }
    }

    public static void a(net.minecraft.client.G.b b10, double d10, double d11, double d12) {
        b10.a(d10, d11, d12);
    }

    public static void b(aC aC2) {
        block6: {
            int n2;
            block5: {
                String string = dB.i();
                n2 = cS.a(aC2);
                if (string != null) {
                    if (n2 != 0) {
                        v.E();
                    }
                    n2 = net.minecraft.client.a.as.f();
                }
                if (string == null) break block5;
                if (n2 == 0) break block6;
                GL11.glEnableClientState((int)32885);
                GL20.glEnableVertexAttribArray((int)cS.b8);
                GL20.glEnableVertexAttribArray((int)cS.cP);
                n2 = cS.dA;
            }
            GL20.glEnableVertexAttribArray((int)n2);
        }
    }

    public static void g() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = cS.dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 3;
            }
            cS.a(n2);
        }
    }

    public static void f() {
        v.f();
    }

    public static void c() {
    }

    public static void d() {
    }

    public static void e() {
        int n2 = 14;
        GL11.glVertexPointer((int)3, (int)5126, (int)56, (long)0L);
        GL11.glColorPointer((int)4, (int)5121, (int)56, (long)12L);
        GL11.glTexCoordPointer((int)2, (int)5126, (int)56, (long)16L);
        net.minecraft.client.a.as.f(net.minecraft.client.a.as.p);
        GL11.glTexCoordPointer((int)2, (int)5122, (int)56, (long)24L);
        net.minecraft.client.a.as.f(net.minecraft.client.a.as.U);
        GL11.glNormalPointer((int)5120, (int)56, (long)28L);
        GL20.glVertexAttribPointer((int)cS.b8, (int)2, (int)5126, (boolean)false, (int)56, (long)32L);
        GL20.glVertexAttribPointer((int)cS.cP, (int)4, (int)5122, (boolean)false, (int)56, (long)40L);
        GL20.glVertexAttribPointer((int)cS.dA, (int)3, (int)5122, (boolean)false, (int)56, (long)48L);
    }

    public static void b(net.minecraft.client.a.x x2, float f10, int n2) {
        block3: {
            boolean bl2;
            block4: {
                String string;
                block2: {
                    string = dB.i();
                    bl2 = cS.dn;
                    if (string == null) break block2;
                    if (bl2) break block3;
                    bl2 = cS.W();
                }
                if (string == null) break block4;
                if (bl2) break block3;
                cS.E();
                v.a();
                cS.ac();
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                cS.a(cS.au(), cS.x());
                x2.a(f10, n2, true, false, true);
                cS.at();
                cS.b(true, true);
                bl2 = false;
            }
            cS.a(bl2, false);
        }
    }

    public static void n() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = cS.dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                cS.bB = true;
                n2 = 7;
            }
            cS.a(n2);
        }
    }

    public static void p() {
        cS.a(17);
    }

    public static void a() {
        block3: {
            int n2;
            block2: {
                String string = dB.i();
                n2 = cS.dj;
                if (string == null) break block2;
                if (n2 == 0) break block3;
                n2 = 7;
            }
            cS.a(n2);
        }
    }

    public static void a(z z2, float f10, boolean bl2) {
        String string = dB.i();
        cS.b(true);
        String string2 = string;
        v.a(true);
        boolean bl3 = bl2;
        if (string2 != null) {
            if (bl3) {
                v.o(519);
                GL11.glPushMatrix();
                IntBuffer intBuffer = cS.cg;
                cS.a(cS.bc);
                cS.ee = true;
                z2.e(f10);
                cS.ee = false;
                cS.a(intBuffer);
                GL11.glPopMatrix();
            }
            v.o(515);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            z2.e(f10);
            bl3 = false;
        }
        cS.b(bl3);
    }

    public static void a(aF aF2, x x2, double d10, net.minecraft.client.G.b b10, int n2, boolean bl2) {
        aF2.a(x2, d10, b10, n2, bl2);
    }

    public static void b() {
    }

    public static void a(aC aC2) {
        String string = dB.i();
        boolean bl2 = net.minecraft.client.a.as.f();
        if (string != null) {
            if (bl2) {
                GL11.glDisableClientState((int)32885);
                GL20.glDisableVertexAttribArray((int)cS.b8);
                GL20.glDisableVertexAttribArray((int)cS.cP);
                GL20.glDisableVertexAttribArray((int)cS.dA);
            }
            bl2 = cS.a(aC2);
        }
        if (bl2) {
            v.c();
        }
    }
}

