/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.aq;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.aq.e;
import net.minecraft.client.a.v;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b {
    private static final /* synthetic */ String a;
    public /* synthetic */ boolean p;
    private static final /* synthetic */ int s;
    private final /* synthetic */ List<String> d;
    private static final /* synthetic */ int r;
    private static final /* synthetic */ int i;
    private static final /* synthetic */ String b;
    private final /* synthetic */ List<Long> c;
    public /* synthetic */ boolean g;
    private /* synthetic */ boolean q;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ Logger o;
    private static /* synthetic */ int e;
    private static final /* synthetic */ String h;
    private final /* synthetic */ Map<String, Long> m;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ int k;
    private static final /* synthetic */ int l;
    private /* synthetic */ String f;

    public void a(Supplier<String> supplier) {
        block3: {
            b b10;
            block4: {
                boolean bl2;
                block2: {
                    int n2 = net.minecraft.aq.b.f();
                    bl2 = this.q;
                    if (n2 == 0) break block2;
                    if (!bl2) break block3;
                    b10 = this;
                    if (n2 == 0) break block4;
                    bl2 = b10.g;
                }
                if (!bl2) break block3;
                b10 = this;
            }
            b10.b(supplier.get());
        }
    }

    public b() {
        this.d = Lists.newArrayList();
        this.c = Lists.newArrayList();
        this.f = "";
        this.m = Maps.newHashMap();
        this.q = this.p = true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int f() {
        int n2 = net.minecraft.aq.b.b();
        if (n2 == 0) {
            return 108;
        }
        return 0;
    }

    public void a(Class<?> class_) {
        block3: {
            b b10;
            block2: {
                int n2 = net.minecraft.aq.b.b();
                b10 = this;
                if (n2 != 0) break block2;
                if (!b10.g) break block3;
                b10 = this;
            }
            b10.b(class_.getSimpleName());
        }
    }

    public static int b() {
        return e;
    }

    public static void b(int n2) {
        e = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String e() {
        int n2 = net.minecraft.aq.b.b();
        Object object = this.d;
        if (n2 == 0) {
            if (object.isEmpty()) {
                return "[UNKNOWN]";
            }
            object = this.d.get(this.d.size() - 1);
        }
        String string = (String)object;
        return string;
    }

    public void a(String string) {
        block3: {
            b b10;
            block2: {
                int n2 = net.minecraft.aq.b.f();
                b10 = this;
                if (n2 == 0) break block2;
                if (!b10.q) break block3;
                this.c();
                b10 = this;
            }
            b10.b(string);
        }
    }

    static {
        a = "scheduledExecutables";
        n = "preRenderErrors";
        b = "render";
        h = "tick";
        j = "display";
        o = LogManager.getLogger();
        i = "scheduledExecutables".hashCode();
        k = "tick".hashCode();
        r = "preRenderErrors".hashCode();
        s = "render".hashCode();
        net.minecraft.aq.b.b(0);
        l = "display".hashCode();
    }

    public void b(String string) {
        block27: {
            int n2;
            int n3;
            block28: {
                block26: {
                    block21: {
                        block22: {
                            int n4;
                            block23: {
                                block25: {
                                    int n5;
                                    block24: {
                                        block13: {
                                            block14: {
                                                int n6;
                                                block18: {
                                                    block20: {
                                                        block19: {
                                                            block15: {
                                                                block17: {
                                                                    block16: {
                                                                        n3 = net.minecraft.aq.b.f();
                                                                        n2 = fi.a();
                                                                        if (n3 == 0) break block13;
                                                                        if (n2 == 0) break block14;
                                                                        int n6 = n5 = string.hashCode();
                                                                        n6 = i;
                                                                        if (n3 == 0) break block15;
                                                                        if (n2 != n6) break block16;
                                                                        n2 = string.equals("scheduledExecutables") ? 1 : 0;
                                                                        if (n3 == 0) break block17;
                                                                        if (n2 == 0) break block16;
                                                                        fi.a.c();
                                                                        if (n3 != 0) break block14;
                                                                    }
                                                                    n2 = n5;
                                                                }
                                                                n6 = k;
                                                            }
                                                            if (n3 == 0) break block18;
                                                            if (n2 != n6) break block19;
                                                            n2 = string.equals("tick") ? 1 : 0;
                                                            if (n3 == 0) break block20;
                                                            if (n2 == 0) break block19;
                                                            n2 = fU.a8() ? 1 : 0;
                                                            if (n3 == 0) break block20;
                                                            if (n2 == 0) break block19;
                                                            fi.a.a();
                                                            fi.m.c();
                                                            if (n3 != 0) break block14;
                                                        }
                                                        n2 = n5;
                                                    }
                                                    if (n3 == 0) break block13;
                                                    n6 = r;
                                                }
                                                if (n2 != n6) break block14;
                                                n2 = string.equals("preRenderErrors") ? 1 : 0;
                                                if (n3 == 0) break block13;
                                                if (n2 != 0) {
                                                    fi.m.a();
                                                }
                                            }
                                            n2 = fU.aw();
                                        }
                                        if (n3 == 0) break block21;
                                        if (n2 == 0) break block22;
                                        int n4 = n5 = string.hashCode();
                                        n4 = s;
                                        if (n3 == 0) break block23;
                                        if (n2 != n4) break block24;
                                        n2 = string.equals("render") ? 1 : 0;
                                        if (n3 == 0) break block25;
                                        if (n2 == 0) break block24;
                                        v.h = false;
                                        if (n3 != 0) break block22;
                                    }
                                    n2 = n5;
                                }
                                if (n3 == 0) break block21;
                                n4 = l;
                            }
                            if (n2 != n4) break block22;
                            n2 = string.equals("display") ? 1 : 0;
                            if (n3 == 0) break block21;
                            if (n2 != 0) {
                                v.h = true;
                            }
                        }
                        n2 = this.q;
                    }
                    if (n3 == 0) break block26;
                    if (n2 == 0) break block27;
                    n2 = this.g ? 1 : 0;
                }
                if (n3 == 0) break block28;
                if (n2 == 0) break block27;
                n2 = this.f.isEmpty() ? 1 : 0;
            }
            if (n3 != 0) {
                if (n2 == 0) {
                    this.f = this.f + ".";
                }
                this.f = this.f + string;
                this.d.add(this.f);
                n2 = this.c.add(System.nanoTime()) ? 1 : 0;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public List<e> c(String var1_1) {
        block31: {
            block30: {
                block29: {
                    block25: {
                        block24: {
                            block23: {
                                var2_2 = net.minecraft.aq.b.b();
                                v0 = this.g;
                                if (var2_2 != 0) break block23;
                                if (!v0) {
                                    return Collections.emptyList();
                                }
                                v1 = this.m;
                                v2 = "root";
                                if (var2_2 != 0) ** GOTO lbl14
                                v0 = v1.containsKey(v2);
                            }
                            if (v0) {
                                v1 = this.m;
                                v2 = "root";
lbl14:
                                // 2 sources

                                v3 = v1.get(v2);
                            } else {
                                v3 = 0L;
                            }
                            var3_3 = v3;
                            v4 = this.m;
                            v5 = var1_1;
                            if (var2_2 != 0) ** GOTO lbl24
                            if (v4.containsKey(v5)) {
                                v4 = this.m;
                                v5 = var1_1;
lbl24:
                                // 2 sources

                                v6 = v4.get(v5);
                            } else {
                                v6 = -1L;
                            }
                            var5_4 = v6;
                            var7_5 = Lists.newArrayList();
                            v7 = var1_1;
                            if (var2_2 != 0) break block24;
                            if (v7.isEmpty()) break block25;
                            v7 = var1_1 + ".";
                        }
                        var1_1 = v7;
                    }
                    var8_6 = 0L;
                    for (String var11_9 : this.m.keySet()) {
                        block27: {
                            block28: {
                                block26: {
                                    v8 = var11_9.length();
                                    if (var2_2 != 0) break block26;
                                    if (v8 <= var1_1.length()) break block27;
                                    v8 = var11_9.startsWith(var1_1) ? 1 : 0;
                                }
                                if (var2_2 != 0) break block28;
                                if (v8 == 0) break block27;
                                v8 = var11_9.indexOf(".", var1_1.length() + 1);
                            }
                            if (v8 < 0) {
                                var8_6 += this.m.get(var11_9).longValue();
                            }
                        }
                        if (var2_2 == 0) continue;
                    }
                    var10_8 = var8_6;
                    v9 = var8_6 == var5_4 ? 0 : (var8_6 < var5_4 ? -1 : 1);
                    if (var2_2 != 0) break block29;
                    if (v9 < 0) {
                        var8_6 = var5_4;
                    }
                    v10 = var3_3;
                    if (var2_2 != 0) break block30;
                    cfr_temp_0 = v10 - var8_6;
                    v9 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                }
                if (v9 >= 0) break block31;
                v10 = var8_6;
            }
            var3_3 = v10;
        }
        for (String var12_13 : this.m.keySet()) {
            block33: {
                block35: {
                    block34: {
                        block32: {
                            v11 = var12_13.length();
                            if (var2_2 != 0) ** GOTO lbl93
                            if (var2_2 != 0) break block32;
                            if (v11 <= var1_1.length()) break block33;
                            v12 = var12_13.startsWith(var1_1);
                        }
                        if (var2_2 != 0) break block34;
                        if (v12 == false) break block33;
                        v13 = var12_13;
                        if (var2_2 != 0) break block35;
                        v12 = v13.indexOf(".", var1_1.length() + 1);
                    }
                    if (v12 >= 0) break block33;
                    v13 = this.m.get(var12_13);
                }
                var13_14 = (Long)v13;
                var15_15 = (double)var13_14 * 100.0 / (double)var8_6;
                var17_16 = (double)var13_14 * 100.0 / (double)var3_3;
                var19_17 = var12_13.substring(var1_1.length());
                var7_5.add(new e(var19_17, var15_15, var17_16));
            }
            if (var2_2 == 0) continue;
        }
        var11_11 = this.m.keySet().iterator();
        do {
            v11 = var11_12.hasNext() ? 1 : 0;
lbl93:
            // 2 sources

            if (v11 == 0) break;
            var12_13 = (String)var11_12.next();
            this.m.put(var12_13, this.m.get(var12_13) * 950L / 1000L);
            if (var2_2 != 0) return var7_5;
        } while (var2_2 == 0);
        v14 = (cfr_temp_1 = (float)var8_6 - var10_8) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
        if (var2_2 == 0 && v14 > 0) {
            v14 = (float)var7_5.add(new e("unspecified", (double)((float)var8_6 - var10_8) * 100.0 / (double)var8_6, (double)((float)var8_6 - var10_8) * 100.0 / (double)var3_3));
        }
        Collections.sort(var7_5);
        var7_5.add(0, new e(var1_1, 100.0, (double)var8_6 * 100.0 / (double)var3_3));
        return var7_5;
    }

    public void d() {
        this.m.clear();
        this.f = "";
        this.d.clear();
        this.q = this.p;
    }

    public void b(Supplier<String> supplier) {
        block3: {
            b b10;
            block2: {
                int n2 = net.minecraft.aq.b.f();
                b10 = this;
                if (n2 == 0) break block2;
                if (!b10.q) break block3;
                this.c();
                b10 = this;
            }
            b10.a(supplier);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void c() {
        block9: {
            block7: {
                block8: {
                    var1_1 = net.minecraft.aq.b.f();
                    v0 = this.q;
                    if (var1_1 != 0) {
                        if (v0 == false) return;
                        v0 = this.g;
                    }
                    if (v0 == false) return;
                    var2_2 = System.nanoTime();
                    var4_3 = this.c.remove(this.c.size() - 1);
                    this.d.remove(this.d.size() - 1);
                    var6_4 = var2_2 - var4_3;
                    v1 = this.m;
                    v2 = this.f;
                    if (var1_1 == 0) break block7;
                    if (!v1.containsKey(v2)) break block8;
                    this.m.put(this.f, this.m.get(this.f) + var6_4);
                    if (var1_1 != 0) break block9;
                }
                v1 = this.m;
                v2 = this.f;
            }
            v1.put(v2, var6_4);
        }
        if (var6_4 > 100000000L) {
            net.minecraft.aq.b.o.warn("Something's taking too long! '{}' took aprox {} ms", (Object)this.f, (Object)((double)var6_4 / 1000000.0));
        }
        v3 = this.d;
        if (var1_1 == 0) ** GOTO lbl34
        if (v3.isEmpty()) {
            v4 = "";
        } else {
            v3 = this.d.get(this.d.size() - 1);
lbl34:
            // 2 sources

            v4 = (String)v3;
        }
        this.f = v4;
    }
}

