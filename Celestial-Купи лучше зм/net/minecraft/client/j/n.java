/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.j;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.minecraft.client.D.v;
import net.minecraft.client.j.u;
import org.apache.commons.io.IOUtils;

public class n {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public n(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream;
        block8: {
            int n2;
            long l2;
            DataInputStream dataInputStream2;
            block7: {
                dataInputStream2 = new DataInputStream(inputStream);
                boolean bl2 = u.c();
                long l3 = dataInputStream2.readLong() - -8552249625308161526L;
                l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (!bl2) {
                    if (l2 != false) {
                        throw new IOException("Bad PNG Signature");
                    }
                    l2 = dataInputStream2.readInt();
                }
                n2 = 13;
                if (bl2) break block7;
                if (l2 != n2) {
                    throw new IOException("Bad length for IHDR chunk!");
                }
                dataInputStream = dataInputStream2;
                if (bl2) break block8;
                l2 = dataInputStream.readInt();
                n2 = 1229472850;
            }
            if (l2 != n2) {
                throw new IOException("Bad type for IHDR chunk!");
            }
            this.b = dataInputStream2.readInt();
            this.a = dataInputStream2.readInt();
            dataInputStream = dataInputStream2;
        }
        IOUtils.closeQuietly((InputStream)dataInputStream);
    }

    public static n a(v v2) throws IOException {
        n n2;
        try {
            n2 = new n(v2.c());
        }
        finally {
            IOUtils.closeQuietly((Closeable)v2);
        }
        return n2;
    }
}

