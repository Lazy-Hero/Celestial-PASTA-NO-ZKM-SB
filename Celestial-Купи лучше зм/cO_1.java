/*
 * Decompiled with CFR 0.150.
 */
import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.ar.aA;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.k.h;

public class cO {
    public /* synthetic */ boolean c;
    private final /* synthetic */ Map[] b;
    public /* synthetic */ int a;

    public synchronized P a(P p2, int n2, boolean n3) {
        block11: {
            int n4;
            String string;
            int n5;
            block10: {
                n5 = n2;
                string = K.d();
                n4 = n3;
                if (string == null) {
                    if (n4 != 0) {
                        n5 = n2 | 4;
                    }
                    n4 = n5;
                }
                if (string != null) break block10;
                if (n4 <= 0) break block11;
                n4 = n5;
            }
            if (n4 < this.b.length) {
                P p3;
                IdentityHashMap<P, P> identityHashMap;
                IdentityHashMap<P, P> identityHashMap2 = identityHashMap = this.b[n5];
                if (string == null) {
                    if (identityHashMap2 == null) {
                        this.b[n5] = identityHashMap = new IdentityHashMap<P, P>(1);
                    }
                    identityHashMap2 = identityHashMap.get(p2);
                }
                P p4 = p3 = (P)((Object)identityHashMap2);
                if (string == null) {
                    if (p4 == null) {
                        p3 = this.b(p2, n2, n3 != 0);
                        identityHashMap.put(p2, p3);
                    }
                    p4 = p3;
                }
                return p4;
            }
        }
        return p2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private P b(P p2, int n2, boolean bl2) {
        int[] arrn = p2.d();
        int n3 = p2.q();
        aA aA2 = p2.b();
        String string = K.d();
        c c10 = p2.p();
        cO cO2 = this;
        if (string == null) {
            if (!cO2.a(p2)) {
                n2 = 0;
            }
            cO2 = this;
        }
        arrn = cO2.a(arrn, n2, bl2);
        P p3 = new P(arrn, n3, aA2, c10);
        return p3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        String string = K.d();
        int n2 = this.a;
        if (string != null) return n2 != 0;
        if (n2 == 2) return 1 != 0;
        n2 = this.a;
        if (string != null) return n2 != 0;
        if (n2 == 4) return 1 != 0;
        return this.c;
    }

    public cO(String string) {
        block4: {
            String string2;
            block11: {
                block12: {
                    boolean bl2;
                    String string3;
                    block9: {
                        block10: {
                            block7: {
                                block8: {
                                    block5: {
                                        block6: {
                                            block2: {
                                                block3: {
                                                    this.a = 1;
                                                    string3 = K.d();
                                                    this.c = false;
                                                    this.b = new Map[8];
                                                    bl2 = string.equals("4");
                                                    if (string3 != null) break block2;
                                                    if (!bl2) break block3;
                                                    this.a = 4;
                                                    if (string3 == null) break block4;
                                                }
                                                bl2 = string.equals("2");
                                            }
                                            if (string3 != null) break block5;
                                            if (!bl2) break block6;
                                            this.a = 2;
                                            if (string3 == null) break block4;
                                        }
                                        bl2 = string.equals("F");
                                    }
                                    if (string3 != null) break block7;
                                    if (!bl2) break block8;
                                    this.c = true;
                                    if (string3 == null) break block4;
                                }
                                bl2 = string.equals("4F");
                            }
                            if (string3 != null) break block9;
                            if (!bl2) break block10;
                            this.a = 4;
                            this.c = true;
                            if (string3 == null) break block4;
                        }
                        string2 = string;
                        if (string3 != null) break block11;
                        bl2 = string2.equals("2F");
                    }
                    if (!bl2) break block12;
                    this.a = 2;
                    this.c = true;
                    if (string3 == null) break block4;
                }
                string2 = "NaturalTextures: Unknown type: " + string;
            }
            fU.h(string2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(P var1_1) {
        var3_2 = var1_1.p();
        var4_3 = var3_2.i();
        var5_4 = var3_2.l();
        var2_5 = K.d();
        var6_6 = var5_4 - var4_3;
        var7_7 = var6_6 / 256.0f;
        var8_8 = var3_2.u();
        var9_9 = var3_2.m();
        var10_10 = var9_9 - var8_8;
        var11_11 = var10_10 / 256.0f;
        var12_12 = var1_1.d();
        var13_13 = var12_12.length / 4;
        var14_14 = 0;
        do {
            block12: {
                block11: {
                    if (var14_14 >= 4) return true;
                    var15_15 = var14_14 * var13_13;
                    var16_16 = Float.intBitsToFloat(var12_12[var15_15 + 4]);
                    var17_17 = Float.intBitsToFloat(var12_12[var15_15 + 4 + 1]);
                    v0 = this.a(var16_16, var4_3, var7_7);
                    if (var2_5 != null) return v0;
                    if (var2_5 == null) {
                        if (!v0) {
                            v1 = this.a(var16_16, var5_4, var7_7);
                            if (var2_5 == null) {
                                if (!v1) {
                                    return false;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v1 = this.a(var17_17, var8_8, var11_11);
                        }
                    }
                    if (var2_5 != null) break block11;
                    if (v1) break block12;
                    v1 = this.a(var17_17, var9_9, var11_11);
                }
                if (var2_5 != null) return v1;
                if (!v1) {
                    return false;
                }
            }
            ++var14_14;
        } while (var2_5 == null);
        return true;
    }

    private int[] a(int[] arrn, int n2, boolean n3) {
        int[] arrn2;
        block7: {
            int[] arrn3 = (int[])arrn.clone();
            String string = K.d();
            int n4 = 4 - n2;
            int n5 = n3;
            if (string == null) {
                if (n5 != 0) {
                    n4 += 3;
                }
                n4 %= 4;
                n5 = arrn3.length / 4;
            }
            int n6 = n5;
            int n7 = 0;
            while (n7 < 4) {
                block10: {
                    block11: {
                        int n8;
                        block8: {
                            block9: {
                                int n9 = n7 * n6;
                                int n10 = n4 * n6;
                                arrn3[n10 + 4] = arrn[n9 + 4];
                                arrn2 = arrn3;
                                if (string != null) break block7;
                                arrn2[n10 + 4 + 1] = arrn[n9 + 4 + 1];
                                n8 = n3;
                                if (string != null) break block8;
                                if (n8 == 0) break block9;
                                --n4;
                                if (string != null) break block10;
                                if (n4 >= 0) break block11;
                                n4 = 3;
                                if (string == null) break block11;
                            }
                            ++n4;
                            if (string != null) break block10;
                            n8 = n4;
                        }
                        if (n8 > 3) {
                            n4 = 0;
                        }
                    }
                    ++n7;
                }
                if (string == null) continue;
            }
            arrn2 = arrn3;
        }
        return arrn2;
    }

    private boolean a(float f10, float f11, float f12) {
        float f13 = h.e(f10 - f11);
        String string = K.d();
        float f14 = f13 == f12 ? 0 : (f13 < f12 ? -1 : 1);
        if (string == null) {
            f14 = f14 < 0 ? 1.0f : 0.0f;
        }
        return (boolean)f14;
    }
}

