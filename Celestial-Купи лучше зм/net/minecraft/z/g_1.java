/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.Z;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.W.K;
import net.minecraft.W.aL;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ac.b;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class g {
    private final /* synthetic */ n b;
    private final /* synthetic */ n e;
    private final /* synthetic */ List<n> f;
    private final /* synthetic */ List<n> a;
    private final /* synthetic */ aA d;
    private final /* synthetic */ z c;

    private boolean a(n n2) {
        aA[] arraA = aA.values();
        String string = net.minecraft.Z.c.c();
        int n3 = arraA.length;
        int n4 = 0;
        while (n4 < n3) {
            block3: {
                block4: {
                    boolean bl2;
                    block5: {
                        aA aA2 = arraA[n4];
                        if (string == null) break block3;
                        if (aA2.g() == this.d.g()) break block4;
                        bl2 = this.a(n2.a(aA2), aA2);
                        if (string == null) break block5;
                        if (bl2) break block4;
                        bl2 = false;
                    }
                    return bl2;
                }
                ++n4;
            }
            if (string != null) continue;
        }
        return true;
    }

    public List<n> b() {
        return this.f;
    }

    public g(z z2, n n2, aA aA2, boolean bl2) {
        block4: {
            block2: {
                block3: {
                    String string = net.minecraft.Z.c.c();
                    String string2 = string;
                    this.f = Lists.newArrayList();
                    this.a = Lists.newArrayList();
                    this.c = z2;
                    this.b = n2;
                    if (string2 == null) break block2;
                    if (!bl2) break block3;
                    this.d = aA2;
                    this.e = n2.a(aA2);
                    if (string2 != null) break block4;
                }
                this.d = aA2.h();
            }
            this.e = n2.a(aA2, 2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public List<n> a() {
        return this.a;
    }

    private boolean a(n n2, aA aA2) {
        int n3;
        int n4;
        String string;
        i i2;
        block37: {
            int n5;
            block36: {
                int n6;
                K k2;
                block39: {
                    int n7;
                    block38: {
                        i2 = this.c.d(n2);
                        k2 = i2.b();
                        string = net.minecraft.Z.c.c();
                        i i3 = i2;
                        if (string != null) {
                            if (i3.o() == net.minecraft.ac.c.A) {
                                return true;
                            }
                            i3 = i2;
                        }
                        int n8 = aL.a(i3, this.c, n2, this.d, false, aA2);
                        if (string != null) {
                            if (n8 == 0) {
                                return true;
                            }
                            n8 = n2.equals(this.b);
                        }
                        if (string != null) {
                            if (n8 != 0) {
                                return true;
                            }
                            n8 = this.f.contains(n2);
                        }
                        if (string != null) {
                            if (n8 != 0) {
                                return true;
                            }
                            n8 = 1;
                        }
                        n6 = n8;
                        n7 = n6 + this.f.size();
                        if (string == null) break block38;
                        if (n7 <= 12) break block39;
                        n7 = 0;
                    }
                    return n7 != 0;
                }
                while (k2 == net.minecraft.u.g.t) {
                    block41: {
                        int n9;
                        block40: {
                            n n10 = n2.a(this.d.h(), n6);
                            i2 = this.c.d(n10);
                            k2 = i2.b();
                            i i4 = i2;
                            if (string != null) {
                                if (i4.o() == net.minecraft.ac.c.A) break;
                                i4 = i2;
                            }
                            n5 = aL.a(i4, this.c, n10, this.d, false, this.d.h()) ? 1 : 0;
                            if (string == null) break block36;
                            if (n5 == 0) break;
                            n9 = n10.equals(this.b);
                            if (string != null) {
                                if (n9 != 0 && string != null) break;
                                n9 = ++n6 + this.f.size();
                            }
                            if (string == null) break block40;
                            if (n9 <= 12) break block41;
                            n9 = 0;
                        }
                        return n9 != 0;
                    }
                    if (string != null) continue;
                }
                n5 = 0;
            }
            n4 = n5;
            for (n3 = n6 - 1; n3 >= 0; --n3) {
                this.f.add(n2.a(this.d.h(), n3));
                ++n4;
                if (string != null) {
                    if (string != null) continue;
                }
                break block37;
            }
            n3 = 1;
        }
        while (true) {
            n n11;
            block49: {
                int n10;
                block47: {
                    block48: {
                        block43: {
                            block42: {
                                int n13;
                                if ((n13 = this.f.indexOf(n11 = n2.a(this.d, n3))) <= -1) break block42;
                                this.a(n4, n13);
                                n10 = 0;
                                if (string == null) break block43;
                                int n14 = n10;
                                while (n14 <= n13 + n4) {
                                    block44: {
                                        block45: {
                                            boolean bl2;
                                            block46: {
                                                n n15 = this.f.get(n14);
                                                if (string == null) break block44;
                                                if (this.c.d(n15).b() != net.minecraft.u.g.t) break block45;
                                                bl2 = this.a(n15);
                                                if (string == null) break block46;
                                                if (bl2) break block45;
                                                bl2 = false;
                                            }
                                            return bl2;
                                        }
                                        ++n14;
                                    }
                                    if (string != null) continue;
                                }
                                return true;
                            }
                            i i5 = i2 = this.c.d(n11);
                            if (string != null) {
                                if (i5.o() == net.minecraft.ac.c.A) {
                                    return true;
                                }
                                i5 = i2;
                            }
                            n10 = aL.a(i5, this.c, n11, this.d, true, this.d) ? 1 : 0;
                        }
                        if (string == null) break block47;
                        if (n10 == 0) break block48;
                        n10 = n11.equals(this.b) ? 1 : 0;
                        if (string == null) break block47;
                        if (n10 == 0) break block49;
                    }
                    n10 = 0;
                }
                return n10 != 0;
            }
            if (i2.q() == net.minecraft.ac.b.DESTROY) {
                this.a.add(n11);
                return true;
            }
            int n12 = this.f.size();
            if (string != null) {
                if (n12 >= 12) {
                    return false;
                }
                n12 = this.f.add(n11) ? 1 : 0;
            }
            ++n4;
            ++n3;
        }
    }

    public boolean c() {
        block12: {
            int n2;
            String string = net.minecraft.Z.c.c();
            this.f.clear();
            String string2 = string;
            this.a.clear();
            i i2 = this.c.d(this.e);
            int n3 = aL.a(i2, this.c, this.e, this.d, false, this.d);
            if (string2 != null) {
                if (n3 == 0) {
                    if (i2.q() == net.minecraft.ac.b.DESTROY) {
                        this.a.add(this.e);
                        return true;
                    }
                    return false;
                }
                n3 = this.a(this.e, this.d);
            }
            if (string2 != null) {
                if (n3 == 0) {
                    return false;
                }
                n3 = n2 = 0;
            }
            while (n2 < this.f.size()) {
                block9: {
                    block10: {
                        boolean bl2;
                        block11: {
                            n n4 = this.f.get(n2);
                            if (string2 == null) break block9;
                            if (this.c.d(n4).b() != net.minecraft.u.g.t) break block10;
                            bl2 = this.a(n4);
                            if (string2 == null) break block11;
                            if (bl2) break block10;
                            bl2 = false;
                        }
                        return bl2;
                    }
                    ++n2;
                }
                if (string2 != null) continue;
            }
            if (!m.c()) break block12;
            net.minecraft.Z.c.b("nbqtkb");
        }
        return true;
    }

    private void a(int n2, int n3) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        arrayList.addAll(this.f.subList(0, n3));
        arrayList2.addAll(this.f.subList(this.f.size() - n2, this.f.size()));
        arrayList3.addAll(this.f.subList(n3, this.f.size() - n2));
        this.f.clear();
        this.f.addAll(arrayList);
        this.f.addAll(arrayList2);
        this.f.addAll(arrayList3);
    }
}

