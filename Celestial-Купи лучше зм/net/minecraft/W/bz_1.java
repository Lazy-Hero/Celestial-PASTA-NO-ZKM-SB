/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.minecraft.W.K;
import net.minecraft.W.aB;
import net.minecraft.W.bq;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bz
extends bq {
    /* synthetic */ int A;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(z z2, n n2, i i2) {
        c c10 = i2.o();
        boolean bl2 = cL.b();
        c c11 = c10;
        c c12 = this.y;
        if (!bl2) {
            if (c11 == c12) return false;
            c11 = c10;
            c12 = net.minecraft.ac.c.g;
        }
        if (c11 == c12) return false;
        boolean bl3 = this.c(z2, n2, i2);
        if (bl2) return bl3;
        if (bl3) return false;
        return true;
    }

    private int a(z z2, n n2, int n3, aA aA2) {
        int n4 = 1000;
        boolean bl2 = cL.b();
        for (aA aA3 : av.HORIZONTAL) {
            block7: {
                int n5;
                int n6;
                block11: {
                    n n7;
                    block10: {
                        i i2;
                        block9: {
                            i i3;
                            block8: {
                                if (aA3 == aA2 || this.c(z2, n7 = n2.a(aA3), i2 = z2.d(n7))) break block7;
                                i3 = i2;
                                if (bl2) break block8;
                                if (i3.o() != this.y) break block9;
                                i3 = i2;
                            }
                            n6 = i3.b(z);
                            if (bl2) break block10;
                            if (n6 <= 0) break block7;
                        }
                        n6 = this.c(z2, n7.k(), i2) ? 1 : 0;
                    }
                    if (!bl2) {
                        if (n6 == 0) {
                            return n3;
                        }
                        n6 = n3;
                    }
                    if (bl2) break block11;
                    if (n6 >= this.b(z2)) break block7;
                    n6 = this.a(z2, n7, n3 + 1, aA3.h());
                }
                int n8 = n5 = n6;
                if (!bl2 && n8 < n4) {
                    n8 = n4 = n5;
                }
            }
            if (!bl2) continue;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(z z2, n n2, i i2) {
        c c10;
        boolean bl2;
        block10: {
            c c11;
            K k2;
            block9: {
                K k3;
                block8: {
                    K k4;
                    block7: {
                        k2 = z2.d(n2).b();
                        bl2 = cL.b();
                        boolean bl3 = k2 instanceof aB;
                        if (bl2) return bl3;
                        if (bl3) return true;
                        k3 = k2;
                        k4 = g.aR;
                        if (bl2) break block7;
                        if (k3 == k4) return true;
                        k3 = k2;
                        if (bl2) break block8;
                        k4 = g.cD;
                    }
                    if (k3 == k4) return true;
                    k3 = k2;
                }
                if (!bl2) {
                    if (k3 == g.aZ) return true;
                    k3 = k2;
                }
                c10 = k3.y;
                c11 = net.minecraft.ac.c.Q;
                if (bl2) break block9;
                if (c10 == c11) return true;
                c10 = k2.y;
                if (bl2) break block10;
                c11 = net.minecraft.ac.c.u;
            }
            if (c10 == c11) return true;
            c10 = k2.y;
        }
        boolean bl4 = c10.n();
        if (bl2) return bl4;
        if (!bl4) return false;
        return true;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block78: {
            n n3;
            z z3;
            bz bz2;
            Object object;
            boolean bl2;
            int n4;
            int n5;
            block82: {
                block81: {
                    int n6;
                    block80: {
                        i i3;
                        block79: {
                            block72: {
                                block73: {
                                    block77: {
                                        block75: {
                                            n n7;
                                            z z4;
                                            block76: {
                                                c c10;
                                                c c11;
                                                block74: {
                                                    block44: {
                                                        block49: {
                                                            block69: {
                                                                int n8;
                                                                block70: {
                                                                    int n9;
                                                                    int n10;
                                                                    block71: {
                                                                        block67: {
                                                                            block68: {
                                                                                int n11;
                                                                                block65: {
                                                                                    block66: {
                                                                                        block64: {
                                                                                            c c12;
                                                                                            c c13;
                                                                                            block60: {
                                                                                                bz bz3;
                                                                                                block58: {
                                                                                                    block59: {
                                                                                                        int n12;
                                                                                                        block63: {
                                                                                                            block61: {
                                                                                                                block62: {
                                                                                                                    int n13;
                                                                                                                    block54: {
                                                                                                                        block55: {
                                                                                                                            int n14;
                                                                                                                            int n15;
                                                                                                                            block56: {
                                                                                                                                int n16;
                                                                                                                                block57: {
                                                                                                                                    int n17;
                                                                                                                                    block52: {
                                                                                                                                        block53: {
                                                                                                                                            int n18;
                                                                                                                                            block50: {
                                                                                                                                                block51: {
                                                                                                                                                    int n19;
                                                                                                                                                    block48: {
                                                                                                                                                        int n20;
                                                                                                                                                        block47: {
                                                                                                                                                            bz bz4;
                                                                                                                                                            block45: {
                                                                                                                                                                block46: {
                                                                                                                                                                    n5 = i2.b(z);
                                                                                                                                                                    n4 = 1;
                                                                                                                                                                    bl2 = cL.b();
                                                                                                                                                                    bz4 = this;
                                                                                                                                                                    if (bl2) break block45;
                                                                                                                                                                    if (bz4.y != net.minecraft.ac.c.g) break block46;
                                                                                                                                                                    n20 = z2.D.e() ? 1 : 0;
                                                                                                                                                                    if (bl2) break block47;
                                                                                                                                                                    if (n20 == 0) {
                                                                                                                                                                        n4 = 2;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                bz4 = this;
                                                                                                                                                            }
                                                                                                                                                            n20 = bz4.a(z2);
                                                                                                                                                        }
                                                                                                                                                        n8 = n20;
                                                                                                                                                        n19 = n5;
                                                                                                                                                        if (bl2) break block48;
                                                                                                                                                        if (n19 <= 0) break block49;
                                                                                                                                                        n19 = -100;
                                                                                                                                                    }
                                                                                                                                                    int n21 = n19;
                                                                                                                                                    this.A = 0;
                                                                                                                                                    for (aA aA2 : av.HORIZONTAL) {
                                                                                                                                                        n21 = this.a(z2, n2.a(aA2), n21);
                                                                                                                                                        if (!bl2) {
                                                                                                                                                            if (!bl2) continue;
                                                                                                                                                        }
                                                                                                                                                        break block44;
                                                                                                                                                    }
                                                                                                                                                    n18 = n10 = n21 + n4;
                                                                                                                                                    if (bl2) break block50;
                                                                                                                                                    if (n18 >= 8) break block51;
                                                                                                                                                    n17 = n21;
                                                                                                                                                    if (bl2) break block52;
                                                                                                                                                    if (n17 >= 0) break block53;
                                                                                                                                                }
                                                                                                                                                n18 = -1;
                                                                                                                                            }
                                                                                                                                            n10 = n18;
                                                                                                                                        }
                                                                                                                                        n17 = this.a(z2.d(n2.a()));
                                                                                                                                    }
                                                                                                                                    n13 = n16 = n17;
                                                                                                                                    if (bl2) break block54;
                                                                                                                                    if (n13 < 0) break block55;
                                                                                                                                    n15 = n16;
                                                                                                                                    n14 = 8;
                                                                                                                                    if (bl2) break block56;
                                                                                                                                    if (n15 < n14) break block57;
                                                                                                                                    n10 = n16;
                                                                                                                                    if (!bl2) break block55;
                                                                                                                                }
                                                                                                                                n15 = n16;
                                                                                                                                n14 = 8;
                                                                                                                            }
                                                                                                                            n10 = n15 + n14;
                                                                                                                        }
                                                                                                                        bz3 = this;
                                                                                                                        if (bl2) break block58;
                                                                                                                        n13 = bz3.A;
                                                                                                                    }
                                                                                                                    if (n13 < 2) break block59;
                                                                                                                    c13 = this.y;
                                                                                                                    c12 = net.minecraft.ac.c.L;
                                                                                                                    if (bl2) break block60;
                                                                                                                    if (c13 != c12) break block59;
                                                                                                                    object = z2.d(n2.k());
                                                                                                                    c13 = object.o();
                                                                                                                    if (bl2) break block61;
                                                                                                                    if (!c13.d()) break block62;
                                                                                                                    n10 = 0;
                                                                                                                    if (!bl2) break block59;
                                                                                                                }
                                                                                                                c13 = object.o();
                                                                                                            }
                                                                                                            c12 = this.y;
                                                                                                            if (bl2) break block60;
                                                                                                            if (c13 != c12) break block59;
                                                                                                            n12 = object.b(z);
                                                                                                            if (bl2) break block63;
                                                                                                            if (n12 != 0) break block59;
                                                                                                            n12 = 0;
                                                                                                        }
                                                                                                        n10 = n12;
                                                                                                    }
                                                                                                    bz3 = this;
                                                                                                }
                                                                                                c13 = bz3.y;
                                                                                                c12 = net.minecraft.ac.c.g;
                                                                                            }
                                                                                            if (c13 != c12) break block64;
                                                                                            n9 = n5;
                                                                                            n11 = 8;
                                                                                            if (bl2) break block65;
                                                                                            if (n9 >= n11) break block64;
                                                                                            n9 = n10;
                                                                                            n11 = 8;
                                                                                            if (bl2) break block65;
                                                                                            if (n9 >= n11) break block64;
                                                                                            n9 = n10;
                                                                                            n11 = n5;
                                                                                            if (bl2) break block65;
                                                                                            if (n9 <= n11) break block64;
                                                                                            n9 = random.nextInt(4);
                                                                                            if (bl2) break block66;
                                                                                            if (n9 != 0) {
                                                                                                n8 *= 4;
                                                                                            }
                                                                                        }
                                                                                        n9 = n10;
                                                                                    }
                                                                                    if (bl2) break block67;
                                                                                    n11 = n5;
                                                                                }
                                                                                if (n9 != n11) break block68;
                                                                                this.e(z2, n2, i2);
                                                                                if (!bl2) break block69;
                                                                            }
                                                                            n5 = n10;
                                                                            n9 = n10;
                                                                        }
                                                                        if (bl2) break block70;
                                                                        if (n9 >= 0) break block71;
                                                                        z2.v(n2);
                                                                        if (!bl2) break block69;
                                                                    }
                                                                    i2 = i2.a(z, n10);
                                                                    n9 = z2.a(n2, i2, 2) ? 1 : 0;
                                                                }
                                                                z2.a(n2, (K)this, n8);
                                                                z2.a(n2, (K)this, false);
                                                            }
                                                            if (!bl2) break block44;
                                                        }
                                                        this.e(z2, n2, i2);
                                                    }
                                                    i3 = z2.d(n2.k());
                                                    n6 = this.b(z2, n2.k(), i3);
                                                    if (bl2) break block72;
                                                    if (n6 == 0) break block73;
                                                    c11 = this.y;
                                                    c10 = net.minecraft.ac.c.g;
                                                    if (bl2) break block74;
                                                    if (c11 != c10) break block75;
                                                    z4 = z2;
                                                    n7 = n2.k();
                                                    if (bl2) break block76;
                                                    c11 = z4.d(n7).o();
                                                    c10 = net.minecraft.ac.c.L;
                                                }
                                                if (c11 != c10) break block75;
                                                z4 = z2;
                                                n7 = n2.k();
                                            }
                                            z4.a(n7, g.bx.d());
                                            this.a(z2, n2.k());
                                            return;
                                        }
                                        if (n5 < 8) break block77;
                                        this.b(z2, n2.k(), i3, n5);
                                        if (!bl2) break block78;
                                    }
                                    this.b(z2, n2.k(), i3, n5 + 8);
                                    if (!bl2) break block78;
                                }
                                n6 = n5;
                            }
                            if (bl2) break block79;
                            if (n6 < 0) break block78;
                            n6 = n5;
                        }
                        if (bl2) break block80;
                        if (n6 == 0) break block81;
                        bz2 = this;
                        z3 = z2;
                        n3 = n2.k();
                        if (bl2) break block82;
                        n6 = bz2.c(z3, n3, i3) ? 1 : 0;
                    }
                    if (n6 == 0) break block78;
                }
                bz2 = this;
                z3 = z2;
                n3 = n2;
            }
            Set<aA> set = bz2.a(z3, n3);
            int n22 = n5 + n4;
            int n23 = n5;
            int n24 = 8;
            if (!bl2) {
                if (n23 >= n24) {
                    n22 = 1;
                }
                n23 = n22;
                n24 = 8;
            }
            if (n23 >= n24) {
                return;
            }
            object = set.iterator();
            while (object.hasNext()) {
                aA aA3 = (aA)object.next();
                this.b(z2, n2.a(aA3), z2.d(n2.a(aA3)), n22);
                if (!bl2) continue;
            }
        }
    }

    private void b(z z2, n n2, i i2, int n3) {
        block2: {
            block4: {
                K k2;
                block5: {
                    block6: {
                        c c10;
                        c c11;
                        boolean bl2;
                        block3: {
                            bl2 = cL.e();
                            if (!this.b(z2, n2, i2)) break block2;
                            c11 = i2.o();
                            c10 = net.minecraft.ac.c.A;
                            if (!bl2) break block3;
                            if (c11 == c10) break block4;
                            k2 = this;
                            if (!bl2) break block5;
                            c11 = ((bz)k2).y;
                            c10 = net.minecraft.ac.c.g;
                        }
                        if (c11 != c10) break block6;
                        this.a(z2, n2);
                        if (bl2) break block4;
                    }
                    k2 = i2.b();
                }
                k2.a(z2, n2, i2, 0);
            }
            z2.a(n2, this.d().a(z, n3), 3);
        }
    }

    @Override
    public void b(z z2, n n2, i i2) {
        block0: {
            if (this.a(z2, n2, i2)) break block0;
            z2.a(n2, (K)this, this.a(z2));
        }
    }

    private Set<aA> a(z z2, n n2) {
        int n3 = 1000;
        EnumSet<aA> enumSet = EnumSet.noneOf(aA.class);
        Iterator<aA> iterator = av.HORIZONTAL.iterator();
        boolean bl2 = cL.b();
        while (iterator.hasNext()) {
            block9: {
                int n4;
                int n5;
                int n6;
                aA aA2;
                block16: {
                    block15: {
                        int n7;
                        block13: {
                            block14: {
                                n n8;
                                block12: {
                                    block11: {
                                        i i2;
                                        block10: {
                                            i i3;
                                            aA2 = iterator.next();
                                            n8 = n2.a(aA2);
                                            if (this.c(z2, n8, i3 = z2.d(n8))) break block9;
                                            i2 = i3;
                                            if (bl2) break block10;
                                            if (i2.o() != this.y) break block11;
                                            i2 = i3;
                                        }
                                        n7 = i2.b(z);
                                        if (bl2) break block12;
                                        if (n7 <= 0) break block9;
                                    }
                                    n7 = this.c(z2, n8.k(), z2.d(n8.k())) ? 1 : 0;
                                }
                                if (bl2) break block13;
                                if (n7 == 0) break block14;
                                n6 = this.a(z2, n8, 1, aA2.h());
                                if (!bl2) break block15;
                            }
                            n7 = 0;
                        }
                        n6 = n7;
                    }
                    n5 = n6;
                    n4 = n3;
                    if (bl2) break block16;
                    if (n5 < n4) {
                        enumSet.clear();
                    }
                    n5 = n6;
                    if (bl2) break block9;
                    n4 = n3;
                }
                if (n5 <= n4) {
                    enumSet.add(aA2);
                    n5 = n3 = n6;
                }
            }
            if (!bl2) continue;
        }
        return enumSet;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected int a(z z2, n n2, int n3) {
        int n4;
        int n5;
        block11: {
            boolean bl2;
            block10: {
                n5 = this.a(z2.d(n2));
                bl2 = cL.e();
                n4 = n5;
                if (bl2) {
                    if (n4 < 0) {
                        return n3;
                    }
                    n4 = n5;
                }
                if (bl2) {
                    if (n4 == 0) {
                        ++this.A;
                    }
                    n4 = n5;
                }
                if (bl2) {
                    if (n4 >= 8) {
                        n5 = 0;
                    }
                    n4 = n3;
                }
                if (!bl2) break block10;
                if (n4 < 0) break block11;
                n4 = n5;
            }
            if (!bl2) return n4;
            if (n4 >= n3) {
                n4 = n3;
                return n4;
            }
        }
        n4 = n5;
        return n4;
    }

    private void e(z z2, n n2, i i2) {
        z2.a(n2, bz.a(this.y).d().a(z, i2.b(z)), 2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int b(z z2) {
        boolean bl2 = cL.b();
        if (this.y != net.minecraft.ac.c.g) return 4;
        int n2 = z2.D.e() ? 1 : 0;
        if (bl2) return n2;
        if (n2 != 0) return 4;
        return 2;
    }

    protected bz(c c10) {
        super(c10);
    }
}

