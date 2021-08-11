/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.aw;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.P.f;
import net.minecraft.P.i;
import net.minecraft.P.p;
import net.minecraft.aw.b;
import net.minecraft.aw.r;
import net.minecraft.aw.w;

public class k {
    private final /* synthetic */ List<r> a;
    private final /* synthetic */ Map<String, Short> d;
    protected /* synthetic */ Map<String, r> c;
    private final /* synthetic */ b b;

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Nullable
    public r a(Class<? extends r> var1_1, String var2_2) {
        block7: {
            var4_3 = this.c.get(var2_2);
            var3_4 = w.d();
            v0 = var4_3;
            if (var3_4 == null) return v0;
            if (v0 != null) {
                v0 = var4_3;
                return v0;
            }
            v1 = this.b;
            if (var3_4 == null) ** GOTO lbl13
            if (v1 == null) break block7;
            try {
                v1 = this.b;
lbl13:
                // 2 sources

                var5_5 = v1.a(var2_2);
                v2 = var5_5;
                if (var3_4 != null) {
                    if (v2 == null) break block7;
                    v2 = var5_5;
                }
                if (var3_4 == null) ** GOTO lbl22
                if (!v2.exists()) break block7;
                try {
                    v2 = var1_1.getConstructor(new Class[]{String.class}).newInstance(new Object[]{var2_2});
lbl22:
                    // 2 sources

                    var4_3 = (r)v2;
                }
                catch (Exception var6_7) {
                    throw new RuntimeException("Failed to instantiate " + var1_1, var6_7);
                }
                var6_8 = new FileInputStream(var5_5);
                var7_9 = f.a(var6_8);
                var6_8.close();
                var4_3.b(var7_9.h("data"));
            }
            catch (Exception var5_6) {
                var5_6.printStackTrace();
            }
        }
        v3 = var4_3;
        if (var3_4 == null) return v3;
        if (v3 != null) {
            this.c.put(var2_2, var4_3);
            this.a.add(var4_3);
        }
        v3 = var4_3;
        return v3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public int a(String var1_1) {
        block9: {
            block7: {
                block8: {
                    var3_2 = this.d.get(var1_1);
                    var2_3 = w.d();
                    v0 = var3_2;
                    if (var2_3 == null) break block7;
                    if (v0 != null) break block8;
                    var3_2 = (short)0;
                    if (var2_3 != null) break block9;
                }
                v0 = (short)(var3_2 + 1);
            }
            var3_2 = v0;
        }
        this.d.put(var1_1, var3_2);
        v1 = this.b;
        if (var2_3 == null) ** GOTO lbl21
        if (v1 == null) {
            return var3_2.shortValue();
        }
        try {
            v1 = this.b;
lbl21:
            // 2 sources

            if ((var4_4 = v1.a("idcounts")) == null) return var3_2.shortValue();
            var5_6 = new net.minecraft.P.r();
            for (String var7_8 : this.d.keySet()) {
                var5_6.a(var7_8, this.d.get(var7_8));
                if (var2_3 == null) return var3_2.shortValue();
                if (var2_3 != null) continue;
            }
            var6_7 = new DataOutputStream(new FileOutputStream(var4_4));
            f.a(var5_6, (DataOutput)var6_7);
            var6_7.close();
            return var3_2.shortValue();
        }
        catch (Exception var4_5) {
            var4_5.printStackTrace();
        }
        return var3_2.shortValue();
    }

    public k(b b10) {
        this.c = Maps.newHashMap();
        this.a = Lists.newArrayList();
        this.d = Maps.newHashMap();
        this.b = b10;
        this.a();
    }

    public void a(String string, r r2) {
        String[] arrstring = w.d();
        boolean bl2 = this.c.containsKey(string);
        if (arrstring != null) {
            if (bl2) {
                this.a.remove(this.c.remove(string));
            }
            this.c.put(string, r2);
            bl2 = this.a.add(r2);
        }
    }

    public void b() {
        int n2 = 0;
        String[] arrstring = w.d();
        while (n2 < this.a.size()) {
            r r2 = this.a.get(n2);
            if (arrstring != null) {
                if (r2.a()) {
                    this.a(r2);
                    r2.a(false);
                }
                ++n2;
            }
            if (arrstring != null) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(r var1_1) {
        var2_2 = w.d();
        v0 = this.b;
        if (var2_2 == null) ** GOTO lbl7
        if (v0 == null) return;
        try {
            v0 = this.b;
lbl7:
            // 2 sources

            if ((var3_3 = v0.a(var1_1.b)) == null) return;
            var4_5 = new net.minecraft.P.r();
            var4_5.a("data", var1_1.a(new net.minecraft.P.r()));
            var5_6 = new FileOutputStream(var3_3);
            f.a(var4_5, var5_6);
            var5_6.close();
            return;
        }
        catch (Exception var3_4) {
            var3_4.printStackTrace();
        }
    }

    private void a() {
        block10: {
            String[] arrstring = w.d();
            try {
                File file;
                this.d.clear();
                b b10 = this.b;
                if (arrstring != null) {
                    if (b10 == null) {
                        return;
                    }
                    b10 = this.b;
                }
                File file2 = file = b10.a("idcounts");
                if (arrstring != null) {
                    if (file2 == null) break block10;
                    file2 = file;
                }
                if (!file2.exists()) break block10;
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                net.minecraft.P.r r2 = f.a(dataInputStream);
                dataInputStream.close();
                for (String string : r2.d()) {
                    block12: {
                        i i2;
                        block11: {
                            i i3 = r2.g(string);
                            if (arrstring == null) break block10;
                            i2 = i3;
                            if (arrstring == null) break block11;
                            if (!(i2 instanceof p)) break block12;
                            i2 = i3;
                        }
                        p p2 = (p)i2;
                        short s2 = p2.a();
                        this.d.put(string, s2);
                    }
                    if (arrstring != null) continue;
                    break;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

