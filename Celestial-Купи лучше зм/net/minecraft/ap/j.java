/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.ap;

import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.P.f;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.ap.g;
import net.minecraft.ar.v;
import net.minecraft.av.d;
import org.apache.commons.io.IOUtils;

public class j {
    private final /* synthetic */ net.minecraft.av.b b;
    private final /* synthetic */ String c;
    private final /* synthetic */ Map<String, g> a;

    public void b(v v2) {
        this.a.remove(v2.a());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(v v2) {
        boolean bl3;
        String string = v2.c();
        String string2 = v2.a();
        InputStream inputStream = null;
        try {
            inputStream = b.class.getResourceAsStream("/assets/" + string + "/structures/" + string2 + ".nbt");
            this.a(string2, inputStream);
            bl3 = true;
        }
        catch (Throwable throwable) {
            try {
                boolean bl2 = false;
                return bl2;
            }
            catch (Throwable throwable2) {
                throw throwable2;
            }
            finally {
                IOUtils.closeQuietly(inputStream);
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
        return bl3;
    }

    private void a(String string, InputStream inputStream) throws IOException {
        r r2;
        block3: {
            int n2;
            String string2;
            r r3;
            block2: {
                r2 = f.a(inputStream);
                int[] arrn = g.c();
                r3 = r2;
                string2 = "DataVersion";
                n2 = 99;
                if (arrn == null) break block2;
                if (r3.a(string2, n2)) break block3;
                r3 = r2;
                string2 = "DataVersion";
                n2 = 500;
            }
            r3.b(string2, n2);
        }
        g g10 = new g();
        g10.b(this.b.a((d)net.minecraft.av.f.STRUCTURE, r2));
        this.a.put(string, g10);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(v v2) {
        boolean bl3;
        String string = v2.a();
        File file = new File(this.c, string + ".nbt");
        int[] arrn = g.c();
        boolean bl2 = file.exists();
        if (arrn == null) return bl2;
        if (!bl2) {
            bl2 = this.c(v2);
            return bl2;
        }
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            this.a(string, fileInputStream);
            bl3 = true;
        }
        catch (Throwable throwable) {
            boolean bl22;
            try {
                bl22 = false;
            }
            catch (Throwable throwable2) {
                IOUtils.closeQuietly(fileInputStream);
                throw throwable2;
            }
            IOUtils.closeQuietly((InputStream)fileInputStream);
            return bl22;
        }
        IOUtils.closeQuietly((InputStream)fileInputStream);
        return bl3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(@Nullable b b10, v v2) {
        boolean bl4;
        File file;
        String string;
        block12: {
            File file2;
            block13: {
                boolean bl2;
                block10: {
                    int[] arrn;
                    block11: {
                        string = v2.a();
                        arrn = g.c();
                        if (b10 == null) return false;
                        boolean bl3 = this.a.containsKey(string);
                        if (arrn == null) return bl3;
                        if (!bl3) return false;
                        file2 = new File(this.c);
                        bl2 = file2.exists();
                        if (arrn == null) break block10;
                        if (bl2) break block11;
                        file = file2;
                        if (arrn == null) break block12;
                        if (!file.mkdirs()) {
                            return false;
                        }
                        break block13;
                    }
                    file = file2;
                    if (arrn == null) break block12;
                    bl2 = file.isDirectory();
                }
                if (!bl2) {
                    return false;
                }
            }
            file = new File(file2, string + ".nbt");
        }
        File file3 = file;
        g g10 = this.a.get(string);
        FileOutputStream fileOutputStream = null;
        try {
            r r2 = g10.a(new r());
            fileOutputStream = new FileOutputStream(file3);
            f.a(r2, fileOutputStream);
            bl4 = true;
        }
        catch (Throwable throwable) {
            try {
                boolean bl3 = false;
                return bl3;
            }
            catch (Throwable throwable2) {
                throw throwable2;
            }
            finally {
                IOUtils.closeQuietly(fileOutputStream);
            }
        }
        IOUtils.closeQuietly((OutputStream)fileOutputStream);
        return bl4;
    }

    public j(String string, net.minecraft.av.b b10) {
        this.a = Maps.newHashMap();
        this.c = string;
        this.b = b10;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public g a(@Nullable b b10, v v2) {
        g g10 = this.b(b10, v2);
        int[] arrn = g.c();
        g g11 = g10;
        if (arrn != null) {
            if (g11 == null) {
                g10 = new g();
                this.a.put(v2.a(), g10);
            }
            g11 = g10;
        }
        return g11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public g b(@Nullable b b10, v v2) {
        int[] arrn;
        String string;
        block6: {
            block5: {
                string = v2.a();
                arrn = g.c();
                Map<String, g> map = this.a;
                String string2 = string;
                if (arrn == null) return map.get(string2);
                if (map.containsKey(string2)) {
                    map = this.a;
                    string2 = string;
                    return map.get(string2);
                }
                if (b10 != null) break block5;
                this.c(v2);
                if (arrn != null) break block6;
            }
            this.a(v2);
        }
        Map<String, g> map = this.a;
        String string3 = string;
        if (arrn != null) {
            if (!map.containsKey(string3)) return null;
            map = this.a;
            string3 = string;
        }
        g g10 = map.get(string3);
        return g10;
    }
}

