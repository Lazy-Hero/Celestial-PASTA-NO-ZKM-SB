/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.E.A;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.a0;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.u;
import net.minecraft.E.x;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aX
extends K {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        block3: {
            String[] arrstring2;
            block4: {
                int n3;
                int n4;
                block2: {
                    m[] arrm = s.b();
                    n4 = arrstring.length;
                    n3 = 1;
                    if (arrm == null) break block2;
                    if (n4 < n3) break block3;
                    arrstring2 = arrstring;
                    if (arrm == null) break block4;
                    n4 = arrstring2.length;
                    n3 = 2;
                }
                if (n4 > n3) break block3;
                arrstring2 = arrstring;
            }
            list = aX.b(arrstring2, 0, n2);
            return list;
        }
        list = Collections.emptyList();
        return list;
    }

    private int a(A a10, double d10, net.minecraft.ah.z z2, Random random, double d11, double d12, double d13, double d14, A[] arra, boolean bl2) throws s {
        int n2;
        m[] arrm;
        int n3;
        double d15;
        block21: {
            int n4 = 1;
            d15 = 3.4028234663852886E38;
            n3 = 0;
            arrm = s.b();
            block0: while (true) {
                int n5 = n3;
                block1: while (n5 < 10000) {
                    int n6;
                    A a11;
                    int n7;
                    block22: {
                        n2 = n4;
                        if (arrm == null || arrm == null) break block21;
                        if (n2 == 0) break block0;
                        n4 = 0;
                        d15 = 3.4028234663852886E38;
                        int n8 = 0;
                        block2: while (true) {
                            int n9 = n8;
                            int n10 = arra.length;
                            block3: while (n9 < n10) {
                                block31: {
                                    int n11;
                                    block30: {
                                        block25: {
                                            A a12;
                                            block26: {
                                                block29: {
                                                    block28: {
                                                        block27: {
                                                            a12 = arra[n8];
                                                            n7 = 0;
                                                            a11 = new A();
                                                            n6 = 0;
                                                            if (arrm == null) break block22;
                                                            int n12 = n6;
                                                            while (n12 < arra.length) {
                                                                block24: {
                                                                    block23: {
                                                                        n9 = n8;
                                                                        n10 = n12;
                                                                        if (arrm == null) continue block3;
                                                                        if (n9 == n10) break block23;
                                                                        A a13 = arra[n12];
                                                                        double d16 = a12.a(a13);
                                                                        d15 = Math.min(d16, d15);
                                                                        if (arrm == null) break block24;
                                                                        if (d16 < d10) {
                                                                            ++n7;
                                                                            a11.b += a13.b - a12.b;
                                                                            a11.a += a13.a - a12.a;
                                                                        }
                                                                    }
                                                                    ++n12;
                                                                }
                                                                if (arrm != null) continue;
                                                            }
                                                            n11 = n7;
                                                            if (arrm == null) break block25;
                                                            if (n11 <= 0) break block26;
                                                            a11.b /= (double)n7;
                                                            a11.a /= (double)n7;
                                                            double d17 = a11.b();
                                                            if (arrm == null) break block27;
                                                            if (!(d17 > 0.0)) break block28;
                                                            a11.a();
                                                            a12.b(a11);
                                                        }
                                                        if (arrm != null) break block29;
                                                    }
                                                    a12.a(random, d11, d12, d13, d14);
                                                }
                                                n4 = 1;
                                            }
                                            n11 = a12.a(d11, d12, d13, d14) ? 1 : 0;
                                        }
                                        if (arrm == null) break block30;
                                        if (n11 == 0) break block31;
                                        n11 = 1;
                                    }
                                    n4 = n11;
                                }
                                ++n8;
                                if (arrm != null) continue block2;
                            }
                            break;
                        }
                        n6 = n4;
                    }
                    if (n6 == 0) {
                        A[] arra2 = arra;
                        int n13 = arra2.length;
                        n7 = 0;
                        while (n7 < n13) {
                            a11 = arra2[n7];
                            if (arrm != null) {
                                n5 = a11.b(z2) ? 1 : 0;
                                if (arrm == null) continue block1;
                                if (n5 == 0) {
                                    a11.a(random, d11, d12, d13, d14);
                                    n4 = 1;
                                }
                                ++n7;
                            }
                            if (arrm != null) continue;
                        }
                    }
                    ++n3;
                    if (arrm != null) continue block0;
                }
                break;
            }
            n2 = n3;
        }
        if (arrm != null) {
            if (n2 >= 10000) {
                throw new s("commands.spreadplayers.failure." + (bl2 ? "teams" : "players"), arra.length, a10.b, a10.a, String.format("%.2f", d15));
            }
            n2 = n3;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private double a(List<net.minecraft.U.x> var1_1, net.minecraft.ah.z var2_2, A[] var3_3, boolean var4_4) {
        var6_5 = 0.0;
        var5_6 = s.b();
        var8_7 = 0;
        var9_8 = Maps.newHashMap();
        for (var10_9 = 0; var10_9 < var1_1.size(); var6_5 += var13_12, ++var10_9) {
            v0 = var1_1.get(var10_9);
            block1: while (true) {
                block14: {
                    block13: {
                        block12: {
                            var11_10 = v0;
                            if (var5_6 == null) return var6_5;
                            v1 = var4_4;
                            if (var5_6 == null) break block12;
                            if (!v1) break block13;
                            v2 = var11_10;
                            if (var5_6 == null) ** GOTO lbl19
                            v1 = v2 instanceof j;
                        }
                        if (v1) {
                            v2 = var11_10;
lbl19:
                            // 2 sources

                            v3 = v2.aM();
                        } else {
                            v3 = null;
                        }
                        var13_13 = v3;
                        v4 = var9_8;
                        v5 = var13_13;
                        if (var5_6 != null) {
                            if (!v4.containsKey(v5)) {
                                var9_8.put(var13_13, var3_3[var8_7++]);
                            }
                            v4 = var9_8;
                            v5 = var13_13;
                        }
                        var12_11 = (A)v4.get(v5);
                        if (var5_6 != null) break block14;
                    }
                    var12_11 = var3_3[var8_7++];
                }
                var11_10.c((float)h.f(var12_11.b) + 0.5f, var12_11.a(var2_2), (double)h.f(var12_11.a) + 0.5);
                var13_12 = 1.7976931348623157E308;
                var15_14 = var3_3;
                var16_15 = var15_14.length;
                var17_16 = 0;
                while (var17_16 < var16_15) {
                    var18_17 = var15_14[var17_16];
                    if (var5_6 != null) {
                        v0 = var12_11;
                        if (var5_6 == null) continue block1;
                        if (v0 != var18_17) {
                            var19_18 = var12_11.a(var18_17);
                            var13_12 = Math.min(var19_18, var13_12);
                        }
                        ++var17_16;
                    }
                    if (var5_6 != null) continue;
                }
                break;
            }
            if (var5_6 != null) continue;
        }
        var6_5 /= (double)var1_1.size();
        return var6_5;
    }

    private void a(J j2, List<net.minecraft.U.x> list, A a10, double d10, double d11, net.minecraft.ah.z z2, boolean n2) throws s {
        Random random = new Random();
        double d12 = a10.b - d11;
        double d13 = a10.a - d11;
        m[] arrm = s.b();
        double d14 = a10.b + d11;
        double d15 = a10.a + d11;
        int n3 = n2;
        if (arrm != null) {
            n3 = n3 != 0 ? this.a(list) : list.size();
        }
        A[] arra = this.a(random, n3, d12, d13, d14, d15);
        int n4 = this.a(a10, d10, z2, random, d12, d13, d14, d15, arra, n2 != 0);
        double d16 = this.a(list, z2, arra, n2 != 0);
        StringBuilder stringBuilder = new StringBuilder();
        String string = "commands.spreadplayers.success.";
        if (arrm != null) {
            stringBuilder = stringBuilder.append(string);
            string = n2 != 0 ? "teams" : "players";
        }
        aX.a(j2, (F)this, stringBuilder.append(string).toString(), arra.length, a10.b, a10.a);
        if (arra.length > 1) {
            j2.a(new net.minecraft.at.h("commands.spreadplayers.info." + (n2 != 0 ? "teams" : "players"), String.format("%.2f", d16), n4));
        }
    }

    private A[] a(Random random, int n2, double d10, double d11, double d12, double d13) {
        A[] arra;
        block2: {
            A[] arra2 = new A[n2];
            m[] arrm = s.b();
            for (int i2 = 0; i2 < arra2.length; ++i2) {
                A a10 = new A();
                a10.a(random, d10, d11, d12, d13);
                arra = arra2;
                if (arrm != null) {
                    arra[i2] = a10;
                    if (arrm != null) continue;
                }
                break block2;
            }
            arra = arra2;
        }
        return arra;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a() {
        return "spreadplayers";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        J j3;
        ArrayList arrayList;
        boolean bl2;
        double d10;
        double d11;
        double d12;
        double d13;
        block16: {
            boolean bl3;
            block13: {
                m[] arrm = s.b();
                int n2 = arrstring.length;
                if (arrm != null) {
                    if (n2 < 6) {
                        throw new z("commands.spreadplayers.usage", new Object[0]);
                    }
                    n2 = 0;
                }
                int n3 = n2;
                n n4 = j2.f();
                d13 = aX.a(n4.e(), arrstring[n3++], true);
                d12 = aX.a(n4.a(), arrstring[n3++], true);
                d11 = aX.a(arrstring[n3++], 0.0);
                d10 = aX.a(arrstring[n3++], d11 + 1.0);
                bl2 = aX.c(arrstring[n3++]);
                arrayList = Lists.newArrayList();
                while (n3 < arrstring.length) {
                    block15: {
                        Object object;
                        String string;
                        block14: {
                            string = arrstring[n3++];
                            bl3 = a0.a(string);
                            if (arrm == null) break block13;
                            if (!bl3) break block14;
                            object = a0.a(j2, string, net.minecraft.U.x.class);
                            boolean bl4 = object.isEmpty();
                            if (arrm != null) {
                                if (bl4) {
                                    throw new u("commands.generic.selector.notFound", string);
                                }
                                bl4 = arrayList.addAll(object);
                            }
                            if (arrm != null) break block15;
                        }
                        if ((object = b10.O().a(string)) == null) {
                            throw new x("commands.generic.player.notFound", string);
                        }
                        arrayList.add(object);
                    }
                    if (arrm != null) continue;
                }
                j3 = j2;
                if (arrm == null) break block16;
                j3.a(d.AFFECTED_ENTITIES, arrayList.size());
                bl3 = arrayList.isEmpty();
            }
            if (bl3) {
                throw new u("commands.spreadplayers.noop");
            }
            j3 = j2;
        }
        j3.a(new net.minecraft.at.h("commands.spreadplayers.spreading." + (bl2 ? "teams" : "players"), arrayList.size(), d10, d13, d12, d11));
        this.a(j2, arrayList, new A(d13, d12), d11, d10, ((net.minecraft.U.x)arrayList.get((int)0)).aG, bl2);
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a(J j2) {
        return "commands.spreadplayers.usage";
    }

    private int a(List<net.minecraft.U.x> list) {
        int n2;
        block3: {
            HashSet hashSet = Sets.newHashSet();
            Iterator<net.minecraft.U.x> iterator = list.iterator();
            m[] arrm = s.b();
            while (iterator.hasNext()) {
                block4: {
                    block5: {
                        net.minecraft.U.x x2 = iterator.next();
                        n2 = x2 instanceof j;
                        if (arrm == null) break block3;
                        if (arrm == null) break block4;
                        if (n2 == 0) break block5;
                        hashSet.add(x2.aM());
                        if (arrm != null) break block4;
                    }
                    hashSet.add(null);
                }
                if (arrm != null) continue;
            }
            n2 = hashSet.size();
        }
        return n2;
    }
}

