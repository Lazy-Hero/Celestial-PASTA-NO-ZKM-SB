/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Dimension;
import java.nio.IntBuffer;
import java.util.ArrayList;
import net.minecraft.client.a.aZ;
import org.lwjgl.opengl.GL11;

public class eF {
    private final /* synthetic */ int[][] a;
    private /* synthetic */ IntBuffer[] d;
    private final /* synthetic */ Dimension[] g;
    private final /* synthetic */ int b;
    private final /* synthetic */ int f;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ String e;
    private final /* synthetic */ int[] h;

    private int a(int n2, int n3) {
        int n4 = (n2 & 0xFF000000) >> 24 & 0xFF;
        int n5 = (n3 & 0xFF000000) >> 24 & 0xFF;
        return (n4 + n5 >> 1 << 24) + ((n2 & 0xFEFEFE) + (n3 & 0xFEFEFE) >> 1);
    }

    public static void a(int n2, int n3, String string) {
        Dimension[] arrdimension = eF.b(n2, n3, string);
        String string2 = K.d();
        for (int i2 = 0; i2 < arrdimension.length; ++i2) {
            Dimension dimension = arrdimension[i2];
            int n4 = dimension.width;
            int n5 = dimension.height;
            int n6 = i2 + 1;
            GL11.glTexImage2D((int)3553, (int)n6, (int)6408, (int)n4, (int)n5, (int)0, (int)32993, (int)33639, (IntBuffer)null);
            if (string2 == null) continue;
        }
    }

    private static int b(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        block9: {
            block8: {
                String string;
                block6: {
                    block7: {
                        n7 = (n2 & 0xFF000000) >> 24 & 0xFF;
                        n6 = (n3 & 0xFF000000) >> 24 & 0xFF;
                        n5 = (n7 + n6) / 2;
                        string = K.d();
                        n4 = n7;
                        if (string != null) break block6;
                        if (n4 != 0) break block7;
                        n4 = n6;
                        if (string != null) break block6;
                        if (n4 != 0) break block7;
                        n7 = 1;
                        n6 = 1;
                        if (string == null) break block8;
                    }
                    n4 = n7;
                }
                if (string == null) {
                    if (n4 == 0) {
                        n2 = n3;
                        n5 /= 2;
                    }
                    n4 = n6;
                }
                if (string != null) break block9;
                if (n4 == 0) {
                    n3 = n2;
                    n5 /= 2;
                }
            }
            n4 = (n2 >> 16 & 0xFF) * n7;
        }
        int n8 = n4;
        int n9 = (n2 >> 8 & 0xFF) * n7;
        int n10 = (n2 & 0xFF) * n7;
        int n11 = (n3 >> 16 & 0xFF) * n6;
        int n12 = (n3 >> 8 & 0xFF) * n6;
        int n13 = (n3 & 0xFF) * n6;
        int n14 = (n8 + n11) / (n7 + n6);
        int n15 = (n9 + n12) / (n7 + n6);
        int n16 = (n10 + n13) / (n7 + n6);
        return n5 << 24 | n14 << 16 | n15 << 8 | n16;
    }

    public static int[][] a(int[] arrn, int n2, int n3, Dimension[] arrdimension) {
        int[][] arrarrn;
        block10: {
            int[] arrn2 = arrn;
            int n4 = n2;
            String string = K.d();
            int n5 = 1;
            int[][] arrarrn2 = new int[arrdimension.length][];
            for (int i2 = 0; i2 < arrdimension.length; ++i2) {
                int n6;
                int n7;
                block11: {
                    Dimension dimension = arrdimension[i2];
                    int n8 = dimension.width;
                    n7 = dimension.height;
                    int[] arrn3 = new int[n8 * n7];
                    arrarrn = arrarrn2;
                    if (string != null) break block10;
                    arrarrn[i2] = arrn3;
                    int n9 = i2 + 1;
                    n6 = n5;
                    if (string == null) {
                        if (n6 != 0) {
                            int n10 = 0;
                            while (n10 < n8) {
                                block12: {
                                    n6 = 0;
                                    if (string != null) break block11;
                                    for (int i3 = v1098003; i3 < n7; ++i3) {
                                        int n11;
                                        int n12 = arrn2[n10 * 2 + 0 + (i3 * 2 + 0) * n4];
                                        int n13 = arrn2[n10 * 2 + 1 + (i3 * 2 + 0) * n4];
                                        int n14 = arrn2[n10 * 2 + 1 + (i3 * 2 + 1) * n4];
                                        int n15 = arrn2[n10 * 2 + 0 + (i3 * 2 + 1) * n4];
                                        arrn3[n10 + i3 * n8] = n11 = eF.a(n12, n13, n14, n15);
                                        if (string == null) {
                                            if (string == null) continue;
                                        }
                                        break block12;
                                    }
                                    ++n10;
                                }
                                if (string == null) continue;
                            }
                        }
                        arrn2 = arrn3;
                        n4 = n8;
                        n6 = n8;
                    }
                }
                if (string == null) {
                    if (n6 > 1) {
                        n6 = n7;
                        if (string == null) {
                            if (n6 > 1) continue;
                        }
                    } else {
                        n6 = 0;
                    }
                }
                n5 = n6;
                if (string == null) continue;
            }
            arrarrn = arrarrn2;
        }
        return arrarrn;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Dimension[] b(int var0, int var1_1, String var2_2) {
        var4_3 = fp.a(var0);
        var5_4 = fp.a(var1_1);
        var3_5 = K.d();
        v0 = var4_3;
        if (var3_5 != null) return new Dimension[v0];
        if (v0 == var0) {
            v0 = var5_4;
            if (var3_5 != null) return new Dimension[v0];
            if (v0 == var1_1) {
                var6_6 = new ArrayList<Dimension>();
                var7_7 = var4_3;
                var8_8 = var5_4;
                do {
                    var8_8 /= 2;
                    if ((var7_7 /= 2) <= 0) {
                        v1 = var8_8;
                        if (var3_5 == null && var3_5 == null) {
                            if (v1 <= 0) {
                                return var6_6.toArray(new Dimension[var6_6.size()]);
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v1 = var7_7;
                    }
                    if (var3_5 == null) {
                        if (v1 <= 0) {
                            var7_7 = 1;
                        }
                        v1 = var8_8;
                    }
                    if (var3_5 == null) {
                        if (v1 <= 0) {
                            var8_8 = 1;
                        }
                        v1 = var7_7 * var8_8 * 4;
                    }
                    var9_9 = v1;
                    var10_11 = new Dimension(var7_7, var8_8);
                    var6_6.add(var10_11);
                } while (var3_5 == null);
            }
        }
        fU.h("Mipmaps not possible (power of 2 dimensions needed), texture: " + var2_2 + ", dim: " + var0 + "x" + var1_1);
        v0 = 0;
        return new Dimension[v0];
    }

    public static IntBuffer[] a(Dimension[] arrdimension, int[][] arrn) {
        IntBuffer[] arrintBuffer;
        block4: {
            String string = K.d();
            Dimension[] arrdimension2 = arrdimension;
            if (string == null) {
                if (arrdimension2 == null) {
                    return null;
                }
                arrdimension2 = arrdimension;
            }
            IntBuffer[] arrintBuffer2 = new IntBuffer[arrdimension2.length];
            for (int i2 = 0; i2 < arrdimension.length; ++i2) {
                Dimension dimension = arrdimension[i2];
                int n2 = dimension.width * dimension.height;
                IntBuffer intBuffer = aZ.b(n2);
                int[] arrn2 = arrn[i2];
                intBuffer.clear();
                intBuffer.put(arrn2);
                intBuffer.clear();
                arrintBuffer = arrintBuffer2;
                if (string == null) {
                    arrintBuffer[i2] = intBuffer;
                    if (string == null) continue;
                }
                break block4;
            }
            arrintBuffer = arrintBuffer2;
        }
        return arrintBuffer;
    }

    public eF(String string, int n2, int n3, int[] arrn, boolean bl2) {
        block3: {
            block2: {
                String string2 = K.d();
                this.e = string;
                this.b = n2;
                String string3 = string2;
                this.f = n3;
                this.h = arrn;
                this.c = bl2;
                this.g = eF.b(n2, n3, string);
                eF eF2 = this;
                if (string3 != null) break block2;
                eF2.a = eF.a(arrn, n2, n3, this.g);
                if (!bl2) break block3;
                eF2 = this;
            }
            eF2.d = eF.a(this.g, this.a);
        }
    }

    public static int a(int n2, int n3, int n4, int n5) {
        int n6 = eF.b(n2, n3);
        int n7 = eF.b(n4, n5);
        int n8 = eF.b(n6, n7);
        return n8;
    }
}

