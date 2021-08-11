/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.C;
import net.minecraft.ar.a3;
import net.minecraft.ax.T;
import net.minecraft.ax.u;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.i.j;
import net.minecraft.w.H;
import net.minecraft.w.d;
import net.minecraft.w.m;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class cH
extends bE {
    public /* synthetic */ hH k;
    public /* synthetic */ hH m;
    public static /* synthetic */ Map<B, double[]> l;

    private static gP b(gP gP2) {
        return gP2;
    }

    private void b() {
        float f10 = cH.c.ac.d ? 2.0f : cj.b.f.a("NameTags Size").r();
        v.d(f10, f10, f10);
    }

    public cH() {
        super("NameTags", a5.Visuals);
        cj.b.f.b(new hH("NameTags Size", this, 1.0, 0.5, 2.0, 0.1));
        cj.b.f.b(new hH("NameBackground", this, true));
        this.m = new hH("Border Opacity", this, 10.0, 0.0, 255.0, 5.0);
        cj.b.f.b(this.m);
        cj.b.f.b(new hH("OffHand Render", this, true));
        this.k = new hH("Show Armor", this, true);
        cj.b.f.b(this.k);
    }

    private double[] a(double d10, double d11, double d12) {
        block3: {
            int n2;
            FloatBuffer floatBuffer;
            block2: {
                int n3;
                floatBuffer = BufferUtils.createFloatBuffer((int)3);
                IntBuffer intBuffer = BufferUtils.createIntBuffer((int)16);
                FloatBuffer floatBuffer2 = BufferUtils.createFloatBuffer((int)16);
                String[] arrstring = C.f();
                FloatBuffer floatBuffer3 = BufferUtils.createFloatBuffer((int)16);
                GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer2);
                String[] arrstring2 = arrstring;
                GL11.glGetFloat((int)2983, (FloatBuffer)floatBuffer3);
                GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
                n2 = n3 = GLU.gluProject((float)((float)d10), (float)((float)d11), (float)((float)d12), (FloatBuffer)floatBuffer2, (FloatBuffer)floatBuffer3, (IntBuffer)intBuffer, (FloatBuffer)floatBuffer);
                if (arrstring2 != null) break block2;
                if (n2 == 0) break block3;
                n2 = 3;
            }
            double[] arrd = new double[n2];
            arrd[0] = floatBuffer.get(0);
            arrd[1] = (float)Display.getHeight() - floatBuffer.get(1);
            arrd[2] = floatBuffer.get(2);
            return arrd;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @cL
    public void a(fn var1_1) {
        v.M();
        var3_2 = cH.l.keySet().iterator();
        var2_3 = C.f();
        block0: while (true) lbl-1000:
        // 3 sources

        {
            v0 = var3_2.hasNext();
            block1: while (v0 != 0) {
                block47: {
                    block48: {
                        block38: {
                            block45: {
                                block46: {
                                    block43: {
                                        block44: {
                                            block41: {
                                                block42: {
                                                    block39: {
                                                        block40: {
                                                            var4_4 = var3_2.next();
                                                            v.M();
                                                            if (var2_3 != null) return;
                                                            v1 = var4_4;
                                                            if (var2_3 == null) {
                                                                if (!(v1 instanceof j)) continue block0;
                                                                v1 = var4_4;
                                                            }
                                                            if (var2_3 == null) {
                                                                if (v1 == cH.c.s) continue block0;
                                                                v1 = cH.l.get(var4_4);
                                                            }
                                                            var5_5 = (double[])v1;
                                                            if (var2_3 != null) break block39;
                                                            if (var5_5[3] < 0.0) break block40;
                                                            v2 = var5_5[3];
                                                            v3 = 1.0;
                                                            if (var2_3 != null) break block41;
                                                            if (!(v2 >= v3)) break block42;
                                                        }
                                                        v.B();
                                                    }
                                                    if (var2_3 == null) ** GOTO lbl-1000
                                                }
                                                v2 = var5_5[0] / (double)net.minecraft.client.b.l.c();
                                                v3 = var5_5[1] / (double)net.minecraft.client.b.l.c();
                                            }
                                            v.b(v2, v3, 0.0);
                                            this.b();
                                            var6_6 = "";
                                            v4 = cj.b.i.a(ch.class).i();
                                            if (var2_3 != null) break block43;
                                            if (!v4) break block44;
                                            v4 = ch.l.l();
                                            if (var2_3 != null) break block43;
                                            if (!v4) break block44;
                                            var6_6 = "Protected";
                                            if (var2_3 == null) break block45;
                                        }
                                        v4 = cj.b.g.c(var4_4.g());
                                    }
                                    if (!v4) break block46;
                                    var6_6 = (Object)ChatFormatting.GREEN + "[F] " + (Object)ChatFormatting.RESET + var4_4.d().f();
                                    if (var2_3 == null) break block45;
                                }
                                var6_6 = var4_4.d().f();
                            }
                            var7_7 = "" + aY.a(var4_4.V(), 1);
                            var8_8 = cH.c.a6.e(var7_7 + " " + var6_6) + 2;
                            v.b(0.0, -10.0, 0.0);
                            v5 = cj.b.f.a("NameBackground").l();
                            if (var2_3 == null) {
                                if (v5 != 0) {
                                    dJ.a(-var8_8 / 2.0f, -10.0, var8_8 / 2.0f, 3.0, 1.0, a0.a(0, this.m.c()), a0.a(25, this.m.c()), true);
                                }
                                v5 = cH.c.a6.c(var6_6 + " " + (Object)cH.a(var4_4.V()) + var7_7, -var8_8 / 2.0f + 2.0f, -7.5f, -1);
                            }
                            var9_9 = var4_4.c(a3.OFF_HAND);
                            if (!this.k.l()) break block47;
                            var10_10 = new ArrayList<Object>();
                            for (var11_11 = 0; var11_11 < 5; ++var11_11) {
                                var12_12 = ((j)var4_4).l(var11_11);
                                var10_10.add(var12_12);
                                if (var2_3 == null) {
                                    if (var2_3 == null) continue;
                                }
                                break block38;
                            }
                            v6 = var10_10;
                            if (var2_3 != null) break block48;
                            var11_11 = -(v6.size() * 9);
                        }
                        if (cj.b.f.a("OffHand Render").l()) {
                            cH.c.Y().b(var9_9, var11_11 + 105 - cH.c.a6.e("" + var11_11), -29);
                            cH.c.Y().a(cH.c.a6, var9_9, var11_11 + 105 - cH.c.a6.e("" + var11_11), -28);
                        }
                        v6 = var10_10;
                    }
                    for (d var13_13 : v6) {
                        block55: {
                            block54: {
                                block51: {
                                    block52: {
                                        block53: {
                                            block49: {
                                                block50: {
                                                    net.minecraft.client.a.a0.b();
                                                    cH.c.Y().b(var13_13, var11_11 + 6, -28);
                                                    cH.c.Y().a(cH.c.a6, var13_13, var11_11 + 5, -26);
                                                    var11_11 += 3;
                                                    net.minecraft.client.a.a0.a();
                                                    var14_14 = 7;
                                                    var15_15 = T.a(Objects.requireNonNull(u.c(16)), var13_13);
                                                    var16_16 = T.a(Objects.requireNonNull(u.c(20)), var13_13);
                                                    var17_17 = T.a(Objects.requireNonNull(u.c(19)), var13_13);
                                                    v0 = var15_15;
                                                    if (var2_3 != null) continue block1;
                                                    if (var2_3 == null) {
                                                        if (v0 > 0) {
                                                            this.a("S" + this.a(var15_15) + var15_15, var11_11, var14_14);
                                                            var14_14 += 8;
                                                        }
                                                        v7 = var16_16;
                                                    }
                                                    if (var2_3 == null) {
                                                        if (v7 > 0) {
                                                            this.a("F" + this.a(var16_16) + var16_16, var11_11, var14_14);
                                                            var14_14 += 8;
                                                        }
                                                        v7 = var17_17;
                                                    }
                                                    if (var2_3 != null) break block49;
                                                    if (v7 <= 0) break block50;
                                                    this.a("Kb" + this.a(var17_17) + var17_17, var11_11, var14_14);
                                                    if (var2_3 == null) break block51;
                                                }
                                                v7 = var13_13.w() instanceof m;
                                            }
                                            if (var2_3 != null) break block52;
                                            if (v7 == 0) break block53;
                                            var18_18 = T.a(Objects.requireNonNull(u.c(0)), var13_13);
                                            var19_19 = T.a(Objects.requireNonNull(u.c(7)), var13_13);
                                            var20_20 = T.a(Objects.requireNonNull(u.c(34)), var13_13);
                                            v8 = var18_18;
                                            if (var2_3 == null) {
                                                if (v8 > 0) {
                                                    this.a("P" + this.a(var18_18) + var18_18, var11_11, var14_14);
                                                    var14_14 += 8;
                                                }
                                                v8 = var19_19;
                                            }
                                            if (var2_3 == null) {
                                                if (v8 > 0) {
                                                    this.a("Th" + this.a(var19_19) + var19_19, var11_11, var14_14);
                                                    var14_14 += 8;
                                                }
                                                v8 = var20_20;
                                            }
                                            if (v8 > 0) {
                                                this.a("U" + this.a(var20_20) + var20_20, var11_11, var14_14);
                                            }
                                            if (var2_3 == null) break block51;
                                        }
                                        v7 = var13_13.w() instanceof H;
                                    }
                                    if (var2_3 != null) break block54;
                                    if (v7 == 0) break block51;
                                    var18_18 = T.a(Objects.requireNonNull(u.c(48)), var13_13);
                                    var19_19 = T.a(Objects.requireNonNull(u.c(49)), var13_13);
                                    var20_20 = T.a(Objects.requireNonNull(u.c(50)), var13_13);
                                    v9 = var18_18;
                                    if (var2_3 == null) {
                                        if (v9 > 0) {
                                            this.a("P" + this.a(var18_18) + var18_18, var11_11, var14_14);
                                            var14_14 += 8;
                                        }
                                        v9 = var19_19;
                                    }
                                    if (var2_3 == null) {
                                        if (v9 > 0) {
                                            this.a("P" + this.a(var19_19) + var19_19, var11_11, var14_14);
                                            var14_14 += 8;
                                        }
                                        v9 = var20_20;
                                    }
                                    if (var2_3 != null) break block55;
                                    if (v9 > 0) {
                                        this.a("F" + this.a(var20_20) + var20_20, var11_11, var14_14);
                                    }
                                }
                                v7 = (int)Math.round(255.0 - (double)var13_13.u() * 255.0 / (double)var13_13.E());
                            }
                            var18_18 = v7;
                            new Color(255 - var18_18 << 16 | var18_18 << 8).brighter();
                            v9 = var13_13.E() - var13_13.u();
                        }
                        if (var2_3 == null) {
                            if (v9 > 0) {
                                v.M();
                                v.n();
                                v.t();
                                v.B();
                            }
                            v9 = var11_11 = (int)((double)var11_11 + 13.5);
                        }
                        if (var2_3 == null) continue;
                    }
                }
                v.B();
                if (var2_3 == null) continue block0;
            }
            break;
        }
        GL11.glPopMatrix();
        v.a();
    }

    public static net.minecraft.at.l a(float f10) {
        String[] arrstring = C.f();
        float f11 = f10 - 4.0f;
        float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (arrstring == null) {
            if (f12 <= 0) {
                return net.minecraft.at.l.RED;
            }
            float f13 = f10 - 8.0f;
            f12 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
        }
        if (arrstring == null) {
            if (f12 <= 0) {
                return net.minecraft.at.l.GOLD;
            }
            float f14 = f10 - 12.0f;
            f12 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        }
        if (arrstring == null) {
            if (f12 <= 0) {
                return net.minecraft.at.l.YELLOW;
            }
            float f15 = f10 - 16.0f;
            f12 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
        }
        if (f12 <= 0) {
            return net.minecraft.at.l.DARK_GREEN;
        }
        return net.minecraft.at.l.GREEN;
    }

    private void a(String string, int n2, int n3) {
        v.M();
        v.n();
        cH.c.a6.c(string, n2 + 6, -35 - (n3 -= 7), -1);
        v.t();
        v.B();
    }

    static {
        l = new HashMap<B, double[]>();
    }

    @cL
    public void a(dS dS2) {
        try {
            this.a();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a() {
        String[] arrstring = C.f();
        l.clear();
        float f10 = cH.c.a8.i;
        Iterator iterator = cH.c.e.O.iterator();
        String[] arrstring2 = arrstring;
        while (iterator.hasNext()) {
            block6: {
                double[] arrd;
                double d10;
                double d11;
                double d12;
                double d13;
                x x2;
                block8: {
                    x x3;
                    block7: {
                        block5: {
                            x3 = x2 = (x)iterator.next();
                            if (arrstring2 != null) break block5;
                            if (!(x3 instanceof j)) break block6;
                            x3 = x2;
                        }
                        if (arrstring2 != null) break block7;
                        if (x3 == cH.c.s) break block6;
                        x3 = x2;
                    }
                    d13 = x3.am + (x2.a - x2.am) * (double)f10 - cH.c.aQ().i;
                    d12 = x2.af + (x2.aF - x2.af) * (double)f10 - cH.c.aQ().k;
                    d11 = x2.n + (x2.ax - x2.n) * (double)f10 - cH.c.aQ().g;
                    double d14 = Objects.requireNonNull(this.a(d13, d12 += (double)x2.aD + 0.2, d11))[2] - 0.0;
                    d10 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                    if (arrstring2 != null) break block8;
                    if (d10 < 0) break block6;
                    arrd = Objects.requireNonNull(this.a(d13, d12, d11));
                    if (arrstring2 != null) break block6;
                    double d15 = arrd[2] - 1.0;
                    d10 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                }
                if (d10 < 0) {
                    arrd = l.put((j)x2, new double[]{Objects.requireNonNull(this.a(d13, d12, d11))[0], Objects.requireNonNull(this.a(d13, d12, d11))[1], Math.abs(this.a(d13, d12 + 1.0, d11, x2)[1] - this.a(d13, d12, d11, x2)[1]), this.a(d13, d12, d11)[2]});
                }
            }
            if (arrstring2 == null) continue;
        }
    }

    private String a(int n2) {
        block11: {
            int n3;
            int n4;
            String[] arrstring;
            block10: {
                arrstring = C.f();
                n4 = n2;
                n3 = 1;
                if (arrstring != null) break block10;
                if (n4 == n3) break block11;
                n4 = n2;
                n3 = 2;
            }
            if (arrstring == null) {
                if (n4 == n3) {
                    return "";
                }
                n4 = n2;
                n3 = 3;
            }
            if (arrstring == null) {
                if (n4 == n3) {
                    return "";
                }
                n4 = n2;
                n3 = 4;
            }
            if (arrstring == null) {
                if (n4 == n3) {
                    return "";
                }
                n4 = n2;
                n3 = 5;
            }
            if (n4 >= n3) {
                return "";
            }
        }
        return "";
    }

    private double[] a(double d10, double d11, double d12, x x2) {
        float f10 = cH.c.a8.i;
        cH.c.Y.a(f10, 0);
        double[] arrd = this.a(d10, d11, d12);
        cH.c.Y.a(f10, 0);
        return arrd;
    }
}

