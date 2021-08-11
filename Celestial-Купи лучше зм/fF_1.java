/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class fF
implements fK {
    protected /* synthetic */ File a;

    @Override
    public void a() {
    }

    @Override
    public String b() {
        return this.a.getName();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public InputStream a(String string) {
        File file;
        block3: {
            try {
                String string2 = dQ.b(string, "/", "/");
                file = new File(this.a, string2);
                if (file.exists()) break block3;
                return null;
            }
            catch (Exception exception) {
                return null;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        return bufferedInputStream;
    }

    public fF(String string, File file) {
        this.a = file;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public boolean b(String string) {
        File file = new File(this.a, string.substring(1));
        String string2 = dB.i();
        boolean bl2 = file.exists();
        if (string2 != null) {
            if (!bl2) {
                return false;
            }
            bl2 = file.isDirectory();
        }
        return bl2;
    }
}

