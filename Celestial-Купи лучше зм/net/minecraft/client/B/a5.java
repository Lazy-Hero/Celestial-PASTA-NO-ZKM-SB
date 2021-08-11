/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  org.apache.commons.io.IOUtils
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.b;

import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import net.minecraft.at.l;
import net.minecraft.client.D.t;
import net.minecraft.client.D.x;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.b.q;
import net.minecraft.client.j.p;
import net.minecraft.client.j.u;
import net.minecraft.client.l.c;
import net.minecraft.client.y.b;
import org.apache.commons.io.IOUtils;
import org.lwjgl.opengl.GL11;

public class a5
implements x {
    public /* synthetic */ boolean e;
    private final /* synthetic */ byte[] x;
    private /* synthetic */ boolean c;
    public /* synthetic */ float t;
    private static final /* synthetic */ String y;
    private final /* synthetic */ u i;
    private final /* synthetic */ f u;
    private final /* synthetic */ float[] a;
    public /* synthetic */ float A;
    private final /* synthetic */ int[] f;
    private /* synthetic */ boolean E;
    public /* synthetic */ Random s;
    public /* synthetic */ int p;
    private final /* synthetic */ float[] v;
    public /* synthetic */ c q;
    public /* synthetic */ boolean r;
    private /* synthetic */ boolean n;
    private /* synthetic */ boolean m;
    private /* synthetic */ boolean z;
    private static final /* synthetic */ net.minecraft.ar.v[] h;
    private /* synthetic */ boolean k;
    private /* synthetic */ int D;
    private /* synthetic */ boolean o;
    public /* synthetic */ float C;
    private static final /* synthetic */ Q g;
    public /* synthetic */ float d;
    public /* synthetic */ float b;
    public /* synthetic */ net.minecraft.ar.v w;
    public /* synthetic */ float B;
    public /* synthetic */ float l;
    private /* synthetic */ net.minecraft.ar.v j;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean d(char n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        int n4 = 48;
        if (arrstring != null) {
            if (n3 >= n4) {
                n3 = n2;
                if (arrstring == null) return n3 != 0;
                if (n3 <= 57) return 1 != 0;
            }
            n3 = n2;
            n4 = 97;
        }
        if (arrstring != null) {
            if (n3 >= n4) {
                n3 = n2;
                if (arrstring == null) return n3 != 0;
                if (n3 <= 102) return 1 != 0;
            }
            n3 = n2;
            n4 = 65;
        }
        if (arrstring != null) {
            if (n3 < n4) return 0 != 0;
            n3 = n2;
            if (arrstring == null) return n3 != 0;
            n4 = 70;
        }
        if (n3 > n4) return 0 != 0;
        return 1 != 0;
    }

    public float a(String string, float f10, float f11, int n2) {
        this.b(string, f10 - (float)this.e(string) / 2.0f + 0.45f, f11 + 0.5f, n2, true);
        return this.b(string, f10 - (float)this.e(string) / 2.0f, f11, n2);
    }

    protected void a(float f10, float f11, float f12, float f13) {
        net.minecraft.client.a.v.b(f10, f11, f12, f13);
    }

    private int a(String string, int n2, int n3, int n4, int n5, boolean bl2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n6 = this.r;
        if (arrstring != null) {
            if (n6 != 0) {
                int n7 = this.e(this.c(string));
                n2 = n2 + n4 - n7;
            }
            n6 = this.a(string, (float)n2, (float)n3, n5, bl2);
        }
        return n6;
    }

    private String b(String string) {
        String string2;
        block2: {
            String[] arrstring = net.minecraft.client.b.q.b();
            while (string != null) {
                string2 = string;
                if (arrstring != null && arrstring != null) {
                    if (!string2.endsWith("\n")) break;
                    string = string.substring(0, string.length() - 1);
                    if (arrstring != null) continue;
                }
                break block2;
            }
            string2 = string;
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b(String string, float f10, float f11, int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        a5 a52 = this;
        if (arrstring != null) {
            if (!a52.e) {
                return 0;
            }
            a52 = this;
        }
        int n3 = a52.b(string, f10, f11, n2, false);
        return n3;
    }

    public String a(String string, int n2, boolean n3) {
        StringBuilder stringBuilder = new StringBuilder();
        float f10 = 0.0f;
        String[] arrstring = net.minecraft.client.b.q.b();
        int n4 = n3;
        if (arrstring != null) {
            n4 = n4 != 0 ? string.length() - 1 : 0;
        }
        int n5 = n4;
        int n6 = n3;
        if (arrstring != null) {
            n6 = n6 != 0 ? -1 : 1;
        }
        int n7 = n6;
        int n8 = 0;
        int n9 = 0;
        for (int i2 = n5; i2 >= 0; i2 += n7) {
            int n10;
            int n11;
            block17: {
                float f11;
                block18: {
                    block19: {
                        float f12;
                        block20: {
                            block11: {
                                float f13;
                                block12: {
                                    block13: {
                                        int n12;
                                        block14: {
                                            block15: {
                                                int n13;
                                                block16: {
                                                    int n14 = i2;
                                                    if (arrstring != null) {
                                                        if (n14 >= string.length()) break;
                                                        float f14 = f10 - (float)n2;
                                                        n14 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                                    }
                                                    if (arrstring != null) {
                                                        if (n14 >= 0) break;
                                                        n14 = string.charAt(i2);
                                                    }
                                                    n11 = n14;
                                                    f12 = this.b((char)n11);
                                                    n10 = n8;
                                                    if (arrstring == null) break block11;
                                                    if (n10 == 0) break block12;
                                                    n8 = 0;
                                                    n12 = n11;
                                                    if (arrstring == null) break block13;
                                                    if (n12 == 108) break block14;
                                                    n12 = n11;
                                                    if (arrstring == null) break block13;
                                                    if (n12 == 76) break block14;
                                                    n13 = n11;
                                                    if (arrstring == null) break block15;
                                                    if (n13 == 114) break block16;
                                                    n10 = n11;
                                                    if (arrstring == null) break block17;
                                                    if (n10 != 82) break block18;
                                                }
                                                n13 = n9 = 0;
                                            }
                                            if (arrstring != null) break block18;
                                        }
                                        n12 = n9 = 1;
                                    }
                                    if (arrstring != null) break block18;
                                }
                                n10 = (f13 = f12 - 0.0f) == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                            }
                            if (arrstring == null) break block19;
                            if (n10 >= 0) break block20;
                            n8 = 1;
                            if (arrstring != null) break block18;
                        }
                        f10 += f12;
                        n10 = n9;
                    }
                    if (arrstring == null) break block17;
                    if (n10 != 0) {
                        f10 += 1.0f;
                    }
                }
                n10 = (f11 = f10 - (float)n2) == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
            }
            if (arrstring != null) {
                if (n10 > 0 && arrstring != null) break;
                n10 = n3;
            }
            if (n10 != 0) {
                stringBuilder.insert(0, (char)n11);
                if (arrstring != null) continue;
            }
            stringBuilder.append((char)n11);
            if (arrstring != null) continue;
        }
        return stringBuilder.toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private float b(char var1_1) {
        block14: {
            block15: {
                block13: {
                    block12: {
                        var2_2 = net.minecraft.client.b.q.b();
                        v0 = var1_1;
                        v1 = 167;
                        if (var2_2 == null) break block12;
                        if (v0 == v1) {
                            return -1.0f;
                        }
                        v0 = var1_1;
                        if (var2_2 == null) break block13;
                        v1 = 32;
                    }
                    if (v0 == v1) {
                        return this.v[32];
                    }
                    v0 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(var1_1);
                }
                var3_3 = v0;
                v2 = var1_1;
                if (var2_2 == null) break block14;
                if (v2 <= 0) break block15;
                v2 = var3_3;
                if (var2_2 == null) break block14;
                if (v2 != -1) {
                    v2 = this.c ? 1 : 0;
                    if (var2_2 != null) {
                        if (v2 == 0) {
                            return this.v[var3_3];
                        } else {
                            ** GOTO lbl28
                        }
                    } else {
                        ** GOTO lbl27
                    }
                }
                break block15;
lbl27:
                // 2 sources

                break block14;
            }
            v2 = this.x[var1_1];
        }
        if (var2_2 != null) {
            if (v2 == 0) return 0.0f;
            v2 = this.x[var1_1] >>> 4;
        }
        var4_4 = v2;
        var5_5 = this.x[var1_1] & 15;
        return (++var5_5 - (var4_4 &= 15)) / 2 + 1;
    }

    protected int a(String string, float f10, float f11, int n2, boolean bl2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        if (string == null) {
            return 0;
        }
        int n3 = this.r;
        if (arrstring != null) {
            if (n3 != 0) {
                string = this.c(string);
            }
            n3 = n2 & 0xFC000000;
        }
        if (arrstring != null) {
            if (n3 == 0) {
                n2 |= 0xFF000000;
            }
            n3 = bl2 ? 1 : 0;
        }
        if (arrstring != null) {
            if (n3 != 0) {
                n2 = (n2 & 0xFCFCFC) >> 2 | n2 & 0xFF000000;
            }
            this.d = (float)(n2 >> 16 & 0xFF) / 255.0f;
            this.b = (float)(n2 >> 8 & 0xFF) / 255.0f;
            this.l = (float)(n2 & 0xFF) / 255.0f;
            this.B = (float)(n2 >> 24 & 0xFF) / 255.0f;
            net.minecraft.client.a.v.b(this.d, this.b, this.l, this.B);
            this.A = f10;
            this.C = f11;
            n3 = cj.b.i.a(ch.class).i() ? 1 : 0;
        }
        if (arrstring != null) {
            if (n3 != 0) {
                string = string.replaceAll(Q.P().l.b(), (Object)ChatFormatting.LIGHT_PURPLE + "" + (Object)((Object)net.minecraft.at.l.ITALIC) + "Protected" + (Object)ChatFormatting.RESET);
            }
            this.a(string, bl2);
            n3 = (int)this.A;
        }
        return n3;
    }

    public int a(String string) {
        return this.p;
    }

    protected InputStream a(net.minecraft.ar.v v2) throws IOException {
        return Q.P().O().a(v2).c();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int e(char c10) {
        int n2 = "0123456789abcdef".indexOf(c10);
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        if (arrstring == null) return n3;
        if (n3 < 0) return 0xFFFFFF;
        n3 = n2;
        if (arrstring == null) return n3;
        if (n3 >= this.f.length) return 0xFFFFFF;
        int n4 = this.f[n2];
        int n5 = fU.g();
        if (arrstring == null) return n5;
        if (n5 != 0) {
            n4 = fa.a(n2, n4);
        }
        n5 = n4;
        return n5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(char n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        int n4 = 107;
        if (arrstring != null) {
            if (n3 >= n4) {
                n3 = n2;
                if (arrstring == null) return n3 != 0;
                if (n3 <= 111) return 1 != 0;
            }
            n3 = n2;
            n4 = 75;
        }
        if (arrstring != null) {
            if (n3 >= n4) {
                n3 = n2;
                if (arrstring == null) return n3 != 0;
                if (n3 <= 79) return 1 != 0;
            }
            n3 = n2;
            if (arrstring == null) return n3 != 0;
            n4 = 114;
        }
        if (n3 == n4) return 1 != 0;
        n3 = n2;
        if (arrstring == null) return n3 != 0;
        if (n3 != 82) return 0 != 0;
        return 1 != 0;
    }

    private float b(char c10, boolean bl2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n2 = this.x[c10];
        if (arrstring != null) {
            if (n2 == 0) {
                return 0.0f;
            }
            n2 = c10 / 256;
        }
        int n3 = n2;
        this.a(n3);
        int n4 = this.x[c10] >>> 4;
        int n5 = this.x[c10] & 0xF;
        float f10 = n4 &= 0xF;
        float f11 = n5 + 1;
        float f12 = (float)(c10 % 16 * 16) + f10;
        float f13 = (c10 & 0xFF) / 16 * 16;
        float f14 = f11 - f10 - 0.02f;
        float f15 = bl2 ? 1.0f : 0.0f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)(f12 / 256.0f), (float)(f13 / 256.0f));
        GL11.glVertex3f((float)(this.A + f15), (float)this.C, (float)0.0f);
        GL11.glTexCoord2f((float)(f12 / 256.0f), (float)((f13 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.A - f15), (float)(this.C + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)((f12 + f14) / 256.0f), (float)(f13 / 256.0f));
        GL11.glVertex3f((float)(this.A + f14 / 2.0f + f15), (float)this.C, (float)0.0f);
        GL11.glTexCoord2f((float)((f12 + f14) / 256.0f), (float)((f13 + 15.98f) / 256.0f));
        GL11.glVertex3f((float)(this.A + f14 / 2.0f - f15), (float)(this.C + 7.99f), (float)0.0f);
        GL11.glEnd();
        return (f11 - f10) / 2.0f + 1.0f;
    }

    public boolean f() {
        return this.c;
    }

    public int c(String string, float f10, float f11, int n2) {
        return this.b(string, f10, f11, n2, true);
    }

    private void e() {
        block16: {
            BufferedImage bufferedImage;
            String[] arrstring = net.minecraft.client.b.q.b();
            try {
                bufferedImage = net.minecraft.client.j.p.a(this.a(this.j));
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
            Properties properties = gN.a(this.j);
            this.n = gN.a(properties, "blend", false);
            int n2 = bufferedImage.getWidth();
            int n3 = bufferedImage.getHeight();
            int n4 = n2 / 16;
            int n5 = n3 / 16;
            float f10 = (float)n2 / 128.0f;
            float f11 = fU.a(f10, 1.0f, 2.0f);
            this.t = 1.0f / f11;
            float f12 = gN.a(properties, "offsetBold", -1.0f);
            float f13 = f12 - 0.0f;
            float f14 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
            if (arrstring != null) {
                if (f14 >= 0) {
                    this.t = f12;
                }
                f14 = n2 * n3;
            }
            int[] arrn = new int[f14];
            bufferedImage.getRGB(0, 0, n2, n3, arrn, 0, n2);
            for (int i2 = 0; i2 < 256; ++i2) {
                int n6;
                block20: {
                    int n7;
                    block21: {
                        block22: {
                            int n8;
                            block19: {
                                block17: {
                                    int n9 = i2 % 16;
                                    int n10 = i2 / 16;
                                    n6 = 0;
                                    if (arrstring == null) break block16;
                                    for (n6 = n4 - 1; n6 >= 0; --n6) {
                                        boolean bl2;
                                        block18: {
                                            int n11 = n9 * n4 + n6;
                                            boolean bl3 = true;
                                            n7 = 0;
                                            if (arrstring == null) break block17;
                                            int n12 = n7;
                                            while (n12 < n5) {
                                                bl2 = bl3;
                                                if (arrstring != null && arrstring != null) {
                                                    if (!bl2) break;
                                                    int n13 = (n10 * n5 + n12) * n2;
                                                    int n14 = arrn[n11 + n13];
                                                    int n15 = n14 >> 24 & 0xFF;
                                                    if (arrstring != null) {
                                                        if (n15 > 16) {
                                                            bl3 = false;
                                                        }
                                                        ++n12;
                                                    }
                                                    if (arrstring != null) continue;
                                                }
                                                break block18;
                                            }
                                            bl2 = bl3;
                                        }
                                        if (!bl2 && arrstring != null) break;
                                        if (arrstring != null) continue;
                                    }
                                    n7 = i2;
                                }
                                n8 = 65;
                                if (arrstring != null) {
                                    if (n7 == n8) {
                                        // empty if block
                                    }
                                    n7 = i2;
                                    n8 = 32;
                                }
                                if (arrstring == null) break block19;
                                if (n7 != n8) break block20;
                                n7 = n4;
                                if (arrstring == null) break block21;
                                n8 = 8;
                            }
                            if (n7 > n8) break block22;
                            n6 = (int)(2.0f * f10);
                            if (arrstring != null) break block20;
                        }
                        n7 = (int)(1.5f * f10);
                    }
                    n6 = n7;
                }
                this.v[i2] = (float)(n6 + 1) / f10 + 1.0f;
                if (arrstring != null) continue;
            }
            gN.a(properties, this.v);
        }
    }

    public void d(String string, float f10, float f11, int n2) {
        this.c(string, f10 -= (float)this.e(string) / 2.0f, f11, n2);
    }

    protected void b(net.minecraft.ar.v v2) {
        this.i.b(v2);
    }

    public static String d(String string) {
        char c10;
        String string2 = "";
        int c102 = -1;
        String[] arrstring = net.minecraft.client.b.q.b();
        int n2 = string.length();
        while ((c10 = string.indexOf(167, (int)(c10 + true))) != '\uffffffff') {
            block8: {
                boolean bl2;
                char c11;
                block6: {
                    block7: {
                        char c12 = c10;
                        if (arrstring != null) {
                            if (c12 >= n2 - 1) continue;
                            c12 = string.charAt(c10 + '\u0001');
                        }
                        c11 = c12;
                        bl2 = a5.d(c11);
                        if (arrstring == null) break block6;
                        if (!bl2) break block7;
                        string2 = "\u00a7" + c11;
                        if (arrstring != null) break block8;
                    }
                    bl2 = a5.a(c11);
                }
                if (bl2) {
                    string2 = string2 + "\u00a7" + c11;
                }
            }
            if (arrstring != null) continue;
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float a(char n2, boolean bl2) {
        float f10;
        a5 a52;
        block9: {
            block8: {
                int n3;
                int n4;
                block7: {
                    String[] arrstring = net.minecraft.client.b.q.b();
                    int n5 = n2;
                    if (arrstring != null) {
                        if (n5 == 32) {
                            a5 a53 = this;
                            if (arrstring != null) {
                                if (a53.c) {
                                    return 4.0f;
                                }
                                a53 = this;
                            }
                            float f11 = a53.v[n2];
                            return f11;
                        }
                        n5 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000".indexOf(n2);
                    }
                    n3 = n4 = n5;
                    if (arrstring == null) break block7;
                    if (n3 == -1) break block8;
                    a52 = this;
                    if (arrstring == null) break block9;
                    n3 = a52.c ? 1 : 0;
                }
                if (n3 == 0) {
                    f10 = this.a(n4, bl2);
                    return f10;
                }
            }
            a52 = this;
        }
        f10 = a52.b((char)n2, bl2);
        return f10;
    }

    /*
     * Exception decompiling
     */
    String d(String var1_1, int var2_2) {
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

    public int c(char c10) {
        return Math.round(this.b(c10));
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    static {
        y = "CL_00000660";
        h = new net.minecraft.ar.v[256];
        g = Q.P();
    }

    protected void a(float f10) {
        block7: {
            a5 a52;
            I i2;
            W w2;
            boolean bl2;
            String[] arrstring;
            block6: {
                arrstring = net.minecraft.client.b.q.b();
                bl2 = this.o;
                if (arrstring == null) break block6;
                if (bl2) {
                    w2 = W.c();
                    i2 = w2.b();
                    net.minecraft.client.a.v.L();
                    i2.a(7, net.minecraft.client.y.b.k);
                    i2.c((double)this.A, (double)(this.C + (float)(this.p / 2)), 0.0).d();
                    i2.c((double)(this.A + f10), (double)(this.C + (float)(this.p / 2)), 0.0).d();
                    i2.c((double)(this.A + f10), (double)(this.C + (float)(this.p / 2) - 1.0f), 0.0).d();
                    i2.c((double)this.A, (double)(this.C + (float)(this.p / 2) - 1.0f), 0.0).d();
                    w2.a();
                    net.minecraft.client.a.v.x();
                }
                a52 = this;
                if (arrstring == null) break block7;
                bl2 = a52.E;
            }
            if (bl2) {
                w2 = W.c();
                i2 = w2.b();
                net.minecraft.client.a.v.L();
                i2.a(7, net.minecraft.client.y.b.k);
                int n2 = this.E;
                if (arrstring != null) {
                    n2 = n2 != 0 ? -1 : 0;
                }
                int n3 = n2;
                i2.c((double)(this.A + (float)n3), (double)(this.C + (float)this.p), 0.0).d();
                i2.c((double)(this.A + f10), (double)(this.C + (float)this.p), 0.0).d();
                i2.c((double)(this.A + f10), (double)(this.C + (float)this.p - 1.0f), 0.0).d();
                i2.c((double)(this.A + (float)n3), (double)(this.C + (float)this.p - 1.0f), 0.0).d();
                w2.a();
                net.minecraft.client.a.v.x();
            }
            a52 = this;
        }
        a52.A += f10;
    }

    @Override
    public void b(t t2) {
        block2: {
            this.j = gN.b(this.w);
            String[] arrstring = net.minecraft.client.b.q.b();
            for (int i2 = 0; i2 < h.length; ++i2) {
                a5.h[i2] = null;
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            this.e();
            this.a();
        }
    }

    public boolean b() {
        return this.r;
    }

    private void a(String string, int n2, int n3, int n4, boolean bl2) {
        Iterator<String> iterator = this.c(string, n4).iterator();
        String[] arrstring = net.minecraft.client.b.q.b();
        while (iterator.hasNext()) {
            String string2 = iterator.next();
            this.a(string2, n2, n3, n4, this.D, bl2);
            n3 += this.p;
            if (arrstring != null) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int e(String var1_1) {
        var2_2 = net.minecraft.client.b.q.b();
        if (var1_1 == null) {
            return 0;
        }
        var3_3 = 0.0f;
        var4_4 = 0;
        var5_5 = 0;
        while (var5_5 < var1_1.length()) {
            block14: {
                block15: {
                    block16: {
                        block7: {
                            block8: {
                                block13: {
                                    block9: {
                                        block10: {
                                            block11: {
                                                block12: {
                                                    var6_6 = var1_1.charAt(var5_5);
                                                    var7_7 = this.b(var6_6);
                                                    cfr_temp_0 = var7_7 - 0.0f;
                                                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                    if (var2_2 == null) return v0;
                                                    if (var2_2 == null) break block7;
                                                    if (v0 >= 0) break block8;
                                                    v1 = var5_5++;
                                                    if (var2_2 == null) break block7;
                                                    if (v1 >= var1_1.length() - 1) break block8;
                                                    v2 = var6_6 = var1_1.charAt(var5_5);
                                                    if (var2_2 == null) break block9;
                                                    if (v2 == 'l') break block10;
                                                    v2 = var6_6;
                                                    if (var2_2 == null) break block9;
                                                    if (v2 == 'L') break block10;
                                                    v3 = var6_6;
                                                    if (var2_2 == null) break block11;
                                                    if (v3 == 'r') break block12;
                                                    v3 = var6_6;
                                                    if (var2_2 == null) break block11;
                                                    if (v3 != 'R') break block13;
                                                }
                                                v3 = '\u0000';
                                            }
                                            var4_4 = v3;
                                            if (var2_2 != null) break block13;
                                        }
                                        v2 = '\u0001';
                                    }
                                    var4_4 = v2;
                                }
                                var7_7 = 0.0f;
                            }
                            var3_3 += var7_7;
                            if (var2_2 == null) break block14;
                            v1 = var4_4;
                        }
                        if (v1 == false) break block15;
                        v4 = var7_7;
                        if (var2_2 == null) break block16;
                        if (!(v4 > 0.0f)) break block15;
                        v4 = var3_3;
                    }
                    v5 = this;
                    if (var2_2 == null) ** GOTO lbl58
                    if (v5.c) {
                        v6 = 1.0f;
                    } else {
                        v5 = this;
lbl58:
                        // 2 sources

                        v6 = v5.t;
                    }
                    var3_3 = v4 + v6;
                }
                ++var5_5;
            }
            if (var2_2 != null) continue;
        }
        v0 = Math.round(var3_3);
        return v0;
    }

    private void d() {
        this.z = false;
        this.m = false;
        this.k = false;
        this.E = false;
        this.o = false;
    }

    public void b(boolean bl2) {
        this.r = bl2;
    }

    public int b(String string, int n2) {
        return this.p * this.c(string, n2).size();
    }

    private float a(int n2, boolean bl2) {
        int n3 = n2 % 16 * 8;
        int n4 = n2 / 16 * 8;
        String[] arrstring = net.minecraft.client.b.q.b();
        boolean bl3 = bl2;
        if (arrstring != null) {
            bl3 = bl3;
        }
        boolean bl4 = bl3;
        this.b(this.j);
        float f10 = this.v[n2];
        float f11 = 7.99f;
        GL11.glBegin((int)5);
        GL11.glTexCoord2f((float)((float)n3 / 128.0f), (float)((float)n4 / 128.0f));
        GL11.glVertex3f((float)(this.A + (float)bl4), (float)this.C, (float)0.0f);
        GL11.glTexCoord2f((float)((float)n3 / 128.0f), (float)(((float)n4 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.A - (float)bl4), (float)(this.C + 7.99f), (float)0.0f);
        GL11.glTexCoord2f((float)(((float)n3 + f11 - 1.0f) / 128.0f), (float)((float)n4 / 128.0f));
        GL11.glVertex3f((float)(this.A + f11 - 1.0f + (float)bl4), (float)this.C, (float)0.0f);
        GL11.glTexCoord2f((float)(((float)n3 + f11 - 1.0f) / 128.0f), (float)(((float)n4 + 7.99f) / 128.0f));
        GL11.glVertex3f((float)(this.A + f11 - 1.0f - (float)bl4), (float)(this.C + 7.99f), (float)0.0f);
        GL11.glEnd();
        return f10;
    }

    public a5(c c10, net.minecraft.ar.v v2, u u2, boolean bl2) {
        block8: {
            this.v = new float[256];
            this.p = 9;
            this.s = new Random();
            this.x = new byte[65536];
            this.f = new int[32];
            String[] arrstring = net.minecraft.client.b.q.b();
            this.e = true;
            this.t = 1.0f;
            this.a = new float[256];
            this.n = false;
            this.u = new f();
            this.q = c10;
            this.w = v2;
            this.j = v2;
            this.i = u2;
            this.c = bl2;
            this.j = gN.b(this.w);
            this.b(this.j);
            for (int i2 = 0; i2 < 32; ++i2) {
                int n2;
                int n3;
                int n4;
                block10: {
                    int n5;
                    int n6;
                    block9: {
                        int n7 = (i2 >> 3 & 1) * 85;
                        n4 = (i2 >> 2 & 1) * 170 + n7;
                        n3 = (i2 >> 1 & 1) * 170 + n7;
                        n2 = (i2 >> 0 & 1) * 170 + n7;
                        if (arrstring == null) break block8;
                        n6 = i2;
                        if (arrstring != null) {
                            if (n6 == 6) {
                                n4 += 85;
                            }
                            n6 = c10.aD ? 1 : 0;
                        }
                        if (arrstring != null) {
                            if (n6 != 0) {
                                int n8 = (n4 * 30 + n3 * 59 + n2 * 11) / 100;
                                int n9 = (n4 * 30 + n3 * 70) / 100;
                                int n10 = (n4 * 30 + n2 * 70) / 100;
                                n4 = n8;
                                n3 = n9;
                                n2 = n10;
                            }
                            n6 = i2;
                        }
                        n5 = 16;
                        if (arrstring == null) break block9;
                        if (n6 < n5) break block10;
                        n4 /= 4;
                        n3 /= 4;
                        n6 = n2;
                        n5 = 4;
                    }
                    n2 = n6 / n5;
                }
                this.f[i2] = (n4 & 0xFF) << 16 | (n3 & 0xFF) << 8 | n2 & 0xFF;
                if (arrstring != null) continue;
            }
            this.a();
        }
    }

    private void a() {
        InputStream inputStream = null;
        try {
            inputStream = this.a(new net.minecraft.ar.v("font/glyph_sizes.bin"));
            inputStream.read(this.x);
        }
        catch (IOException iOException) {
            try {
                throw new RuntimeException(iOException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int a(String var1_1, int var2_2) {
        block19: {
            block20: {
                block18: {
                    block15: {
                        var4_3 = var1_1.length();
                        var5_4 = 0.0f;
                        var3_6 = net.minecraft.client.b.q.b();
                        var7_7 = -1;
                        var8_8 = 0;
                        for (var6_5 = 0; var6_5 < var4_3; ++var6_5) {
                            block17: {
                                block16: {
                                    var9_9 = var1_1.charAt(var6_5);
                                    v0 = var9_9;
                                    if (var3_6 == null) break block15;
                                    if (var3_6 == null) ** GOTO lbl27
                                    switch (v0) {
                                        case 10: {
                                            --var6_5;
                                            if (var3_6 != null) break;
                                        }
                                        case 32: {
                                            var7_7 = var6_5;
                                        }
                                        default: {
                                            var5_4 += this.b(var9_9);
                                            v1 = var8_8;
                                            if (var3_6 != null) {
                                                if (v1 == 0) break;
                                                var5_4 += 1.0f;
                                                if (var3_6 != null) break;
                                            }
                                            break block16;
                                        }
                                        case 167: {
                                            v1 = var6_5;
lbl27:
                                            // 2 sources

                                            v2 = var4_3 - 1;
                                            if (var3_6 == null) break block17;
                                            if (v1 >= v2) break;
                                            v3 = var10_10 = var1_1.charAt(++var6_5);
                                            if (var3_6 == null) ** GOTO lbl50
                                            if (v3 == 'l') ** GOTO lbl49
                                            v3 = var10_10;
                                            if (var3_6 == null) ** GOTO lbl50
                                            if (v3 == 'L') ** GOTO lbl49
                                            v4 = var10_10;
                                            if (var3_6 == null) ** GOTO lbl47
                                            if (v4 == 'r') ** GOTO lbl46
                                            v4 = var10_10;
                                            if (var3_6 == null) ** GOTO lbl47
                                            if (v4 == 'R') ** GOTO lbl46
                                            v1 = a5.d(var10_10) ? 1 : 0;
                                            if (var3_6 != null) {
                                                if (v1 == 0) break;
                                            }
                                            break block16;
lbl46:
                                            // 3 sources

                                            v4 = '\u0000';
lbl47:
                                            // 3 sources

                                            var8_8 = v4;
                                            if (var3_6 != null) break;
lbl49:
                                            // 3 sources

                                            v3 = '\u0001';
lbl50:
                                            // 3 sources

                                            var8_8 = v3;
                                        }
                                    }
                                    v1 = var9_9;
                                }
                                v2 = 10;
                            }
                            if (var3_6 != null) {
                                if (v1 == v2) {
                                    var7_7 = ++var6_5;
                                    if (var3_6 != null) break;
                                }
                                v1 = Math.round(var5_4);
                                v2 = var2_2;
                            }
                            if (v1 > v2 && var3_6 != null) break;
                            if (var3_6 != null) continue;
                        }
                        v0 = var6_5;
                    }
                    v5 = var4_3;
                    if (var3_6 == null) break block18;
                    if (v0 == v5) break block19;
                    v0 = var7_7;
                    v5 = -1;
                }
                if (var3_6 == null) break block20;
                if (v0 == v5) break block19;
                v0 = var7_7;
                if (var3_6 == null) return v0;
                v5 = var6_5;
            }
            if (v0 < v5) {
                v0 = var7_7;
                return v0;
            }
        }
        v0 = var6_5;
        return v0;
    }

    public void a(String string, int n2, int n3, int n4, int n5) {
        block6: {
            a5 a52;
            block5: {
                boolean bl2;
                block4: {
                    String[] arrstring = net.minecraft.client.b.q.b();
                    bl2 = this.n;
                    if (arrstring == null) break block4;
                    if (bl2) {
                        net.minecraft.client.a.v.b(this.u);
                        net.minecraft.client.a.v.a();
                        net.minecraft.client.a.v.f(770, 771);
                    }
                    this.d();
                    this.D = n5;
                    string = this.b(string);
                    this.a(string, n2, n3, n4, false);
                    a52 = this;
                    if (arrstring == null) break block5;
                    bl2 = a52.n;
                }
                if (!bl2) break block6;
                a52 = this;
            }
            net.minecraft.client.a.v.a(a52.u);
        }
    }

    /*
     * Exception decompiling
     */
    private void a(String var1_1, boolean var2_2) {
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

    private void a(int n2) {
        this.b(this.b(n2));
    }

    public List<String> c(String string, int n2) {
        return Arrays.asList(this.d(string, n2).split("\n"));
    }

    private net.minecraft.ar.v b(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        net.minecraft.ar.v v2 = h[n2];
        if (arrstring != null) {
            if (v2 == null) {
                a5.h[n2] = new net.minecraft.ar.v(String.format("textures/font/unicode_page_%02x.png", n2));
                a5.h[n2] = gN.b(h[n2]);
            }
            v2 = h[n2];
        }
        return v2;
    }

    public int b(String string, float f10, float f11, int n2, boolean bl2) {
        int n3;
        String[] arrstring;
        block9: {
            int n4;
            block7: {
                block8: {
                    String[] arrstring2 = net.minecraft.client.b.q.b();
                    this.c();
                    arrstring = arrstring2;
                    n4 = this.n;
                    if (arrstring != null) {
                        if (n4 != 0) {
                            net.minecraft.client.a.v.b(this.u);
                            net.minecraft.client.a.v.a();
                            net.minecraft.client.a.v.f(770, 771);
                        }
                        this.d();
                        n4 = bl2;
                    }
                    if (arrstring == null) break block7;
                    if (n4 == 0) break block8;
                    n3 = this.a(string, f10 + 1.0f, f11 + 1.0f, n2, true);
                    n3 = Math.max(n3, this.a(string, f10, f11, n2, false));
                    if (arrstring != null) break block9;
                }
                n4 = this.a(string, f10, f11, n2, false);
            }
            n3 = n4;
        }
        int n5 = this.n;
        if (arrstring != null) {
            if (n5 != 0) {
                net.minecraft.client.a.v.a(this.u);
            }
            n5 = n3;
        }
        return n5;
    }

    protected void c() {
        net.minecraft.client.a.v.e();
    }

    public String c(String string) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(8).shape(string), 127);
            bidi.setReorderingMode(0);
            return bidi.writeReordered(2);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }

    public String e(String string, int n2) {
        return this.a(string, n2, false);
    }
}

