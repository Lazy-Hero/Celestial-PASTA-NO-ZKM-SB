/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.x;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.a.e;
import net.minecraft.at.h;
import net.minecraft.i.k;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
extends K {
    public static final /* synthetic */ Pattern d;
    private static /* synthetic */ boolean e;

    public static void b(boolean bl2) {
        e = bl2;
    }

    public static boolean c() {
        boolean bl2 = a.b();
        return !bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        boolean bl2 = a.b();
        String[] arrstring2 = arrstring;
        if (bl2) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = a.a(arrstring2, b10.at());
        return list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(b b10, J j2) {
        boolean bl2 = a.c();
        boolean bl3 = b10.O().a().a();
        if (!bl2) {
            if (!bl3) return false;
            bl3 = super.a(b10, j2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    protected void a(b b10, J j2, String string, @Nullable String string2) {
        block7: {
            Object[] arrobject;
            block6: {
                e e10 = new e(string, null, j2.g(), null, string2);
                boolean bl2 = a.c();
                b10.O().a().a(e10);
                boolean bl3 = bl2;
                List<k> list = b10.O().b(string);
                arrobject = new String[list.size()];
                int n2 = 0;
                for (k k2 : list) {
                    k2.cD.b(new h("multiplayer.disconnect.ip_banned", new Object[0]));
                    arrobject[n2++] = k2.g();
                    if (!bl3) {
                        if (!bl3) continue;
                    }
                    break block6;
                }
                if (!list.isEmpty()) break block6;
                a.a(j2, (F)this, "commands.banip.success", string);
                if (!bl3) break block7;
            }
            a.a(j2, (F)this, "commands.banip.success.players", string, a.a(arrobject));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block8: {
            block7: {
                var4_4 = a.c();
                v0 = var3_3.length;
                v1 = 1;
                if (!var4_4) {
                    if (v0 < v1) throw new z("commands.banip.usage", new Object[0]);
                    v0 = var3_3[0].length();
                    v1 = 1;
                }
                if (!var4_4) {
                    if (v0 <= v1) throw new z("commands.banip.usage", new Object[0]);
                    v0 = var3_3.length;
                    v1 = 2;
                }
                var5_5 = v0 >= v1 ? a.a(var2_2, var3_3, 1) : null;
                var6_6 = a.d.matcher(var3_3[0]);
                if (!var6_6.matches()) break block7;
                v2 = var3_3[0];
                v3 = var5_5;
                if (var4_4) ** GOTO lbl22
                if (v3 == null) {
                    v4 = null;
                } else {
                    v3 = var5_5;
lbl22:
                    // 2 sources

                    v4 = v3.f();
                }
                this.a(var1_1, var2_2, v2, v4);
                if (!var4_4) break block8;
            }
            if ((var7_7 = var1_1.O().a(var3_3[0])) == null) {
                throw new x("commands.banip.invalid");
            }
            v5 = var7_7.e();
            v6 = var5_5;
            if (var4_4) ** GOTO lbl35
            if (v6 == null) {
                v7 = null;
            } else {
                v6 = var5_5;
lbl35:
                // 2 sources

                v7 = v6.f();
            }
            this.a(var1_1, var2_2, v5, v7);
        }
        if (var4_4 == false) return;
        throw new z("commands.banip.usage", new Object[0]);
    }

    @Override
    public String a(J j2) {
        return "commands.banip.usage";
    }

    static {
        d = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        a.b(true);
    }

    @Override
    public String a() {
        return "ban-ip";
    }

    public static boolean b() {
        return e;
    }

    @Override
    public int a() {
        return 3;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

