/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.M;
import net.minecraft.client.b.aO;
import net.minecraft.client.b.c;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.i.b;
import net.minecraft.k.h;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class I
extends q {
    private final /* synthetic */ Q k;
    private static final /* synthetic */ Logger l;
    private final /* synthetic */ List<aO> h;
    private /* synthetic */ int i;
    private /* synthetic */ boolean g;
    private final /* synthetic */ List<String> a;
    private final /* synthetic */ List<aO> j;

    public void a(k k2, int n2) {
        this.a(k2, n2, this.k.n.b(), false);
        l.info("[CHAT] {}", (Object)k2.f().replaceAll("\r", "\\\\r").replaceAll("\n", "\\\\n"));
    }

    public int a() {
        return this.d() / 9;
    }

    public boolean e() {
        return this.k.aO instanceof M;
    }

    public float b() {
        return this.k.ac.ah;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    public k a(int n2, int n3) {
        block6: {
            int n4;
            int n5;
            int n6;
            String[] arrstring;
            block11: {
                int n7;
                int n8;
                block10: {
                    int n9;
                    block9: {
                        int n10;
                        block8: {
                            block7: {
                                int n11;
                                block5: {
                                    arrstring = q.b();
                                    n11 = this.e();
                                    if (arrstring == null) break block5;
                                    if (n11 == 0) break block6;
                                    n11 = net.minecraft.client.b.l.c();
                                }
                                int n12 = n11;
                                float f10 = this.b();
                                n6 = n2 / n12 - 2;
                                n9 = n3 / n12 - 40;
                                n6 = net.minecraft.k.h.d((float)n6 / f10);
                                n9 = net.minecraft.k.h.d((float)n9 / f10);
                                n10 = n6;
                                if (arrstring == null) break block7;
                                if (n10 < 0) break block6;
                                n10 = n9;
                            }
                            if (arrstring == null) break block8;
                            if (n10 < 0) break block6;
                            n10 = Math.min(this.a(), this.j.size());
                        }
                        int n13 = n10;
                        n8 = n6;
                        n7 = net.minecraft.k.h.d((float)this.h() / this.b());
                        if (arrstring == null) break block9;
                        if (n8 > n7) break block6;
                        n8 = n9;
                        n7 = this.k.a6.p * n13 + n13;
                    }
                    if (arrstring == null) break block10;
                    if (n8 >= n7) break block6;
                    n8 = n9 / this.k.a6.p;
                    n7 = this.i;
                }
                n4 = n5 = n8 + n7;
                if (arrstring == null) break block11;
                if (n4 < 0) break block6;
                n4 = n5;
            }
            if (n4 >= this.j.size()) break block6;
            aO aO2 = this.j.get(n5);
            int n14 = 0;
            for (k k2 : aO2.a()) {
                block13: {
                    int n15;
                    block12: {
                        n15 = k2 instanceof g;
                        if (arrstring == null) break block12;
                        if (n15 == 0) break block13;
                        n15 = n14 += this.k.a6.e(net.minecraft.client.b.c.a(((g)k2).c(), false));
                    }
                    if (n15 > n6) {
                        return k2;
                    }
                }
                if (arrstring != null) continue;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a(k var1_1, int var2_2, int var3_3, boolean var4_4) {
        var5_5 = q.b();
        v0 = var2_2;
        if (var5_5 != null) {
            if (v0 != 0) {
                this.c(var2_2);
            }
            v0 = net.minecraft.k.h.d((float)this.h() / this.b());
        }
        var6_6 = v0;
        var7_7 = net.minecraft.client.b.c.a(var1_1, var6_6, this.k.a6, false, false);
        var8_8 = this.e();
        for (k var10_10 : var7_7) {
            block9: {
                block11: {
                    block10: {
                        if (var5_5 == null) break block9;
                        v1 = var8_8 ? 1 : 0;
                        if (var5_5 == null) ** GOTO lbl28
                        if (v1 == 0) break block10;
                        v2 = this;
                        if (var5_5 == null) break block11;
                        if (v2.i > 0) {
                            this.g = true;
                            this.b(1);
                        }
                    }
                    v2 = this;
                }
                v2.j.add(0, new aO(var3_3, var10_10, var2_2));
            }
            if (var5_5 != null) continue;
        }
        do {
            v1 = this.j.size();
lbl28:
            // 2 sources

            if (v1 <= 100) break;
            this.j.remove(this.j.size() - 1);
            if (var5_5 == null) return;
        } while (var5_5 != null);
        if (var4_4 != false) return;
        this.h.add(0, new aO(var3_3, var1_1, var2_2));
        do {
            if (this.h.size() <= 100) return;
            this.h.remove(this.h.size() - 1);
        } while (var5_5 != null);
    }

    public static int a(float f10) {
        return net.minecraft.k.h.d(f10 * 160.0f + 20.0f);
    }

    static {
        l = LogManager.getLogger();
    }

    public static int b(float f10) {
        return net.minecraft.k.h.d(f10 * 280.0f + 40.0f);
    }

    public List<String> f() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void c(int var1_1) {
        var3_2 = this.j.iterator();
        var2_3 = q.b();
        while (var3_2.hasNext()) {
            var4_4 = var3_2.next();
            v0 = var4_4.b();
            v1 = var1_1;
            if (var2_3 != null) {
                if (v0 == v1) {
                    var3_2.remove();
                }
                if (var2_3 != null) continue;
            }
            ** GOTO lbl19
        }
        var3_2 = this.h.iterator();
        do {
            block8: {
                if (var3_2.hasNext() == false) return;
                var4_4 = var3_2.next();
                if (var2_3 == null) break block8;
                v0 = var4_4.b();
                v1 = var1_1;
lbl19:
                // 2 sources

                if (v0 != v1) continue;
                var3_2.remove();
            }
            if (var2_3 != null) return;
        } while (var2_3 != null);
    }

    public void g() {
        this.i = 0;
        this.g = false;
    }

    public void a(k k2) {
        this.a(k2, 0);
        fo fo2 = new fo(k2.f());
        af.a(fo2);
    }

    public I(Q q2) {
        this.a = Lists.newArrayList();
        this.h = Lists.newArrayList();
        this.j = Lists.newArrayList();
        this.k = q2;
    }

    public void a(boolean bl2) {
        block3: {
            List<Object> list;
            block2: {
                String[] arrstring = q.b();
                this.j.clear();
                String[] arrstring2 = arrstring;
                list = this.h;
                if (arrstring2 == null) break block2;
                list.clear();
                if (!bl2) break block3;
                list = this.a;
            }
            list.clear();
        }
    }

    public int h() {
        return I.b(this.k.ac.m);
    }

    public void a(String string) {
        block2: {
            boolean bl2;
            block3: {
                String[] arrstring = q.b();
                bl2 = this.a.isEmpty();
                if (arrstring == null) break block2;
                if (bl2) break block3;
                bl2 = this.a.get(this.a.size() - 1).equals(string);
                if (arrstring == null || bl2) break block2;
            }
            bl2 = this.a.add(string);
        }
    }

    public void b(int n2) {
        block6: {
            block5: {
                I i2;
                int n3;
                block4: {
                    this.i += n2;
                    int n4 = this.j.size();
                    String[] arrstring = q.b();
                    n3 = this.i;
                    if (arrstring == null) break block4;
                    if (n3 > n4 - this.a()) {
                        this.i = n4 - this.a();
                    }
                    i2 = this;
                    if (arrstring == null) break block5;
                    n3 = i2.i;
                }
                if (n3 > 0) break block6;
                this.i = 0;
                i2 = this;
            }
            i2.g = false;
        }
    }

    public void c() {
        String[] arrstring = q.b();
        this.j.clear();
        this.g();
        String[] arrstring2 = arrstring;
        for (int i2 = this.h.size() - 1; i2 >= 0; --i2) {
            aO aO2 = this.h.get(i2);
            this.a(aO2.a(), aO2.b(), aO2.c(), true);
            if (arrstring2 != null) continue;
        }
    }

    public void a(int n2) {
        block13: {
            block25: {
                int n3;
                int n4;
                int n5;
                int n6;
                int n7;
                String[] arrstring;
                block26: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    block24: {
                        int n13;
                        int n14;
                        block11: {
                            block10: {
                                int n15;
                                float f10;
                                int n16;
                                float f11;
                                block14: {
                                    I i2;
                                    block12: {
                                        arrstring = q.b();
                                        i2 = this;
                                        if (arrstring == null) break block12;
                                        if (i2.k.ac.bd == b.HIDDEN) break block13;
                                        i2 = this;
                                    }
                                    f11 = i2.b();
                                    v.M();
                                    v.b(2.0f, 8.0f, 0.0f);
                                    v.d(f11, f11, 1.0f);
                                    v.B();
                                    n16 = this.a();
                                    n12 = this.j.size();
                                    f10 = this.k.ac.b_ * 0.9f + 0.1f;
                                    n15 = n12;
                                    if (arrstring == null) break block14;
                                    if (n15 <= 0) break block13;
                                    n15 = this.e() ? 1 : 0;
                                }
                                int n17 = n15;
                                int n18 = net.minecraft.k.h.f((float)this.h() / f11);
                                v.M();
                                v.b(2.5f, 8.0f, 0.0f);
                                v.b(0.0f, -3.0f, 0.0f);
                                v.d(f11, f11, 1.0f);
                                n11 = 0;
                                n10 = 0;
                                while (n10 + this.i < this.j.size()) {
                                    block15: {
                                        block16: {
                                            block22: {
                                                int n19;
                                                String string;
                                                block23: {
                                                    int n20;
                                                    block20: {
                                                        block21: {
                                                            int n21;
                                                            aO aO2;
                                                            block19: {
                                                                int n22;
                                                                block17: {
                                                                    block18: {
                                                                        n9 = n10;
                                                                        if (arrstring == null) break block10;
                                                                        n14 = n16;
                                                                        if (arrstring == null) break block11;
                                                                        if (n9 >= n14) break;
                                                                        aO2 = this.j.get(n10 + this.i);
                                                                        if (arrstring == null) break block15;
                                                                        if (aO2 == null) break block16;
                                                                        n22 = n8 = n2 - aO2.c();
                                                                        if (arrstring == null) break block17;
                                                                        if (n22 < 200) break block18;
                                                                        n22 = n17;
                                                                        if (arrstring == null) break block17;
                                                                        if (n22 == 0) break block16;
                                                                    }
                                                                    n22 = n8;
                                                                }
                                                                double d10 = (double)n22 / 200.0;
                                                                d10 = 1.0 - d10;
                                                                d10 *= 10.0;
                                                                d10 = net.minecraft.k.h.b(d10, 0.0, 1.0);
                                                                d10 *= d10;
                                                                n7 = (int)(255.0 * d10);
                                                                n21 = n17;
                                                                if (arrstring == null) break block19;
                                                                if (n21 != 0) {
                                                                    n7 = 255;
                                                                }
                                                                n7 = (int)((float)n7 * f10);
                                                                ++n11;
                                                                if (arrstring == null) break block15;
                                                                n21 = n7;
                                                            }
                                                            if (n21 <= 3) break block16;
                                                            n6 = -n10 * 9;
                                                            string = aO2.a().a();
                                                            v.a();
                                                            n20 = cl.k.l();
                                                            if (arrstring == null) break block20;
                                                            if (n20 == 0) break block21;
                                                            n19 = cj.b.i.a(cl.class).i();
                                                            if (arrstring == null) break block22;
                                                            if (n19 != 0) break block23;
                                                        }
                                                        n20 = -2;
                                                    }
                                                    I.a(n20, n6 - 9, n18 + 4, n6, n7 / 2 << 24);
                                                }
                                                n19 = this.k.a6.c(string, 0.0f, (float)((double)n6 - 9.5) + f11, 0xFFFFFF + (n7 << 24));
                                            }
                                            v.v();
                                            v.f();
                                        }
                                        ++n10;
                                    }
                                    if (arrstring != null) continue;
                                }
                                n9 = n17;
                            }
                            if (arrstring == null) break block24;
                            if (n9 == 0) break block25;
                            n10 = this.k.a6.p;
                            v.b(-3.0f, 0.0f, 0.0f);
                            n13 = n12 * n10;
                            n14 = n12;
                        }
                        n9 = n13 + n14;
                    }
                    int n23 = n9;
                    n8 = n11 * n10 + n11;
                    n5 = this.i * n8 / n12;
                    n4 = n8 * n8 / n23;
                    n3 = n23;
                    if (arrstring == null) break block26;
                    if (n3 == n8) break block25;
                    n3 = n5;
                }
                if (arrstring != null) {
                    n3 = n3 > 0 ? 170 : 96;
                }
                n7 = n3;
                int n24 = this.g;
                if (arrstring != null) {
                    n24 = n24 != 0 ? 0xCC3333 : 0x3333AA;
                }
                n6 = n24;
                I.a(0, -n5, 2, -n5 - n4, n6 + (n7 << 24));
                I.a(2, -n5, 1, -n5 - n4, 0xCCCCCC + (n7 << 24));
            }
            v.B();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int d() {
        float f10;
        String[] arrstring = q.b();
        I i2 = this;
        if (arrstring != null) {
            if (i2.e()) {
                f10 = this.k.ac.aQ;
                return I.a(f10);
            }
            i2 = this;
        }
        f10 = i2.k.ac.at;
        return I.a(f10);
    }
}

