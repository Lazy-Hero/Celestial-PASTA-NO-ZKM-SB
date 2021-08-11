/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.N.y;
import net.minecraft.P.a;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.Z.i;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class W
extends K {
    @Override
    public String a() {
        return "fill";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block75: {
            block44: {
                m[] arrm;
                block40: {
                    Object object;
                    r r2;
                    int n2;
                    net.minecraft.ah.z z2;
                    int n3;
                    n n4;
                    n n5;
                    i i2;
                    net.minecraft.W.K k2;
                    block46: {
                        int n6;
                        block45: {
                            int n7;
                            block43: {
                                n n8;
                                n n9;
                                block42: {
                                    block41: {
                                        arrm = s.b();
                                        if (arrm != null) {
                                            if (arrstring.length < 7) {
                                                throw new z("commands.fill.usage", new Object[0]);
                                            }
                                            j2.a(d.AFFECTED_BLOCKS, 0);
                                        }
                                        n9 = W.b(j2, arrstring, 0, false);
                                        n8 = W.b(j2, arrstring, 3, false);
                                        k2 = K.b(j2, arrstring[6]);
                                        if (arrstring.length < 8) break block41;
                                        i2 = W.b(k2, arrstring[7]);
                                        if (arrm != null) break block42;
                                    }
                                    i2 = k2.d();
                                }
                                n5 = new n(Math.min(n9.e(), n8.e()), Math.min(n9.b(), n8.b()), Math.min(n9.a(), n8.a()));
                                n4 = new n(Math.max(n9.e(), n8.e()), Math.max(n9.b(), n8.b()), Math.max(n9.a(), n8.a()));
                                n7 = n3 = (n4.e() - n5.e() + 1) * (n4.b() - n5.b() + 1) * (n4.a() - n5.a() + 1);
                                if (arrm != null) {
                                    if (n7 > 32768) {
                                        throw new s("commands.fill.tooManyBlocks", n3, 32768);
                                    }
                                    n7 = n5.b();
                                }
                                if (arrm == null) break block43;
                                if (n7 < 0) break block44;
                                n7 = n4.b();
                            }
                            if (n7 >= 256) break block44;
                            z2 = j2.b();
                            int n10 = n5.a();
                            block2: while (true) {
                                int n8 = n10;
                                block3: while (n8 <= n4.a()) {
                                    for (n2 = n5.e(); n2 <= n4.e(); n2 += 16) {
                                        n8 = z2.n(new n(n2, n4.b() - n5.b(), n10)) ? 1 : 0;
                                        if (arrm == null) continue block3;
                                        if (n8 != 0) continue;
                                        throw new s("commands.fill.outOfWorld", new Object[0]);
                                    }
                                    n10 += 16;
                                    if (arrm != null) continue block2;
                                }
                                break;
                            }
                            r2 = new r();
                            n2 = 0;
                            n6 = arrstring.length;
                            if (arrm == null) break block45;
                            if (n6 < 10) break block46;
                            n6 = k2.e() ? 1 : 0;
                        }
                        if (n6 != 0) {
                            object = W.a(arrstring, 9);
                            try {
                                r2 = net.minecraft.P.d.c((String)object);
                                n2 = 1;
                            }
                            catch (a a10) {
                                throw new s("commands.fill.tagError", a10.getMessage());
                            }
                        }
                    }
                    object = Lists.newArrayList();
                    n3 = 0;
                    int n12 = n5.a();
                    block5: while (true) {
                        int n9 = n12;
                        block6: while (n9 <= n4.a()) {
                            int n14 = n5.b();
                            block7: while (true) {
                                int n11 = n14;
                                n11 = n4.b();
                                block8: while (n10 <= n11) {
                                    n9 = n5.e();
                                    if (arrm == null) continue block6;
                                    int n17 = n9;
                                    while (n17 <= n4.e()) {
                                        block59: {
                                            block56: {
                                                int n13;
                                                n n19;
                                                block74: {
                                                    block73: {
                                                        block72: {
                                                            y y2;
                                                            Object object2;
                                                            block71: {
                                                                n n15;
                                                                net.minecraft.ah.z z3;
                                                                block55: {
                                                                    block48: {
                                                                        block70: {
                                                                            int n16;
                                                                            block69: {
                                                                                int n18;
                                                                                block68: {
                                                                                    block67: {
                                                                                        block66: {
                                                                                            block65: {
                                                                                                block64: {
                                                                                                    block49: {
                                                                                                        block50: {
                                                                                                            block61: {
                                                                                                                int n20;
                                                                                                                block63: {
                                                                                                                    block62: {
                                                                                                                        block60: {
                                                                                                                            int n21;
                                                                                                                            block58: {
                                                                                                                                block57: {
                                                                                                                                    block53: {
                                                                                                                                        block54: {
                                                                                                                                            block51: {
                                                                                                                                                block52: {
                                                                                                                                                    block47: {
                                                                                                                                                        n19 = new n(n17, n14, n12);
                                                                                                                                                        n16 = arrstring.length;
                                                                                                                                                        if (arrm == null) break block47;
                                                                                                                                                        n11 = 9;
                                                                                                                                                        if (arrm == null) continue block8;
                                                                                                                                                        if (n16 < n11) break block48;
                                                                                                                                                        n16 = "outline".equals(arrstring[8]) ? 1 : 0;
                                                                                                                                                    }
                                                                                                                                                    if (arrm == null) break block49;
                                                                                                                                                    if (n16 != 0) break block50;
                                                                                                                                                    n16 = "hollow".equals(arrstring[8]) ? 1 : 0;
                                                                                                                                                    if (arrm == null) break block49;
                                                                                                                                                    if (n16 != 0) break block50;
                                                                                                                                                    n21 = "destroy".equals(arrstring[8]);
                                                                                                                                                    if (arrm == null) break block51;
                                                                                                                                                    if (n21 == 0) break block52;
                                                                                                                                                    z2.a(n19, true);
                                                                                                                                                    if (arrm != null) break block48;
                                                                                                                                                }
                                                                                                                                                n21 = "keep".equals(arrstring[8]);
                                                                                                                                            }
                                                                                                                                            if (arrm == null) break block53;
                                                                                                                                            if (n21 == 0) break block54;
                                                                                                                                            z3 = z2;
                                                                                                                                            n15 = n19;
                                                                                                                                            if (arrm == null) break block55;
                                                                                                                                            if (z3.a(n15)) break block48;
                                                                                                                                            if (arrm != null) break block56;
                                                                                                                                        }
                                                                                                                                        n21 = "replace".equals(arrstring[8]);
                                                                                                                                    }
                                                                                                                                    if (arrm == null) break block57;
                                                                                                                                    if (n21 == 0) break block48;
                                                                                                                                    n21 = k2.e();
                                                                                                                                }
                                                                                                                                if (arrm == null) break block58;
                                                                                                                                if (n21 != 0) break block48;
                                                                                                                                n21 = arrstring.length;
                                                                                                                            }
                                                                                                                            if (n21 <= 9) break block48;
                                                                                                                            object2 = K.b(j2, arrstring[9]);
                                                                                                                            if (arrm == null) break block59;
                                                                                                                            if (z2.d(n19).b() != object2) break block56;
                                                                                                                            n20 = arrstring.length;
                                                                                                                            if (arrm == null) break block60;
                                                                                                                            if (n20 <= 10) break block61;
                                                                                                                            n20 = "-1".equals(arrstring[10]) ? 1 : 0;
                                                                                                                        }
                                                                                                                        if (arrm == null) break block62;
                                                                                                                        if (n20 != 0) break block61;
                                                                                                                        n20 = "*".equals(arrstring[10]) ? 1 : 0;
                                                                                                                    }
                                                                                                                    if (arrm == null) break block63;
                                                                                                                    if (n20 != 0) break block61;
                                                                                                                    n20 = K.a((net.minecraft.W.K)object2, arrstring[10]).apply((Object)z2.d(n19)) ? 1 : 0;
                                                                                                                }
                                                                                                                if (n20 == 0 && arrm != null) break block56;
                                                                                                            }
                                                                                                            if (arrm != null) break block48;
                                                                                                        }
                                                                                                        n16 = n17;
                                                                                                    }
                                                                                                    n18 = n5.e();
                                                                                                    if (arrm == null) break block64;
                                                                                                    if (n16 == n18) break block48;
                                                                                                    int n18 = n17;
                                                                                                    n18 = n4.e();
                                                                                                }
                                                                                                if (arrm == null) break block65;
                                                                                                if (n16 == n18) break block48;
                                                                                                int n18 = n14;
                                                                                                n18 = n5.b();
                                                                                            }
                                                                                            if (arrm == null) break block66;
                                                                                            if (n16 == n18) break block48;
                                                                                            int n18 = n14;
                                                                                            n18 = n4.b();
                                                                                        }
                                                                                        if (arrm == null) break block67;
                                                                                        if (n16 == n18) break block48;
                                                                                        int n18 = n12;
                                                                                        n18 = n5.a();
                                                                                    }
                                                                                    if (arrm == null) break block68;
                                                                                    if (n16 == n18) break block48;
                                                                                    n16 = n12;
                                                                                    if (arrm == null) break block69;
                                                                                    n18 = n4.a();
                                                                                }
                                                                                if (n16 == n18) break block48;
                                                                                n16 = "hollow".equals(arrstring[8]) ? 1 : 0;
                                                                            }
                                                                            if (arrm == null) break block70;
                                                                            if (n16 == 0) break block56;
                                                                            z2.a(n19, g.bf.d(), 2);
                                                                            n16 = object.add(n19) ? 1 : 0;
                                                                        }
                                                                        if (arrm != null) break block56;
                                                                    }
                                                                    z3 = z2;
                                                                    n15 = n19;
                                                                }
                                                                object2 = z3.b(n15);
                                                                y2 = object2;
                                                                if (arrm == null) break block71;
                                                                if (y2 == null) break block72;
                                                                y2 = object2;
                                                            }
                                                            n13 = y2 instanceof net.minecraft.B.a;
                                                            if (arrm == null) break block73;
                                                            if (n13 != 0) {
                                                                ((net.minecraft.B.a)object2).d();
                                                            }
                                                        }
                                                        n13 = z2.a(n19, i2, 2);
                                                    }
                                                    if (arrm == null) break block74;
                                                    if (n13 == 0) break block56;
                                                    object.add(n19);
                                                    ++n3;
                                                    if (arrm == null) break block59;
                                                    n13 = n2;
                                                }
                                                if (n13 == 0) break block56;
                                                y y3 = z2.b(n19);
                                                if (arrm == null) break block59;
                                                if (y3 != null) {
                                                    r2.b("x", n19.e());
                                                    r2.b("y", n19.b());
                                                    r2.b("z", n19.a());
                                                    y3.c(r2);
                                                }
                                            }
                                            ++n17;
                                        }
                                        if (arrm != null) continue;
                                    }
                                    ++n14;
                                    if (arrm != null) continue block7;
                                }
                                break;
                            }
                            ++n12;
                            if (arrm != null) continue block5;
                        }
                        break;
                    }
                    Iterator iterator = object.iterator();
                    while (iterator.hasNext()) {
                        n n25 = (n)iterator.next();
                        net.minecraft.W.K k3 = z2.d(n25).b();
                        z2.b(n25, k3, false);
                        if (arrm != null) {
                            if (arrm != null) continue;
                        }
                        break block40;
                    }
                    if (n3 <= 0) {
                        throw new s("commands.fill.failed", new Object[0]);
                    }
                    j2.a(d.AFFECTED_BLOCKS, n3);
                    W.a(j2, (F)this, "commands.fill.success", n3);
                }
                if (arrm != null) break block75;
            }
            throw new s("commands.fill.outOfWorld", new Object[0]);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        block19: {
            block18: {
                block17: {
                    var5_5 = s.b();
                    v0 = var3_3.length;
                    if (var5_5 == null) ** GOTO lbl12
                    if (v0 > 0) {
                        v0 = var3_3.length;
                        v1 = 3;
                        if (var5_5 != null) {
                            if (v0 <= v1) {
                                return W.a(var3_3, 0, var4_4);
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var3_3.length;
lbl12:
                        // 2 sources

                        v1 = 3;
                    }
                    if (var5_5 != null) {
                        if (v0 > v1) {
                            v0 = var3_3.length;
                            v1 = 6;
                            if (var5_5 != null) {
                                if (v0 <= v1) {
                                    return W.a(var3_3, 3, var4_4);
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = var3_3.length;
                            v1 = 7;
                        }
                    }
                    if (var5_5 != null) {
                        if (v0 == v1) {
                            return W.a(var3_3, net.minecraft.W.K.h.a());
                        }
                        v0 = var3_3.length;
                        v1 = 9;
                    }
                    if (var5_5 == null) break block17;
                    if (v0 == v1) {
                        return W.a(var3_3, new String[]{"replace", "destroy", "keep", "hollow", "outline"});
                    }
                    v0 = var3_3.length;
                    if (var5_5 == null) break block18;
                    v1 = 10;
                }
                if (v0 != v1) break block19;
                v0 = "replace".equals(var3_3[8]) ? 1 : 0;
            }
            if (v0 != 0) {
                v2 = W.a(var3_3, net.minecraft.W.K.h.a());
                return v2;
            }
        }
        v2 = Collections.emptyList();
        return v2;
    }

    @Override
    public String a(J j2) {
        return "commands.fill.usage";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 2;
    }
}

