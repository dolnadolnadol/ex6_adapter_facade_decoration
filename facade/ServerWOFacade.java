public class ServerWOFacade {
    public static void main(String[] args) {
		ServerManager serverManager = new ServerManager();
		serverManager.start();
		serverManager.stop();
    }
}
