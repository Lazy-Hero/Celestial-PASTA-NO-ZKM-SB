/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.util.vector.Quaternion
 */
package net.minecraft.client.a;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;
import net.minecraft.client.a.B;
import net.minecraft.client.a.F;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.L;
import net.minecraft.client.a.S;
import net.minecraft.client.a.a;
import net.minecraft.client.a.a6;
import net.minecraft.client.a.aG;
import net.minecraft.client.a.aQ;
import net.minecraft.client.a.aT;
import net.minecraft.client.a.aV;
import net.minecraft.client.a.aY;
import net.minecraft.client.a.ad;
import net.minecraft.client.a.ag;
import net.minecraft.client.a.aj;
import net.minecraft.client.a.as;
import net.minecraft.client.a.at;
import net.minecraft.client.a.b;
import net.minecraft.client.a.e;
import net.minecraft.client.a.h;
import net.minecraft.client.a.k;
import net.minecraft.client.a.n;
import net.minecraft.client.a.o;
import net.minecraft.client.a.w;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.util.vector.Quaternion;

public class v {
    private static final /* synthetic */ B e;
    private static final /* synthetic */ e n;
    private static final /* synthetic */ n s;
    private static final /* synthetic */ w k;
    private static final /* synthetic */ FloatBuffer v;
    private static final /* synthetic */ h b;
    private static final /* synthetic */ aQ d;
    private static final /* synthetic */ aG f;
    private static final /* synthetic */ a6 x;
    private static final /* synthetic */ S l;
    private static final /* synthetic */ k w;
    private static final /* synthetic */ aj i;
    private static final /* synthetic */ b u;
    private static final /* synthetic */ aY[] p;
    private static final /* synthetic */ aT a;
    private static final /* synthetic */ e g;
    private static /* synthetic */ int t;
    private static /* synthetic */ String j;
    private static final /* synthetic */ e[] q;
    private static final /* synthetic */ a o;
    private static final /* synthetic */ e m;
    public static /* synthetic */ boolean h;
    private static final /* synthetic */ FloatBuffer c;
    private static /* synthetic */ int r;

    private static F a(at at2) {
        switch (at2) {
            case S: {
                return net.minecraft.client.a.v.b.c;
            }
            case T: {
                return net.minecraft.client.a.v.b.b;
            }
            case R: {
                return net.minecraft.client.a.v.b.a;
            }
            case Q: {
                return net.minecraft.client.a.v.b.d;
            }
        }
        return net.minecraft.client.a.v.b.c;
    }

    public static void o(int n2) {
        block3: {
            int n3;
            block2: {
                String string = I.j();
                n3 = n2;
                if (string != null) break block2;
                if (n3 == net.minecraft.client.a.v.l.b) break block3;
                net.minecraft.client.a.v.l.b = n2;
                n3 = n2;
            }
            GL11.glDepthFunc((int)n3);
        }
    }

    private static void i(int n2) {
        block3: {
            int n3;
            int n4;
            block2: {
                String string = I.j();
                n4 = n2;
                n3 = net.minecraft.client.a.v.x.b;
                if (string != null) break block2;
                if (n4 == n3) break block3;
                net.minecraft.client.a.v.x.b = n2;
                n4 = 2917;
                n3 = n2;
            }
            GL11.glFogi((int)n4, (int)n3);
        }
    }

    public static void e(float f10, float f11, float f12) {
        GL11.glVertex3f((float)f10, (float)f11, (float)f12);
    }

    public static void t(int n2) {
        block0: {
            if (n2 == net.minecraft.client.a.v.p[net.minecraft.client.a.v.r].b) break block0;
            net.minecraft.client.a.v.p[net.minecraft.client.a.v.r].b = n2;
            GL11.glBindTexture((int)3553, (int)n2);
        }
    }

    public static void n(int n2) {
        GL11.glEnable((int)n2);
    }

    public static void a(int n2) {
        GL11.glDisableClientState((int)n2);
    }

    public static void d(float f10, float f11, float f12) {
        GL11.glScalef((float)f10, (float)f11, (float)f12);
    }

    public static void b(float f10, float f11, float f12) {
        GL11.glTranslatef((float)f10, (float)f11, (float)f12);
    }

    public static void b(f f10) {
        f10.a = net.minecraft.client.a.e.a(net.minecraft.client.a.v.d.b);
        f10.b = net.minecraft.client.a.v.d.c;
        f10.c = net.minecraft.client.a.v.d.a;
    }

    public static void a(ad ad2) {
        net.minecraft.client.a.v.j(ad2.mode);
    }

    public static void d(int n2, int n3, int n4, int n5) {
        GL11.glViewport((int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void l(int n2) {
        q[n2].a();
    }

    public static boolean k() {
        return net.minecraft.client.a.e.a(net.minecraft.client.a.v.x.e);
    }

    public static void B() {
        GL11.glPopMatrix();
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        GL11.glGetFloat((int)n2, (FloatBuffer)floatBuffer);
    }

    public static void z() {
        block1: {
            int n2;
            int n3;
            int n4;
            int n5;
            block4: {
                int n6;
                int n7;
                block3: {
                    String string;
                    block2: {
                        int n8;
                        block0: {
                            string = I.j();
                            n8 = fU.a8();
                            if (string != null) break block0;
                            if (n8 == 0) break block1;
                            n8 = GL11.glGetInteger((int)34016);
                        }
                        n5 = n8;
                        n4 = GL11.glGetInteger((int)32873);
                        n3 = net.minecraft.client.a.v.H();
                        n7 = n2 = net.minecraft.client.a.v.N();
                        if (string != null) break block2;
                        if (n7 <= 0) break block1;
                        n7 = n5;
                    }
                    n6 = n3;
                    if (string != null) break block3;
                    if (n7 != n6) break block4;
                    n7 = n4;
                    n6 = n2;
                }
                if (n7 == n6) break block1;
            }
            fU.b("checkTexture: act: " + n3 + ", glAct: " + n5 + ", tex: " + n2 + ", glTex: " + n4);
        }
    }

    public static void b(float f10, float f11, float f12, float f13) {
        block4: {
            float f14;
            float f15;
            block2: {
                block3: {
                    String string = I.j();
                    f15 = f10;
                    f14 = net.minecraft.client.a.v.u.b;
                    if (string != null) break block2;
                    if (f15 != f14) break block3;
                    f15 = f11;
                    f14 = net.minecraft.client.a.v.u.c;
                    if (string != null) break block2;
                    if (f15 != f14) break block3;
                    f15 = f12;
                    f14 = net.minecraft.client.a.v.u.a;
                    if (string != null) break block2;
                    if (f15 != f14) break block3;
                    f15 = f13;
                    f14 = net.minecraft.client.a.v.u.d;
                    if (string != null) break block2;
                    if (f15 == f14) break block4;
                }
                net.minecraft.client.a.v.u.b = f10;
                net.minecraft.client.a.v.u.c = f11;
                net.minecraft.client.a.v.u.a = f12;
                net.minecraft.client.a.v.u.d = f13;
                f15 = f10;
                f14 = f11;
            }
            GL11.glColor4f((float)f15, (float)f14, (float)f12, (float)f13);
        }
    }

    public static void q() {
        g.b();
    }

    public static void c(int n2, int n3, int n4) {
        GL11.glTexParameteri((int)n2, (int)n3, (int)n4);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL11.glColorPointer((int)n2, (int)n3, (int)n4, (ByteBuffer)byteBuffer);
    }

    public static void c() {
        net.minecraft.client.a.v.s.b.b();
    }

    public static FloatBuffer a(FloatBuffer floatBuffer, Quaternion quaternion) {
        floatBuffer.clear();
        float f10 = quaternion.x * quaternion.x;
        float f11 = quaternion.x * quaternion.y;
        float f12 = quaternion.x * quaternion.z;
        float f13 = quaternion.x * quaternion.w;
        float f14 = quaternion.y * quaternion.y;
        float f15 = quaternion.y * quaternion.z;
        float f16 = quaternion.y * quaternion.w;
        float f17 = quaternion.z * quaternion.z;
        float f18 = quaternion.z * quaternion.w;
        floatBuffer.put(1.0f - 2.0f * (f14 + f17));
        floatBuffer.put(2.0f * (f11 + f18));
        floatBuffer.put(2.0f * (f12 - f16));
        floatBuffer.put(0.0f);
        floatBuffer.put(2.0f * (f11 - f18));
        floatBuffer.put(1.0f - 2.0f * (f10 + f17));
        floatBuffer.put(2.0f * (f15 + f13));
        floatBuffer.put(0.0f);
        floatBuffer.put(2.0f * (f12 + f16));
        floatBuffer.put(2.0f * (f15 - f13));
        floatBuffer.put(1.0f - 2.0f * (f10 + f14));
        floatBuffer.put(0.0f);
        floatBuffer.put(0.0f);
        floatBuffer.put(0.0f);
        floatBuffer.put(0.0f);
        floatBuffer.put(1.0f);
        floatBuffer.rewind();
        return floatBuffer;
    }

    public static void r() {
        net.minecraft.client.a.v.w.b.b();
    }

    public static void c(int n2, FloatBuffer floatBuffer) {
        GL11.glFog((int)n2, (FloatBuffer)floatBuffer);
    }

    public static void f() {
        net.minecraft.client.a.v.d.b.a();
    }

    public static void g() {
        net.minecraft.client.a.v.o.a.b();
    }

    public static void e(int n2, int n3) {
        GL11.glPolygonMode((int)n2, (int)n3);
    }

    public static String c(int n2) {
        return GL11.glGetString((int)n2);
    }

    public static void a(IntBuffer intBuffer) {
        block2: {
            String string = I.j();
            intBuffer.rewind();
            String string2 = string;
            while (intBuffer.position() < intBuffer.limit()) {
                int n2 = intBuffer.get();
                net.minecraft.client.a.v.v(n2);
                if (string2 == null) {
                    if (string2 == null) continue;
                }
                break block2;
            }
            intBuffer.rewind();
        }
    }

    public static int k(int n2) {
        return GL11.glGenLists((int)n2);
    }

    public static void a(o o2, G g10) {
        net.minecraft.client.a.v.f(o2.factor, g10.factor);
    }

    public static void a(ag ag2) {
        net.minecraft.client.a.v.i(ag2.capabilityId);
    }

    public static void v(int n2) {
        if (n2 != 0) {
            GL11.glDeleteTextures((int)n2);
            for (aY aY2 : p) {
                if (aY2.b != n2) continue;
                aY2.b = 0;
            }
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        GL11.glReadPixels((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (IntBuffer)intBuffer);
    }

    public static void F() {
        net.minecraft.client.a.v.o.a.a();
    }

    public static void d(int n2, int n3, int n4) {
        GL11.glTexEnvi((int)n2, (int)n3, (int)n4);
    }

    public static void a(FloatBuffer floatBuffer) {
        GL11.glMultMatrix((FloatBuffer)floatBuffer);
    }

    public static void a(L l2) {
        net.minecraft.client.a.v.w(l2.opcode);
    }

    public static void h() {
        net.minecraft.client.a.v.w.b.a();
    }

    public static void y() {
        n.a();
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        GL11.glLight((int)n2, (int)n3, (FloatBuffer)floatBuffer);
    }

    public static int b() {
        return GL11.glGenTextures();
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        GL11.glCopyTexSubImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9);
    }

    public static void b(aV aV2) {
        aV2.b();
    }

    public static void a(int n2, IntBuffer intBuffer) {
        GL11.glGetInteger((int)n2, (IntBuffer)intBuffer);
    }

    public static void p(int n2) {
        GL14.glBlendEquation((int)n2);
    }

    public static void c(float f10, float f11, float f12, float f13) {
        block4: {
            float f14;
            float f15;
            block2: {
                block3: {
                    String string = I.j();
                    f15 = f10;
                    f14 = net.minecraft.client.a.v.k.b.b;
                    if (string != null) break block2;
                    if (f15 != f14) break block3;
                    f15 = f11;
                    f14 = net.minecraft.client.a.v.k.b.c;
                    if (string != null) break block2;
                    if (f15 != f14) break block3;
                    f15 = f12;
                    f14 = net.minecraft.client.a.v.k.b.a;
                    if (string != null) break block2;
                    if (f15 != f14) break block3;
                    f15 = f13;
                    f14 = net.minecraft.client.a.v.k.b.d;
                    if (string != null) break block2;
                    if (f15 == f14) break block4;
                }
                net.minecraft.client.a.v.k.b.b = f10;
                net.minecraft.client.a.v.k.b.c = f11;
                net.minecraft.client.a.v.k.b.a = f12;
                net.minecraft.client.a.v.k.b.d = f13;
                f15 = f10;
                f14 = f11;
            }
            GL11.glClearColor((float)f15, (float)f14, (float)f12, (float)f13);
        }
    }

    public static void d() {
        GL11.glEnd();
    }

    public static void a(double d10, double d11, double d12, double d13, double d14, double d15) {
        GL11.glOrtho((double)d10, (double)d11, (double)d12, (double)d13, (double)d14, (double)d15);
    }

    public static void a(at at2, int n2, FloatBuffer floatBuffer) {
        GL11.glTexGen((int)net.minecraft.client.a.v.a((at)at2).b, (int)n2, (FloatBuffer)floatBuffer);
    }

    public static void s() {
        net.minecraft.client.a.v.d(8960, 8704, 8448);
        net.minecraft.client.a.v.d(8960, 34161, 8448);
        net.minecraft.client.a.v.d(8960, 34162, 8448);
        net.minecraft.client.a.v.d(8960, 34176, 5890);
        net.minecraft.client.a.v.d(8960, 34184, 5890);
        net.minecraft.client.a.v.d(8960, 34192, 768);
        net.minecraft.client.a.v.d(8960, 34200, 770);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        GL11.glNormalPointer((int)n2, (int)n3, (ByteBuffer)byteBuffer);
    }

    public static void a() {
        net.minecraft.client.a.v.d.b.b();
    }

    static {
        int n2;
        v = BufferUtils.createFloatBuffer((int)16);
        net.minecraft.client.a.v.b("we5Uvc");
        c = BufferUtils.createFloatBuffer((int)4);
        a = new aT(null);
        n = new e(2896);
        q = new e[8];
        h = true;
        for (n2 = 0; n2 < 8; ++n2) {
            net.minecraft.client.a.v.q[n2] = new e(16384 + n2);
        }
        w = new k(null);
        d = new aQ(null);
        l = new S(null);
        x = new a6(null);
        s = new n(null);
        i = new aj(null);
        o = new a(null);
        b = new h(null);
        k = new w(null);
        f = new aG(null);
        m = new e(2977);
        p = new aY[32];
        for (n2 = 0; n2 < p.length; ++n2) {
            net.minecraft.client.a.v.p[n2] = new aY(null);
        }
        t = 7425;
        g = new e(32826);
        e = new B(null);
        u = new b();
    }

    public static void M() {
        GL11.glPushMatrix();
    }

    public static void I() {
        net.minecraft.client.a.v.i.b.a();
    }

    public static int N() {
        return net.minecraft.client.a.v.p[net.minecraft.client.a.v.r].b;
    }

    public static void w(int n2) {
        block3: {
            int n3;
            block2: {
                String string = I.j();
                n3 = n2;
                if (string != null) break block2;
                if (n3 == net.minecraft.client.a.v.o.b) break block3;
                net.minecraft.client.a.v.o.b = n2;
                n3 = n2;
            }
            GL11.glLogicOp((int)n3);
        }
    }

    public static int D() {
        return GL11.glGetError();
    }

    public static void v() {
        net.minecraft.client.a.v.a.b.a();
    }

    private static void j(int n2) {
        block3: {
            int n3;
            block2: {
                String string = I.j();
                n3 = n2;
                if (string != null) break block2;
                if (n3 == net.minecraft.client.a.v.s.a) break block3;
                net.minecraft.client.a.v.s.a = n2;
                n3 = n2;
            }
            GL11.glCullFace((int)n3);
        }
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, @Nullable IntBuffer intBuffer) {
        GL11.glTexImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (IntBuffer)intBuffer);
    }

    public static void a(aV aV2) {
        aV2.a();
    }

    public static void w() {
        GL11.glEndList();
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        GL11.glTexSubImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (IntBuffer)intBuffer);
    }

    public static void i() {
        GL11.glPopAttrib();
    }

    public static void e(int n2) {
        GL11.glBegin((int)n2);
    }

    public static void a(f f10) {
        net.minecraft.client.a.v.d.b.a(f10.a);
        net.minecraft.client.a.v.f(f10.b, f10.c);
    }

    public static void d(float f10) {
        GL11.glLineWidth((float)f10);
    }

    public static void a(float f10, float f11, float f12) {
        GL11.glNormal3f((float)f10, (float)f11, (float)f12);
    }

    public static void O() {
        GL11.glPushAttrib((int)8256);
    }

    public static void b(float f10, float f11) {
        block4: {
            float f12;
            float f13;
            block2: {
                block3: {
                    String string = I.j();
                    f13 = f10;
                    f12 = net.minecraft.client.a.v.i.c;
                    if (string != null) break block2;
                    if (f13 != f12) break block3;
                    f13 = f11;
                    f12 = net.minecraft.client.a.v.i.d;
                    if (string != null) break block2;
                    if (f13 == f12) break block4;
                }
                net.minecraft.client.a.v.i.c = f10;
                net.minecraft.client.a.v.i.d = f11;
                f13 = f10;
                f12 = f11;
            }
            GL11.glPolygonOffset((float)f13, (float)f12);
        }
    }

    public static void E() {
        net.minecraft.client.a.v.s.b.a();
    }

    public static void b(String string) {
        j = string;
    }

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        GL11.glTexEnv((int)n2, (int)n3, (FloatBuffer)floatBuffer);
    }

    public static void b(int n2, int n3, int n4) {
        GL11.glDrawArrays((int)n2, (int)n3, (int)n4);
    }

    public static void L() {
        net.minecraft.client.a.v.p[net.minecraft.client.a.v.r].a.a();
    }

    public static int H() {
        return as.U + r;
    }

    public static int b(int n2) {
        return GL11.glGetInteger((int)n2);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        GL11.glColorPointer((int)n2, (int)n3, (int)n4, (long)n5);
    }

    public static void K() {
        GL11.glBindTexture((int)3553, (int)net.minecraft.client.a.v.p[net.minecraft.client.a.v.r].b);
    }

    public static void m() {
        m.b();
    }

    public static void u() {
        g.a();
    }

    public static void a(o o2, G g10, o o3, G g11) {
        net.minecraft.client.a.v.e(o2.factor, g10.factor, o3.factor, g11.factor);
    }

    public static void u(int n2) {
        block3: {
            int n3;
            int n4;
            block2: {
                String string = I.j();
                n4 = r;
                n3 = n2 - as.U;
                if (string != null) break block2;
                if (n4 == n3) break block3;
                n4 = n2;
                n3 = as.U;
            }
            r = n4 - n3;
            as.m(n2);
        }
    }

    public static void b(double d10, double d11, double d12) {
        GL11.glTranslated((double)d10, (double)d11, (double)d12);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(double d10, double d11, double d12) {
        GL11.glScaled((double)d10, (double)d11, (double)d12);
    }

    public static void c(int n2, int n3) {
        GL11.glPixelStorei((int)n2, (int)n3);
    }

    public static void a(at at2, int n2) {
        block3: {
            int n3;
            int n4;
            block2: {
                F f10 = net.minecraft.client.a.v.a(at2);
                String string = I.j();
                n4 = n2;
                n3 = f10.a;
                if (string != null) break block2;
                if (n4 == n3) break block3;
                f10.a = n2;
                n4 = f10.b;
                n3 = 9472;
            }
            GL11.glTexGeni((int)n4, (int)n3, (int)n2);
        }
    }

    public static void a(double d10) {
        block3: {
            double d11;
            block2: {
                String string = I.j();
                d11 = d10;
                if (string != null) break block2;
                if (d11 == net.minecraft.client.a.v.k.a) break block3;
                net.minecraft.client.a.v.k.a = d10;
                d11 = d10;
            }
            GL11.glClearDepth((double)d11);
        }
    }

    public static void p() {
        net.minecraft.client.a.v.u.b = -1.0f;
        net.minecraft.client.a.v.u.c = -1.0f;
        net.minecraft.client.a.v.u.a = -1.0f;
        net.minecraft.client.a.v.u.d = -1.0f;
    }

    public static void b(int n2, int n3, int n4, int n5) {
        GL11.glTexCoordPointer((int)n2, (int)n3, (int)n4, (long)n5);
    }

    public static void c(int n2, int n3, int n4, int n5) {
        GL11.glVertexPointer((int)n2, (int)n3, (int)n4, (long)n5);
    }

    public static void a(Quaternion quaternion) {
        net.minecraft.client.a.v.a(net.minecraft.client.a.v.a(v, quaternion));
    }

    public static void b(boolean bl2) {
        net.minecraft.client.a.v.x.e.a(bl2);
    }

    public static void c(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL11.glVertexPointer((int)n2, (int)n3, (int)n4, (ByteBuffer)byteBuffer);
    }

    public static void o() {
        net.minecraft.client.a.v.x.e.b();
    }

    public static void t() {
        net.minecraft.client.a.v.l.a.b();
    }

    public static void e(int n2, int n3, int n4, int n5) {
        block4: {
            int n6;
            int n7;
            block2: {
                block3: {
                    String string = I.j();
                    n7 = n2;
                    n6 = net.minecraft.client.a.v.d.c;
                    if (string != null) break block2;
                    if (n7 != n6) break block3;
                    n7 = n3;
                    n6 = net.minecraft.client.a.v.d.a;
                    if (string != null) break block2;
                    if (n7 != n6) break block3;
                    n7 = n4;
                    n6 = net.minecraft.client.a.v.d.e;
                    if (string != null) break block2;
                    if (n7 != n6) break block3;
                    n7 = n5;
                    n6 = net.minecraft.client.a.v.d.d;
                    if (string != null) break block2;
                    if (n7 == n6) break block4;
                }
                net.minecraft.client.a.v.d.c = n2;
                net.minecraft.client.a.v.d.a = n3;
                net.minecraft.client.a.v.d.e = n4;
                net.minecraft.client.a.v.d.d = n5;
                n7 = n2;
                n6 = n3;
            }
            as.c(n7, n6, n4, n5);
        }
    }

    public static void a(int n2, int n3, float f10) {
        GL11.glTexEnvf((int)n2, (int)n3, (float)f10);
    }

    public static void J() {
        m.a();
    }

    public static void b(at at2) {
        net.minecraft.client.a.v.a((at)at2).c.a();
    }

    public static void b(int n2, int n3) {
        GL11.glFogi((int)n2, (int)n3);
    }

    public static void G() {
        net.minecraft.client.a.v.i.b.b();
    }

    public static void c(at at2) {
        net.minecraft.client.a.v.a((at)at2).c.b();
    }

    public static void b(float f10) {
        block3: {
            float f11;
            block2: {
                String string = I.j();
                float f12 = f10 - net.minecraft.client.a.v.x.a;
                f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (string != null) break block2;
                if (f11 == false) break block3;
                net.minecraft.client.a.v.x.a = f10;
                f11 = 2914;
            }
            GL11.glFogf((int)f11, (float)f10);
        }
    }

    public static void g(int n2) {
        block3: {
            int n3;
            block2: {
                String string = I.j();
                n3 = n2;
                if (string != null) break block2;
                if (n3 == t) break block3;
                t = n2;
                n3 = n2;
            }
            GL11.glShadeModel((int)n3);
        }
    }

    public static void j() {
        n.b();
    }

    public static void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        block4: {
            boolean bl6;
            boolean bl7;
            block2: {
                block3: {
                    String string = I.j();
                    bl7 = bl2;
                    bl6 = net.minecraft.client.a.v.e.a;
                    if (string != null) break block2;
                    if (bl7 != bl6) break block3;
                    bl7 = bl3;
                    bl6 = net.minecraft.client.a.v.e.c;
                    if (string != null) break block2;
                    if (bl7 != bl6) break block3;
                    bl7 = bl4;
                    bl6 = net.minecraft.client.a.v.e.d;
                    if (string != null) break block2;
                    if (bl7 != bl6) break block3;
                    bl7 = bl5;
                    bl6 = net.minecraft.client.a.v.e.b;
                    if (string != null) break block2;
                    if (bl7 == bl6) break block4;
                }
                net.minecraft.client.a.v.e.a = bl2;
                net.minecraft.client.a.v.e.c = bl3;
                net.minecraft.client.a.v.e.d = bl4;
                net.minecraft.client.a.v.e.b = bl5;
                bl7 = bl2;
                bl6 = bl3;
            }
            GL11.glColorMask((boolean)bl7, (boolean)bl6, (boolean)bl4, (boolean)bl5);
        }
    }

    public static void f(int n2) {
        GL11.glDisable((int)n2);
    }

    public static void a(int n2, int n3) {
        GL11.glDeleteLists((int)n2, (int)n3);
    }

    public static void b(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL11.glTexCoordPointer((int)n2, (int)n3, (int)n4, (ByteBuffer)byteBuffer);
    }

    public static void h(int n2) {
        block3: {
            int n3;
            block2: {
                String string = I.j();
                n3 = h;
                if (string != null) break block2;
                if (n3 == 0) break block3;
                n3 = n2;
            }
            GL11.glClear((int)n3);
        }
    }

    public static void s(int n2) {
        GL11.glCallList((int)n2);
    }

    public static void r(int n2) {
        GL11.glEnableClientState((int)n2);
    }

    public static void d(int n2) {
        q[n2].b();
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        GL11.glGetTexImage((int)n2, (int)n3, (int)n4, (int)n5, (IntBuffer)intBuffer);
    }

    public static void c(float f10) {
        block3: {
            float f11;
            block2: {
                String string = I.j();
                float f12 = f10 - net.minecraft.client.a.v.x.c;
                f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (string != null) break block2;
                if (f11 == false) break block3;
                net.minecraft.client.a.v.x.c = f10;
                f11 = 2916;
            }
            GL11.glFogf((int)f11, (float)f10);
        }
    }

    public static void d(int n2, int n3) {
        GL11.glNewList((int)n2, (int)n3);
    }

    public static int a(int n2, int n3, int n4) {
        return GL11.glGetTexLevelParameteri((int)n2, (int)n3, (int)n4);
    }

    public static void f(int n2, int n3) {
        block4: {
            int n4;
            int n5;
            block2: {
                block3: {
                    String string = I.j();
                    n5 = n2;
                    n4 = net.minecraft.client.a.v.d.c;
                    if (string != null) break block2;
                    if (n5 != n4) break block3;
                    n5 = n3;
                    n4 = net.minecraft.client.a.v.d.a;
                    if (string != null) break block2;
                    if (n5 == n4) break block4;
                }
                net.minecraft.client.a.v.d.c = n2;
                net.minecraft.client.a.v.d.a = n3;
                n5 = n2;
                n4 = n3;
            }
            GL11.glBlendFunc((int)n5, (int)n4);
        }
    }

    public static void a(int n2, float f10) {
        block4: {
            int n3;
            block2: {
                block3: {
                    String string = I.j();
                    n3 = n2;
                    if (string != null) break block2;
                    if (n3 != net.minecraft.client.a.v.a.c) break block3;
                    float f11 = f10 - net.minecraft.client.a.v.a.a;
                    n3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (string != null) break block2;
                    if (n3 == 0) break block4;
                }
                net.minecraft.client.a.v.a.c = n2;
                net.minecraft.client.a.v.a.a = f10;
                n3 = n2;
            }
            GL11.glAlphaFunc((int)n3, (float)f10);
        }
    }

    public static void e() {
        net.minecraft.client.a.v.a.b.b();
    }

    public static void a(boolean bl2) {
        block3: {
            boolean bl3;
            block2: {
                String string = I.j();
                bl3 = bl2;
                if (string != null) break block2;
                if (bl3 == net.minecraft.client.a.v.l.c) break block3;
                net.minecraft.client.a.v.l.c = bl2;
                bl3 = bl2;
            }
            GL11.glDepthMask((boolean)bl3);
        }
    }

    public static void n() {
        net.minecraft.client.a.v.l.a.a();
    }

    public static void C() {
        net.minecraft.client.a.v.x.e.a();
    }

    public static void q(int n2) {
        GL11.glMatrixMode((int)n2);
    }

    public static void l() {
        GL11.glLoadIdentity();
    }

    public static void b(int n2, int n3, float f10) {
        GL11.glTexParameterf((int)n2, (int)n3, (float)f10);
    }

    public static void x() {
        net.minecraft.client.a.v.p[net.minecraft.client.a.v.r].a.b();
    }

    public static void a(float f10, float f11, float f12, float f13) {
        GL11.glRotatef((float)f10, (float)f11, (float)f12, (float)f13);
    }

    public static String A() {
        return j;
    }

    public static void c(float f10, float f11, float f12) {
        net.minecraft.client.a.v.b(f10, f11, f12, 1.0f);
    }

    public static void m(int n2) {
        c.put(0, (float)(n2 >> 16 & 0xFF) / 255.0f);
        c.put(1, (float)(n2 >> 8 & 0xFF) / 255.0f);
        c.put(2, (float)(n2 >> 0 & 0xFF) / 255.0f);
        c.put(3, (float)(n2 >> 24 & 0xFF) / 255.0f);
        net.minecraft.client.a.v.b(8960, 8705, c);
        net.minecraft.client.a.v.d(8960, 8704, 34160);
        net.minecraft.client.a.v.d(8960, 34161, 7681);
        net.minecraft.client.a.v.d(8960, 34176, 34166);
        net.minecraft.client.a.v.d(8960, 34192, 768);
        net.minecraft.client.a.v.d(8960, 34162, 7681);
        net.minecraft.client.a.v.d(8960, 34184, 5890);
        net.minecraft.client.a.v.d(8960, 34200, 770);
    }

    public static void a(float f10, float f11) {
        GL11.glTexCoord2f((float)f10, (float)f11);
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        GL11.glLightModel((int)n2, (FloatBuffer)floatBuffer);
    }

    public static void g(int n2, int n3) {
        block4: {
            int n4;
            int n5;
            block2: {
                block3: {
                    String string = I.j();
                    n5 = n2;
                    n4 = net.minecraft.client.a.v.w.a;
                    if (string != null) break block2;
                    if (n5 != n4) break block3;
                    n5 = n3;
                    n4 = net.minecraft.client.a.v.w.c;
                    if (string != null) break block2;
                    if (n5 == n4) break block4;
                }
                net.minecraft.client.a.v.w.a = n2;
                net.minecraft.client.a.v.w.c = n3;
                n5 = n2;
                n4 = n3;
            }
            GL11.glColorMaterial((int)n5, (int)n4);
        }
    }

    public static void a(float f10) {
        block3: {
            float f11;
            block2: {
                String string = I.j();
                float f12 = f10 - net.minecraft.client.a.v.x.d;
                f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                if (string != null) break block2;
                if (f11 == false) break block3;
                net.minecraft.client.a.v.x.d = f10;
                f11 = 2915;
            }
            GL11.glFogf((int)f11, (float)f10);
        }
    }
}

