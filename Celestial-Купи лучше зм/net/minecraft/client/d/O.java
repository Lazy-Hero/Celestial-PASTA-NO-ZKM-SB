/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.CharMatcher
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 *  org.apache.commons.io.filefilter.DirectoryFileFilter
 */
package net.minecraft.client.D;

import com.google.common.base.CharMatcher;
import com.google.common.collect.Sets;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.ar.K;
import net.minecraft.ar.T;
import net.minecraft.client.D.M;
import net.minecraft.client.D.P;
import net.minecraft.client.D.h;
import org.apache.commons.io.filefilter.DirectoryFileFilter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends M {
    private static final /* synthetic */ CharMatcher c;
    private static final /* synthetic */ boolean d;

    @Override
    protected boolean c(String string) {
        return this.a(string) != null;
    }

    static {
        d = T.a() == K.WINDOWS;
        c = CharMatcher.is((char)'\\');
    }

    protected static boolean a(File file, String string) throws IOException {
        String string2 = file.getCanonicalPath();
        boolean bl2 = h.b();
        boolean bl3 = d;
        if (!bl2) {
            if (bl3) {
                string2 = c.replaceFrom((CharSequence)string2, '/');
            }
            bl3 = string2.endsWith(string);
        }
        return bl3;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected InputStream a(String string) throws IOException {
        File file = this.a(string);
        if (file == null) {
            throw new P(this.a, string);
        }
        return new BufferedInputStream(new FileInputStream(file));
    }

    @Override
    public Set<String> a() {
        HashSet hashSet;
        block4: {
            File file;
            boolean bl2;
            File file2;
            block3: {
                hashSet = Sets.newHashSet();
                file2 = new File(this.a, "assets/");
                bl2 = h.b();
                file = file2;
                if (bl2) break block3;
                if (!file.isDirectory()) break block4;
                file = file2;
            }
            for (File file3 : file.listFiles((FileFilter)DirectoryFileFilter.DIRECTORY)) {
                String string;
                block6: {
                    block5: {
                        string = O.a(file2, file3);
                        boolean bl3 = string.equals(string.toLowerCase(Locale.ROOT));
                        if (bl2) break block5;
                        if (!bl3) break block6;
                        bl3 = hashSet.add(string.substring(0, string.length() - 1));
                    }
                    if (!bl2) continue;
                }
                this.b(string);
                if (!bl2) continue;
            }
        }
        return hashSet;
    }

    public O(File file) {
        super(file);
    }

    @Nullable
    private File a(String string) {
        block4: {
            boolean bl2 = h.b();
            try {
                File file;
                block6: {
                    boolean bl3;
                    File file2;
                    block5: {
                        file2 = new File(this.a, string);
                        bl3 = file2.isFile();
                        if (bl2) break block5;
                        if (!bl3) break block4;
                        file = file2;
                        if (bl2) break block6;
                        bl3 = O.a(file, string);
                    }
                    if (!bl3) break block4;
                    file = file2;
                }
                return file;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return null;
    }
}

