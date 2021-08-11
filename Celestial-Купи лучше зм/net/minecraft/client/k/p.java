/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.Set;
import net.minecraft.ar.F;
import net.minecraft.ar.aA;
import net.minecraft.client.k.d;
import net.minecraft.client.k.r;
import net.minecraft.client.k.s;
import net.minecraft.k.n;

public class p {
    private static final /* synthetic */ int b;
    private final /* synthetic */ BitSet e;
    private /* synthetic */ int c;
    private static final /* synthetic */ int a;
    private static final /* synthetic */ int f;
    private static final /* synthetic */ int[] d;

    private void a(int n2, Set<aA> set) {
        block22: {
            int n3;
            int[] arrn;
            block20: {
                int n4;
                block21: {
                    int n5;
                    int n6;
                    block19: {
                        block18: {
                            block16: {
                                int n7;
                                block17: {
                                    int n8;
                                    int n9;
                                    block15: {
                                        block14: {
                                            block12: {
                                                int n10;
                                                block13: {
                                                    n10 = n2 >> 0 & 0xF;
                                                    arrn = s.r();
                                                    n9 = n10;
                                                    if (arrn == null) break block12;
                                                    if (n9 != 0) break block13;
                                                    set.add(aA.WEST);
                                                    if (arrn != null) break block14;
                                                }
                                                n9 = n10;
                                            }
                                            n8 = 15;
                                            if (arrn == null) break block15;
                                            if (n9 == n8) {
                                                set.add(aA.EAST);
                                            }
                                        }
                                        n9 = n2 >> 8;
                                        n8 = 15;
                                    }
                                    n6 = n7 = n9 & n8;
                                    if (arrn == null) break block16;
                                    if (n6 != 0) break block17;
                                    set.add(aA.DOWN);
                                    if (arrn != null) break block18;
                                }
                                n6 = n7;
                            }
                            n5 = 15;
                            if (arrn == null) break block19;
                            if (n6 == n5) {
                                set.add(aA.UP);
                            }
                        }
                        n6 = n2 >> 4;
                        n5 = 15;
                    }
                    n3 = n4 = n6 & n5;
                    if (arrn == null) break block20;
                    if (n3 != 0) break block21;
                    set.add(aA.NORTH);
                    if (arrn != null) break block22;
                }
                n3 = n4;
            }
            if (arrn != null && n3 == 15) {
                n3 = set.add(aA.SOUTH) ? 1 : 0;
            }
        }
    }

    static {
        a = (int)Math.pow(16.0, 0.0);
        f = (int)Math.pow(16.0, 1.0);
        b = (int)Math.pow(16.0, 2.0);
        d = new int[1352];
        boolean bl2 = false;
        int n2 = 15;
        int n3 = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    if (i2 != 0 && i2 != 15 && i3 != 0 && i3 != 15 && i4 != 0 && i4 != 15) continue;
                    p.d[n3++] = p.a(i2, i3, i4);
                }
            }
        }
    }

    private int a(int n2, aA aA2) {
        int[] arrn = s.r();
        int n3 = r.a[aA2.ordinal()];
        if (arrn != null) {
            switch (n3) {
                case 1: {
                    int n4 = n2 >> 8 & 0xF;
                    if (arrn != null) {
                        if (n4 == 0) {
                            return -1;
                        }
                        n4 = n2 - b;
                    }
                    return n4;
                }
                case 2: {
                    int n5 = n2 >> 8 & 0xF;
                    int n6 = 15;
                    if (arrn != null) {
                        if (n5 == n6) {
                            return -1;
                        }
                        n5 = n2;
                        n6 = b;
                    }
                    return n5 + n6;
                }
                case 3: {
                    int n7 = n2 >> 4 & 0xF;
                    if (arrn != null) {
                        if (n7 == 0) {
                            return -1;
                        }
                        n7 = n2 - f;
                    }
                    return n7;
                }
                case 4: {
                    int n8 = n2 >> 4 & 0xF;
                    int n9 = 15;
                    if (arrn != null) {
                        if (n8 == n9) {
                            return -1;
                        }
                        n8 = n2;
                        n9 = f;
                    }
                    return n8 + n9;
                }
                case 5: {
                    int n10 = n2 >> 0 & 0xF;
                    if (arrn != null) {
                        if (n10 == 0) {
                            return -1;
                        }
                        n10 = n2 - a;
                    }
                    return n10;
                }
                case 6: {
                    int n11 = n2 >> 0 & 0xF;
                    int n12 = 15;
                    if (arrn != null) {
                        if (n11 == n12) {
                            return -1;
                        }
                        n11 = n2;
                        n12 = a;
                    }
                    return n11 + n12;
                }
            }
            n3 = -1;
        }
        return n3;
    }

    public d a() {
        d d10;
        block8: {
            int[] arrn;
            block9: {
                int n2;
                block6: {
                    block7: {
                        d10 = new d();
                        arrn = s.r();
                        n2 = 4096 - this.c;
                        if (arrn == null) break block6;
                        if (n2 >= 256) break block7;
                        d10.a(true);
                        if (arrn != null) break block8;
                    }
                    n2 = this.c;
                }
                if (n2 != 0) break block9;
                d10.a(false);
                if (arrn != null) break block8;
            }
            int[] arrn2 = d;
            int n3 = arrn2.length;
            int n4 = 0;
            while (n4 < n3) {
                int n5 = arrn2[n4];
                if (arrn != null) {
                    if (!this.e.get(n5)) {
                        d10.a(this.a(n5));
                    }
                    ++n4;
                }
                if (arrn != null) continue;
            }
        }
        return d10;
    }

    private static int a(int n2, int n3, int n4) {
        return n2 << 0 | n3 << 8 | n4 << 4;
    }

    public void c(n n2) {
        this.e.set(p.a(n2), true);
        --this.c;
    }

    public p() {
        this.e = new BitSet(4096);
        this.c = 4096;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static int a(n n2) {
        return p.a(n2.e() & 0xF, n2.b() & 0xF, n2.a() & 0xF);
    }

    public Set<aA> b(n n2) {
        return this.a(p.a(n2));
    }

    private Set<aA> a(int n2) {
        EnumSet<aA> enumSet = EnumSet.noneOf(aA.class);
        int[] arrn = s.r();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>(384);
        arrayDeque.add(F.a(n2));
        this.e.set(n2, true);
        block0: while (true) {
            int n3 = arrayDeque.isEmpty();
            block1: while (n3 == 0) {
                int n4 = (Integer)arrayDeque.poll();
                this.a(n4, enumSet);
                aA[] arraA = aA.VALUES;
                int n5 = arraA.length;
                int n6 = 0;
                while (n6 < n5) {
                    aA aA2 = arraA[n6];
                    int n7 = this.a(n4, aA2);
                    if (arrn != null) {
                        n3 = n7;
                        if (arrn == null) continue block1;
                        if (n3 >= 0) {
                            boolean bl2 = this.e.get(n7);
                            if (arrn != null && !bl2) {
                                this.e.set(n7, true);
                                bl2 = arrayDeque.add(F.a(n7));
                            }
                        }
                        ++n6;
                    }
                    if (arrn != null) continue;
                }
                if (arrn != null) continue block0;
            }
            break;
        }
        return enumSet;
    }
}

