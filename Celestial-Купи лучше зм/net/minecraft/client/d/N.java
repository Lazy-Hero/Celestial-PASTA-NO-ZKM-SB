/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.D;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.minecraft.client.D.M;
import net.minecraft.client.D.P;
import net.minecraft.client.D.h;

public class N
extends M
implements Closeable {
    private /* synthetic */ ZipFile c;
    public static final /* synthetic */ Splitter d;

    @Override
    public Set<String> a() {
        ZipFile zipFile;
        boolean bl2 = h.b();
        try {
            zipFile = this.a();
        }
        catch (IOException iOException) {
            return Collections.emptySet();
        }
        Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
        HashSet hashSet = Sets.newHashSet();
        while (enumeration.hasMoreElements()) {
            block5: {
                String string;
                block8: {
                    block7: {
                        ArrayList arrayList;
                        block6: {
                            ArrayList arrayList2;
                            ZipEntry zipEntry = enumeration.nextElement();
                            String string2 = zipEntry.getName();
                            if (!string2.startsWith("assets/")) break block5;
                            arrayList = arrayList2 = Lists.newArrayList((Iterable)d.split((CharSequence)string2));
                            if (bl2) break block6;
                            if (arrayList.size() <= 1) break block5;
                            arrayList = arrayList2.get(1);
                        }
                        string = (String)((Object)arrayList);
                        boolean bl3 = string.equals(string.toLowerCase(Locale.ROOT));
                        if (bl2) break block7;
                        if (!bl3) break block8;
                        bl3 = hashSet.add(string);
                    }
                    if (!bl2) break block5;
                }
                this.b(string);
            }
            if (!bl2) continue;
        }
        return hashSet;
    }

    static {
        d = Splitter.on((char)'/').omitEmptyStrings().limit(3);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected InputStream a(String string) throws IOException {
        ZipFile zipFile = this.a();
        ZipEntry zipEntry = zipFile.getEntry(string);
        if (zipEntry == null) {
            throw new P(this.a, string);
        }
        return zipFile.getInputStream(zipEntry);
    }

    private ZipFile a() throws IOException {
        boolean bl2 = h.b();
        ZipFile zipFile = this.c;
        if (!bl2) {
            if (zipFile == null) {
                this.c = new ZipFile(this.a);
            }
            zipFile = this.c;
        }
        return zipFile;
    }

    public N(File file) {
        super(file);
    }

    @Override
    public void close() throws IOException {
        block3: {
            ZipFile zipFile;
            block2: {
                boolean bl2 = h.b();
                zipFile = this.c;
                if (bl2) break block2;
                if (zipFile == null) break block3;
                zipFile = this.c;
            }
            zipFile.close();
            this.c = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(String string) {
        block3: {
            try {
                if (this.a().getEntry(string) == null) break block3;
                return true;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return false;
    }

    protected void finalize() throws Throwable {
        this.close();
        super.finalize();
    }
}

