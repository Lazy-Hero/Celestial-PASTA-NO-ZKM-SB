/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.ah.A;
import net.minecraft.aw.w;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aT
extends K {
    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a(J j2) {
        return "commands.weather.usage";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        m[] arrm = s.b();
        String[] arrstring2 = arrstring;
        if (arrm != null) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = aT.a(arrstring2, "clear", "rain", "thunder");
        return list;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block20: {
            block11: {
                m[] arrm;
                block17: {
                    boolean bl2;
                    w w2;
                    int n2;
                    block18: {
                        block19: {
                            block15: {
                                block16: {
                                    block14: {
                                        int n3;
                                        int n4;
                                        block13: {
                                            int n5;
                                            int n6;
                                            block12: {
                                                block10: {
                                                    arrm = s.b();
                                                    n6 = arrstring.length;
                                                    n5 = 1;
                                                    if (arrm == null) break block10;
                                                    if (n6 < n5) break block11;
                                                    n6 = arrstring.length;
                                                    n5 = 2;
                                                }
                                                if (arrm == null) break block12;
                                                if (n6 > n5) break block11;
                                                n6 = 300 + new Random().nextInt(600);
                                                n5 = 20;
                                            }
                                            n2 = n6 * n5;
                                            n4 = arrstring.length;
                                            n3 = 2;
                                            if (arrm == null) break block13;
                                            if (n4 < n3) break block14;
                                            n4 = aT.a(arrstring[1], 1, 1000000);
                                            n3 = 20;
                                        }
                                        n2 = n4 * n3;
                                    }
                                    A a10 = b10.S[0];
                                    w2 = a10.b();
                                    bl2 = "clear".equalsIgnoreCase(arrstring[0]);
                                    if (arrm == null) break block15;
                                    if (!bl2) break block16;
                                    w2.h(n2);
                                    w2.g(0);
                                    w2.a(0);
                                    w2.c(false);
                                    w2.a(false);
                                    aT.a(j2, (F)this, "commands.weather.clear", new Object[0]);
                                    if (arrm != null) break block17;
                                }
                                bl2 = "rain".equalsIgnoreCase(arrstring[0]);
                            }
                            if (arrm == null) break block18;
                            if (!bl2) break block19;
                            w2.h(0);
                            w2.g(n2);
                            w2.a(n2);
                            w2.c(true);
                            w2.a(false);
                            aT.a(j2, (F)this, "commands.weather.rain", new Object[0]);
                            if (arrm != null) break block17;
                        }
                        bl2 = "thunder".equalsIgnoreCase(arrstring[0]);
                    }
                    if (!bl2) {
                        throw new z("commands.weather.usage", new Object[0]);
                    }
                    w2.h(0);
                    w2.g(n2);
                    w2.a(n2);
                    w2.c(true);
                    w2.a(true);
                    aT.a(j2, (F)this, "commands.weather.thunder", new Object[0]);
                }
                if (arrm != null) break block20;
            }
            throw new z("commands.weather.usage", new Object[0]);
        }
    }

    @Override
    public String a() {
        return "weather";
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

