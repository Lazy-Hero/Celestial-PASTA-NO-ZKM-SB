/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.P;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;
import net.minecraft.P.g;
import net.minecraft.P.i;
import net.minecraft.P.r;
import net.minecraft.P.s;
import net.minecraft.ar.Z;
import net.minecraft.c.l;
import net.minecraft.k.m;

public class f {
    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static i a(DataInput dataInput, int n2, g g10) throws IOException {
        byte by2 = dataInput.readByte();
        boolean bl2 = i.f();
        byte by3 = by2;
        if (!bl2) {
            if (by3 == 0) {
                return new s();
            }
            dataInput.readUTF();
            by3 = by2;
        }
        i i2 = i.a(by3);
        try {
            i2.a(dataInput, n2, g10);
            return i2;
        }
        catch (IOException iOException) {
            net.minecraft.c.f f10 = net.minecraft.c.f.a(iOException, "Loading NBT data");
            l l2 = f10.a("NBT Tag");
            l2.a("Tag type", by2);
            throw new Z(f10);
        }
    }

    public static r a(DataInput dataInput, g g10) throws IOException {
        block3: {
            i i2;
            block2: {
                i i3 = f.a(dataInput, 0, g10);
                boolean bl2 = i.f();
                i2 = i3;
                if (bl2) break block2;
                if (!(i2 instanceof r)) break block3;
                i2 = i3;
            }
            return (r)i2;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    public static void b(r r2, File file) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
            f.a(r2, (DataOutput)dataOutputStream);
        }
    }

    public static void a(r r2, OutputStream outputStream) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));){
            f.a(r2, (DataOutput)dataOutputStream);
        }
    }

    public static void a(r r2, File file) throws IOException {
        File file2 = new File(file.getAbsolutePath() + "_tmp");
        boolean bl2 = i.a();
        boolean bl3 = file2.exists();
        if (bl2) {
            if (bl3) {
                file2.delete();
            }
            f.b(r2, file2);
            bl3 = file.exists();
        }
        if (bl2) {
            if (bl3) {
                file.delete();
            }
            bl3 = file.exists();
        }
        if (bl2) {
            if (bl3) {
                throw new IOException("Failed to delete " + file);
            }
            bl3 = file2.renameTo(file);
        }
        if (!m.d()) {
            i.b(!bl2);
        }
    }

    public static r a(InputStream inputStream) throws IOException {
        r r2;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            r2 = f.a(dataInputStream, g.c);
        }
        return r2;
    }

    public static void a(r r2, DataOutput dataOutput) throws IOException {
        f.a((i)r2, dataOutput);
    }

    @Nullable
    public static r a(File file) throws IOException {
        r r2;
        if (!file.exists()) {
            return null;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
            r2 = f.a(dataInputStream, g.c);
        }
        return r2;
    }

    public static r a(DataInputStream dataInputStream) throws IOException {
        return f.a(dataInputStream, g.c);
    }

    private static void a(i i2, DataOutput dataOutput) throws IOException {
        block3: {
            i i3;
            block2: {
                boolean bl2 = i.f();
                dataOutput.writeByte(i2.d());
                boolean bl3 = bl2;
                i3 = i2;
                if (bl3) break block2;
                if (i3.d() == 0) break block3;
                dataOutput.writeUTF("");
                i3 = i2;
            }
            i3.a(dataOutput);
        }
    }
}

