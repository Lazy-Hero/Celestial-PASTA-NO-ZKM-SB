/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.lwjgl.util.vector.Matrix4f
 *  org.lwjgl.util.vector.ReadableVector3f
 *  org.lwjgl.util.vector.Vector3f
 *  org.lwjgl.util.vector.Vector4f
 */
package net.minecraft.client.x;

import javax.annotation.Nullable;
import net.D;
import net.minecraft.ar.aA;
import net.minecraft.client.a.aU;
import net.minecraft.client.a.ao;
import net.minecraft.client.a.c;
import net.minecraft.client.x.C;
import net.minecraft.client.x.E;
import net.minecraft.client.x.F;
import net.minecraft.client.x.G;
import net.minecraft.client.x.P;
import net.minecraft.client.x.au;
import net.minecraft.client.x.g;
import net.minecraft.client.x.k;
import net.minecraft.client.x.w;
import net.minecraft.client.x.z;
import net.minecraft.k.h;
import net.minecraft.k.m;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.ReadableVector3f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

public class N {
    private static final /* synthetic */ C e;
    private static final /* synthetic */ float g;
    private static final /* synthetic */ C f;
    private static final /* synthetic */ C b;
    private static final /* synthetic */ C[] c;
    private static final /* synthetic */ C a;
    private static final /* synthetic */ float d;

    /*
     * Exception decompiling
     */
    public P a(Vector3f var1_1, Vector3f var2_2, z var3_3, net.minecraft.client.j.c var4_4, aA var5_5, D var6_6, w var7_7, boolean var8_8, boolean var9_9) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public int a(Vector3f vector3f, aA aA2, int n2, g g10) {
        return this.a(vector3f, aA2, n2, g10);
    }

    public P a(Vector3f vector3f, Vector3f vector3f2, z z2, net.minecraft.client.j.c c10, aA aA2, g g10, @Nullable w w2, boolean bl2, boolean bl3) {
        au au2 = z2.e;
        if (bl2) {
            au2 = this.a(z2.e, aA2, g10);
        }
        int[] arrn = this.a(au2, c10, aA2, this.a(vector3f, vector3f2), g10, w2, bl3);
        aA aA3 = N.a(arrn);
        if (w2 == null) {
            this.a(arrn, aA3);
        }
        return new P(arrn, z2.d, aA3, c10);
    }

    private static void a(g g10, aA aA2, C c10) {
        N.c[N.a((g)g10, (aA)aA2)] = c10;
    }

    private void a(Vector3f vector3f, Vector3f vector3f2, Matrix4f matrix4f, Vector3f vector3f3) {
        Vector4f vector4f = new Vector4f(vector3f.x - vector3f2.x, vector3f.y - vector3f2.y, vector3f.z - vector3f2.z, 1.0f);
        Matrix4f.transform((Matrix4f)matrix4f, (Vector4f)vector4f, (Vector4f)vector4f);
        vector4f.x *= vector3f3.x;
        vector4f.y *= vector3f3.y;
        vector4f.z *= vector3f3.z;
        vector3f.set(vector4f.x + vector3f2.x, vector4f.y + vector3f2.y, vector4f.z + vector3f2.z);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static float a(aA var0) {
        var1_1 = P.o();
        v0 = k.b[var0.ordinal()];
        if (var1_1 != null) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = fU.ag() ? 1 : 0;
lbl7:
                // 2 sources

                if (v0 == 0) return 0.5f;
                return cS.bK;
            }
            case 2: {
                return 1.0f;
            }
            case 3: 
            case 4: {
                if (fU.ag() == false) return 0.8f;
                return cS.bM;
            }
            case 5: 
            case 6: {
                if (fU.ag() == false) return 0.6f;
                return cS.c4;
            }
        }
        return 1.0f;
    }

    private void a(int[] arrn, int n2, aA aA2, au au2, float[] arrf, net.minecraft.client.j.c c10, D d10, @Nullable w w2, boolean n3) {
        aA aA3 = d10.a(aA2);
        String[] arrstring = P.o();
        int n4 = n3;
        if (arrstring == null) {
            n4 = n4 != 0 ? this.b(aA3) : -1;
        }
        int n5 = n4;
        c c11 = ao.a(aA2).a(n2);
        Vector3f vector3f = new Vector3f(arrf[c11.a], arrf[c11.b], arrf[c11.c]);
        this.a(vector3f, w2);
        int n6 = this.a(vector3f, aA2, n2, d10);
        fM.a(vector3f);
        this.a(arrn, n6, n2, vector3f, n5, c10, au2);
    }

    private static int a(g g10, aA aA2) {
        return net.minecraft.client.x.g.values().length * aA2.ordinal() + g10.ordinal();
    }

    private au a(au au2, aA aA2, g g10) {
        return c[N.a(g10, aA2)].a(au2);
    }

    private int[] a(au au2, net.minecraft.client.j.c c10, aA aA2, float[] arrf, D d10, @Nullable w w2, boolean bl2) {
        int n2 = 28;
        String[] arrstring = P.o();
        int n3 = fU.ag();
        if (arrstring == null) {
            if (n3 != 0) {
                n2 = 56;
            }
            n3 = n2;
        }
        int[] arrn = new int[n3];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(arrn, i2, aA2, au2, arrf, c10, d10, w2, bl2);
            if (arrstring == null) continue;
        }
        return arrn;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static aA a(int[] arrn) {
        aA aA2;
        aA aA3;
        block5: {
            int n2 = arrn.length / 4;
            int n3 = n2 * 2;
            Vector3f vector3f = new Vector3f(Float.intBitsToFloat(arrn[0]), Float.intBitsToFloat(arrn[1]), Float.intBitsToFloat(arrn[2]));
            Vector3f vector3f2 = new Vector3f(Float.intBitsToFloat(arrn[n2]), Float.intBitsToFloat(arrn[n2 + 1]), Float.intBitsToFloat(arrn[n2 + 2]));
            Vector3f vector3f3 = new Vector3f(Float.intBitsToFloat(arrn[n3]), Float.intBitsToFloat(arrn[n3 + 1]), Float.intBitsToFloat(arrn[n3 + 2]));
            Vector3f vector3f4 = new Vector3f();
            Vector3f vector3f5 = new Vector3f();
            Vector3f vector3f6 = new Vector3f();
            String[] arrstring = P.o();
            Vector3f.sub((Vector3f)vector3f, (Vector3f)vector3f2, (Vector3f)vector3f4);
            Vector3f.sub((Vector3f)vector3f3, (Vector3f)vector3f2, (Vector3f)vector3f5);
            String[] arrstring2 = arrstring;
            Vector3f.cross((Vector3f)vector3f5, (Vector3f)vector3f4, (Vector3f)vector3f6);
            float f10 = (float)Math.sqrt(vector3f6.x * vector3f6.x + vector3f6.y * vector3f6.y + vector3f6.z * vector3f6.z);
            vector3f6.x /= f10;
            vector3f6.y /= f10;
            vector3f6.z /= f10;
            aA3 = null;
            float f11 = 0.0f;
            aA[] arraA = aA.values();
            int n4 = arraA.length;
            int n5 = 0;
            while (n5 < n4) {
                block6: {
                    block7: {
                        float f12;
                        aA aA4;
                        block8: {
                            aA4 = arraA[n5];
                            m m2 = aA4.m();
                            Vector3f vector3f7 = new Vector3f((float)m2.e(), (float)m2.b(), (float)m2.a());
                            float f13 = Vector3f.dot((Vector3f)vector3f6, (Vector3f)vector3f7);
                            if (arrstring2 != null) break block5;
                            if (arrstring2 != null) break block6;
                            if (!(f13 >= 0.0f)) break block7;
                            f12 = f13;
                            if (arrstring2 != null) break block8;
                            if (!(f12 > f11)) break block7;
                            f12 = f13;
                        }
                        f11 = f12;
                        aA3 = aA4;
                    }
                    ++n5;
                }
                if (arrstring2 == null) continue;
                m.b(!m.c());
                break;
            }
            aA2 = aA3;
            if (arrstring2 != null) return aA2;
            if (aA2 == null) {
                return aA.UP;
            }
        }
        aA2 = aA3;
        return aA2;
    }

    private void a(int[] arrn, aA aA2) {
        float f10;
        int n2;
        int[] arrn2 = new int[arrn.length];
        System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
        float[] arrf = new float[aA.values().length];
        arrf[aU.c] = 999.0f;
        arrf[aU.f] = 999.0f;
        arrf[aU.b] = 999.0f;
        arrf[aU.a] = -999.0f;
        arrf[aU.d] = -999.0f;
        arrf[aU.e] = -999.0f;
        int n3 = arrn.length / 4;
        String[] arrstring = P.o();
        for (int i2 = 0; i2 < 4; ++i2) {
            n2 = n3 * i2;
            float f11 = Float.intBitsToFloat(arrn2[n2]);
            float f12 = Float.intBitsToFloat(arrn2[n2 + 1]);
            f10 = Float.intBitsToFloat(arrn2[n2 + 2]);
            float f13 = f11 - arrf[aU.c];
            float f14 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
            if (arrstring == null) {
                float f15;
                if (f14 < 0) {
                    arrf[aU.c] = f11;
                }
                f14 = (f15 = f12 - arrf[aU.f]) == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
            }
            if (arrstring == null) {
                float f16;
                if (f14 < 0) {
                    arrf[aU.f] = f12;
                }
                f14 = (f16 = f10 - arrf[aU.b]) == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
            }
            if (arrstring == null) {
                float f17;
                if (f14 < 0) {
                    arrf[aU.b] = f10;
                }
                f14 = (f17 = f11 - arrf[aU.a]) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
            }
            if (arrstring == null) {
                float f18;
                if (f14 > 0) {
                    arrf[aU.a] = f11;
                }
                f14 = (f18 = f12 - arrf[aU.d]) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            }
            if (arrstring == null) {
                float f19;
                if (f14 > 0) {
                    arrf[aU.d] = f12;
                }
                f14 = (f19 = f10 - arrf[aU.e]) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
            }
            if (f14 <= 0) continue;
            arrf[aU.e] = f10;
            if (arrstring == null) continue;
        }
        ao ao2 = ao.a(aA2);
        n2 = 0;
        block1: while (true) {
            int n4 = n2;
            block2: while (n4 < 4) {
                int n5 = n3 * n2;
                c c10 = ao2.a(n2);
                f10 = arrf[c10.a];
                float f20 = arrf[c10.b];
                float f21 = arrf[c10.c];
                arrn[n5] = Float.floatToRawIntBits(f10);
                arrn[n5 + 1] = Float.floatToRawIntBits(f20);
                arrn[n5 + 2] = Float.floatToRawIntBits(f21);
                int n6 = 0;
                while (n6 < 4) {
                    block18: {
                        block19: {
                            boolean bl2;
                            int n7;
                            block20: {
                                n7 = n3 * n6;
                                float f22 = Float.intBitsToFloat(arrn2[n7]);
                                float f23 = Float.intBitsToFloat(arrn2[n7 + 1]);
                                float f24 = Float.intBitsToFloat(arrn2[n7 + 2]);
                                if (arrstring != null) break block18;
                                n4 = h.b(f10, f22) ? 1 : 0;
                                if (arrstring != null) continue block2;
                                if (n4 == 0) break block19;
                                bl2 = h.b(f20, f23);
                                if (arrstring != null) break block20;
                                if (!bl2) break block19;
                                bl2 = h.b(f21, f24);
                            }
                            if (bl2) {
                                arrn[n5 + 4] = arrn2[n7 + 4];
                                arrn[n5 + 4 + 1] = arrn2[n7 + 4 + 1];
                            }
                        }
                        ++n6;
                    }
                    if (arrstring == null) continue;
                }
                ++n2;
                if (arrstring == null) continue block1;
            }
            break;
        }
    }

    private Matrix4f a() {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.setIdentity();
        return matrix4f;
    }

    static {
        g = 1.0f / (float)Math.cos(0.3926991f) - 1.0f;
        d = 1.0f / (float)Math.cos(0.7853981633974483) - 1.0f;
        c = new C[net.minecraft.client.x.g.values().length * aA.values().length];
        a = new net.minecraft.client.x.D();
        f = new E();
        b = new F();
        e = new G();
        N.a(net.minecraft.client.x.g.X0_Y0, aA.DOWN, a);
        N.a(net.minecraft.client.x.g.X0_Y0, aA.EAST, a);
        N.a(net.minecraft.client.x.g.X0_Y0, aA.NORTH, a);
        N.a(net.minecraft.client.x.g.X0_Y0, aA.SOUTH, a);
        N.a(net.minecraft.client.x.g.X0_Y0, aA.UP, a);
        N.a(net.minecraft.client.x.g.X0_Y0, aA.WEST, a);
        N.a(net.minecraft.client.x.g.X0_Y90, aA.EAST, a);
        N.a(net.minecraft.client.x.g.X0_Y90, aA.NORTH, a);
        N.a(net.minecraft.client.x.g.X0_Y90, aA.SOUTH, a);
        N.a(net.minecraft.client.x.g.X0_Y90, aA.WEST, a);
        N.a(net.minecraft.client.x.g.X0_Y180, aA.EAST, a);
        N.a(net.minecraft.client.x.g.X0_Y180, aA.NORTH, a);
        N.a(net.minecraft.client.x.g.X0_Y180, aA.SOUTH, a);
        N.a(net.minecraft.client.x.g.X0_Y180, aA.WEST, a);
        N.a(net.minecraft.client.x.g.X0_Y270, aA.EAST, a);
        N.a(net.minecraft.client.x.g.X0_Y270, aA.NORTH, a);
        N.a(net.minecraft.client.x.g.X0_Y270, aA.SOUTH, a);
        N.a(net.minecraft.client.x.g.X0_Y270, aA.WEST, a);
        N.a(net.minecraft.client.x.g.X90_Y0, aA.DOWN, a);
        N.a(net.minecraft.client.x.g.X90_Y0, aA.SOUTH, a);
        N.a(net.minecraft.client.x.g.X90_Y90, aA.DOWN, a);
        N.a(net.minecraft.client.x.g.X90_Y180, aA.DOWN, a);
        N.a(net.minecraft.client.x.g.X90_Y180, aA.NORTH, a);
        N.a(net.minecraft.client.x.g.X90_Y270, aA.DOWN, a);
        N.a(net.minecraft.client.x.g.X180_Y0, aA.DOWN, a);
        N.a(net.minecraft.client.x.g.X180_Y0, aA.UP, a);
        N.a(net.minecraft.client.x.g.X270_Y0, aA.SOUTH, a);
        N.a(net.minecraft.client.x.g.X270_Y0, aA.UP, a);
        N.a(net.minecraft.client.x.g.X270_Y90, aA.UP, a);
        N.a(net.minecraft.client.x.g.X270_Y180, aA.NORTH, a);
        N.a(net.minecraft.client.x.g.X270_Y180, aA.UP, a);
        N.a(net.minecraft.client.x.g.X270_Y270, aA.UP, a);
        N.a(net.minecraft.client.x.g.X0_Y270, aA.UP, f);
        N.a(net.minecraft.client.x.g.X0_Y90, aA.DOWN, f);
        N.a(net.minecraft.client.x.g.X90_Y0, aA.WEST, f);
        N.a(net.minecraft.client.x.g.X90_Y90, aA.WEST, f);
        N.a(net.minecraft.client.x.g.X90_Y180, aA.WEST, f);
        N.a(net.minecraft.client.x.g.X90_Y270, aA.NORTH, f);
        N.a(net.minecraft.client.x.g.X90_Y270, aA.SOUTH, f);
        N.a(net.minecraft.client.x.g.X90_Y270, aA.WEST, f);
        N.a(net.minecraft.client.x.g.X180_Y90, aA.UP, f);
        N.a(net.minecraft.client.x.g.X180_Y270, aA.DOWN, f);
        N.a(net.minecraft.client.x.g.X270_Y0, aA.EAST, f);
        N.a(net.minecraft.client.x.g.X270_Y90, aA.EAST, f);
        N.a(net.minecraft.client.x.g.X270_Y90, aA.NORTH, f);
        N.a(net.minecraft.client.x.g.X270_Y90, aA.SOUTH, f);
        N.a(net.minecraft.client.x.g.X270_Y180, aA.EAST, f);
        N.a(net.minecraft.client.x.g.X270_Y270, aA.EAST, f);
        N.a(net.minecraft.client.x.g.X0_Y180, aA.DOWN, b);
        N.a(net.minecraft.client.x.g.X0_Y180, aA.UP, b);
        N.a(net.minecraft.client.x.g.X90_Y0, aA.NORTH, b);
        N.a(net.minecraft.client.x.g.X90_Y0, aA.UP, b);
        N.a(net.minecraft.client.x.g.X90_Y90, aA.UP, b);
        N.a(net.minecraft.client.x.g.X90_Y180, aA.SOUTH, b);
        N.a(net.minecraft.client.x.g.X90_Y180, aA.UP, b);
        N.a(net.minecraft.client.x.g.X90_Y270, aA.UP, b);
        N.a(net.minecraft.client.x.g.X180_Y0, aA.EAST, b);
        N.a(net.minecraft.client.x.g.X180_Y0, aA.NORTH, b);
        N.a(net.minecraft.client.x.g.X180_Y0, aA.SOUTH, b);
        N.a(net.minecraft.client.x.g.X180_Y0, aA.WEST, b);
        N.a(net.minecraft.client.x.g.X180_Y90, aA.EAST, b);
        N.a(net.minecraft.client.x.g.X180_Y90, aA.NORTH, b);
        N.a(net.minecraft.client.x.g.X180_Y90, aA.SOUTH, b);
        N.a(net.minecraft.client.x.g.X180_Y90, aA.WEST, b);
        N.a(net.minecraft.client.x.g.X180_Y180, aA.DOWN, b);
        N.a(net.minecraft.client.x.g.X180_Y180, aA.EAST, b);
        N.a(net.minecraft.client.x.g.X180_Y180, aA.NORTH, b);
        N.a(net.minecraft.client.x.g.X180_Y180, aA.SOUTH, b);
        N.a(net.minecraft.client.x.g.X180_Y180, aA.UP, b);
        N.a(net.minecraft.client.x.g.X180_Y180, aA.WEST, b);
        N.a(net.minecraft.client.x.g.X180_Y270, aA.EAST, b);
        N.a(net.minecraft.client.x.g.X180_Y270, aA.NORTH, b);
        N.a(net.minecraft.client.x.g.X180_Y270, aA.SOUTH, b);
        N.a(net.minecraft.client.x.g.X180_Y270, aA.WEST, b);
        N.a(net.minecraft.client.x.g.X270_Y0, aA.DOWN, b);
        N.a(net.minecraft.client.x.g.X270_Y0, aA.NORTH, b);
        N.a(net.minecraft.client.x.g.X270_Y90, aA.DOWN, b);
        N.a(net.minecraft.client.x.g.X270_Y180, aA.DOWN, b);
        N.a(net.minecraft.client.x.g.X270_Y180, aA.SOUTH, b);
        N.a(net.minecraft.client.x.g.X270_Y270, aA.DOWN, b);
        N.a(net.minecraft.client.x.g.X0_Y90, aA.UP, e);
        N.a(net.minecraft.client.x.g.X0_Y270, aA.DOWN, e);
        N.a(net.minecraft.client.x.g.X90_Y0, aA.EAST, e);
        N.a(net.minecraft.client.x.g.X90_Y90, aA.EAST, e);
        N.a(net.minecraft.client.x.g.X90_Y90, aA.NORTH, e);
        N.a(net.minecraft.client.x.g.X90_Y90, aA.SOUTH, e);
        N.a(net.minecraft.client.x.g.X90_Y180, aA.EAST, e);
        N.a(net.minecraft.client.x.g.X90_Y270, aA.EAST, e);
        N.a(net.minecraft.client.x.g.X270_Y0, aA.WEST, e);
        N.a(net.minecraft.client.x.g.X180_Y90, aA.DOWN, e);
        N.a(net.minecraft.client.x.g.X180_Y270, aA.UP, e);
        N.a(net.minecraft.client.x.g.X270_Y90, aA.WEST, e);
        N.a(net.minecraft.client.x.g.X270_Y180, aA.WEST, e);
        N.a(net.minecraft.client.x.g.X270_Y270, aA.NORTH, e);
        N.a(net.minecraft.client.x.g.X270_Y270, aA.SOUTH, e);
        N.a(net.minecraft.client.x.g.X270_Y270, aA.WEST, e);
    }

    private void a(int[] arrn, int n2, int n3, Vector3f vector3f, int n4, net.minecraft.client.j.c c10, au au2) {
        int n5 = arrn.length / 4;
        int n6 = n2 * n5;
        arrn[n6] = Float.floatToRawIntBits(vector3f.x);
        arrn[n6 + 1] = Float.floatToRawIntBits(vector3f.y);
        arrn[n6 + 2] = Float.floatToRawIntBits(vector3f.z);
        arrn[n6 + 3] = n4;
        arrn[n6 + 4] = Float.floatToRawIntBits(c10.a((double)au2.c(n3) * 0.999 + (double)au2.c((n3 + 2) % 4) * 0.001));
        arrn[n6 + 4 + 1] = Float.floatToRawIntBits(c10.b((double)au2.a(n3) * 0.999 + (double)au2.a((n3 + 2) % 4) * 0.001));
    }

    private float[] a(Vector3f vector3f, Vector3f vector3f2) {
        float[] arrf = new float[aA.values().length];
        arrf[aU.c] = vector3f.x / 16.0f;
        arrf[aU.f] = vector3f.y / 16.0f;
        arrf[aU.b] = vector3f.z / 16.0f;
        arrf[aU.a] = vector3f2.x / 16.0f;
        arrf[aU.d] = vector3f2.y / 16.0f;
        arrf[aU.e] = vector3f2.z / 16.0f;
        return arrf;
    }

    private int b(aA aA2) {
        float f10 = N.a(aA2);
        int n2 = h.c((int)(f10 * 255.0f), 0, 255);
        return 0xFF000000 | n2 << 16 | n2 << 8 | n2;
    }

    public int a(Vector3f vector3f, aA aA2, int n2, D d10) {
        block3: {
            block2: {
                String[] arrstring;
                block1: {
                    arrstring = P.o();
                    if (d10 == net.minecraft.client.x.g.X0_Y0) {
                        return n2;
                    }
                    Object object = cq.c3;
                    if (arrstring != null) break block1;
                    if (!((ak)object).b()) break block2;
                    object = cq.d(cq.c3, new Object[]{vector3f, d10.a()});
                }
                if (arrstring == null) break block3;
            }
            this.a(vector3f, new Vector3f(0.5f, 0.5f, 0.5f), ((g)d10).a(), new Vector3f(1.0f, 1.0f, 1.0f));
        }
        return d10.a(aA2, n2);
    }

    private void a(Vector3f vector3f, @Nullable w w2) {
        block12: {
            Vector3f vector3f2;
            Matrix4f matrix4f;
            block17: {
                block14: {
                    String[] arrstring;
                    block16: {
                        block15: {
                            int n2;
                            block13: {
                                arrstring = P.o();
                                if (w2 == null) break block12;
                                matrix4f = this.a();
                                vector3f2 = new Vector3f(0.0f, 0.0f, 0.0f);
                                n2 = k.a[w2.c.ordinal()];
                                if (arrstring == null) {
                                    switch (n2) {
                                        case 1: {
                                            Matrix4f.rotate((float)(w2.b * ((float)Math.PI / 180)), (Vector3f)new Vector3f(1.0f, 0.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                                            vector3f2.set(0.0f, 1.0f, 1.0f);
                                            if (arrstring == null) break;
                                        }
                                        case 2: {
                                            Matrix4f.rotate((float)(w2.b * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 1.0f, 0.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                                            vector3f2.set(1.0f, 0.0f, 1.0f);
                                            if (arrstring == null) break;
                                        }
                                        case 3: {
                                            Matrix4f.rotate((float)(w2.b * ((float)Math.PI / 180)), (Vector3f)new Vector3f(0.0f, 0.0f, 1.0f), (Matrix4f)matrix4f, (Matrix4f)matrix4f);
                                            vector3f2.set(1.0f, 1.0f, 0.0f);
                                            break;
                                        }
                                    }
                                    n2 = w2.d ? 1 : 0;
                                }
                                if (arrstring != null) break block13;
                                if (n2 == 0) break block14;
                                float f10 = Math.abs(w2.b) - 22.5f;
                                n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                            }
                            if (n2 != 0) break block15;
                            vector3f2.scale(g);
                            if (arrstring == null) break block16;
                        }
                        vector3f2.scale(d);
                    }
                    Vector3f.add((Vector3f)vector3f2, (Vector3f)new Vector3f(1.0f, 1.0f, 1.0f), (Vector3f)vector3f2);
                    if (arrstring == null) break block17;
                }
                vector3f2.set(1.0f, 1.0f, 1.0f);
            }
            this.a(vector3f, new Vector3f((ReadableVector3f)w2.a), matrix4f, vector3f2);
        }
    }
}

