/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import io.netty.buffer.Unpooled;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.Q.X;
import net.minecraft.R.b;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class an
extends K {
    @Override
    public String a(J j2) {
        return "commands.stopsound.usage";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block22: {
            block13: {
                m[] arrm;
                block20: {
                    String string;
                    String string2;
                    k k2;
                    block21: {
                        boolean bl2;
                        block18: {
                            block19: {
                                Object object;
                                block17: {
                                    String[] arrstring2;
                                    int n2;
                                    block16: {
                                        int n3;
                                        int n4;
                                        block15: {
                                            int n5;
                                            block14: {
                                                int n6;
                                                block12: {
                                                    arrm = s.b();
                                                    n5 = arrstring.length;
                                                    n6 = 1;
                                                    if (arrm == null) break block12;
                                                    if (n5 < n6) break block13;
                                                    n5 = arrstring.length;
                                                    if (arrm == null) break block14;
                                                    n6 = 3;
                                                }
                                                if (n5 > n6) break block13;
                                                n5 = 0;
                                            }
                                            n2 = n5;
                                            k2 = an.d(b10, j2, arrstring[n2++]);
                                            string2 = "";
                                            string = "";
                                            n4 = arrstring.length;
                                            n3 = 2;
                                            if (arrm == null) break block15;
                                            if (n4 >= n3) {
                                                ay ay2;
                                                object = arrstring[n2++];
                                                ay ay3 = ay2 = ay.a((String)object);
                                                if (arrm != null) {
                                                    if (ay3 == null) {
                                                        throw new s("commands.stopsound.unknownSoundSource", object);
                                                    }
                                                    ay3 = ay2;
                                                }
                                                string2 = ay3.b();
                                            }
                                            arrstring2 = arrstring;
                                            if (arrm == null) break block16;
                                            n4 = arrstring2.length;
                                            n3 = 3;
                                        }
                                        if (n4 != n3) break block17;
                                        arrstring2 = arrstring;
                                    }
                                    string = arrstring2[n2++];
                                }
                                object = new net.minecraft.C.m(Unpooled.buffer());
                                ((net.minecraft.C.m)((Object)object)).a(string2);
                                ((net.minecraft.C.m)((Object)object)).a(string);
                                k2.cD.a(new X("MC|StopSound", (net.minecraft.C.m)((Object)object)));
                                bl2 = string2.isEmpty();
                                if (arrm == null) break block18;
                                if (!bl2) break block19;
                                bl2 = string.isEmpty();
                                if (arrm == null) break block18;
                                if (!bl2) break block19;
                                an.a(j2, (F)this, "commands.stopsound.success.all", k2.g());
                                if (arrm != null) break block20;
                            }
                            bl2 = string.isEmpty();
                        }
                        if (!bl2) break block21;
                        an.a(j2, (F)this, "commands.stopsound.success.soundSource", string2, k2.g());
                        if (arrm != null) break block20;
                    }
                    an.a(j2, (F)this, "commands.stopsound.success.individualSound", string, string2, k2.g());
                }
                if (arrm != null) break block22;
            }
            throw new z(this.a(j2), new Object[0]);
        }
    }

    @Override
    public String a() {
        return "stopsound";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block8: {
            int n3;
            int n4;
            block7: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm != null) {
                    if (n4 == n3) {
                        return an.a(arrstring, b10.at());
                    }
                    n4 = arrstring.length;
                    n3 = 2;
                }
                if (arrm == null) break block7;
                if (n4 == n3) {
                    return an.a(arrstring, ay.a());
                }
                arrstring2 = arrstring;
                if (arrm == null) break block8;
                n4 = arrstring2.length;
                n3 = 3;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = an.a(arrstring2, d.c.a());
        return list;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 2;
    }
}

