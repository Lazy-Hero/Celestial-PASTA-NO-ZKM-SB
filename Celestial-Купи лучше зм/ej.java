/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import net.minecraft.client.a.v;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ej
implements bu {
    private final /* synthetic */ int b = 15;
    private /* synthetic */ int a;

    private byte[] a(int n2, int n3) {
        byte[] arrby = new byte[n2 * n3 * 3];
        int n4 = 0;
        int n5 = 0;
        String string = dB.i();
        block0: while (true) {
            int n6 = n5;
            block1: while (n6 < n3) {
                int n7 = 0;
                while (n7 < n2) {
                    block5: {
                        n6 = 1;
                        if (string == null) continue block1;
                        for (int i2 = v1172359; i2 < 4; ++i2) {
                            arrby[n4++] = this.a(n7, n5, i2);
                            if (string != null) {
                                if (string != null) continue;
                            }
                            break block5;
                        }
                        ++n7;
                    }
                    if (string != null) continue;
                }
                ++n5;
                if (string != null) continue block0;
            }
            break;
        }
        return arrby;
    }

    public ej(int n2, int n3) {
        this.a = GL11.glGenTextures();
        this.b = 15;
        byte[] arrby = this.a(n2, n3);
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)arrby.length);
        byteBuffer.put(arrby);
        byteBuffer.flip();
        v.t(this.a);
        GL11.glTexImage2D((int)3553, (int)0, (int)6407, (int)n2, (int)n3, (int)0, (int)6407, (int)5121, (ByteBuffer)byteBuffer);
        GL11.glTexParameteri((int)3553, (int)10242, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10243, (int)10497);
        GL11.glTexParameteri((int)3553, (int)10240, (int)9729);
        GL11.glTexParameteri((int)3553, (int)10241, (int)9729);
        v.t(0);
    }

    public int c() {
        return this.a;
    }

    private int a(int n2) {
        n2 ^= n2 << 13;
        n2 ^= n2 >> 17;
        n2 ^= n2 << 5;
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private byte a(int n2, int n3, int n4) {
        int n5 = (this.a(n2) + this.a(n3 * 19)) * this.a(n4 * 23) - n4;
        return (byte)(this.a(n5) % 128);
    }

    @Override
    public int a() {
        this.getClass();
        return 15;
    }

    @Override
    public int b() {
        return this.a;
    }

    @Override
    public void c() {
        v.v(this.a);
        this.a = 0;
    }
}

