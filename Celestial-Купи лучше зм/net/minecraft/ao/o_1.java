/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.aV;
import net.minecraft.ao.ac;
import net.minecraft.ao.bu;
import net.minecraft.ao.j;
import net.minecraft.ao.u;
import net.minecraft.k.f;
import net.minecraft.k.h;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class o
extends j {
    private /* synthetic */ int g;
    private /* synthetic */ double k;
    private /* synthetic */ f[] h;
    private final /* synthetic */ List<net.minecraft.A.h> i;
    private /* synthetic */ boolean j;

    @Override
    public n a(z z2, n n2, boolean bl2) {
        n n3;
        block8: {
            String[] arrstring;
            block10: {
                block9: {
                    arrstring = u.b();
                    o o2 = this;
                    if (arrstring == null) break block9;
                    if (o2.j) break block10;
                    this.a();
                    o2 = this;
                }
                o2.j = true;
            }
            n n4 = null;
            net.minecraft.k.o o3 = new net.minecraft.k.o(0, 0, 0);
            double d10 = Double.MAX_VALUE;
            for (f f10 : this.h) {
                double d11;
                block12: {
                    n n5;
                    block11: {
                        o3.a((f10.c << 4) + 8, 32, (f10.b << 4) + 8);
                        d11 = o3.b(n2);
                        n3 = n4;
                        if (arrstring == null) break block8;
                        if (arrstring == null) break block11;
                        if (n3 != null) break block12;
                        n5 = new n(o3);
                    }
                    n4 = n5;
                    d10 = d11;
                    if (arrstring != null) continue;
                }
                double d12 = d11;
                if (arrstring != null) {
                    if (!(d12 < d10)) continue;
                    n4 = new n(o3);
                    d12 = d11;
                }
                d10 = d12;
                if (arrstring != null) continue;
            }
            n3 = n4;
        }
        return n3;
    }

    @Override
    public String a() {
        return "Stronghold";
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected ac a(int n2, int n3) {
        bu bu2;
        block3: {
            bu bu3 = new bu(this.d, this.a, n2, n3);
            String[] arrstring = u.b();
            do {
                bu bu4;
                if (!bu3.d().isEmpty()) {
                    bu4 = bu3;
                    if (arrstring == null) continue;
                    if (arrstring != null) {
                        if (((aV)bu4.d().get((int)0)).j != null) break;
                    }
                    break block3;
                }
                bu4 = bu3 = new bu(this.d, this.a, n2, n3);
            } while (arrstring != null);
            bu2 = bu3;
        }
        return bu2;
    }

    @Override
    protected boolean b(int n2, int n3) {
        int n4;
        block6: {
            String[] arrstring = u.b();
            o o2 = this;
            if (arrstring != null) {
                if (!o2.j) {
                    this.a();
                    this.j = true;
                }
                o2 = this;
            }
            f[] arrf = o2.h;
            int n5 = arrf.length;
            int n6 = 0;
            while (n6 < n5) {
                block7: {
                    block8: {
                        int n7;
                        block9: {
                            f f10 = arrf[n6];
                            if (arrstring == null) break block7;
                            n4 = n2;
                            if (arrstring == null) break block6;
                            if (n4 != f10.c) break block8;
                            n7 = n3;
                            if (arrstring == null) break block9;
                            if (n7 != f10.b) break block8;
                            n7 = 1;
                        }
                        return n7 != 0;
                    }
                    ++n6;
                }
                if (arrstring != null) continue;
            }
            n4 = 0;
        }
        return n4 != 0;
    }

    public o(Map<String, String> map) {
        this();
        String[] arrstring = u.b();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            block7: {
                boolean bl2;
                block8: {
                    block9: {
                        block5: {
                            block6: {
                                bl2 = entry.getKey().equals("distance");
                                if (arrstring == null) break block5;
                                if (!bl2) break block6;
                                this.k = net.minecraft.k.h.a(entry.getValue(), this.k, 1.0);
                                if (arrstring != null) break block7;
                            }
                            bl2 = entry.getKey().equals("count");
                        }
                        if (arrstring == null) break block8;
                        if (!bl2) break block9;
                        this.h = new f[net.minecraft.k.h.a(entry.getValue(), this.h.length, 1)];
                        if (arrstring != null) break block7;
                    }
                    bl2 = entry.getKey().equals("spread");
                }
                if (bl2) {
                    this.g = net.minecraft.k.h.a(entry.getValue(), this.g, 1);
                }
            }
            if (arrstring != null) continue;
        }
    }

    public o() {
        this.h = new f[128];
        this.k = 32.0;
        this.g = 3;
        this.i = Lists.newArrayList();
        Iterator<net.minecraft.A.h> iterator = net.minecraft.A.h.x.iterator();
        String[] arrstring = u.b();
        while (iterator.hasNext()) {
            block6: {
                float f10;
                net.minecraft.A.h h2;
                net.minecraft.A.h h3;
                block5: {
                    h2 = h3 = iterator.next();
                    if (arrstring == null) break block5;
                    if (h2 == null) break block6;
                    h2 = h3;
                }
                float f11 = (f10 = h2.e() - 0.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                if (arrstring != null && f11 > 0) {
                    f11 = (float)this.i.add(h3);
                }
            }
            if (arrstring != null) continue;
        }
    }

    private void a() {
        block12: {
            int n2;
            int n3;
            int n4;
            int n5;
            double d10;
            Object object2;
            String[] arrstring;
            block11: {
                String[] arrstring2 = u.b();
                this.a(this.d);
                int n6 = 0;
                arrstring = arrstring2;
                for (Object object2 : this.f.values()) {
                    if (n6 < this.h.length) {
                        this.h[n6++] = new f(((ac)object2).e(), ((ac)object2).b());
                    }
                    if (arrstring != null) continue;
                }
                object2 = new Random();
                ((Random)object2).setSeed(this.d.C());
                d10 = ((Random)object2).nextDouble() * Math.PI * 2.0;
                n5 = 0;
                n4 = 0;
                int n7 = n3 = this.f.size();
                if (arrstring == null) break block11;
                if (n7 >= this.h.length) break block12;
                n7 = n2 = 0;
            }
            while (n2 < this.h.length) {
                block16: {
                    int n8;
                    int n9;
                    block15: {
                        int n10;
                        int n11;
                        block14: {
                            n n12;
                            block13: {
                                n n13;
                                double d11 = 4.0 * this.k + this.k * (double)n5 * 6.0 + (((Random)object2).nextDouble() - 0.5) * this.k * 2.5;
                                n11 = (int)Math.round(Math.cos(d10) * d11);
                                n10 = (int)Math.round(Math.sin(d10) * d11);
                                n12 = n13 = this.d.B().a((n11 << 4) + 8, (n10 << 4) + 8, 112, this.i, (Random)object2);
                                if (arrstring == null) break block13;
                                if (n12 == null) break block14;
                                n11 = n13.e() >> 4;
                                n12 = n13;
                            }
                            n10 = n12.a() >> 4;
                        }
                        n9 = n2;
                        n8 = n3;
                        if (arrstring == null) break block15;
                        if (n9 >= n8) {
                            this.h[n2] = new f(n11, n10);
                        }
                        d10 += Math.PI * 2 / (double)this.g;
                        ++n4;
                        if (arrstring == null) break block16;
                        n9 = n4;
                        n8 = this.g;
                    }
                    if (n9 == n8) {
                        n4 = 0;
                        this.g += 2 * this.g / (++n5 + 1);
                        this.g = Math.min(this.g, this.h.length - n2);
                        d10 += ((Random)object2).nextDouble() * Math.PI * 2.0;
                    }
                    ++n2;
                }
                if (arrstring != null) continue;
            }
        }
    }
}

