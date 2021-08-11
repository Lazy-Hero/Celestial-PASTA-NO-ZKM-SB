/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.z;
import net.minecraft.Q.a_;
import net.minecraft.R.b;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class s
extends K {
    @Override
    public int a() {
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a() {
        return "setworldspawn";
    }

    @Override
    public String a(J j2) {
        return "commands.setworldspawn.usage";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws net.minecraft.E.s {
        n n2;
        block4: {
            J j3;
            block6: {
                block7: {
                    block5: {
                        int n3;
                        boolean bl2;
                        block2: {
                            block3: {
                                bl2 = a.b();
                                n3 = arrstring.length;
                                if (!bl2) break block2;
                                if (n3 != 0) break block3;
                                n2 = s.a(j2).f();
                                if (bl2) break block4;
                            }
                            n3 = arrstring.length;
                        }
                        if (n3 != 3) break block5;
                        j3 = j2;
                        if (!bl2) break block6;
                        if (j3.b() != null) break block7;
                    }
                    throw new z("commands.setworldspawn.usage", new Object[0]);
                }
                j3 = j2;
            }
            n2 = s.b(j3, arrstring, 0, true);
        }
        j2.b().r(n2);
        b10.O().a(new a_(n2));
        s.a(j2, (F)this, "commands.setworldspawn.success", n2.e(), n2.b(), n2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        block3: {
            String[] arrstring2;
            block4: {
                int n3;
                block2: {
                    boolean bl2 = a.c();
                    n3 = arrstring.length;
                    if (bl2) break block2;
                    if (n3 <= 0) break block3;
                    arrstring2 = arrstring;
                    if (bl2) break block4;
                    n3 = arrstring2.length;
                }
                if (n3 > 3) break block3;
                arrstring2 = arrstring;
            }
            list = s.a(arrstring2, 0, n2);
            return list;
        }
        list = Collections.emptyList();
        return list;
    }
}

