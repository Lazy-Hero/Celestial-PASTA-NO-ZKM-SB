/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.A.C;
import net.minecraft.A.h;
import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class i
extends d {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(int n2, int n3) {
        m[] arrm = d.b();
        int n4 = i.a(n2, n3);
        if (arrm != null) {
            if (n4 != 0) {
                return true;
            }
            n4 = n2;
        }
        h h2 = h.b(n4);
        h h3 = h.b(n3);
        h h4 = h2;
        if (arrm != null) {
            if (h4 == null) return false;
            h4 = h3;
        }
        if (arrm != null) {
            if (h4 == null) return false;
            h4 = h2;
        }
        C c10 = h4.b();
        C c11 = h3.b();
        C c13 = c10;
        c13 = c11;
        if (arrm != null) {
            if (c12 == c13) return true;
            C c13 = c10;
            c13 = C.MEDIUM;
        }
        if (arrm != null) {
            if (c12 == c13) return true;
            C c13 = c11;
            c13 = C.MEDIUM;
        }
        if (c12 != c13) return false;
        return true;
    }

    private boolean a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7) {
        block6: {
            block3: {
                boolean bl2;
                m[] arrm;
                block5: {
                    int n8;
                    block4: {
                        int n9;
                        block2: {
                            arrm = d.b();
                            int n10 = i.a(n5, n6);
                            if (arrm != null) {
                                if (n10 == 0) {
                                    return false;
                                }
                                n10 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
                            }
                            int n11 = n10;
                            int n12 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
                            n9 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
                            n8 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
                            bl2 = this.b(n11, n6);
                            if (arrm == null) break block2;
                            if (!bl2) break block3;
                            bl2 = this.b(n12, n6);
                        }
                        if (arrm == null) break block4;
                        if (!bl2) break block3;
                        bl2 = this.b(n9, n6);
                    }
                    if (arrm == null) break block5;
                    if (!bl2) break block3;
                    bl2 = this.b(n8, n6);
                }
                if (!bl2) break block3;
                arrn2[n2 + n3 * n4] = n5;
                if (arrm != null) break block6;
            }
            arrn2[n2 + n3 * n4] = n7;
        }
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public i(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.f.a(n2 - 1, n3 - 1, n4 + 2, n5 + 2);
        int[] arrn2 = b.a(n4 * n5);
        int n6 = 0;
        m[] arrm = d.b();
        block0: while (true) {
            int n7 = n6;
            block1: while (n7 < n5) {
                int n8 = 0;
                while (n8 < n4) {
                    block9: {
                        block10: {
                            int n9;
                            block22: {
                                block40: {
                                    block24: {
                                        block37: {
                                            int n10;
                                            int n11;
                                            block39: {
                                                int n12;
                                                block38: {
                                                    int n13;
                                                    block36: {
                                                        int n14;
                                                        block35: {
                                                            int n15;
                                                            block34: {
                                                                block33: {
                                                                    block32: {
                                                                        block31: {
                                                                            block30: {
                                                                                block29: {
                                                                                    block28: {
                                                                                        block27: {
                                                                                            block26: {
                                                                                                block25: {
                                                                                                    block23: {
                                                                                                        int n16;
                                                                                                        block21: {
                                                                                                            int n17;
                                                                                                            block14: {
                                                                                                                block15: {
                                                                                                                    block20: {
                                                                                                                        block17: {
                                                                                                                            int n18;
                                                                                                                            int n19;
                                                                                                                            block19: {
                                                                                                                                block18: {
                                                                                                                                    block16: {
                                                                                                                                        block13: {
                                                                                                                                            block12: {
                                                                                                                                                block11: {
                                                                                                                                                    this.a((long)(n8 + n2), (long)(n6 + n3));
                                                                                                                                                    n9 = arrn[n8 + 1 + (n6 + 1) * (n4 + 2)];
                                                                                                                                                    if (arrm == null) break block9;
                                                                                                                                                    n7 = this.a(arrn, arrn2, n8, n6, n4, n9, h.b(net.minecraft.u.d.W), h.b(net.minecraft.u.d.F)) ? 1 : 0;
                                                                                                                                                    if (arrm == null) continue block1;
                                                                                                                                                    if (n7 != 0) break block10;
                                                                                                                                                    n16 = this.b(arrn, arrn2, n8, n6, n4, n9, h.b(net.minecraft.u.d.t), h.b(net.minecraft.u.d.C));
                                                                                                                                                    if (arrm == null) break block11;
                                                                                                                                                    if (n16 != 0) break block10;
                                                                                                                                                    n16 = this.b(arrn, arrn2, n8, n6, n4, n9, h.b(net.minecraft.u.d.b), h.b(net.minecraft.u.d.C)) ? 1 : 0;
                                                                                                                                                }
                                                                                                                                                if (arrm == null) break block12;
                                                                                                                                                if (n16 != 0) break block10;
                                                                                                                                                n16 = this.b(arrn, arrn2, n8, n6, n4, n9, h.b(net.minecraft.u.d.B), h.b(net.minecraft.u.d.Z)) ? 1 : 0;
                                                                                                                                            }
                                                                                                                                            if (arrm == null) break block13;
                                                                                                                                            if (n16 != 0) break block10;
                                                                                                                                            n16 = n9;
                                                                                                                                        }
                                                                                                                                        n17 = h.b(net.minecraft.u.d.ab);
                                                                                                                                        if (arrm == null) break block14;
                                                                                                                                        if (n16 != n17) break block15;
                                                                                                                                        n15 = arrn[n8 + 1 + (n6 + 1 - 1) * (n4 + 2)];
                                                                                                                                        n13 = arrn[n8 + 1 + 1 + (n6 + 1) * (n4 + 2)];
                                                                                                                                        n12 = arrn[n8 + 1 - 1 + (n6 + 1) * (n4 + 2)];
                                                                                                                                        n14 = arrn[n8 + 1 + (n6 + 1 + 1) * (n4 + 2)];
                                                                                                                                        n19 = n15;
                                                                                                                                        n18 = h.b(net.minecraft.u.d.S);
                                                                                                                                        if (arrm == null) break block16;
                                                                                                                                        if (n19 == n18) break block17;
                                                                                                                                        n19 = n13;
                                                                                                                                        n18 = h.b(net.minecraft.u.d.S);
                                                                                                                                    }
                                                                                                                                    if (arrm == null) break block18;
                                                                                                                                    if (n19 == n18) break block17;
                                                                                                                                    n19 = n12;
                                                                                                                                    n18 = h.b(net.minecraft.u.d.S);
                                                                                                                                }
                                                                                                                                if (arrm == null) break block19;
                                                                                                                                if (n19 == n18) break block17;
                                                                                                                                n19 = n14;
                                                                                                                                n18 = h.b(net.minecraft.u.d.S);
                                                                                                                            }
                                                                                                                            if (n19 == n18) break block17;
                                                                                                                            arrn2[n8 + n6 * n4] = n9;
                                                                                                                            if (arrm != null) break block20;
                                                                                                                        }
                                                                                                                        arrn2[n8 + n6 * n4] = h.b(net.minecraft.u.d.U);
                                                                                                                    }
                                                                                                                    if (arrm != null) break block10;
                                                                                                                }
                                                                                                                n16 = n9;
                                                                                                                if (arrm == null) break block21;
                                                                                                                n17 = h.b(net.minecraft.u.d.n);
                                                                                                            }
                                                                                                            if (n16 != n17) break block22;
                                                                                                            n16 = arrn[n8 + 1 + (n6 + 1 - 1) * (n4 + 2)];
                                                                                                        }
                                                                                                        n15 = n16;
                                                                                                        n13 = arrn[n8 + 1 + 1 + (n6 + 1) * (n4 + 2)];
                                                                                                        n12 = arrn[n8 + 1 - 1 + (n6 + 1) * (n4 + 2)];
                                                                                                        n14 = arrn[n8 + 1 + (n6 + 1 + 1) * (n4 + 2)];
                                                                                                        n11 = n15;
                                                                                                        n10 = h.b(net.minecraft.u.d.ab);
                                                                                                        if (arrm == null) break block23;
                                                                                                        if (n11 == n10) break block24;
                                                                                                        n11 = n13;
                                                                                                        n10 = h.b(net.minecraft.u.d.ab);
                                                                                                    }
                                                                                                    if (arrm == null) break block25;
                                                                                                    if (n11 == n10) break block24;
                                                                                                    n11 = n12;
                                                                                                    n10 = h.b(net.minecraft.u.d.ab);
                                                                                                }
                                                                                                if (arrm == null) break block26;
                                                                                                if (n11 == n10) break block24;
                                                                                                n11 = n14;
                                                                                                n10 = h.b(net.minecraft.u.d.ab);
                                                                                            }
                                                                                            if (arrm == null) break block27;
                                                                                            if (n11 == n10) break block24;
                                                                                            n11 = n15;
                                                                                            n10 = h.b(net.minecraft.u.d.aa);
                                                                                        }
                                                                                        if (arrm == null) break block28;
                                                                                        if (n11 == n10) break block24;
                                                                                        n11 = n13;
                                                                                        n10 = h.b(net.minecraft.u.d.aa);
                                                                                    }
                                                                                    if (arrm == null) break block29;
                                                                                    if (n11 == n10) break block24;
                                                                                    n11 = n12;
                                                                                    n10 = h.b(net.minecraft.u.d.aa);
                                                                                }
                                                                                if (arrm == null) break block30;
                                                                                if (n11 == n10) break block24;
                                                                                n11 = n14;
                                                                                n10 = h.b(net.minecraft.u.d.aa);
                                                                            }
                                                                            if (arrm == null) break block31;
                                                                            if (n11 == n10) break block24;
                                                                            n11 = n15;
                                                                            n10 = h.b(net.minecraft.u.d.S);
                                                                        }
                                                                        if (arrm == null) break block32;
                                                                        if (n11 == n10) break block24;
                                                                        n11 = n13;
                                                                        n10 = h.b(net.minecraft.u.d.S);
                                                                    }
                                                                    if (arrm == null) break block33;
                                                                    if (n11 == n10) break block24;
                                                                    n11 = n12;
                                                                    n10 = h.b(net.minecraft.u.d.S);
                                                                }
                                                                if (arrm == null) break block34;
                                                                if (n11 == n10) break block24;
                                                                n11 = n14;
                                                                n10 = h.b(net.minecraft.u.d.S);
                                                            }
                                                            if (arrm == null) break block35;
                                                            if (n11 == n10) break block24;
                                                            n11 = n15;
                                                            n10 = h.b(net.minecraft.u.d.l);
                                                        }
                                                        if (arrm == null) break block36;
                                                        if (n11 == n10) break block37;
                                                        n11 = n14;
                                                        n10 = h.b(net.minecraft.u.d.l);
                                                    }
                                                    if (arrm == null) break block38;
                                                    if (n11 == n10) break block37;
                                                    n11 = n13;
                                                    n10 = h.b(net.minecraft.u.d.l);
                                                }
                                                if (arrm == null) break block39;
                                                if (n11 == n10) break block37;
                                                n11 = n12;
                                                n10 = h.b(net.minecraft.u.d.l);
                                            }
                                            if (n11 == n10) break block37;
                                            arrn2[n8 + n6 * n4] = n9;
                                            if (arrm != null) break block40;
                                        }
                                        arrn2[n8 + n6 * n4] = h.b(net.minecraft.u.d.j);
                                        if (arrm != null) break block40;
                                    }
                                    arrn2[n8 + n6 * n4] = h.b(net.minecraft.u.d.s);
                                }
                                if (arrm != null) break block10;
                            }
                            arrn2[n8 + n6 * n4] = n9;
                        }
                        ++n8;
                    }
                    if (arrm != null) continue;
                }
                ++n6;
                if (arrm != null) continue block0;
            }
            break;
        }
        return arrn2;
    }

    private boolean b(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7) {
        block6: {
            block3: {
                boolean bl2;
                m[] arrm;
                block5: {
                    int n8;
                    block4: {
                        int n9;
                        block2: {
                            arrm = d.b();
                            int n10 = n5;
                            if (arrm != null) {
                                if (n10 != n6) {
                                    return false;
                                }
                                n10 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
                            }
                            int n11 = n10;
                            int n12 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
                            n9 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
                            n8 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
                            bl2 = i.a(n11, n6);
                            if (arrm == null) break block2;
                            if (!bl2) break block3;
                            bl2 = i.a(n12, n6);
                        }
                        if (arrm == null) break block4;
                        if (!bl2) break block3;
                        bl2 = i.a(n9, n6);
                    }
                    if (arrm == null) break block5;
                    if (!bl2) break block3;
                    bl2 = i.a(n8, n6);
                }
                if (!bl2) break block3;
                arrn2[n2 + n3 * n4] = n5;
                if (arrm != null) break block6;
            }
            arrn2[n2 + n3 * n4] = n7;
        }
        return true;
    }
}

