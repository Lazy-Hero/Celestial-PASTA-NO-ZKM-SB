/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import net.minecraft.k.m;

public class d4 {
    private static /* synthetic */ int[] b;

    public static void b(int[] arrn) {
        b = arrn;
    }

    protected String a(String string) throws IOException {
        StringBuilder stringBuilder;
        block2: {
            String string2;
            InputStream inputStream = new URL(string).openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            int[] arrn = d4.b();
            StringBuilder stringBuilder2 = new StringBuilder();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuilder = stringBuilder2.append(string2).append("\n");
                if (arrn != null) {
                    if (arrn != null) continue;
                    m.b(!m.c());
                    break;
                }
                break block2;
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    public static int[] b() {
        return b;
    }

    static {
        if (d4.b() == null) {
            d4.b(new int[5]);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

