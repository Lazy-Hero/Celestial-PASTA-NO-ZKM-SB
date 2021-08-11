/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  javax.annotation.Nullable
 */
package net.minecraft.k;

import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;
import net.minecraft.ar.aA;
import net.minecraft.k.i;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class k {
    public final /* synthetic */ double e;
    public final /* synthetic */ double f;
    public final /* synthetic */ double d;
    public final /* synthetic */ double b;
    public final /* synthetic */ double a;
    private static /* synthetic */ String c;
    public final /* synthetic */ double g;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int hashCode() {
        long l2 = Double.doubleToLongBits(this.e);
        int n2 = (int)(l2 ^ l2 >>> 32);
        boolean bl2 = n.g();
        l2 = Double.doubleToLongBits(this.b);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.d);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.f);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.a);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        l2 = Double.doubleToLongBits(this.g);
        n2 = 31 * n2 + (int)(l2 ^ l2 >>> 32);
        if (!bl2) {
            m.b(!m.c());
        }
        return n2;
    }

    @Nullable
    @VisibleForTesting
    l a(double d10, l l2, l l3) {
        l l4 = l2.a(l3, d10);
        return l4 != null && this.a(l4) ? l4 : null;
    }

    @Nullable
    @VisibleForTesting
    l b(double d10, l l2, l l3) {
        l l4 = l2.c(l3, d10);
        return l4 != null && this.c(l4) ? l4 : null;
    }

    public k a(n n2) {
        return new k(this.e + (double)n2.e(), this.b + (double)n2.b(), this.d + (double)n2.a(), this.f + (double)n2.e(), this.a + (double)n2.b(), this.g + (double)n2.a());
    }

    @Nullable
    @VisibleForTesting
    l c(double d10, l l2, l l3) {
        l l4 = l2.b(l3, d10);
        return l4 != null && this.d(l4) ? l4 : null;
    }

    @Nullable
    public i b(l l2, l l3) {
        l l4;
        l l5;
        aA aA2;
        boolean bl2;
        l l6;
        block27: {
            k k2;
            block29: {
                block28: {
                    block24: {
                        k k3;
                        block26: {
                            block25: {
                                block21: {
                                    k k4;
                                    block23: {
                                        block22: {
                                            block18: {
                                                k k5;
                                                block20: {
                                                    block19: {
                                                        l6 = this.a(this.e, l2, l3);
                                                        bl2 = n.e();
                                                        aA2 = aA.WEST;
                                                        l4 = l5 = this.a(this.f, l2, l3);
                                                        if (bl2) break block18;
                                                        if (l4 == null) break block19;
                                                        k5 = this;
                                                        if (bl2) break block20;
                                                        if (k5.a(l2, l6, l5)) {
                                                            l6 = l5;
                                                            aA2 = aA.EAST;
                                                        }
                                                    }
                                                    k5 = this;
                                                }
                                                l4 = l5 = k5.b(this.b, l2, l3);
                                            }
                                            if (bl2) break block21;
                                            if (l4 == null) break block22;
                                            k4 = this;
                                            if (bl2) break block23;
                                            if (k4.a(l2, l6, l5)) {
                                                l6 = l5;
                                                aA2 = aA.DOWN;
                                            }
                                        }
                                        k4 = this;
                                    }
                                    l4 = l5 = k4.b(this.a, l2, l3);
                                }
                                if (bl2) break block24;
                                if (l4 == null) break block25;
                                k3 = this;
                                if (bl2) break block26;
                                if (k3.a(l2, l6, l5)) {
                                    l6 = l5;
                                    aA2 = aA.UP;
                                }
                            }
                            k3 = this;
                        }
                        l4 = l5 = k3.c(this.d, l2, l3);
                    }
                    if (bl2) break block27;
                    if (l4 == null) break block28;
                    k2 = this;
                    if (bl2) break block29;
                    if (k2.a(l2, l6, l5)) {
                        l6 = l5;
                        aA2 = aA.NORTH;
                    }
                }
                k2 = this;
            }
            l4 = l5 = k2.c(this.g, l2, l3);
        }
        if (!bl2) {
            if (l4 != null && this.a(l2, l6, l5)) {
                l6 = l5;
                aA2 = aA.SOUTH;
            }
            l4 = l6;
        }
        return l4 == null ? null : new i(l6, aA2);
    }

    public k a(double d10) {
        return this.a(d10, d10, d10);
    }

    public boolean a(l l2, l l3) {
        return this.a(Math.min(l2.e, l3.e), Math.min(l2.d, l3.d), Math.min(l2.b, l3.b), Math.max(l2.e, l3.e), Math.max(l2.d, l3.d), Math.max(l2.b, l3.b));
    }

    public double a(k k2, double d10) {
        double d11;
        block5: {
            block6: {
                double d12;
                block10: {
                    block9: {
                        double d13;
                        double d14;
                        boolean bl2;
                        block7: {
                            block8: {
                                bl2 = n.g();
                                d11 = k2.f;
                                if (!bl2) break block5;
                                if (!(d11 > this.e)) break block6;
                                d11 = k2.e;
                                if (!bl2) break block5;
                                if (!(d11 < this.f)) break block6;
                                d11 = k2.a;
                                if (!bl2) break block5;
                                if (!(d11 > this.b)) break block6;
                                d11 = k2.b;
                                if (!bl2) break block5;
                                if (!(d11 < this.a)) break block6;
                                double d15 = d10 - 0.0;
                                d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                if (!bl2) break block7;
                                if (d14 <= 0) break block8;
                                double d16 = k2.g - this.d;
                                d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                if (!bl2) break block7;
                                if (d14 > 0) break block8;
                                double d17 = d13 = this.d - k2.g;
                                if (bl2 && d17 < d10) {
                                    d17 = d10 = d13;
                                }
                                if (bl2) break block9;
                            }
                            d12 = d10;
                            if (!bl2) break block10;
                            double d18 = d12 - 0.0;
                            d14 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                        }
                        if (d14 >= 0) break block9;
                        d12 = k2.d;
                        if (!bl2) break block10;
                        if (!(d12 >= this.g)) break block9;
                        d12 = d13 = this.g - k2.d;
                        if (!bl2) break block10;
                        if (d12 > d10) {
                            d10 = d13;
                        }
                    }
                    d12 = d10;
                }
                return d12;
            }
            d11 = d10;
        }
        return d11;
    }

    public double c(k k2, double d10) {
        double d11;
        block5: {
            block6: {
                double d12;
                block10: {
                    block9: {
                        double d13;
                        double d14;
                        boolean bl2;
                        block7: {
                            block8: {
                                bl2 = n.g();
                                d11 = k2.a;
                                if (!bl2) break block5;
                                if (!(d11 > this.b)) break block6;
                                d11 = k2.b;
                                if (!bl2) break block5;
                                if (!(d11 < this.a)) break block6;
                                d11 = k2.g;
                                if (!bl2) break block5;
                                if (!(d11 > this.d)) break block6;
                                d11 = k2.d;
                                if (!bl2) break block5;
                                if (!(d11 < this.g)) break block6;
                                double d15 = d10 - 0.0;
                                d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                if (!bl2) break block7;
                                if (d14 <= 0) break block8;
                                double d16 = k2.f - this.e;
                                d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                if (!bl2) break block7;
                                if (d14 > 0) break block8;
                                double d17 = d13 = this.e - k2.f;
                                if (bl2 && d17 < d10) {
                                    d17 = d10 = d13;
                                }
                                if (bl2) break block9;
                            }
                            d12 = d10;
                            if (!bl2) break block10;
                            double d18 = d12 - 0.0;
                            d14 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                        }
                        if (d14 >= 0) break block9;
                        d12 = k2.e;
                        if (!bl2) break block10;
                        if (!(d12 >= this.f)) break block9;
                        d12 = d13 = this.f - k2.e;
                        if (!bl2) break block10;
                        if (d12 > d10) {
                            d10 = d13;
                        }
                    }
                    d12 = d10;
                }
                return d12;
            }
            d11 = d10;
        }
        return d11;
    }

    public boolean c(k k2) {
        return this.a(k2.e, k2.b, k2.d, k2.f, k2.a, k2.g);
    }

    public double b(k k2, double d10) {
        double d11;
        block5: {
            block6: {
                double d12;
                block10: {
                    block9: {
                        double d13;
                        double d14;
                        boolean bl2;
                        block7: {
                            block8: {
                                bl2 = n.g();
                                d11 = k2.f;
                                if (!bl2) break block5;
                                if (!(d11 > this.e)) break block6;
                                d11 = k2.e;
                                if (!bl2) break block5;
                                if (!(d11 < this.f)) break block6;
                                d11 = k2.g;
                                if (!bl2) break block5;
                                if (!(d11 > this.d)) break block6;
                                d11 = k2.d;
                                if (!bl2) break block5;
                                if (!(d11 < this.g)) break block6;
                                double d15 = d10 - 0.0;
                                d14 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                if (!bl2) break block7;
                                if (d14 <= 0) break block8;
                                double d16 = k2.a - this.b;
                                d14 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                if (!bl2) break block7;
                                if (d14 > 0) break block8;
                                double d17 = d13 = this.b - k2.a;
                                if (bl2 && d17 < d10) {
                                    d17 = d10 = d13;
                                }
                                if (bl2) break block9;
                            }
                            d12 = d10;
                            if (!bl2) break block10;
                            double d18 = d12 - 0.0;
                            d14 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                        }
                        if (d14 >= 0) break block9;
                        d12 = k2.b;
                        if (!bl2) break block10;
                        if (!(d12 >= this.a)) break block9;
                        d12 = d13 = this.a - k2.b;
                        if (!bl2) break block10;
                        if (d12 > d10) {
                            d10 = d13;
                        }
                    }
                    d12 = d10;
                }
                return d12;
            }
            d11 = d10;
        }
        return d11;
    }

    public k c(double d10) {
        return new k(this.e, this.b, this.d, this.f, d10, this.g);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @VisibleForTesting
    boolean a(l l2, @Nullable l l3, l l4) {
        double d10;
        boolean bl2 = n.g();
        l l5 = l3;
        if (bl2) {
            if (l5 == null) return 1 != 0;
            l5 = l2;
        }
        int n2 = (d10 = l5.f(l4) - l2.f(l3)) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (!bl2) return n2 != 0;
        if (n2 >= 0) return 0 != 0;
        return 1 != 0;
    }

    public k a(double d10, double d11, double d12) {
        double d13 = this.e - d10;
        double d14 = this.b - d11;
        double d15 = this.d - d12;
        double d16 = this.f + d10;
        double d17 = this.a + d11;
        double d18 = this.g + d12;
        return new k(d13, d14, d15, d16, d17, d18);
    }

    public boolean equals(Object object) {
        boolean bl2 = n.g();
        Object object2 = this;
        if (bl2) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (bl2) {
            if (!(object2 instanceof k)) {
                return false;
            }
            object2 = object;
        }
        k k2 = (k)object2;
        int n2 = Double.compare(k2.e, this.e);
        if (bl2) {
            if (n2 != 0) {
                return false;
            }
            n2 = Double.compare(k2.b, this.b);
        }
        if (bl2) {
            if (n2 != 0) {
                return false;
            }
            n2 = Double.compare(k2.d, this.d);
        }
        if (bl2) {
            if (n2 != 0) {
                return false;
            }
            n2 = Double.compare(k2.f, this.f);
        }
        if (bl2) {
            if (n2 != 0) {
                return false;
            }
            n2 = Double.compare(k2.a, this.a);
        }
        if (bl2) {
            if (n2 != 0) {
                return false;
            }
            n2 = Double.compare(k2.g, this.g);
        }
        if (bl2) {
            n2 = n2 == 0 ? 1 : 0;
        }
        return n2 != 0;
    }

    public k b(double d10) {
        return this.a(-d10);
    }

    public k e(l l2) {
        return this.c(l2.e, l2.d, l2.b);
    }

    public k a(k k2) {
        double d10 = Math.min(this.e, k2.e);
        double d11 = Math.min(this.b, k2.b);
        double d12 = Math.min(this.d, k2.d);
        double d13 = Math.max(this.f, k2.f);
        double d14 = Math.max(this.a, k2.a);
        double d15 = Math.max(this.g, k2.g);
        return new k(d10, d11, d12, d13, d14, d15);
    }

    public k b(k k2) {
        double d10 = Math.max(this.e, k2.e);
        double d11 = Math.max(this.b, k2.b);
        double d12 = Math.max(this.d, k2.d);
        double d13 = Math.min(this.f, k2.f);
        double d14 = Math.min(this.a, k2.a);
        double d15 = Math.min(this.g, k2.g);
        return new k(d10, d11, d12, d13, d14, d15);
    }

    public l e() {
        return new l(this.e + (this.f - this.e) * 0.5, this.b + (this.a - this.b) * 0.5, this.d + (this.g - this.d) * 0.5);
    }

    public double d() {
        double d10 = this.f - this.e;
        double d11 = this.a - this.b;
        double d12 = this.g - this.d;
        return (d10 + d11 + d12) / 3.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    @VisibleForTesting
    public boolean a(l l2) {
        double d10;
        block5: {
            boolean bl2;
            block7: {
                block6: {
                    block4: {
                        bl2 = n.g();
                        double d11 = l2.d - this.b;
                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (!bl2) break block4;
                        if (d10 < 0) break block5;
                        double d12 = l2.d - this.a;
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (!bl2) break block6;
                    if (d10 > 0) break block5;
                    double d13 = l2.b - this.d;
                    d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (!bl2) break block7;
                if (d10 < 0) break block5;
                double d14 = l2.b - this.g;
                d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            }
            if (!bl2) return (boolean)d10;
            if (d10 <= 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public k(double d10, double d11, double d12, double d13, double d14, double d15) {
        this.e = Math.min(d10, d13);
        this.b = Math.min(d11, d14);
        this.d = Math.min(d12, d15);
        this.f = Math.max(d10, d13);
        this.a = Math.max(d11, d14);
        this.g = Math.max(d12, d15);
    }

    static {
        if (k.b() == null) {
            k.b("PhrPbb");
        }
    }

    public k(l l2, l l3) {
        this(l2.e, l2.d, l2.b, l3.e, l3.d, l3.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(l l2) {
        double d10;
        block4: {
            double d11;
            block5: {
                double d12;
                block7: {
                    boolean bl2;
                    block6: {
                        bl2 = n.e();
                        double d13 = l2.e - this.e;
                        d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                        if (bl2) return (boolean)d10;
                        if (d10 <= 0) break block4;
                        double d14 = l2.e - this.f;
                        d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                        if (bl2) return (boolean)d10;
                        if (d10 >= 0) break block4;
                        double d15 = l2.d - this.b;
                        d11 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                        if (bl2) return (boolean)d11;
                        if (d11 <= 0) break block5;
                        double d16 = l2.d - this.a;
                        d11 = d16 == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                        if (bl2) return (boolean)d11;
                        if (d11 >= 0) break block5;
                        double d17 = l2.b - this.d;
                        d12 = d17 == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                        if (bl2) break block6;
                        if (d12 <= 0) break block7;
                        double d18 = l2.b - this.g;
                        d12 = d18 == 0.0 ? 0 : (d18 < 0.0 ? -1 : 1);
                    }
                    if (bl2) return (boolean)d12;
                    if (d12 < 0) {
                        d12 = 1.0;
                        return (boolean)d12;
                    }
                }
                d12 = 0.0;
                return (boolean)d12;
            }
            d11 = 0.0;
            return (boolean)d11;
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public k(n n2, n n3) {
        this(n2.e(), n2.b(), n2.a(), n3.e(), n3.b(), n3.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    @VisibleForTesting
    public boolean d(l l2) {
        double d10;
        block5: {
            boolean bl2;
            block7: {
                block6: {
                    block4: {
                        bl2 = n.e();
                        double d11 = l2.e - this.e;
                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (bl2) break block4;
                        if (d10 < 0) break block5;
                        double d12 = l2.e - this.f;
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (bl2) break block6;
                    if (d10 > 0) break block5;
                    double d13 = l2.d - this.b;
                    d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (bl2) break block7;
                if (d10 < 0) break block5;
                double d14 = l2.d - this.a;
                d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            }
            if (bl2) return (boolean)d10;
            if (d10 <= 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    /*
     * Enabled aggressive block sorting
     */
    @VisibleForTesting
    public boolean c(l l2) {
        double d10;
        block5: {
            boolean bl2;
            block7: {
                block6: {
                    block4: {
                        bl2 = n.e();
                        double d11 = l2.e - this.e;
                        d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                        if (bl2) break block4;
                        if (d10 < 0) break block5;
                        double d12 = l2.e - this.f;
                        d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                    }
                    if (bl2) break block6;
                    if (d10 > 0) break block5;
                    double d13 = l2.b - this.d;
                    d10 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                }
                if (bl2) break block7;
                if (d10 < 0) break block5;
                double d14 = l2.b - this.g;
                d10 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
            }
            if (bl2) return (boolean)d10;
            if (d10 <= 0) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    public k d(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        block21: {
            double d19;
            double d20;
            block22: {
                double d21;
                block19: {
                    boolean bl2;
                    block20: {
                        block18: {
                            double d22;
                            block17: {
                                block15: {
                                    double d23;
                                    block16: {
                                        block14: {
                                            double d24;
                                            block13: {
                                                block11: {
                                                    double d25;
                                                    block12: {
                                                        d18 = this.e;
                                                        d17 = this.b;
                                                        d16 = this.d;
                                                        d15 = this.f;
                                                        bl2 = n.g();
                                                        d14 = this.a;
                                                        d13 = this.g;
                                                        double d26 = d10 - 0.0;
                                                        d21 = d26 == 0.0 ? 0 : (d26 < 0.0 ? -1 : 1);
                                                        if (!bl2) break block11;
                                                        if (d21 >= 0) break block12;
                                                        d18 += d10;
                                                        if (bl2) break block13;
                                                    }
                                                    d21 = (d25 = d10 - 0.0) == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
                                                }
                                                if (!bl2) break block14;
                                                if (d21 > 0) {
                                                    d15 += d10;
                                                }
                                            }
                                            d21 = (d24 = d11 - 0.0) == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
                                        }
                                        if (!bl2) break block15;
                                        if (d21 >= 0) break block16;
                                        d17 += d11;
                                        if (bl2) break block17;
                                    }
                                    d21 = (d23 = d11 - 0.0) == 0.0 ? 0 : (d23 > 0.0 ? 1 : -1);
                                }
                                if (!bl2) break block18;
                                if (d21 > 0) {
                                    d14 += d11;
                                }
                            }
                            d21 = (d22 = d12 - 0.0) == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                        }
                        if (!bl2) break block19;
                        if (d21 >= 0) break block20;
                        d16 += d12;
                        if (bl2) break block21;
                    }
                    d20 = d12;
                    d19 = 0.0;
                    if (!bl2) break block22;
                    double d27 = d20 - d19;
                    d21 = d27 == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                }
                if (d21 <= 0) break block21;
                d20 = d13;
                d19 = d12;
            }
            d13 = d20 + d19;
        }
        return new k(d18, d17, d16, d15, d14, d13);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c() {
        boolean bl2 = n.g();
        boolean bl3 = Double.isNaN(this.e);
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = Double.isNaN(this.b);
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = Double.isNaN(this.d);
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = Double.isNaN(this.f);
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = Double.isNaN(this.a);
        if (!bl2) return bl3;
        if (bl3) return true;
        bl3 = Double.isNaN(this.g);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    public static void b(String string) {
        c = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16;
        block5: {
            boolean bl2;
            block9: {
                block8: {
                    block7: {
                        block6: {
                            block4: {
                                bl2 = n.e();
                                double d17 = this.e - d13;
                                d16 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                                if (bl2) break block4;
                                if (d16 >= 0) break block5;
                                double d18 = this.f - d10;
                                d16 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                            }
                            if (bl2) break block6;
                            if (d16 <= 0) break block5;
                            double d19 = this.b - d14;
                            d16 = d19 == 0.0 ? 0 : (d19 < 0.0 ? -1 : 1);
                        }
                        if (bl2) break block7;
                        if (d16 >= 0) break block5;
                        double d20 = this.a - d11;
                        d16 = d20 == 0.0 ? 0 : (d20 > 0.0 ? 1 : -1);
                    }
                    if (bl2) break block8;
                    if (d16 <= 0) break block5;
                    double d21 = this.d - d15;
                    d16 = d21 == 0.0 ? 0 : (d21 < 0.0 ? -1 : 1);
                }
                if (bl2) break block9;
                if (d16 >= 0) break block5;
                double d22 = this.g - d12;
                d16 = d22 == 0.0 ? 0 : (d22 > 0.0 ? 1 : -1);
            }
            if (bl2) return (boolean)d16;
            if (d16 > 0) {
                d16 = 1.0;
                return (boolean)d16;
            }
        }
        d16 = 0.0;
        return (boolean)d16;
    }

    public String toString() {
        return "box[" + this.e + ", " + this.b + ", " + this.d + " -> " + this.f + ", " + this.a + ", " + this.g + "]";
    }

    public k b(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        block21: {
            double d19;
            double d20;
            block22: {
                double d21;
                block19: {
                    boolean bl2;
                    block20: {
                        block18: {
                            double d22;
                            block17: {
                                block15: {
                                    double d23;
                                    block16: {
                                        block14: {
                                            double d24;
                                            block13: {
                                                block11: {
                                                    double d25;
                                                    block12: {
                                                        d18 = this.e;
                                                        d17 = this.b;
                                                        d16 = this.d;
                                                        d15 = this.f;
                                                        bl2 = n.e();
                                                        d14 = this.a;
                                                        d13 = this.g;
                                                        double d26 = d10 - 0.0;
                                                        d21 = d26 == 0.0 ? 0 : (d26 < 0.0 ? -1 : 1);
                                                        if (bl2) break block11;
                                                        if (d21 >= 0) break block12;
                                                        d18 -= d10;
                                                        if (!bl2) break block13;
                                                    }
                                                    d21 = (d25 = d10 - 0.0) == 0.0 ? 0 : (d25 > 0.0 ? 1 : -1);
                                                }
                                                if (bl2) break block14;
                                                if (d21 > 0) {
                                                    d15 -= d10;
                                                }
                                            }
                                            d21 = (d24 = d11 - 0.0) == 0.0 ? 0 : (d24 < 0.0 ? -1 : 1);
                                        }
                                        if (bl2) break block15;
                                        if (d21 >= 0) break block16;
                                        d17 -= d11;
                                        if (!bl2) break block17;
                                    }
                                    d21 = (d23 = d11 - 0.0) == 0.0 ? 0 : (d23 > 0.0 ? 1 : -1);
                                }
                                if (bl2) break block18;
                                if (d21 > 0) {
                                    d14 -= d11;
                                }
                            }
                            d21 = (d22 = d12 - 0.0) == 0.0 ? 0 : (d22 < 0.0 ? -1 : 1);
                        }
                        if (bl2) break block19;
                        if (d21 >= 0) break block20;
                        d16 -= d12;
                        if (!bl2) break block21;
                    }
                    d20 = d12;
                    d19 = 0.0;
                    if (bl2) break block22;
                    double d27 = d20 - d19;
                    d21 = d27 == 0.0 ? 0 : (d27 > 0.0 ? 1 : -1);
                }
                if (d21 <= 0) break block21;
                d20 = d13;
                d19 = d12;
            }
            d13 = d20 - d19;
        }
        return new k(d18, d17, d16, d15, d14, d13);
    }

    public k(n n2) {
        this(n2.e(), n2.b(), n2.a(), n2.e() + 1, n2.b() + 1, n2.a() + 1);
    }

    public k c(double d10, double d11, double d12) {
        return new k(this.e + d10, this.b + d11, this.d + d12, this.f + d10, this.a + d11, this.g + d12);
    }

    public static String b() {
        return c;
    }
}

