/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.k.n;

public class zzzzd6Customizer {
    private static final /* synthetic */ List<P> a;

    public static Y a(Y y2, i i2, e9 e92) {
        if (e92.o()) {
            y2 = cB.a(y2, i2);
        }
        return y2;
    }

    static {
        a = ImmutableList.of();
    }

    private static P[] a(P p2, t t2, i i2, n n2, aA aA2, long l2, e9 e92) {
        boolean bl2;
        P p3;
        block9: {
            block10: {
                P[] arrp;
                block11: {
                    P[] arrp2;
                    block12: {
                        String string;
                        block8: {
                            P p4;
                            e9 e93;
                            block7: {
                                string = K.d();
                                e93 = e92;
                                p4 = p2;
                                if (string != null) break block7;
                                if (!e93.a(p4)) break block8;
                                e93 = e92;
                                p4 = p2;
                            }
                            return e93.b(p4);
                        }
                        p3 = p2;
                        bl2 = fU.ar();
                        if (string != null) break block9;
                        if (!bl2) break block10;
                        arrp = arrp2 = cJ.b(t2, i2, n2, p2, e92);
                        if (string != null) break block11;
                        if (arrp.length != 1) break block12;
                        arrp = arrp2;
                        if (string != null) break block11;
                        if (arrp[0] == p2) break block10;
                    }
                    arrp = arrp2;
                }
                return arrp;
            }
            bl2 = fU.O();
        }
        if (bl2 && (p2 = aO.a(n2, p2)) != p3) {
            return e92.b(p2);
        }
        return e92.b(p2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static List<P> a(List<P> var0, t var1_1, i var2_2, n var3_3, aA var4_4, long var5_5, e9 var7_6) {
        block19: {
            block16: {
                block17: {
                    block18: {
                        var8_7 = K.d();
                        if (var4_4 == null) break block16;
                        v0 = var7_6.o();
                        if (var8_7 != null) break block17;
                        if (!v0) break block18;
                        v0 = cB.a(var1_1.d(var3_3.a(var4_4)), var2_2);
                        if (var8_7 == null) {
                            if (v0) {
                                return zzzzd6Customizer.a;
                            } else {
                                ** GOTO lbl11
                            }
                        }
                        break block17;
                    }
                    v1 = var7_6;
                    if (var8_7 != null) break block19;
                    v0 = v1.a(var0);
                }
                if (!v0 && fU.a4()) {
                    var0 = aB.b(var1_1, var2_2, var3_3, var4_4, var0);
                }
            }
            v1 = var7_6;
        }
        var9_8 = v1.a();
        var9_8.clear();
        var10_9 = 0;
        while (var10_9 < var0.size()) {
            block15: {
                block20: {
                    block21: {
                        v2 = var0;
                        if (var8_7 != null) return v2;
                        var11_10 = (P)v2.get(var10_9);
                        var12_11 = zzzzd6Customizer.a(var11_10, var1_1, var2_2, var3_3, var4_4, var5_5, var7_6);
                        v3 = var10_9;
                        if (var8_7 != null) break block20;
                        if (v3 != 0) break block21;
                        v3 = var0.size();
                        if (var8_7 != null) break block20;
                        if (v3 == 1) {
                            v3 = var12_11.length;
                            if (var8_7 == null) {
                                if (v3 == 1 && var12_11[0] == var11_10) {
                                    return var0;
                                } else {
                                    ** GOTO lbl41
                                }
                            } else {
                                ** GOTO lbl40
                            }
                        }
                        break block21;
lbl40:
                        // 2 sources

                        break block20;
                    }
                    v3 = var13_12 = 0;
                }
                while (var13_12 < var12_11.length) {
                    var14_13 = var12_11[var13_12];
                    var9_8.add(var14_13);
                    ++var13_12;
                    if (var8_7 == null) {
                        if (var8_7 == null) continue;
                    }
                    break block15;
                }
                ++var10_9;
            }
            if (var8_7 == null) continue;
        }
        v2 = var9_8;
        return v2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

