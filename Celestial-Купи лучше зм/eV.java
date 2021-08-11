/*
 * Decompiled with CFR 0.150.
 */
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class eV
extends Thread {
    private /* synthetic */ a_ b;
    private static final /* synthetic */ Charset c;
    private static final /* synthetic */ String a;

    private void a(gg gg2, OutputStream outputStream) throws IOException {
        block2: {
            String string = K.d();
            this.a(outputStream, gg2.i() + " " + gg2.b() + " " + gg2.f() + "\r\n");
            Map<String, String> map = gg2.c();
            String string2 = string;
            for (String string3 : map.keySet()) {
                String string4 = gg2.c().get(string3);
                this.a(outputStream, string3 + ": " + string4 + "\r\n");
                if (string2 == null) {
                    if (string2 == null) continue;
                }
                break block2;
            }
            this.a(outputStream, "\r\n");
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void a() throws IOException {
        String string = this.b.f();
        int n2 = this.b.c();
        Proxy proxy = this.b.j();
        Socket socket = new Socket(proxy);
        socket.connect(new InetSocketAddress(string, n2), 5000);
        this.b.a(socket);
    }

    public eV(a_ a_2) {
        super("HttpPipelineSender");
        this.b = null;
        this.b = a_2;
    }

    private void a(OutputStream outputStream, String string) throws IOException {
        byte[] arrby = string.getBytes(c);
        outputStream.write(arrby);
    }

    static {
        a = "\r\n";
        c = StandardCharsets.US_ASCII;
    }

    @Override
    public void run() {
        eC eC2 = null;
        String string = K.d();
        try {
            this.a();
            while (!Thread.interrupted()) {
                eC2 = this.b.g();
                gg gg2 = eC2.a();
                OutputStream outputStream = this.b.i();
                this.a(gg2, outputStream);
                this.b.a(eC2);
                if (string == null && string == null) continue;
                break;
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
        catch (Exception exception) {
            this.b.b(eC2, exception);
        }
    }
}

