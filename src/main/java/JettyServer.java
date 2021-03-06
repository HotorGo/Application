import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class JettyServer {

    public static void main(String[] args) throws Exception {

        Server server = new Server(8888);
        ServletContextHandler handler = new ServletContextHandler();
        server.setHandler(handler);
        handler.setResourceBase(".");
        handler.addServlet(DefaultServlet.class, "/");
        handler.addServlet(GreetServlet.class, "/greet.html");
        server.start();

    }

}