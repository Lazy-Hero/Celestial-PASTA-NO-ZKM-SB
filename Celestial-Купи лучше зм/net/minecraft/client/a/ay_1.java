/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GLContext
 */
package net.minecraft.client.a;

import java.nio.FloatBuffer;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.aV;
import net.minecraft.client.a.at;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GLContext;

final class ay
extends aV {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        int n2;
        String string;
        block6: {
            String string2 = I.j();
            v.v();
            v.a(519, 0.0f);
            string = string2;
            v.y();
            GL11.glLightModel((int)2899, (FloatBuffer)a0.a(0.2f, 0.2f, 0.2f, 1.0f));
            for (int i2 = 0; i2 < 8; ++i2) {
                v.l(i2);
                GL11.glLight((int)(16384 + i2), (int)4608, (FloatBuffer)a0.a(0.0f, 0.0f, 0.0f, 1.0f));
                GL11.glLight((int)(16384 + i2), (int)4611, (FloatBuffer)a0.a(0.0f, 0.0f, 1.0f, 0.0f));
                n2 = i2;
                if (string == null) {
                    int n3;
                    if (string == null) {
                        if (n2 == 0) {
                            GL11.glLight((int)(16384 + i2), (int)4609, (FloatBuffer)a0.a(1.0f, 1.0f, 1.0f, 1.0f));
                            GL11.glLight((int)(16384 + i2), (int)4610, (FloatBuffer)a0.a(1.0f, 1.0f, 1.0f, 1.0f));
                            if (string == null) continue;
                        }
                        GL11.glLight((int)(16384 + i2), (int)4609, (FloatBuffer)a0.a(0.0f, 0.0f, 0.0f, 1.0f));
                        n3 = 16384 + i2;
                    }
                    GL11.glLight((int)n3, (int)4610, (FloatBuffer)a0.a(0.0f, 0.0f, 0.0f, 1.0f));
                    if (string == null) continue;
                }
                break block6;
            }
            v.h();
            v.g(1032, 5634);
            v.n();
            v.o(513);
            v.a(true);
            v.f();
            v.a(o.ONE, G.ZERO);
            v.a(o.ONE, G.ZERO, o.ONE, G.ZERO);
            GL14.glBlendEquation((int)32774);
            v.C();
            GL11.glFogi((int)2917, (int)2048);
            v.b(1.0f);
            v.a(0.0f);
            v.c(1.0f);
            GL11.glFog((int)2918, (FloatBuffer)a0.a(0.0f, 0.0f, 0.0f, 0.0f));
            n2 = GLContext.getCapabilities().GL_NV_fog_distance ? 1 : 0;
        }
        if (string == null) {
            if (n2 != 0) {
                GL11.glFogi((int)2917, (int)34140);
            }
            v.b(0.0f, 0.0f);
            v.F();
            v.w(5379);
            v.b(at.S);
            v.a(at.S, 9216);
            v.a(at.S, 9474, a0.a(1.0f, 0.0f, 0.0f, 0.0f));
            v.a(at.S, 9217, a0.a(1.0f, 0.0f, 0.0f, 0.0f));
            v.b(at.T);
            v.a(at.T, 9216);
            v.a(at.T, 9474, a0.a(0.0f, 1.0f, 0.0f, 0.0f));
            v.a(at.T, 9217, a0.a(0.0f, 1.0f, 0.0f, 0.0f));
            v.b(at.R);
            v.a(at.R, 9216);
            v.a(at.R, 9474, a0.a(0.0f, 0.0f, 0.0f, 0.0f));
            v.a(at.R, 9217, a0.a(0.0f, 0.0f, 0.0f, 0.0f));
            v.b(at.Q);
            v.a(at.Q, 9216);
            v.a(at.Q, 9474, a0.a(0.0f, 0.0f, 0.0f, 0.0f));
            v.a(at.Q, 9217, a0.a(0.0f, 0.0f, 0.0f, 0.0f));
            v.u(0);
            GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
            GL11.glTexParameteri((int)3553, (int)10241, (int)9986);
            GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
            GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
            GL11.glTexParameteri((int)3553, (int)33085, (int)1000);
            GL11.glTexParameteri((int)3553, (int)33083, (int)1000);
            GL11.glTexParameteri((int)3553, (int)33082, (int)-1000);
            GL11.glTexParameterf((int)3553, (int)34049, (float)0.0f);
            GL11.glTexEnvi((int)8960, (int)8704, (int)8448);
            GL11.glTexEnv((int)8960, (int)8705, (FloatBuffer)a0.a(0.0f, 0.0f, 0.0f, 0.0f));
            GL11.glTexEnvi((int)8960, (int)34161, (int)8448);
            GL11.glTexEnvi((int)8960, (int)34162, (int)8448);
            GL11.glTexEnvi((int)8960, (int)34176, (int)5890);
            GL11.glTexEnvi((int)8960, (int)34177, (int)34168);
            GL11.glTexEnvi((int)8960, (int)34178, (int)34166);
            GL11.glTexEnvi((int)8960, (int)34184, (int)5890);
            GL11.glTexEnvi((int)8960, (int)34185, (int)34168);
            GL11.glTexEnvi((int)8960, (int)34186, (int)34166);
            GL11.glTexEnvi((int)8960, (int)34192, (int)768);
            GL11.glTexEnvi((int)8960, (int)34193, (int)768);
            GL11.glTexEnvi((int)8960, (int)34194, (int)770);
            GL11.glTexEnvi((int)8960, (int)34200, (int)770);
            GL11.glTexEnvi((int)8960, (int)34201, (int)770);
            GL11.glTexEnvi((int)8960, (int)34202, (int)770);
            GL11.glTexEnvf((int)8960, (int)34163, (float)1.0f);
            GL11.glTexEnvf((int)8960, (int)3356, (float)1.0f);
            v.J();
            v.g(7425);
            v.u();
            v.a(true, true, true, true);
            v.a(1.0);
            GL11.glLineWidth((float)1.0f);
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glPolygonMode((int)1028, (int)6914);
            n2 = 1029;
        }
        GL11.glPolygonMode((int)n2, (int)6914);
    }
}

