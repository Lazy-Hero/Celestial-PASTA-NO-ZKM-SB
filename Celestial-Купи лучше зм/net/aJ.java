/*
 * Decompiled with CFR 0.150.
 */
package net;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.ArrayList;
import net.G;
import net.e;
import net.minecraft.k.m;
import net.x;

public class aJ {
    public static G[] a(String string) throws x, IOException {
        StringReader stringReader = new StringReader(string);
        PushbackReader pushbackReader = new PushbackReader(stringReader);
        ArrayList<G> arrayList = new ArrayList<G>();
        int[] arrn = G.c();
        while (true) {
            e e10;
            int n2;
            if ((n2 = pushbackReader.read()) < 0) {
                G[] arrg = arrayList.toArray(new G[arrayList.size()]);
                if (arrn != null) {
                    m.b(!m.d());
                }
                return arrg;
            }
            char c10 = (char)n2;
            char c11 = Character.isWhitespace(c10);
            if (arrn == null) {
                if (c11 != '\u0000') continue;
                c11 = c10;
            }
            if ((e10 = e.b(c11)) == null) {
                throw new x("Invalid character: '" + c10 + "', in: " + string);
            }
            G g10 = aJ.a(c10, e10, pushbackReader);
            arrayList.add(g10);
        }
    }

    private static G a(char c10, e e10, PushbackReader pushbackReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        int[] arrn = G.c();
        stringBuffer.append(c10);
        do {
            char c11;
            char c12;
            char c13;
            if (e10.c() > 0) {
                c13 = stringBuffer.length();
                if (arrn == null && arrn == null) {
                    if (c13 >= e10.c()) break;
                }
            } else {
                c13 = pushbackReader.read();
            }
            char c14 = c12 = c13;
            if (arrn == null) {
                if (c14 < '\u0000' && arrn == null) break;
                c14 = c11 = (char)c12;
            }
            if (arrn != null) continue;
            if (!e10.a(c11)) {
                pushbackReader.unread(c11);
                if (arrn == null) break;
            }
            stringBuffer.append(c11);
        } while (arrn == null);
        return new G(e10, stringBuffer.toString());
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

