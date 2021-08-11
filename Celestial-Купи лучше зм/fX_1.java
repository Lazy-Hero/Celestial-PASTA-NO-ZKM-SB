/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
import java.nio.ByteBuffer;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.Z.l;
import net.minecraft.ah.t;
import net.minecraft.client.a.I;
import net.minecraft.client.y.e;
import net.minecraft.k.m;
import net.minecraft.k.n;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class fX {
    /* synthetic */ boolean c;
    /* synthetic */ int b;
    /* synthetic */ boolean i;
    /* synthetic */ int f;
    /* synthetic */ int h;
    /* synthetic */ int g;
    /* synthetic */ boolean a;
    /* synthetic */ int e;
    /* synthetic */ long[] j;
    /* synthetic */ boolean d;

    public static void c(I i2) {
        block3: {
            I i3;
            block2: {
                String string = dB.i();
                i3 = i2;
                if (string == null) break block2;
                if (i3.p != 0) break block3;
                i3 = i2;
            }
            fX.f(i3);
        }
    }

    public void a(long l2) {
        ++this.f;
        this.j[this.f] = l2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(I var1_1, int var2_2) {
        var4_3 = var1_1.o;
        var5_4 = var1_1.l;
        var6_5 = var1_1.m();
        var7_6 = var4_3.get(var2_2 + 0 * this.e);
        var8_7 = var4_3.get(var2_2 + 0 * this.e + 1);
        var9_8 = var4_3.get(var2_2 + 0 * this.e + 2);
        var10_9 = var4_3.get(var2_2 + 0 * this.e + this.h);
        var11_10 = var4_3.get(var2_2 + 0 * this.e + this.h + 1);
        var12_11 = var4_3.get(var2_2 + 1 * this.e);
        var13_12 = var4_3.get(var2_2 + 1 * this.e + 1);
        var14_13 = var4_3.get(var2_2 + 1 * this.e + 2);
        var3_14 = dB.i();
        var15_15 = var4_3.get(var2_2 + 1 * this.e + this.h);
        var16_16 = var4_3.get(var2_2 + 1 * this.e + this.h + 1);
        var17_17 = var4_3.get(var2_2 + 2 * this.e);
        var18_18 = var4_3.get(var2_2 + 2 * this.e + 1);
        var19_19 = var4_3.get(var2_2 + 2 * this.e + 2);
        var20_20 = var4_3.get(var2_2 + 2 * this.e + this.h);
        var21_21 = var4_3.get(var2_2 + 2 * this.e + this.h + 1);
        var22_22 = var4_3.get(var2_2 + 3 * this.e);
        var23_23 = var4_3.get(var2_2 + 3 * this.e + 1);
        var24_24 = var4_3.get(var2_2 + 3 * this.e + 2);
        var25_25 = var4_3.get(var2_2 + 3 * this.e + this.h);
        var26_26 = var4_3.get(var2_2 + 3 * this.e + this.h + 1);
        var27_27 = var17_17 - var7_6;
        var28_28 = var18_18 - var8_7;
        var29_29 = var19_19 - var9_8;
        var30_30 = var22_22 - var12_11;
        var31_31 = var23_23 - var13_12;
        var32_32 = var24_24 - var14_13;
        var33_33 = var28_28 * var32_32 - var31_31 * var29_29;
        var34_34 = var29_29 * var30_30 - var32_32 * var27_27;
        var35_35 = var27_27 * var31_31 - var30_30 * var28_28;
        var36_36 = var33_33 * var33_33 + var34_34 * var34_34 + var35_35 * var35_35;
        v0 = var36_36;
        v1 = 0.0;
        if (var3_14 == null) ** GOTO lbl41
        if (v0 != v1) {
            v0 = 1.0;
            v1 = Math.sqrt(var36_36);
lbl41:
            // 2 sources

            v2 = (float)(v0 / v1);
        } else {
            v2 = 1.0f;
        }
        var37_37 = v2;
        var33_33 *= var37_37;
        var34_34 *= var37_37;
        var35_35 *= var37_37;
        var27_27 = var12_11 - var7_6;
        var28_28 = var13_12 - var8_7;
        var29_29 = var14_13 - var9_8;
        var38_38 = var15_15 - var10_9;
        var39_39 = var16_16 - var11_10;
        var30_30 = var17_17 - var7_6;
        var31_31 = var18_18 - var8_7;
        var32_32 = var19_19 - var9_8;
        var40_40 = var20_20 - var10_9;
        var41_41 = var21_21 - var11_10;
        v3 = var42_42 = var38_38 * var41_41 - var40_40 * var39_39;
        v4 = 0.0f;
        if (var3_14 == null) ** GOTO lbl64
        if (v3 != v4) {
            v3 = 1.0f;
            v4 = var42_42;
lbl64:
            // 2 sources

            v5 = v3 / v4;
        } else {
            v5 = 1.0f;
        }
        var43_43 = v5;
        var44_44 = (var41_41 * var27_27 - var39_39 * var30_30) * var43_43;
        var45_45 = (var41_41 * var28_28 - var39_39 * var31_31) * var43_43;
        var46_46 = (var41_41 * var29_29 - var39_39 * var32_32) * var43_43;
        var47_47 = (var38_38 * var30_30 - var40_40 * var27_27) * var43_43;
        var48_48 = (var38_38 * var31_31 - var40_40 * var28_28) * var43_43;
        var49_49 = (var38_38 * var32_32 - var40_40 * var29_29) * var43_43;
        var36_36 = var44_44 * var44_44 + var45_45 * var45_45 + var46_46 * var46_46;
        v6 = var36_36;
        v7 = 0.0;
        if (var3_14 == null) ** GOTO lbl81
        if (v6 != v7) {
            v6 = 1.0;
            v7 = Math.sqrt(var36_36);
lbl81:
            // 2 sources

            v8 = (float)(v6 / v7);
        } else {
            v8 = 1.0f;
        }
        var37_37 = v8;
        var44_44 *= var37_37;
        var45_45 *= var37_37;
        var46_46 *= var37_37;
        var36_36 = var47_47 * var47_47 + var48_48 * var48_48 + var49_49 * var49_49;
        v9 = var36_36;
        v10 = 0.0;
        if (var3_14 == null) ** GOTO lbl95
        if (v9 != v10) {
            v9 = 1.0;
            v10 = Math.sqrt(var36_36);
lbl95:
            // 2 sources

            v11 = (float)(v9 / v10);
        } else {
            v11 = 1.0f;
        }
        var37_37 = v11;
        var50_50 = var35_35 * var45_45 - var34_34 * var46_46;
        var51_51 = var33_33 * var46_46 - var35_35 * var44_44;
        var52_52 = var34_34 * var44_44 - var33_33 * var45_45;
        v12 = (var47_47 *= var37_37) * var50_50 + (var48_48 *= var37_37) * var51_51 + (var49_49 *= var37_37) * var52_52;
        if (var3_14 != null) {
            v12 = v12 < 0.0f ? -1.0f : 1.0f;
        }
        var53_53 = v12;
        var54_54 = (int)(var33_33 * 127.0f) & 255;
        var55_55 = (int)(var34_34 * 127.0f) & 255;
        var56_56 = (int)(var35_35 * 127.0f) & 255;
        var57_57 = (var56_56 << 16) + (var55_55 << 8) + var54_54;
        var5_4.put(var2_2 + 0 * this.e + this.g, var57_57);
        var5_4.put(var2_2 + 1 * this.e + this.g, var57_57);
        var5_4.put(var2_2 + 2 * this.e + this.g, var57_57);
        var5_4.put(var2_2 + 3 * this.e + this.g, var57_57);
        var58_58 = ((int)(var44_44 * 32767.0f) & 65535) + (((int)(var45_45 * 32767.0f) & 65535) << 16);
        var59_59 = ((int)(var46_46 * 32767.0f) & 65535) + (((int)(var53_53 * 32767.0f) & 65535) << 16);
        var5_4.put(var2_2 + 0 * this.e + 10, var58_58);
        var5_4.put(var2_2 + 0 * this.e + 10 + 1, var59_59);
        var5_4.put(var2_2 + 1 * this.e + 10, var58_58);
        var5_4.put(var2_2 + 1 * this.e + 10 + 1, var59_59);
        var5_4.put(var2_2 + 2 * this.e + 10, var58_58);
        var5_4.put(var2_2 + 2 * this.e + 10 + 1, var59_59);
        var5_4.put(var2_2 + 3 * this.e + 10, var58_58);
        var5_4.put(var2_2 + 3 * this.e + 10 + 1, var59_59);
        var60_60 = (var10_9 + var15_15 + var20_20 + var25_25) / 4.0f;
        var61_61 = (var11_10 + var16_16 + var21_21 + var26_26) / 4.0f;
        var4_3.put(var2_2 + 0 * this.e + 8, var60_60);
        var4_3.put(var2_2 + 0 * this.e + 8 + 1, var61_61);
        var4_3.put(var2_2 + 1 * this.e + 8, var60_60);
        var4_3.put(var2_2 + 1 * this.e + 8 + 1, var61_61);
        var4_3.put(var2_2 + 2 * this.e + 8, var60_60);
        var4_3.put(var2_2 + 2 * this.e + 8 + 1, var61_61);
        var4_3.put(var2_2 + 3 * this.e + 8, var60_60);
        var4_3.put(var2_2 + 3 * this.e + 8 + 1, var61_61);
        if (m.c() == false) return;
        dB.c("aardvb");
    }

    public static void b(I i2) {
        i2.n = new fX();
    }

    public void a() {
        this.j[this.f] = 0L;
        --this.f;
    }

    public static void g(I i2) {
        i2.n.a();
    }

    public static void f(I i2) {
        fX fX2 = i2.n;
        e e10 = i2.g();
        String string = dB.i();
        fX2.e = e10.c() / 4;
        fX2.i = fX2.c = e10.h();
        fX2.a = e10.a(0);
        int n2 = fX2.c;
        if (string != null) {
            n2 = n2 != 0 ? e10.e() / 4 : 0;
        }
        fX2.g = n2;
        int n3 = fX2.a;
        if (string != null) {
            n3 = n3 != 0 ? e10.b(0) / 4 : 0;
        }
        fX2.h = n3;
        fX2.b = 8;
    }

    public fX() {
        this.j = new long[10];
        this.f = 0;
        this.j[this.f] = 0L;
    }

    public static boolean a(boolean bl2, I i2) {
        i2.n.a();
        return bl2;
    }

    public static void a(int n2, int n3, int n4, I i2) {
        block2: {
            int n5;
            int n6;
            block3: {
                block4: {
                    int n7;
                    String string = dB.i();
                    if (n4 == 0) break block2;
                    e e10 = i2.g();
                    n6 = n7 = e10.c();
                    n5 = 56;
                    if (string == null) break block3;
                    if (n6 != n5) break block4;
                    ByteBuffer byteBuffer = i2.b();
                    byteBuffer.position(32);
                    GL20.glVertexAttribPointer((int)cS.b8, (int)2, (int)5126, (boolean)false, (int)n7, (ByteBuffer)byteBuffer);
                    byteBuffer.position(40);
                    GL20.glVertexAttribPointer((int)cS.cP, (int)4, (int)5122, (boolean)false, (int)n7, (ByteBuffer)byteBuffer);
                    byteBuffer.position(48);
                    GL20.glVertexAttribPointer((int)cS.dA, (int)3, (int)5122, (boolean)false, (int)n7, (ByteBuffer)byteBuffer);
                    byteBuffer.position(0);
                    GL20.glEnableVertexAttribArray((int)cS.b8);
                    GL20.glEnableVertexAttribArray((int)cS.cP);
                    GL20.glEnableVertexAttribArray((int)cS.dA);
                    GL11.glDrawArrays((int)n2, (int)n3, (int)n4);
                    GL20.glDisableVertexAttribArray((int)cS.b8);
                    GL20.glDisableVertexAttribArray((int)cS.cP);
                    GL20.glDisableVertexAttribArray((int)cS.dA);
                    if (string != null) break block2;
                }
                n6 = n2;
                n5 = n3;
            }
            GL11.glDrawArrays((int)n6, (int)n5, (int)n4);
        }
    }

    public static void a(I i2) {
        block4: {
            I i3;
            String string;
            block6: {
                int n2;
                int n3;
                block5: {
                    block3: {
                        string = dB.i();
                        n3 = i2.g().h();
                        if (string == null) break block3;
                        if (n3 == 0) break block4;
                        n3 = i2.h;
                    }
                    n2 = 7;
                    if (string == null) break block5;
                    if (n3 != n2) break block4;
                    i3 = i2;
                    if (string == null) break block6;
                    n3 = i3.p;
                    n2 = 4;
                }
                if (n3 % n2 != 0) break block4;
                i3 = i2;
            }
            fX fX2 = i3.n;
            fX.f(i2);
            int n4 = i2.p * fX2.e;
            for (int i4 = 0; i4 < n4; i4 += fX2.e * 4) {
                fX2.a(i2, i4);
                if (string != null) continue;
            }
        }
    }

    public static void e(I i2) {
        block5: {
            fX fX2;
            block7: {
                int n2;
                int n3;
                block6: {
                    String string;
                    block4: {
                        fX2 = i2.n;
                        string = dB.i();
                        n3 = fX2.e;
                        n2 = 14;
                        if (string == null) break block4;
                        if (n3 != n2) break block5;
                        n3 = i2.h;
                        n2 = 7;
                    }
                    if (string == null) break block6;
                    if (n3 != n2) break block7;
                    n3 = i2.p;
                    n2 = 4;
                }
                if (n3 % n2 == 0) {
                    fX2.a(i2, i2.m() - 4 * fX2.e);
                }
            }
            long l2 = fX2.j[fX2.f];
            int n4 = i2.m() - 14 + 12;
            i2.l.put(n4, (int)l2);
            i2.l.put(n4 + 1, (int)(l2 >> 32));
        }
    }

    public static void a(i i2, n n2, t t2, I i3) {
        int n3;
        int n4;
        K k2;
        block4: {
            int n5;
            block2: {
                block3: {
                    k2 = i2.b();
                    String string = dB.i();
                    n5 = i2 instanceof l;
                    if (string == null) break block2;
                    if (n5 == 0) break block3;
                    l l2 = (l)i2;
                    n4 = l2.a();
                    n3 = l2.c();
                    if (string != null) break block4;
                }
                n5 = K.b(k2);
            }
            n4 = n5;
            n3 = k2.d(i2);
        }
        n4 = T.a(n4, n3);
        int n6 = k2.b(i2).ordinal();
        int n7 = ((n6 & 0xFFFF) << 16) + (n4 & 0xFFFF);
        int n8 = n3 & 0xFFFF;
        i3.n.a(((long)n8 << 32) + (long)n7);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(I i2, int[] arrn) {
        block7: {
            fX fX2;
            fX fX3;
            String string;
            block6: {
                string = dB.i();
                I i3 = i2;
                if (string != null) {
                    if (i3.p == 0) {
                        fX.f(i2);
                    }
                    i3 = i2;
                }
                fX2 = fX3 = i3.n;
                if (string == null) break block6;
                if (fX2.e != 14) break block7;
                fX2 = fX3;
            }
            long l2 = fX2.j[fX3.f];
            int n2 = 12;
            while (n2 + 1 < arrn.length) {
                arrn[n2] = (int)l2;
                arrn[n2 + 1] = (int)(l2 >> 32);
                n2 += 14;
                if (string != null) continue;
            }
        }
    }

    public static void d(I i2) {
        block2: {
            int n2;
            int n3;
            fX fX2;
            block3: {
                String string;
                block1: {
                    fX2 = i2.n;
                    string = dB.i();
                    n3 = fX2.e;
                    n2 = 14;
                    if (string == null) break block1;
                    if (n3 != n2) break block2;
                    n3 = i2.h;
                    n2 = 7;
                }
                if (string == null) break block3;
                if (n3 != n2) break block2;
                n3 = i2.p;
                n2 = 4;
            }
            if (n3 % n2 == 0) {
                fX2.a(i2, i2.m() - 4 * fX2.e);
            }
        }
    }
}

