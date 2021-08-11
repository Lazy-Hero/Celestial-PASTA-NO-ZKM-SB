/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.aw;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.ah.G;
import net.minecraft.av.d;
import net.minecraft.av.f;
import net.minecraft.aw.b;
import net.minecraft.aw.j;
import net.minecraft.aw.p;
import net.minecraft.aw.w;
import net.minecraft.t.e;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class B
implements j,
b {
    private static final /* synthetic */ Logger f;
    private final /* synthetic */ String d;
    protected final /* synthetic */ net.minecraft.av.b b;
    private final /* synthetic */ File e;
    private final /* synthetic */ File a;
    private final /* synthetic */ File c;
    private final /* synthetic */ net.minecraft.ap.j g;
    private final /* synthetic */ long h;

    @Override
    public j a() {
        return this;
    }

    private void a() {
        try {
            File file = new File(this.a, "session.lock");
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
                dataOutputStream.writeLong(this.h);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    @Override
    public e a(G g10) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    @Override
    public void b() throws net.minecraft.ah.w {
        String[] arrstring = w.d();
        try {
            DataInputStream dataInputStream;
            block5: {
                File file = new File(this.a, "session.lock");
                DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(file));
                try {
                    dataInputStream = dataInputStream2;
                    if (arrstring == null) break block5;
                    if (dataInputStream.readLong() != this.h) {
                        throw new net.minecraft.ah.w("The save is being accessed from another location, aborting");
                    }
                    dataInputStream = dataInputStream2;
                }
                catch (Throwable throwable) {
                    dataInputStream2.close();
                    throw throwable;
                }
            }
            dataInputStream.close();
        }
        catch (IOException iOException) {
            throw new net.minecraft.ah.w("Failed to check session lock, aborting");
        }
    }

    @Override
    public void a(w w2, @Nullable r r2) {
        r r3 = w2.a(r2);
        r r4 = new r();
        String[] arrstring = w.d();
        r4.a("Data", r3);
        try {
            File file = new File(this.a, "level.dat_new");
            File file2 = new File(this.a, "level.dat_old");
            File file3 = new File(this.a, "level.dat");
            net.minecraft.P.f.a(r4, new FileOutputStream(file));
            boolean bl2 = file2.exists();
            if (arrstring != null) {
                if (bl2) {
                    file2.delete();
                }
                file3.renameTo(file2);
                bl2 = file3.exists();
            }
            if (arrstring != null) {
                if (bl2) {
                    file3.delete();
                }
                file.renameTo(file3);
                bl2 = file.exists();
            }
            if (arrstring != null) {
                if (bl2) {
                    bl2 = file.delete();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public w c() {
        block10: {
            block9: {
                var2_1 = new File(this.a, "level.dat");
                var1_2 = w.d();
                v0 = var2_1.exists();
                if (var1_2 == null) break block9;
                if (v0) {
                    var3_3 = p.a(var2_1, this.b);
                    if (var1_2 != null) {
                        if (var3_3 != null) {
                            return var3_3;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    var2_1 = new File(this.a, "level.dat_old");
                }
                v1 = var2_1;
                if (var1_2 == null) break block10;
                v0 = v1.exists();
            }
            if (!v0) {
                return null;
            }
            v1 = var2_1;
        }
        v2 = p.a(v1, this.b);
        return v2;
    }

    static {
        f = LogManager.getLogger();
    }

    @Override
    @Nullable
    public r b(net.minecraft.i.j j2) {
        String[] arrstring;
        r r2;
        block7: {
            r2 = null;
            arrstring = w.d();
            try {
                File file = new File(this.c, j2.a2() + ".dat");
                boolean bl2 = file.exists();
                if (arrstring != null) {
                    if (!bl2) break block7;
                    bl2 = file.isFile();
                }
                if (bl2) {
                    r2 = net.minecraft.P.f.a(new FileInputStream(file));
                }
            }
            catch (Exception exception) {
                f.warn("Failed to load player data for {}", (Object)j2.g());
            }
        }
        r r3 = r2;
        if (arrstring != null) {
            if (r3 != null) {
                j2.d(this.b.a((d)net.minecraft.av.f.PLAYER, r2));
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public void e() {
    }

    @Override
    public String[] a() {
        String[] arrstring;
        block7: {
            String[] arrstring2;
            String[] arrstring3;
            block9: {
                String[] arrstring4;
                block8: {
                    arrstring3 = this.c.list();
                    arrstring2 = w.d();
                    arrstring4 = arrstring3;
                    if (arrstring2 == null) break block8;
                    if (arrstring4 != null) break block9;
                    arrstring4 = new String[]{};
                }
                arrstring3 = arrstring4;
            }
            for (int i2 = 0; i2 < arrstring3.length; ++i2) {
                arrstring = arrstring3;
                if (arrstring2 != null) {
                    int n2 = i2;
                    if (arrstring2 != null) {
                        if (!arrstring[n2].endsWith(".dat")) continue;
                        String[] arrstring5 = arrstring3;
                        n2 = i2;
                    }
                    arrstring5[n2] = arrstring3[i2].substring(0, arrstring3[i2].length() - 4);
                    if (arrstring2 != null) continue;
                }
                break block7;
            }
            arrstring = arrstring3;
        }
        return arrstring;
    }

    @Override
    public net.minecraft.ap.j d() {
        return this.g;
    }

    @Override
    public File f() {
        return this.a;
    }

    @Override
    public void a(net.minecraft.i.j j2) {
        String[] arrstring = w.d();
        try {
            r r2 = j2.b(new r());
            File file = new File(this.c, j2.a2() + ".dat.tmp");
            File file2 = new File(this.c, j2.a2() + ".dat");
            net.minecraft.P.f.a(r2, new FileOutputStream(file));
            boolean bl2 = file2.exists();
            if (arrstring != null) {
                if (bl2) {
                    file2.delete();
                }
                bl2 = file.renameTo(file2);
            }
        }
        catch (Exception exception) {
            f.warn("Failed to save player data for {}", (Object)j2.g());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public File a(String string) {
        return new File(this.e, string + ".dat");
    }

    public B(File file, String string, boolean bl2, net.minecraft.av.b b10) {
        block4: {
            block2: {
                B b11;
                block3: {
                    this.h = net.minecraft.R.b.R();
                    this.b = b10;
                    this.a = new File(file, string);
                    String[] arrstring = w.d();
                    this.a.mkdirs();
                    this.c = new File(this.a, "playerdata");
                    this.e = new File(this.a, "data");
                    this.e.mkdirs();
                    b11 = this;
                    if (arrstring == null) break block2;
                    b11.d = string;
                    if (!bl2) break block3;
                    this.c.mkdirs();
                    this.g = new net.minecraft.ap.j(new File(this.a, "structures").toString(), b10);
                    if (arrstring != null) break block4;
                }
                b11 = this;
            }
            b11.g = null;
        }
        this.a();
    }

    @Override
    public void a(w w2) {
        this.a(w2, null);
    }
}

