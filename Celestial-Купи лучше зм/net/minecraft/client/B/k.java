/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.Arrays
 *  it.unimi.dsi.fastutil.Swapper
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntComparator
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.B;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.lang.invoke.LambdaMetafactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import net.minecraft.client.B.d;
import net.minecraft.client.B.g;
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class k<T> {
    private /* synthetic */ int a;
    private static final /* synthetic */ Logger b;
    private /* synthetic */ IntList h;
    protected final /* synthetic */ List<T> i;
    private static final /* synthetic */ boolean f;
    private final /* synthetic */ IntList e;
    private /* synthetic */ IntList d;
    private static final /* synthetic */ boolean c;
    private final /* synthetic */ IntList g;

    private int a(String string, int n2) {
        int n3;
        block7: {
            int n4 = this.e.getInt(this.d.getInt(n2));
            int n5 = net.minecraft.client.B.d.c();
            int n6 = this.h.getInt(n2);
            for (int i2 = 0; i2 < string.length(); ++i2) {
                char c10;
                block9: {
                    char c11;
                    block8: {
                        char c12;
                        int n7;
                        n3 = n7 = this.g.getInt(n4 + n6 + i2);
                        if (n5 != 0) break block7;
                        if (n5 == 0) {
                            if (n3 == -1) {
                                return 1;
                            }
                            c12 = string.charAt(i2);
                        }
                        void var8_8 = c12;
                        char c13 = (char)n7;
                        c10 = var8_8;
                        c11 = c13;
                        if (n5 != 0) break block8;
                        if (c10 < c11) {
                            return -1;
                        }
                        c10 = var8_8;
                        if (n5 != 0) break block9;
                        c11 = c13;
                    }
                    if (c10 <= c11) continue;
                    c10 = '\u0001';
                }
                return c10;
            }
            n3 = 0;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b() {
        block11: {
            var2_1 = this.g.size();
            var3_2 = new int[var2_1];
            var4_3 = new int[var2_1];
            var5_4 = new int[var2_1];
            var6_5 = new int[var2_1];
            var7_6 = new g(this, var4_3, var5_4);
            var8_7 = (Swapper)LambdaMetafactory.metafactory(null, null, null, (II)V, lambda$func_194058_a$0(int[] int[] int[] int int ), (II)V)((int[])var4_3, (int[])var5_4, (int[])var6_5);
            var1_8 = net.minecraft.client.B.d.c();
            for (var9_9 = 0; var9_9 < var2_1; ++var9_9) {
                var3_2[var9_9] = this.g.getInt(var9_9);
                if (var1_8 == 0) {
                    if (var1_8 == 0) continue;
                    m.b(m.d() == false);
                    break;
                }
                break block11;
            }
            var9_9 = 1;
        }
        var10_10 = Math.min(var2_1, this.a);
        while (var9_9 * 2 < var10_10) {
            block12: {
                var11_12 = 0;
                while (var11_12 < var2_1) {
                    var4_3[var11_12] = var3_2[var11_12];
                    v0 = var5_4;
                    v1 = var11_12;
                    v2 = var11_12 + var9_9;
                    if (var1_8 == 0) {
                        if (var1_8 == 0) {
                            v3 = v2 < var2_1 ? var3_2[var11_12 + var9_9] : -2;
                        }
                        v0[v1] = v3;
                        var6_5[var11_12] = var11_12++;
                        if (var1_8 == 0) continue;
                    }
                    ** GOTO lbl58
                }
                it.unimi.dsi.fastutil.Arrays.quickSort((int)0, (int)var2_1, (IntComparator)var7_6, (Swapper)var8_7);
                for (var11_12 = 0; var11_12 < var2_1; ++var11_12) {
                    block15: {
                        block14: {
                            block13: {
                                v4 = var11_12;
                                if (var1_8 != 0) break block12;
                                if (var1_8 != 0) break block13;
                                if (v4 <= 0) break block14;
                                v0 = var4_3;
                                v1 = var11_12;
                                if (var1_8 != 0) break block15;
                                v5 = v0[v1];
                            }
                            if (v5 == var4_3[var11_12 - 1]) {
                                v0 = var5_4;
                                v1 = var11_12;
                                if (var1_8 == 0) {
                                    if (v0[v1] == var5_4[var11_12 - 1]) {
                                        var3_2[var6_5[var11_12]] = var3_2[var6_5[var11_12 - 1]];
                                        if (var1_8 == 0) continue;
                                    } else {
                                        ** GOTO lbl53
                                    }
                                } else {
                                    ** GOTO lbl52
                                }
                            }
                            break block14;
lbl52:
                            // 2 sources

                            break block15;
                        }
                        v0 = var3_2;
                        v1 = var6_5[var11_12];
                    }
                    v2 = var11_12;
lbl58:
                    // 2 sources

                    v0[v1] = v2;
                    if (var1_8 == 0) continue;
                }
                v4 = var9_9 = var9_9 * 2;
            }
            if (var1_8 == 0) continue;
        }
        var10_11 = this.d;
        var11_13 = this.h;
        this.d = new IntArrayList(var10_11.size());
        this.h = new IntArrayList(var11_13.size());
        for (var12_14 = 0; var12_14 < var2_1; ++var12_14) {
            var13_15 = var6_5[var12_14];
            this.d.add(var10_11.getInt(var13_15));
            this.h.add(var11_13.getInt(var13_15));
            if (var1_8 != 0) return;
            if (var1_8 == 0) continue;
        }
        if (k.c == false) return;
        this.a();
    }

    public void a(T t2, String string) {
        block2: {
            this.a = Math.max(this.a, string.length());
            int n2 = this.i.size();
            int n3 = net.minecraft.client.B.d.b();
            this.i.add(t2);
            int n4 = n3;
            this.e.add(this.g.size());
            for (int i2 = 0; i2 < string.length(); ++i2) {
                this.d.add(n2);
                this.h.add(i2);
                this.g.add((int)string.charAt(i2));
                if (n4 != 0) {
                    if (n4 != 0) continue;
                }
                break block2;
            }
            this.d.add(n2);
            this.h.add(string.length());
            this.g.add(-1);
        }
    }

    static {
        f = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
        c = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
        b = LogManager.getLogger();
    }

    private static void lambda$func_194058_a$0(int[] arrn, int[] arrn2, int[] arrn3, int n2, int n3) {
        block3: {
            int n4;
            block2: {
                int n5 = net.minecraft.client.B.d.c();
                n4 = n2;
                if (n5 != 0) break block2;
                if (n4 == n3) break block3;
                n4 = arrn[n2];
            }
            int n6 = n4;
            arrn[n2] = arrn[n3];
            arrn[n3] = n6;
            n6 = arrn2[n2];
            arrn2[n2] = arrn2[n3];
            arrn2[n3] = n6;
            n6 = arrn3[n2];
            arrn3[n2] = arrn3[n3];
            arrn3[n3] = n6;
        }
    }

    public List<T> a(String string) {
        block25: {
            LinkedHashSet linkedHashSet;
            block21: {
                IntOpenHashSet intOpenHashSet;
                int n2;
                block20: {
                    int n3;
                    int n4;
                    block19: {
                        int n5;
                        int n6;
                        int n7;
                        int n8;
                        int n9;
                        block26: {
                            block24: {
                                block18: {
                                    n9 = this.d.size();
                                    n8 = 0;
                                    n7 = n9;
                                    n2 = net.minecraft.client.B.d.c();
                                    while (n8 < n7) {
                                        block22: {
                                            int n10;
                                            block23: {
                                                n6 = n8 + (n7 - n8) / 2;
                                                n4 = this.a(string, n6);
                                                n5 = f ? 1 : 0;
                                                if (n2 != 0) break block18;
                                                if (n2 == 0) {
                                                    if (n5 != 0) {
                                                        b.debug("comparing lower \"{}\" with {} \"{}\": {}", (Object)string, (Object)n6, (Object)this.a(n6), (Object)n4);
                                                    }
                                                    n10 = n4;
                                                }
                                                if (n2 != 0) break block22;
                                                if (n10 <= 0) break block23;
                                                n8 = n6 + 1;
                                                if (n2 == 0) break block22;
                                            }
                                            n10 = n7 = n6;
                                        }
                                        if (n2 == 0) continue;
                                    }
                                    n5 = n8;
                                }
                                if (n2 != 0) break block24;
                                if (n5 < 0) break block25;
                                n5 = n8;
                            }
                            if (n2 != 0) break block26;
                            if (n5 >= n9) break block25;
                            n5 = n8;
                        }
                        n6 = n5;
                        n7 = n9;
                        while (n8 < n7) {
                            block27: {
                                int n11;
                                block28: {
                                    n4 = n8 + (n7 - n8) / 2;
                                    int n12 = this.a(string, n4);
                                    n3 = f ? 1 : 0;
                                    if (n2 != 0) break block19;
                                    if (n2 == 0) {
                                        if (n3 != 0) {
                                            b.debug("comparing upper \"{}\" with {} \"{}\": {}", (Object)string, (Object)n4, (Object)this.a(n4), (Object)n12);
                                        }
                                        n11 = n12;
                                    }
                                    if (n2 != 0) break block27;
                                    if (n11 < 0) break block28;
                                    n8 = n4 + 1;
                                    if (n2 == 0) break block27;
                                }
                                n11 = n7 = n4;
                            }
                            if (n2 == 0) continue;
                        }
                        n3 = n8;
                    }
                    n4 = n3;
                    IntOpenHashSet intOpenHashSet2 = new IntOpenHashSet();
                    for (int i2 = n6; i2 < n4; ++i2) {
                        intOpenHashSet = intOpenHashSet2;
                        if (n2 == 0) {
                            intOpenHashSet.add(this.d.getInt(i2));
                            if (n2 == 0) continue;
                        }
                        break block20;
                    }
                    intOpenHashSet = intOpenHashSet2;
                }
                int[] arrn = intOpenHashSet.toIntArray();
                Arrays.sort(arrn);
                LinkedHashSet linkedHashSet2 = Sets.newLinkedHashSet();
                for (int n13 : arrn) {
                    linkedHashSet = linkedHashSet2;
                    if (n2 == 0) {
                        linkedHashSet.add(this.i.get(n13));
                        if (n2 == 0) continue;
                    }
                    break block21;
                }
                linkedHashSet = linkedHashSet2;
            }
            return Lists.newArrayList((Iterable)linkedHashSet);
        }
        return Collections.emptyList();
    }

    private String a(int n2) {
        int n3 = this.h.getInt(n2);
        int n4 = this.e.getInt(this.d.getInt(n2));
        StringBuilder stringBuilder = new StringBuilder();
        int n5 = net.minecraft.client.B.d.c();
        int n6 = 0;
        while (n4 + n6 < this.g.size()) {
            int n7;
            int n8 = n6;
            if (n5 == 0) {
                if (n8 == n3) {
                    stringBuilder.append('^');
                }
                n8 = n7 = ((Integer)this.g.get(n4 + n6)).intValue();
            }
            if (n5 == 0) {
                if (n7 == -1 && n5 == 0) break;
                stringBuilder.append((char)n7);
                ++n6;
            }
            if (n5 == 0) continue;
        }
        return stringBuilder.toString();
    }

    private void a() {
        block2: {
            int n2 = net.minecraft.client.B.d.b();
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                b.debug("{} {}", (Object)i2, (Object)this.a(i2));
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block2;
            }
            b.debug("");
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public k() {
        this.i = Lists.newArrayList();
        this.g = new IntArrayList();
        this.e = new IntArrayList();
        this.d = new IntArrayList();
        this.h = new IntArrayList();
    }
}

