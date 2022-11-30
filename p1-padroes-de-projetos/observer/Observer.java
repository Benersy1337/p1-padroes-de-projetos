package observer;

public interface Observer {
    // Utilizamos apenas um método aonde recebemos como argumento o objeto observable, para o objeto observador saber quem mandou uma notificação, passando por uma String message.
    public void notify(Observable observable, String message);
}
