/*
 * Decompiled with CFR 0.150.
 */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class G
implements fK {
    protected /* synthetic */ File b;
    protected /* synthetic */ ZipFile a;

    public G(String string, File file) {
        this.b = file;
        this.a = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a() {
        var1_1 = dB.i();
        v0 = this.a;
        if (var1_1 == null) ** GOTO lbl7
        if (v0 == null) return;
        try {
            v0 = this.a;
lbl7:
            // 2 sources

            v0.close();
        }
        catch (Exception var2_2) {
            // empty catch block
        }
        this.a = null;
    }

    @Override
    public String b() {
        return this.b.getName();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream a(String string) {
        ZipEntry zipEntry;
        block7: {
            String string2 = dB.i();
            try {
                String string3;
                block9: {
                    block8: {
                        G g10 = this;
                        if (string2 == null) break block8;
                        if (g10.a != null) break block9;
                        g10 = this;
                    }
                    g10.a = new ZipFile(this.b);
                }
                if ((zipEntry = this.a.getEntry(string3 = dQ.f(string, "/"))) != null) break block7;
                return null;
            }
            catch (Exception exception) {
                return null;
            }
        }
        InputStream inputStream = this.a.getInputStream(zipEntry);
        return inputStream;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean b(String string) {
        block7: {
            String string2 = dB.i();
            try {
                String string3;
                ZipEntry zipEntry;
                block9: {
                    block8: {
                        G g10 = this;
                        if (string2 == null) break block8;
                        if (g10.a != null) break block9;
                        g10 = this;
                    }
                    g10.a = new ZipFile(this.b);
                }
                if ((zipEntry = this.a.getEntry(string3 = dQ.f(string, "/"))) == null) break block7;
                return true;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return false;
    }
}

