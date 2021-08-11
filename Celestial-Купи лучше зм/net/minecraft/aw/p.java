/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.aw;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.ar.u;
import net.minecraft.av.d;
import net.minecraft.av.f;
import net.minecraft.aw.B;
import net.minecraft.aw.b;
import net.minecraft.aw.c;
import net.minecraft.aw.w;
import net.minecraft.aw.z;
import net.minecraft.client.O;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class p
implements z {
    protected final /* synthetic */ File c;
    private static final /* synthetic */ Logger b;
    protected final /* synthetic */ net.minecraft.av.b a;

    public p(File file, net.minecraft.av.b b10) {
        this.a = b10;
        String[] arrstring = w.d();
        if (arrstring != null) {
            if (!file.exists()) {
                file.mkdirs();
            }
            this.c = file;
        }
    }

    @Override
    public File b(String string, String string2) {
        return new File(new File(this.c, string), string2);
    }

    @Override
    public boolean c(String string) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(String string) {
        File file = new File(this.c, string);
        String[] arrstring = w.d();
        boolean bl2 = file.exists();
        if (arrstring == null) return bl2;
        if (bl2) {
            return false;
        }
        try {
            file.mkdir();
            file.delete();
            return true;
        }
        catch (Throwable throwable) {
            b.warn("Couldn't make new level", throwable);
            return false;
        }
    }

    @Override
    public List<c> b() throws O {
        ArrayList arrayList = Lists.newArrayList();
        String[] arrstring = w.d();
        int n2 = 0;
        while (n2 < 5) {
            String string = "World" + (n2 + 1);
            w w2 = this.f(string);
            if (arrstring != null) {
                if (w2 != null) {
                    arrayList.add(new c(w2, string, "", w2.A(), false));
                }
                ++n2;
            }
            if (arrstring != null) continue;
        }
        return arrayList;
    }

    @Override
    public b a(String string, boolean bl2) {
        return new B(this.c, string, bl2, this.a);
    }

    @Override
    public boolean d(String string) {
        boolean bl2;
        block7: {
            int n2;
            File file = new File(this.c, string);
            String[] arrstring = w.d();
            int n3 = file.exists();
            if (arrstring != null) {
                if (n3 == 0) {
                    return true;
                }
                b.info("Deleting level {}", (Object)string);
                n3 = n2 = 1;
            }
            while (n2 <= 5) {
                block9: {
                    int n4;
                    block8: {
                        b.info("Attempt {}...", (Object)n2);
                        bl2 = p.a(file.listFiles());
                        if (arrstring == null) break block7;
                        if (arrstring == null) break block8;
                        if (bl2 && arrstring != null) break;
                        b.warn("Unsuccessful in deleting contents.");
                        if (arrstring == null) break block9;
                        n4 = n2;
                    }
                    if (n4 < 5) {
                        try {
                            Thread.sleep(500L);
                        }
                        catch (InterruptedException interruptedException) {
                            // empty catch block
                        }
                    }
                    ++n2;
                }
                if (arrstring != null) continue;
            }
            bl2 = file.delete();
        }
        return bl2;
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public boolean b(String string) {
        File file = new File(this.c, string);
        return file.isDirectory();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public w f(String var1_1) {
        block12: {
            block11: {
                var3_2 = new File(this.c, var1_1);
                var2_3 = w.d();
                v0 = var3_2;
                if (var2_3 != null) {
                    if (!v0.exists()) {
                        return null;
                    }
                    v0 = new File(var3_2, "level.dat");
                }
                var4_4 = v0;
                v1 = var4_4.exists();
                if (var2_3 == null) break block11;
                if (v1) {
                    var5_5 = p.a(var4_4, this.a);
                    if (var2_3 != null) {
                        if (var5_5 != null) {
                            return var5_5;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    var4_4 = new File(var3_2, "level.dat_old");
                }
                v2 = var4_4;
                if (var2_3 == null) break block12;
                v1 = v2.exists();
            }
            if (!v1) {
                return null;
            }
            v2 = var4_4;
        }
        v3 = p.a(v2, this.a);
        return v3;
    }

    @Override
    public boolean a(String string, u u2) {
        return false;
    }

    @Override
    public String c() {
        return "Old Format";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected static boolean a(File[] var0) {
        var2_1 = var0;
        var1_2 = w.d();
        var3_3 = var2_1.length;
        var4_4 = 0;
        do {
            if (var4_4 >= var3_3) return true;
            var5_5 = var2_1[var4_4];
            p.b.debug("Deleting {}", (Object)var5_5);
            v0 = var5_5.isDirectory();
            if (var1_2 == null) return v0;
            if (var1_2 != null) {
                if (v0) {
                    v1 = p.a(var5_5.listFiles());
                    if (var1_2 != null) {
                        if (!v1) {
                            p.b.warn("Couldn't delete directory {}", (Object)var5_5);
                            return false;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v1 = var5_5.delete();
                }
            }
            if (var1_2 == null) return v1;
            if (!v1) {
                p.b.warn("Couldn't delete file {}", (Object)var5_5);
                return false;
            }
            ++var4_4;
        } while (var1_2 != null);
        return true;
    }

    @Override
    public void a(String string, String string2) {
        block7: {
            File file;
            File file2;
            block6: {
                File file3 = new File(this.c, string);
                String[] arrstring = w.d();
                file2 = file3;
                if (arrstring == null) break block6;
                if (!file2.exists()) break block7;
                file2 = new File(file3, "level.dat");
            }
            if ((file = file2).exists()) {
                try {
                    r r2 = net.minecraft.P.f.a(new FileInputStream(file));
                    r r3 = r2.h("Data");
                    r3.a("LevelName", string2);
                    net.minecraft.P.f.a(r2, new FileOutputStream(file));
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    @Nullable
    public static w a(File file, net.minecraft.av.b b10) {
        try {
            r r2 = net.minecraft.P.f.a(new FileInputStream(file));
            r r3 = r2.h("Data");
            return new w(b10.a((d)f.LEVEL, r3));
        }
        catch (Exception exception) {
            b.error("Exception reading {}", (Object)file, (Object)exception);
            return null;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        b = LogManager.getLogger();
    }

    @Override
    public void a() {
    }
}

