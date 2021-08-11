/*
 * Decompiled with CFR 0.150.
 */
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

public class aM
extends Thread {
    private static final /* synthetic */ Charset c;
    private /* synthetic */ a_ b;
    private static final /* synthetic */ char a;
    private static final /* synthetic */ char e;
    private static final /* synthetic */ String d;

    public aM(a_ a_2) {
        super("HttpPipelineReceiver");
        this.b = null;
        this.b = a_2;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    static {
        d = "Content-Length";
        e = (char)13;
        a = (char)10;
        c = StandardCharsets.US_ASCII;
    }

    @Override
    public void run() {
        String string = K.d();
        while (!Thread.interrupted()) {
            eC eC2 = null;
            try {
                eC2 = this.b.l();
                InputStream inputStream = this.b.d();
                cM cM2 = this.a(inputStream);
                this.b.a(eC2, cM2);
            }
            catch (InterruptedException interruptedException) {
                return;
            }
            catch (Exception exception) {
                this.b.a(eC2, exception);
            }
            if (string == null) continue;
        }
    }

    private byte[] c(InputStream inputStream) throws IOException {
        int n2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String string = K.d();
        do {
            String string2 = this.b(inputStream);
            String[] arrstring = fU.c(string2, "; ");
            n2 = Integer.parseInt(arrstring[0], 16);
            byte[] arrby = new byte[n2];
            this.a(arrby, inputStream);
            byteArrayOutputStream.write(arrby);
            this.b(inputStream);
        } while ((n2 != 0 || string != null) && string == null);
        return byteArrayOutputStream.toByteArray();
    }

    private cM a(InputStream inputStream) throws IOException {
        String string = this.b(inputStream);
        String[] arrstring = fU.c(string, " ");
        String string2 = K.d();
        String[] arrstring2 = arrstring;
        if (string2 == null) {
            if (arrstring2.length < 3) {
                throw new IOException("Invalid status line: " + string);
            }
            arrstring2 = arrstring;
        }
        String string3 = arrstring2[0];
        int n2 = fU.b(arrstring[1], 0);
        String string4 = arrstring[2];
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        while (true) {
            int n3;
            String string5;
            String string6;
            String string7;
            String string8;
            block7: {
                block6: {
                    byte[] arrby;
                    block11: {
                        block8: {
                            block9: {
                                int n4;
                                block10: {
                                    int n5;
                                    if ((string8 = this.b(inputStream)).length() > 0) break block6;
                                    arrby = null;
                                    string6 = string7 = (String)linkedHashMap.get("Content-Length");
                                    if (string2 != null) break block7;
                                    if (string2 != null) break block8;
                                    if (string6 == null) break block9;
                                    n4 = n5 = fU.b(string7, -1);
                                    if (string2 != null) break block10;
                                    if (n4 <= 0) break block11;
                                    n4 = n5;
                                }
                                arrby = new byte[n4];
                                this.a(arrby, inputStream);
                                break block11;
                            }
                            string6 = (String)linkedHashMap.get("Transfer-Encoding");
                        }
                        if (fU.a((Object)(string5 = string6), (Object)"chunked")) {
                            arrby = this.c(inputStream);
                        }
                    }
                    return new cM(n2, string, linkedHashMap, arrby);
                }
                string6 = string8;
            }
            if ((n3 = string6.indexOf(":")) <= 0) continue;
            string7 = string8.substring(0, n3).trim();
            string5 = string8.substring(n3 + 1).trim();
            linkedHashMap.put(string7, string5);
        }
    }

    private String b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String string = K.d();
        int n2 = -1;
        boolean bl2 = false;
        do {
            int n3;
            if ((n3 = inputStream.read()) < 0) {
                if (string == null) {
                    if (string == null) break;
                }
            } else {
                byteArrayOutputStream.write(n3);
            }
            int n4 = n2;
            if (string != null) continue;
            if (n4 == 13) {
                n4 = n3;
                if (string != null) continue;
                if (n4 == 10) {
                    bl2 = true;
                    if (string == null) break;
                }
            }
            n4 = n2 = n3;
        } while (string == null);
        byte[] arrby = byteArrayOutputStream.toByteArray();
        String string2 = new String(arrby, c);
        if (bl2) {
            string2 = string2.substring(0, string2.length() - 2);
        }
        return string2;
    }

    private void a(byte[] arrby, InputStream inputStream) throws IOException {
        int n2 = 0;
        String string = K.d();
        while (n2 < arrby.length) {
            int n3;
            int n4 = n3 = inputStream.read(arrby, n2, arrby.length - n2);
            if (string == null) {
                if (n4 < 0) {
                    throw new EOFException();
                }
                n4 = n2 = n2 + n3;
            }
            if (string == null) continue;
        }
    }
}

