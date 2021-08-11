/*
 * Decompiled with CFR 0.150.
 */
import java.nio.FloatBuffer;
import java.util.Arrays;
import net.minecraft.k.m;

public class cc {
    static void b(float[] arrf, float[] arrf2, float[] arrf3) {
        arrf[0] = arrf2[0] * arrf3[0] + arrf2[4] * arrf3[1] + arrf2[8] * arrf3[2] + arrf2[12] * arrf3[3];
        arrf[1] = arrf2[1] * arrf3[0] + arrf2[5] * arrf3[1] + arrf2[9] * arrf3[2] + arrf2[13] * arrf3[3];
        arrf[2] = arrf2[2] * arrf3[0] + arrf2[6] * arrf3[1] + arrf2[10] * arrf3[2] + arrf2[14] * arrf3[3];
        arrf[3] = arrf2[3] * arrf3[0] + arrf2[7] * arrf3[1] + arrf2[11] * arrf3[2] + arrf2[15] * arrf3[3];
    }

    static void a(float[] arrf, float[] arrf2) {
        block2: {
            block4: {
                double d10;
                String string;
                float f10;
                block3: {
                    arrf[0] = arrf2[5] * arrf2[10] * arrf2[15] - arrf2[5] * arrf2[11] * arrf2[14] - arrf2[9] * arrf2[6] * arrf2[15] + arrf2[9] * arrf2[7] * arrf2[14] + arrf2[13] * arrf2[6] * arrf2[11] - arrf2[13] * arrf2[7] * arrf2[10];
                    arrf[1] = -arrf2[1] * arrf2[10] * arrf2[15] + arrf2[1] * arrf2[11] * arrf2[14] + arrf2[9] * arrf2[2] * arrf2[15] - arrf2[9] * arrf2[3] * arrf2[14] - arrf2[13] * arrf2[2] * arrf2[11] + arrf2[13] * arrf2[3] * arrf2[10];
                    arrf[2] = arrf2[1] * arrf2[6] * arrf2[15] - arrf2[1] * arrf2[7] * arrf2[14] - arrf2[5] * arrf2[2] * arrf2[15] + arrf2[5] * arrf2[3] * arrf2[14] + arrf2[13] * arrf2[2] * arrf2[7] - arrf2[13] * arrf2[3] * arrf2[6];
                    arrf[3] = -arrf2[1] * arrf2[6] * arrf2[11] + arrf2[1] * arrf2[7] * arrf2[10] + arrf2[5] * arrf2[2] * arrf2[11] - arrf2[5] * arrf2[3] * arrf2[10] - arrf2[9] * arrf2[2] * arrf2[7] + arrf2[9] * arrf2[3] * arrf2[6];
                    arrf[4] = -arrf2[4] * arrf2[10] * arrf2[15] + arrf2[4] * arrf2[11] * arrf2[14] + arrf2[8] * arrf2[6] * arrf2[15] - arrf2[8] * arrf2[7] * arrf2[14] - arrf2[12] * arrf2[6] * arrf2[11] + arrf2[12] * arrf2[7] * arrf2[10];
                    arrf[5] = arrf2[0] * arrf2[10] * arrf2[15] - arrf2[0] * arrf2[11] * arrf2[14] - arrf2[8] * arrf2[2] * arrf2[15] + arrf2[8] * arrf2[3] * arrf2[14] + arrf2[12] * arrf2[2] * arrf2[11] - arrf2[12] * arrf2[3] * arrf2[10];
                    arrf[6] = -arrf2[0] * arrf2[6] * arrf2[15] + arrf2[0] * arrf2[7] * arrf2[14] + arrf2[4] * arrf2[2] * arrf2[15] - arrf2[4] * arrf2[3] * arrf2[14] - arrf2[12] * arrf2[2] * arrf2[7] + arrf2[12] * arrf2[3] * arrf2[6];
                    arrf[7] = arrf2[0] * arrf2[6] * arrf2[11] - arrf2[0] * arrf2[7] * arrf2[10] - arrf2[4] * arrf2[2] * arrf2[11] + arrf2[4] * arrf2[3] * arrf2[10] + arrf2[8] * arrf2[2] * arrf2[7] - arrf2[8] * arrf2[3] * arrf2[6];
                    arrf[8] = arrf2[4] * arrf2[9] * arrf2[15] - arrf2[4] * arrf2[11] * arrf2[13] - arrf2[8] * arrf2[5] * arrf2[15] + arrf2[8] * arrf2[7] * arrf2[13] + arrf2[12] * arrf2[5] * arrf2[11] - arrf2[12] * arrf2[7] * arrf2[9];
                    arrf[9] = -arrf2[0] * arrf2[9] * arrf2[15] + arrf2[0] * arrf2[11] * arrf2[13] + arrf2[8] * arrf2[1] * arrf2[15] - arrf2[8] * arrf2[3] * arrf2[13] - arrf2[12] * arrf2[1] * arrf2[11] + arrf2[12] * arrf2[3] * arrf2[9];
                    arrf[10] = arrf2[0] * arrf2[5] * arrf2[15] - arrf2[0] * arrf2[7] * arrf2[13] - arrf2[4] * arrf2[1] * arrf2[15] + arrf2[4] * arrf2[3] * arrf2[13] + arrf2[12] * arrf2[1] * arrf2[7] - arrf2[12] * arrf2[3] * arrf2[5];
                    arrf[11] = -arrf2[0] * arrf2[5] * arrf2[11] + arrf2[0] * arrf2[7] * arrf2[9] + arrf2[4] * arrf2[1] * arrf2[11] - arrf2[4] * arrf2[3] * arrf2[9] - arrf2[8] * arrf2[1] * arrf2[7] + arrf2[8] * arrf2[3] * arrf2[5];
                    arrf[12] = -arrf2[4] * arrf2[9] * arrf2[14] + arrf2[4] * arrf2[10] * arrf2[13] + arrf2[8] * arrf2[5] * arrf2[14] - arrf2[8] * arrf2[6] * arrf2[13] - arrf2[12] * arrf2[5] * arrf2[10] + arrf2[12] * arrf2[6] * arrf2[9];
                    arrf[13] = arrf2[0] * arrf2[9] * arrf2[14] - arrf2[0] * arrf2[10] * arrf2[13] - arrf2[8] * arrf2[1] * arrf2[14] + arrf2[8] * arrf2[2] * arrf2[13] + arrf2[12] * arrf2[1] * arrf2[10] - arrf2[12] * arrf2[2] * arrf2[9];
                    arrf[14] = -arrf2[0] * arrf2[5] * arrf2[14] + arrf2[0] * arrf2[6] * arrf2[13] + arrf2[4] * arrf2[1] * arrf2[14] - arrf2[4] * arrf2[2] * arrf2[13] - arrf2[12] * arrf2[1] * arrf2[6] + arrf2[12] * arrf2[2] * arrf2[5];
                    arrf[15] = arrf2[0] * arrf2[5] * arrf2[10] - arrf2[0] * arrf2[6] * arrf2[9] - arrf2[4] * arrf2[1] * arrf2[10] + arrf2[4] * arrf2[2] * arrf2[9] + arrf2[8] * arrf2[1] * arrf2[6] - arrf2[8] * arrf2[2] * arrf2[5];
                    f10 = arrf2[0] * arrf[0] + arrf2[1] * arrf[4] + arrf2[2] * arrf[8] + arrf2[3] * arrf[12];
                    string = dB.i();
                    double d11 = (double)f10 - 0.0;
                    double d12 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                    if (string == null) break block3;
                    if (d12 == false) break block4;
                    d12 = d10 = 0.0;
                }
                while (d10 < 16) {
                    double d13 = d10++;
                    arrf[d13] = arrf[d13] / f10;
                    if (string != null) {
                        if (string != null) continue;
                        m.b(!m.d());
                        break;
                    }
                    break block2;
                }
                if (string != null) break block2;
            }
            Arrays.fill(arrf, 0.0f);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static void a(float[] arrf, float[] arrf2, float[] arrf3) {
        int n2 = 0;
        String string = dB.i();
        while (n2 < 4) {
            block3: {
                for (int i2 = 0; i2 < 4; ++i2) {
                    arrf[4 * n2 + i2] = arrf2[4 * n2 + 0] * arrf3[0 + i2] + arrf2[4 * n2 + 1] * arrf3[4 + i2] + arrf2[4 * n2 + 2] * arrf3[8 + i2] + arrf2[4 * n2 + 3] * arrf3[12 + i2];
                    if (string != null) {
                        if (string != null) continue;
                    }
                    break block3;
                }
                ++n2;
            }
            if (string != null) continue;
        }
    }

    static void a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, float[] arrf, float[] arrf2) {
        floatBuffer2.get(arrf2);
        cc.a(arrf, arrf2);
        floatBuffer.put(arrf);
    }
}

