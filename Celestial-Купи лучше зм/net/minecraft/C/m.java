/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.ByteBufOutputStream
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  io.netty.util.ByteProcessor
 *  javax.annotation.Nullable
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ByteProcessor;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.f;
import net.minecraft.P.g;
import net.minecraft.P.r;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.at.o;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class m
extends ByteBuf {
    private static /* synthetic */ int b;
    private final /* synthetic */ ByteBuf a;

    public m a(byte[] arrby) {
        this.d(arrby.length);
        this.writeBytes(arrby);
        return this;
    }

    public boolean isWritable(int n2) {
        return this.a.isWritable(n2);
    }

    public ByteBuf setLongLE(int n2, long l2) {
        return this.a.setLongLE(n2, l2);
    }

    public ByteBuf setBytes(int n2, byte[] arrby, int n3, int n4) {
        return this.a.setBytes(n2, arrby, n3, n4);
    }

    public ByteBuf readBytes(byte[] arrby) {
        return this.a.readBytes(arrby);
    }

    public int indexOf(int n2, int n3, byte by2) {
        return this.a.indexOf(n2, n3, by2);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public ByteBuf writeZero(int n2) {
        return this.a.writeZero(n2);
    }

    public char readChar() {
        return this.a.readChar();
    }

    public ByteBuf readBytes(OutputStream outputStream, int n2) throws IOException {
        return this.a.readBytes(outputStream, n2);
    }

    public int writerIndex() {
        return this.a.writerIndex();
    }

    public ByteBuffer nioBuffer(int n2, int n3) {
        return this.a.nioBuffer(n2, n3);
    }

    public int getMedium(int n2) {
        return this.a.getMedium(n2);
    }

    public double getDouble(int n2) {
        return this.a.getDouble(n2);
    }

    public long[] a(@Nullable long[] arrl, int n2) {
        long[] arrl2;
        block8: {
            int n3;
            int n4;
            block11: {
                int n5;
                block12: {
                    int n6;
                    block10: {
                        long[] arrl3;
                        block9: {
                            n6 = this.a();
                            n4 = m.b();
                            arrl3 = arrl;
                            if (n4 != 0) break block9;
                            if (arrl3 == null) break block10;
                            arrl3 = arrl;
                        }
                        n5 = arrl3.length;
                        if (n4 != 0) break block11;
                        if (n5 == n6) break block12;
                    }
                    int n7 = n6;
                    if (n4 == 0) {
                        if (n7 > n2) {
                            throw new DecoderException("LongArray with size " + n6 + " is bigger than allowed " + n2);
                        }
                        n7 = n6;
                    }
                    arrl = new long[n7];
                }
                n5 = n3 = 0;
            }
            while (n3 < arrl.length) {
                arrl2 = arrl;
                if (n4 == 0) {
                    arrl2[n3] = this.readLong();
                    ++n3;
                    if (n4 == 0) continue;
                }
                break block8;
            }
            arrl2 = arrl;
        }
        return arrl2;
    }

    public int bytesBefore(int n2, int n3, byte by2) {
        return this.a.bytesBefore(n2, n3, by2);
    }

    public ByteBuf readerIndex(int n2) {
        return this.a.readerIndex(n2);
    }

    public ByteBuf retain() {
        return this.a.retain();
    }

    public long readLong() {
        return this.a.readLong();
    }

    public long k() {
        long l2 = 0L;
        int n2 = m.b();
        int n3 = 0;
        do {
            byte by2 = this.readByte();
            l2 |= (long)(by2 & 0x7F) << n3++ * 7;
            if (n3 > 10) {
                if (n2 != 0) continue;
                throw new RuntimeException("VarLong too big");
            }
            if ((by2 & 0x80) != 128 && n2 == 0) break;
        } while (n2 == 0);
        return l2;
    }

    public ByteBuf setLong(int n2, long l2) {
        return this.a.setLong(n2, l2);
    }

    public ByteBuf setIntLE(int n2, int n3) {
        return this.a.setIntLE(n2, n3);
    }

    public short getShort(int n2) {
        return this.a.getShort(n2);
    }

    public short readShortLE() {
        return this.a.readShortLE();
    }

    public ByteBuf writeIntLE(int n2) {
        return this.a.writeIntLE(n2);
    }

    public ByteBuf setBoolean(int n2, boolean bl2) {
        return this.a.setBoolean(n2, bl2);
    }

    public int readableBytes() {
        return this.a.readableBytes();
    }

    public ByteBuf getBytes(int n2, byte[] arrby) {
        return this.a.getBytes(n2, arrby);
    }

    public ByteBuf writeByte(int n2) {
        return this.a.writeByte(n2);
    }

    public boolean isReadable(int n2) {
        return this.a.isReadable(n2);
    }

    public int[] f(int n2) {
        int[] arrn;
        block4: {
            int n3 = this.a();
            int n4 = m.b();
            int n5 = n3;
            if (n4 == 0) {
                if (n5 > n2) {
                    throw new DecoderException("VarIntArray with size " + n3 + " is bigger than allowed " + n2);
                }
                n5 = n3;
            }
            int[] arrn2 = new int[n5];
            for (int i2 = 0; i2 < arrn2.length; ++i2) {
                arrn = arrn2;
                if (n4 == 0) {
                    arrn[i2] = this.a();
                    if (n4 == 0) continue;
                }
                break block4;
            }
            arrn = arrn2;
        }
        return arrn;
    }

    public m a(long l2) {
        block2: {
            int n2 = m.h();
            while ((l2 & 0xFFFFFFFFFFFFFF80L) != 0L) {
                this.writeByte((int)(l2 & 0x7FL) | 0x80);
                l2 >>>= 7;
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block2;
            }
            this.writeByte((int)l2);
        }
        return this;
    }

    public float getFloat(int n2) {
        return this.a.getFloat(n2);
    }

    public int setBytes(int n2, InputStream inputStream, int n3) throws IOException {
        return this.a.setBytes(n2, inputStream, n3);
    }

    public ByteBuf markReaderIndex() {
        return this.a.markReaderIndex();
    }

    public int getMediumLE(int n2) {
        return this.a.getMediumLE(n2);
    }

    public short getShortLE(int n2) {
        return this.a.getShortLE(n2);
    }

    public ByteBuf writeBytes(byte[] arrby) {
        return this.a.writeBytes(arrby);
    }

    public int setCharSequence(int n2, CharSequence charSequence, Charset charset) {
        return this.a.setCharSequence(n2, charSequence, charset);
    }

    public ByteOrder order() {
        return this.a.order();
    }

    public int readInt() {
        return this.a.readInt();
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.a.getBytes(n2, byteBuf, n3, n4);
    }

    public ByteBuf touch() {
        return this.a.touch();
    }

    public ByteBuf capacity(int n2) {
        return this.a.capacity(n2);
    }

    public ByteBuf discardReadBytes() {
        return this.a.discardReadBytes();
    }

    public int getUnsignedMedium(int n2) {
        return this.a.getUnsignedMedium(n2);
    }

    public m a(Enum<?> enum_) {
        return this.d(enum_.ordinal());
    }

    public int maxCapacity() {
        return this.a.maxCapacity();
    }

    public long memoryAddress() {
        return this.a.memoryAddress();
    }

    public d j() throws IOException {
        short s2 = this.readShort();
        int n2 = m.b();
        short s3 = s2;
        if (n2 == 0) {
            if (s3 < 0) {
                return d.m;
            }
            s3 = this.readByte();
        }
        short s4 = s3;
        short s5 = this.readShort();
        d d10 = new d(net.minecraft.w.k.a(s2), (int)s4, (int)s5);
        d10.b(this.g());
        return d10;
    }

    public m a(k k2) {
        return this.a(o.a(k2));
    }

    public int writeBytes(FileChannel fileChannel, long l2, int n2) throws IOException {
        return this.a.writeBytes(fileChannel, l2, n2);
    }

    public int readMediumLE() {
        return this.a.readMediumLE();
    }

    public ByteBuf setMedium(int n2, int n3) {
        return this.a.setMedium(n2, n3);
    }

    public int readIntLE() {
        return this.a.readIntLE();
    }

    public ByteBuf readBytes(int n2) {
        return this.a.readBytes(n2);
    }

    public ByteBuf resetWriterIndex() {
        return this.a.resetWriterIndex();
    }

    public int getUnsignedMediumLE(int n2) {
        return this.a.getUnsignedMediumLE(n2);
    }

    public m a(n n2) {
        this.writeLong(n2.h());
        return this;
    }

    public boolean hasArray() {
        return this.a.hasArray();
    }

    public <T extends Enum<T>> T a(Class<T> class_) {
        return (T)((Enum[])class_.getEnumConstants())[this.a()];
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf) {
        return this.a.getBytes(n2, byteBuf);
    }

    public ByteBuf setByte(int n2, int n3) {
        return this.a.setByte(n2, n3);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public int bytesBefore(int n2, byte by2) {
        return this.a.bytesBefore(n2, by2);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.a.setBytes(n2, byteBuf, n3);
    }

    public ByteBuf clear() {
        return this.a.clear();
    }

    public boolean readBoolean() {
        return this.a.readBoolean();
    }

    public int readerIndex() {
        return this.a.readerIndex();
    }

    public ByteBuf writeChar(int n2) {
        return this.a.writeChar(n2);
    }

    public ByteBuf slice(int n2, int n3) {
        return this.a.slice(n2, n3);
    }

    public int getBytes(int n2, GatheringByteChannel gatheringByteChannel, int n3) throws IOException {
        return this.a.getBytes(n2, gatheringByteChannel, n3);
    }

    public m a(Date date) {
        this.writeLong(date.getTime());
        return this;
    }

    public ByteBuf resetReaderIndex() {
        return this.a.resetReaderIndex();
    }

    public int maxWritableBytes() {
        return this.a.maxWritableBytes();
    }

    public ByteBuf getBytes(int n2, ByteBuf byteBuf, int n3) {
        return this.a.getBytes(n2, byteBuf, n3);
    }

    public ByteBuf writeBytes(byte[] arrby, int n2, int n3) {
        return this.a.writeBytes(arrby, n2, n3);
    }

    public ByteBuf copy(int n2, int n3) {
        return this.a.copy(n2, n3);
    }

    public m d(int n2) {
        block2: {
            int n3 = m.h();
            while ((n2 & 0xFFFFFF80) != 0) {
                this.writeByte(n2 & 0x7F | 0x80);
                n2 >>>= 7;
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block2;
            }
            this.writeByte(n2);
        }
        return this;
    }

    public static int a(int n2) {
        int n3;
        block3: {
            int n4 = m.b();
            for (int i2 = 1; i2 < 5; ++i2) {
                n3 = n2 & -1 << i2 * 7;
                if (n4 == 0) {
                    int n5;
                    if (n4 == 0) {
                        if (n3 != 0) continue;
                        n5 = i2;
                    }
                    return n5;
                }
                break block3;
            }
            n3 = 5;
        }
        return n3;
    }

    public ByteBuf getBytes(int n2, byte[] arrby, int n3, int n4) {
        return this.a.getBytes(n2, arrby, n3, n4);
    }

    public int getBytes(int n2, FileChannel fileChannel, long l2, int n3) throws IOException {
        return this.a.getBytes(n2, fileChannel, l2, n3);
    }

    public k m() throws IOException {
        return o.a(this.c(32767));
    }

    public boolean getBoolean(int n2) {
        return this.a.getBoolean(n2);
    }

    public ByteBuf discardSomeReadBytes() {
        return this.a.discardSomeReadBytes();
    }

    public ByteBuf order(ByteOrder byteOrder) {
        return this.a.order(byteOrder);
    }

    public int bytesBefore(byte by2) {
        return this.a.bytesBefore(by2);
    }

    public n l() {
        return n.a(this.readLong());
    }

    public ByteBuf setBytes(int n2, byte[] arrby) {
        return this.a.setBytes(n2, arrby);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.a.writeBytes(byteBuf, n2, n3);
    }

    public ByteBuf readSlice(int n2) {
        return this.a.readSlice(n2);
    }

    public m a(int[] arrn) {
        m m2;
        block2: {
            this.d(arrn.length);
            int[] arrn2 = arrn;
            int n2 = arrn2.length;
            int n3 = m.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n4 = arrn2[i2];
                m2 = this.d(n4);
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block2;
            }
            m2 = this;
        }
        return m2;
    }

    public int capacity() {
        return this.a.capacity();
    }

    public long getUnsignedInt(int n2) {
        return this.a.getUnsignedInt(n2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf) {
        return this.a.writeBytes(byteBuf);
    }

    public int getInt(int n2) {
        return this.a.getInt(n2);
    }

    public ByteBuf writeMediumLE(int n2) {
        return this.a.writeMediumLE(n2);
    }

    public int ensureWritable(int n2, boolean bl2) {
        return this.a.ensureWritable(n2, bl2);
    }

    public ByteBuf readBytes(ByteBuffer byteBuffer) {
        return this.a.readBytes(byteBuffer);
    }

    public static int h() {
        int n2 = m.b();
        if (n2 == 0) {
            return 44;
        }
        return 0;
    }

    public ByteBuf getBytes(int n2, OutputStream outputStream, int n3) throws IOException {
        return this.a.getBytes(n2, outputStream, n3);
    }

    public ByteBuf retain(int n2) {
        return this.a.retain(n2);
    }

    public UUID f() {
        return new UUID(this.readLong(), this.readLong());
    }

    public int refCnt() {
        return this.a.refCnt();
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf) {
        return this.a.setBytes(n2, byteBuf);
    }

    public ByteBuf skipBytes(int n2) {
        return this.a.skipBytes(n2);
    }

    public m a(v v2) {
        this.a(v2.toString());
        return this;
    }

    public v e() {
        return new v(this.c(32767));
    }

    public ByteBuffer[] nioBuffers() {
        return this.a.nioBuffers();
    }

    public ByteBuffer nioBuffer() {
        return this.a.nioBuffer();
    }

    @Nullable
    public r g() throws IOException {
        int n2 = this.readerIndex();
        int n3 = m.b();
        byte by2 = this.readByte();
        if (n3 == 0) {
            if (by2 == 0) {
                return null;
            }
            this.readerIndex(n2);
        }
        try {
            return f.a((DataInput)new ByteBufInputStream((ByteBuf)this), new g(0x200000L));
        }
        catch (IOException iOException) {
            throw new EncoderException((Throwable)iOException);
        }
    }

    public static int b() {
        return b;
    }

    public long readUnsignedInt() {
        return this.a.readUnsignedInt();
    }

    public ByteBuf unwrap() {
        return this.a.unwrap();
    }

    public ByteBuf getBytes(int n2, ByteBuffer byteBuffer) {
        return this.a.getBytes(n2, byteBuffer);
    }

    public byte[] e(int n2) {
        int n3 = this.a();
        int n4 = m.b();
        int n5 = n3;
        if (n4 == 0) {
            if (n5 > n2) {
                throw new DecoderException("ByteArray with size " + n3 + " is bigger than allowed " + n2);
            }
            n5 = n3;
        }
        byte[] arrby = new byte[n5];
        this.readBytes(arrby);
        return arrby;
    }

    public int readUnsignedShort() {
        return this.a.readUnsignedShort();
    }

    public m a(UUID uUID) {
        this.writeLong(uUID.getMostSignificantBits());
        this.writeLong(uUID.getLeastSignificantBits());
        return this;
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public long[] b(@Nullable long[] arrl) {
        return this.a(arrl, this.readableBytes() / 8);
    }

    public long getLong(int n2) {
        return this.a.getLong(n2);
    }

    public m a(d d10) {
        block4: {
            r r2;
            block7: {
                d d11;
                block5: {
                    block6: {
                        int n2;
                        block2: {
                            block3: {
                                n2 = m.b();
                                if (n2 != 0) break block2;
                                if (!d10.G()) break block3;
                                this.writeShort(-1);
                                if (n2 == 0) break block4;
                            }
                            this.writeShort(net.minecraft.w.k.a(d10.w()));
                            this.writeByte(d10.t());
                            this.writeShort(d10.d());
                        }
                        r2 = null;
                        d11 = d10;
                        if (n2 != 0) break block5;
                        if (d11.w().i()) break block6;
                        d11 = d10;
                        if (n2 != 0) break block5;
                        if (!d11.w().c()) break block7;
                    }
                    d11 = d10;
                }
                r2 = d11.v();
            }
            this.a(r2);
        }
        return this;
    }

    public int readUnsignedShortLE() {
        return this.a.readUnsignedShortLE();
    }

    public ByteBuf setChar(int n2, int n3) {
        return this.a.setChar(n2, n3);
    }

    public ByteBuf setBytes(int n2, ByteBuffer byteBuffer) {
        return this.a.setBytes(n2, byteBuffer);
    }

    public int setBytes(int n2, ScatteringByteChannel scatteringByteChannel, int n3) throws IOException {
        return this.a.setBytes(n2, scatteringByteChannel, n3);
    }

    public ByteBuffer[] nioBuffers(int n2, int n3) {
        return this.a.nioBuffers(n2, n3);
    }

    public boolean hasMemoryAddress() {
        return this.a.hasMemoryAddress();
    }

    public int arrayOffset() {
        return this.a.arrayOffset();
    }

    public ByteBuffer internalNioBuffer(int n2, int n3) {
        return this.a.internalNioBuffer(n2, n3);
    }

    static {
        if (m.b() != 0) {
            m.b(43);
        }
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n2, int n3) {
        return this.a.readBytes(byteBuf, n2, n3);
    }

    public ByteBuf copy() {
        return this.a.copy();
    }

    public ByteBuf writeShortLE(int n2) {
        return this.a.writeShortLE(n2);
    }

    public int a() {
        int n2 = 0;
        int n3 = m.h();
        int n4 = 0;
        do {
            byte by2 = this.readByte();
            n2 |= (by2 & 0x7F) << n4++ * 7;
            if (n4 > 5) {
                if (n3 == 0) continue;
                throw new RuntimeException("VarInt too big");
            }
            if ((by2 & 0x80) != 128 && n3 != 0) break;
        } while (n3 != 0);
        return n2;
    }

    public int writeCharSequence(CharSequence charSequence, Charset charset) {
        return this.a.writeCharSequence(charSequence, charset);
    }

    public long getUnsignedIntLE(int n2) {
        return this.a.getUnsignedIntLE(n2);
    }

    public CharSequence readCharSequence(int n2, Charset charset) {
        return this.a.readCharSequence(n2, charset);
    }

    public ByteBuf writeLong(long l2) {
        return this.a.writeLong(l2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public m a(@Nullable r var1_1) {
        var2_2 = m.h();
        v0 = var1_1;
        if (var2_2 == 0) ** GOTO lbl10
        if (v0 == null) {
            this.writeByte(0);
            if (var2_2 != 0) return this;
        }
        try {
            v0 = var1_1;
lbl10:
            // 2 sources

            f.a(v0, (DataOutput)new ByteBufOutputStream((ByteBuf)this));
            return this;
        }
        catch (IOException var3_3) {
            throw new EncoderException((Throwable)var3_3);
        }
    }

    public byte getByte(int n2) {
        return this.a.getByte(n2);
    }

    public byte[] c() {
        return this.e(this.readableBytes());
    }

    public m(ByteBuf byteBuf) {
        this.a = byteBuf;
    }

    public ByteBufAllocator alloc() {
        return this.a.alloc();
    }

    public ByteBuf readRetainedSlice(int n2) {
        return this.a.readRetainedSlice(n2);
    }

    public boolean isDirect() {
        return this.a.isDirect();
    }

    public int getUnsignedShortLE(int n2) {
        return this.a.getUnsignedShortLE(n2);
    }

    public int compareTo(ByteBuf byteBuf) {
        return this.a.compareTo(byteBuf);
    }

    public int nioBufferCount() {
        return this.a.nioBufferCount();
    }

    public boolean release() {
        return this.a.release();
    }

    public ByteBuf writeLongLE(long l2) {
        return this.a.writeLongLE(l2);
    }

    public short readShort() {
        return this.a.readShort();
    }

    public String toString() {
        return this.a.toString();
    }

    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int n2) throws IOException {
        return this.a.writeBytes(scatteringByteChannel, n2);
    }

    public int readBytes(GatheringByteChannel gatheringByteChannel, int n2) throws IOException {
        return this.a.readBytes(gatheringByteChannel, n2);
    }

    public int setBytes(int n2, FileChannel fileChannel, long l2, int n3) throws IOException {
        return this.a.setBytes(n2, fileChannel, l2, n3);
    }

    public ByteBuf readBytes(ByteBuf byteBuf, int n2) {
        return this.a.readBytes(byteBuf, n2);
    }

    public String toString(int n2, int n3, Charset charset) {
        return this.a.toString(n2, n3, charset);
    }

    public int readUnsignedMedium() {
        return this.a.readUnsignedMedium();
    }

    public short readUnsignedByte() {
        return this.a.readUnsignedByte();
    }

    public m a(String string) {
        byte[] arrby = string.getBytes(StandardCharsets.UTF_8);
        int n2 = m.b();
        if (n2 == 0) {
            if (arrby.length > 32767) {
                throw new EncoderException("String too big (was " + arrby.length + " bytes encoded, max " + 32767 + ")");
            }
            this.d(arrby.length);
            this.writeBytes(arrby);
        }
        return this;
    }

    public int writableBytes() {
        return this.a.writableBytes();
    }

    public ByteBuf readBytes(byte[] arrby, int n2, int n3) {
        return this.a.readBytes(arrby, n2, n3);
    }

    public int forEachByte(int n2, int n3, ByteProcessor byteProcessor) {
        return this.a.forEachByte(n2, n3, byteProcessor);
    }

    public byte[] array() {
        return this.a.array();
    }

    public long readLongLE() {
        return this.a.readLongLE();
    }

    public ByteBuf touch(Object object) {
        return this.a.touch(object);
    }

    public boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    public ByteBuf setShortLE(int n2, int n3) {
        return this.a.setShortLE(n2, n3);
    }

    public ByteBuf retainedSlice(int n2, int n3) {
        return this.a.retainedSlice(n2, n3);
    }

    public ByteBuf writeInt(int n2) {
        return this.a.writeInt(n2);
    }

    public ByteBuf writeBytes(ByteBuf byteBuf, int n2) {
        return this.a.writeBytes(byteBuf, n2);
    }

    public ByteBuf retainedDuplicate() {
        return this.a.retainedDuplicate();
    }

    public ByteBuf writeBoolean(boolean bl2) {
        return this.a.writeBoolean(bl2);
    }

    public double readDouble() {
        return this.a.readDouble();
    }

    public ByteBuf setDouble(int n2, double d10) {
        return this.a.setDouble(n2, d10);
    }

    public boolean isReadable() {
        return this.a.isReadable();
    }

    public int readUnsignedMediumLE() {
        return this.a.readUnsignedMediumLE();
    }

    public long readUnsignedIntLE() {
        return this.a.readUnsignedIntLE();
    }

    public ByteBuf writeDouble(double d10) {
        return this.a.writeDouble(d10);
    }

    public short getUnsignedByte(int n2) {
        return this.a.getUnsignedByte(n2);
    }

    public float readFloat() {
        return this.a.readFloat();
    }

    public ByteBuf setZero(int n2, int n3) {
        return this.a.setZero(n2, n3);
    }

    public int forEachByteDesc(int n2, int n3, ByteProcessor byteProcessor) {
        return this.a.forEachByteDesc(n2, n3, byteProcessor);
    }

    public char getChar(int n2) {
        return this.a.getChar(n2);
    }

    public ByteBuf retainedSlice() {
        return this.a.retainedSlice();
    }

    public ByteBuf setShort(int n2, int n3) {
        return this.a.setShort(n2, n3);
    }

    public ByteBuf writerIndex(int n2) {
        return this.a.writerIndex(n2);
    }

    public ByteBuf setFloat(int n2, float f10) {
        return this.a.setFloat(n2, f10);
    }

    public static void b(int n2) {
        b = n2;
    }

    public int getUnsignedShort(int n2) {
        return this.a.getUnsignedShort(n2);
    }

    public int readBytes(FileChannel fileChannel, long l2, int n2) throws IOException {
        return this.a.readBytes(fileChannel, l2, n2);
    }

    public int getIntLE(int n2) {
        return this.a.getIntLE(n2);
    }

    public String c(int n2) {
        int n3 = this.a();
        int n4 = m.h();
        int n5 = n3;
        if (n4 != 0) {
            if (n5 > n2 * 4) {
                throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + n3 + " > " + n2 * 4 + ")");
            }
            n5 = n3;
        }
        if (n5 < 0) {
            throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = this.toString(this.readerIndex(), n3, StandardCharsets.UTF_8);
        this.readerIndex(this.readerIndex() + n3);
        String string2 = string;
        if (n4 != 0) {
            if (string2.length() > n2) {
                throw new DecoderException("The received string length is longer than maximum allowed (" + n3 + " > " + n2 + ")");
            }
            string2 = string;
        }
        return string2;
    }

    public int forEachByteDesc(ByteProcessor byteProcessor) {
        return this.a.forEachByteDesc(byteProcessor);
    }

    public Date i() {
        return new Date(this.readLong());
    }

    public ByteBuf setInt(int n2, int n3) {
        return this.a.setInt(n2, n3);
    }

    public byte readByte() {
        return this.a.readByte();
    }

    public ByteBuf writeMedium(int n2) {
        return this.a.writeMedium(n2);
    }

    public ByteBuf setMediumLE(int n2, int n3) {
        return this.a.setMediumLE(n2, n3);
    }

    public int[] d() {
        return this.f(this.readableBytes());
    }

    public int readMedium() {
        return this.a.readMedium();
    }

    public ByteBuf ensureWritable(int n2) {
        return this.a.ensureWritable(n2);
    }

    public ByteBuf slice() {
        return this.a.slice();
    }

    public String toString(Charset charset) {
        return this.a.toString(charset);
    }

    public ByteBuf setIndex(int n2, int n3) {
        return this.a.setIndex(n2, n3);
    }

    public m a(long[] arrl) {
        m m2;
        block2: {
            int n2 = m.b();
            this.d(arrl.length);
            int n3 = n2;
            for (long l2 : arrl) {
                m2 = this;
                if (n3 == 0) {
                    m2.writeLong(l2);
                    if (n3 == 0) continue;
                }
                break block2;
            }
            m2 = this;
        }
        return m2;
    }

    public ByteBuf markWriterIndex() {
        return this.a.markWriterIndex();
    }

    public ByteBuf readBytes(ByteBuf byteBuf) {
        return this.a.readBytes(byteBuf);
    }

    public ByteBuf writeFloat(float f10) {
        return this.a.writeFloat(f10);
    }

    public ByteBuf writeShort(int n2) {
        return this.a.writeShort(n2);
    }

    public ByteBuf asReadOnly() {
        return this.a.asReadOnly();
    }

    public CharSequence getCharSequence(int n2, int n3, Charset charset) {
        return this.a.getCharSequence(n2, n3, charset);
    }

    public ByteBuf setBytes(int n2, ByteBuf byteBuf, int n3, int n4) {
        return this.a.setBytes(n2, byteBuf, n3, n4);
    }

    public boolean isWritable() {
        return this.a.isWritable();
    }

    public long getLongLE(int n2) {
        return this.a.getLongLE(n2);
    }

    public boolean release(int n2) {
        return this.a.release(n2);
    }

    public ByteBuf duplicate() {
        return this.a.duplicate();
    }

    public ByteBuf writeBytes(ByteBuffer byteBuffer) {
        return this.a.writeBytes(byteBuffer);
    }

    public int writeBytes(InputStream inputStream, int n2) throws IOException {
        return this.a.writeBytes(inputStream, n2);
    }

    public int forEachByte(ByteProcessor byteProcessor) {
        return this.a.forEachByte(byteProcessor);
    }
}

