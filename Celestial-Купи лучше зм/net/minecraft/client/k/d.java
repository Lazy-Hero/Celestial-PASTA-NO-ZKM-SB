/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.util.Iterator;
import java.util.Set;
import net.minecraft.ar.aA;
import net.minecraft.client.k.s;

public class d {
    private static final /* synthetic */ int b;
    private /* synthetic */ long a;

    private void c(int n2) {
        this.a |= (long)(1 << n2);
    }

    private void a(int n2, boolean bl2) {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    arrn = s.r();
                    if (arrn == null) break block0;
                    if (!bl2) break block1;
                    this.c(n2);
                }
                if (arrn != null) break block2;
            }
            this.b(n2);
        }
    }

    private boolean a(int n2) {
        int[] arrn = s.r();
        long l2 = (this.a & (long)(1 << n2)) - 0L;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (arrn != null) {
            l3 = l3 != false ? (long)1 : (long)0;
        }
        return (boolean)l3;
    }

    public void a(aA aA2, aA aA3, boolean bl2) {
        this.a(aA2.ordinal() + aA3.ordinal() * b, bl2);
        this.a(aA3.ordinal() + aA2.ordinal() * b, bl2);
    }

    static {
        b = aA.values().length;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(Set<aA> set) {
        Iterator<aA> iterator = set.iterator();
        int[] arrn = s.r();
        block0: while (iterator.hasNext()) {
            aA aA2 = iterator.next();
            for (aA aA3 : set) {
                this.a(aA2, aA3, true);
                if (arrn == null) continue block0;
                if (arrn != null) continue;
            }
            if (arrn != null) continue;
        }
    }

    private void b(int n2) {
        this.a &= (long)(~(1 << n2));
    }

    public boolean a(aA aA2, aA aA3) {
        return this.a(aA2.ordinal() + aA3.ordinal() * b);
    }

    public void a(boolean bl2) {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    arrn = s.r();
                    if (arrn == null) break block0;
                    if (!bl2) break block1;
                    this.a = -1L;
                }
                if (arrn != null) break block2;
            }
            this.a = 0L;
        }
    }

    public String toString() {
        StringBuilder stringBuilder;
        block11: {
            aA aA2;
            int n2;
            int n3;
            int[] arrn;
            aA[] arraA;
            StringBuilder stringBuilder2;
            block10: {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(' ');
                arraA = aA.values();
                arrn = s.r();
                n3 = arraA.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    aA2 = arraA[n2];
                    stringBuilder2.append(' ').append(aA2.toString().toUpperCase().charAt(0));
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block10;
                }
                stringBuilder2.append('\n');
                arraA = aA.values();
                n3 = arraA.length;
            }
            for (n2 = 0; n2 < n3; ++n2) {
                aA aA3 = arraA[n2];
                block2: while (true) {
                    aA2 = aA3;
                    stringBuilder = stringBuilder2.append(aA2.toString().toUpperCase().charAt(0));
                    if (arrn == null) break block11;
                    for (aA aA4 : aA.values()) {
                        block13: {
                            block12: {
                                if (arrn == null) break block12;
                                aA3 = aA2;
                                if (arrn == null) continue block2;
                                if (aA3 != aA4) break block13;
                                stringBuilder2.append("  ");
                            }
                            if (arrn != null) continue;
                        }
                        int n4 = this.a(aA2, aA4);
                        StringBuilder stringBuilder3 = stringBuilder2.append(' ');
                        int n5 = n4;
                        if (arrn != null) {
                            n5 = n5 != 0 ? 89 : 110;
                        }
                        stringBuilder3.append((char)n5);
                        if (arrn != null) continue;
                    }
                    break;
                }
                stringBuilder2.append('\n');
                if (arrn != null) continue;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }
}

