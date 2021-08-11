/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
package net.minecraft.client.a;

import com.google.common.collect.Ordering;
import java.util.Collection;
import net.minecraft.B.n;
import net.minecraft.K.b;
import net.minecraft.K.j;
import net.minecraft.client.D.h;
import net.minecraft.client.I.g;
import net.minecraft.client.a.I;
import net.minecraft.client.a.v;

public abstract class K
extends g {
    protected /* synthetic */ boolean aa;

    @Override
    public void r() {
        super.r();
        this.i();
    }

    public K(n n2) {
        super(n2);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block3: {
            K k2;
            block2: {
                String string = I.j();
                super.a(n2, n3, f10);
                String string2 = string;
                k2 = this;
                if (string2 != null) break block2;
                if (!k2.aa) break block3;
                k2 = this;
            }
            k2.g();
        }
    }

    private void g() {
        block11: {
            int n2;
            Collection<j> collection;
            String string;
            int n3;
            int n4;
            block13: {
                int n5;
                int n6;
                block12: {
                    int n7;
                    block10: {
                        n4 = this.H - 124;
                        n3 = this.B;
                        int n8 = 166;
                        string = I.j();
                        collection = this.m.s.az();
                        n7 = collection.isEmpty();
                        if (string != null) break block10;
                        if (n7 != 0) break block11;
                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                        net.minecraft.client.a.v.y();
                        n7 = 33;
                    }
                    n2 = n7;
                    n6 = collection.size();
                    n5 = 5;
                    if (string != null) break block12;
                    if (n6 <= n5) break block13;
                    n6 = 132;
                    n5 = collection.size() - 1;
                }
                n2 = n6 / n5;
            }
            for (j j2 : Ordering.natural().sortedCopy(collection)) {
                block19: {
                    int n9;
                    String string2;
                    block16: {
                        int n10;
                        block17: {
                            block18: {
                                block14: {
                                    block15: {
                                        b b10 = j2.g();
                                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                        this.m.aN().b(N);
                                        this.a(n4, n3, 0, 166, 140, 32);
                                        b b11 = b10;
                                        if (string == null) {
                                            if (b11.d()) {
                                                int n11 = b10.j();
                                                this.a(n4 + 6, n3 + 7, 0 + n11 % 8 * 18, 198 + n11 / 8 * 18, 18, 18);
                                            }
                                            b11 = b10;
                                        }
                                        string2 = net.minecraft.client.D.h.a(b11.i(), new Object[0]);
                                        n9 = j2.h();
                                        n10 = 1;
                                        if (string != null) break block14;
                                        if (n9 != n10) break block15;
                                        string2 = string2 + " " + net.minecraft.client.D.h.a("enchantment.level.2", new Object[0]);
                                        if (string == null) break block16;
                                    }
                                    n9 = j2.h();
                                    n10 = 2;
                                }
                                if (string != null) break block17;
                                if (n9 != n10) break block18;
                                string2 = string2 + " " + net.minecraft.client.D.h.a("enchantment.level.3", new Object[0]);
                                if (string == null) break block16;
                            }
                            n9 = j2.h();
                            if (string != null) break block19;
                            n10 = 3;
                        }
                        if (n9 == n10) {
                            string2 = string2 + " " + net.minecraft.client.D.h.a("enchantment.level.4", new Object[0]);
                        }
                    }
                    n9 = this.v.c(string2, n4 + 10 + 18, n3 + 6, 0xFFFFFF);
                }
                String string3 = b.a(j2, 1.0f);
                this.v.c(string3, n4 + 10 + 18, n3 + 6 + 10, 0x7F7F7F);
                n3 += n2;
                if (string == null) continue;
            }
        }
    }

    protected void i() {
        block4: {
            block2: {
                K k2;
                block3: {
                    String string = I.j();
                    k2 = this;
                    if (string != null) break block2;
                    if (!k2.m.s.az().isEmpty()) break block3;
                    this.H = (h - this.M) / 2;
                    this.aa = false;
                    if (string == null) break block4;
                }
                this.H = 160 + (h - this.M - 200) / 2;
                k2 = this;
            }
            k2.aa = true;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

