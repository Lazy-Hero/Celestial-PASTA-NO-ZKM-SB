/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  javax.annotation.Nullable
 */
package net.minecraft.client.D;

import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.ar.K;
import net.minecraft.ar.T;
import net.minecraft.ar.v;
import net.minecraft.client.D.M;
import net.minecraft.client.D.O;
import net.minecraft.client.D.a;
import net.minecraft.client.D.c;
import net.minecraft.client.D.h;
import net.minecraft.client.j.p;
import net.minecraft.client.v.l;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class o
implements a {
    private final /* synthetic */ c b;
    public static final /* synthetic */ Set<String> a;
    private static final /* synthetic */ boolean c;

    @Override
    public BufferedImage c() throws IOException {
        return p.a(o.class.getResourceAsStream("/" + new v("pack.png").a()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(v v2) {
        boolean bl2 = h.c();
        o o2 = this;
        if (bl2) {
            if (o2.b(v2) != null) return true;
            o2 = this;
        }
        boolean bl3 = o2.b.a(v2);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    static {
        a = ImmutableSet.of((Object)"minecraft", (Object)"realms");
        c = T.a() == K.WINDOWS;
    }

    private boolean a(File file, String string) throws IOException {
        String string2 = file.getPath();
        boolean bl2 = h.b();
        boolean bl3 = string2.startsWith("file:");
        if (!bl2) {
            if (bl3) {
                boolean bl4 = c;
                if (!bl2) {
                    if (bl4) {
                        string2 = string2.replace("\\", "/");
                    }
                    bl4 = string2.endsWith(string);
                }
                return bl4;
            }
            bl3 = O.a(file, string);
        }
        return bl3;
    }

    @Override
    @Nullable
    public <T extends l> T a(net.minecraft.client.v.o o2, String string) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.b.a());
            return M.a(o2, fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public o(c c10) {
        this.b = c10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private InputStream b(v v2) {
        block5: {
            String string = "/assets/" + v2.c() + "/" + v2.a();
            InputStream inputStream = ea.a(string);
            boolean bl2 = h.c();
            InputStream inputStream2 = inputStream;
            if (!bl2) return inputStream2;
            if (inputStream2 != null) {
                inputStream2 = inputStream;
                return inputStream2;
            }
            try {
                URL uRL = o.class.getResource(string);
                if (uRL == null || !this.a(new File(uRL.getFile()), string)) break block5;
            }
            catch (IOException iOException) {
                return o.class.getResourceAsStream(string);
            }
            InputStream inputStream3 = o.class.getResourceAsStream(string);
            return inputStream3;
        }
        return null;
    }

    @Override
    public InputStream a(v v2) throws IOException {
        block6: {
            InputStream inputStream;
            block5: {
                InputStream inputStream2;
                InputStream inputStream3 = this.c(v2);
                boolean bl2 = h.b();
                InputStream inputStream4 = inputStream3;
                if (!bl2) {
                    if (inputStream4 != null) {
                        return inputStream3;
                    }
                    inputStream4 = this.b(v2);
                }
                inputStream = inputStream2 = inputStream4;
                if (bl2) break block5;
                if (inputStream == null) break block6;
                inputStream = inputStream2;
            }
            return inputStream;
        }
        throw new FileNotFoundException(v2.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public InputStream c(v v2) throws IOException {
        File file = this.b.b(v2);
        boolean bl2 = h.b();
        File file2 = file;
        if (!bl2) {
            if (file2 == null) return null;
            file2 = file;
        }
        if (!file2.isFile()) return null;
        FileInputStream fileInputStream = new FileInputStream(file);
        return fileInputStream;
    }

    @Override
    public String b() {
        return "Default";
    }

    @Override
    public Set<String> a() {
        return a;
    }
}

